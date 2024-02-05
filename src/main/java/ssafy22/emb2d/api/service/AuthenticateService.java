package ssafy22.emb2d.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
  @Value("${2mb2d.password}")
  private String applicationPassword;

  public Boolean checkPassword(String password) {
    Boolean result = false;
    if (password.equals(applicationPassword))
      result = true;

    return result;
  }


}
