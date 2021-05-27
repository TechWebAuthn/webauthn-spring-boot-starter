package com.mih.webauthn;

import com.yubico.webauthn.RelyingParty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.net.URL;
import java.util.Set;

@ConfigurationProperties(prefix = "webauthn")
@Component
@Validated
public class WebAuthnProperties {
  /**
   * Relying party identifierasdasd
   * @see RelyingParty#getIdentity()
   */
  @NotEmpty
  private String relyingPartyId;

  @NotEmpty
  private String relyingPartyName;

  private URL relyingPartyIcon;

  @NotEmpty
  private Set<String> relyingPartyOrigins;

  public String getRelyingPartyId() {
    return this.relyingPartyId;
  }

  public void setRelyingPartyId(String relyingPartyId) {
    this.relyingPartyId = relyingPartyId;
  }

  public String getRelyingPartyName() {
    return this.relyingPartyName;
  }

  public void setRelyingPartyName(String relyingPartyName) {
    this.relyingPartyName = relyingPartyName;
  }

  public URL getRelyingPartyIcon() {
    return this.relyingPartyIcon;
  }

  public void setRelyingPartyIcon(URL relyingPartyIcon) {
    this.relyingPartyIcon = relyingPartyIcon;
  }

  public Set<String> getRelyingPartyOrigins() {
    return this.relyingPartyOrigins;
  }

  public void setRelyingPartyOrigins(Set<String> relyingPartyOrigins) {
    this.relyingPartyOrigins = relyingPartyOrigins;
  }

}
