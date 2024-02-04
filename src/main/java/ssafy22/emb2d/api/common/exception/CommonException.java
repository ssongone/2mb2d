package ssafy22.emb2d.api.common.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class CommonException extends RuntimeException {
  private final HttpStatus code;
  private String messageCode;
  private String[] messageParameters;

  public CommonException(HttpStatus code) {
    this.code = code;
  }

  public CommonException(String messageCode) {
    this.code = HttpStatus.INTERNAL_SERVER_ERROR;
    this.messageCode = messageCode;
  }

  public CommonException(HttpStatus code, String messageCode) {
    this.code = code;
    this.messageCode = messageCode;
  }

  public CommonException(String messageCode, String[] messageParameters) {
    this.code = HttpStatus.INTERNAL_SERVER_ERROR;
    this.messageCode = messageCode;
    this.messageParameters = messageParameters;
  }

  @Override
  public String getMessage() {
    if (this.getMessageCode() != null)
      return this.getMessageCode();
    
    if (this.code != null)
      return this.code.toString();
    
    return "";
  }
}
