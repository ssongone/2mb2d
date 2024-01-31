package ssafy22.emb2d.api.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
  public Boolean checkPassword(String password) {
    Boolean result = false;
    if (password.equals("qkrtjdeo"))
      result = true;
    
    return result;
  }
}
