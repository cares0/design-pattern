package pattern.structural.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
