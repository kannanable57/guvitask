package task11;

public class incorrect {
	Login controller
	@PostMapping("/login")
	    public ResponseEntity<?> login(@RequestBody LoginMembers loginMembers) throws AuthenticationException, IOException, ServletException {

	        final Authentication authentication = authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(
	                        loginMembers.getEmail(),
	                        loginMembers.getPassword()
	                )
	        );
	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        final String token = jwtTokenUtil.generateToken(authentication);
	        logger.info("You are log in successfully with token");
	        return ResponseEntity.ok(new AuthTokenRequest(token));
	    }
}
