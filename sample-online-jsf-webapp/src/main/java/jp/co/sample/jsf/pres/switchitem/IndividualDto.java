package jp.co.sample.jsf.pres.switchitem;

import jp.co.sample.common.code.GenderVo;
import jp.co.sample.common.util.CodeUtils;
import jp.co.sample.jsf.common.code.NationalityVo;
import jp.co.sample.jsf.common.code.YesNoVo;
import jp.co.sample.jsf.common.constant.ValidationMessageId;
import java.io.Serializable;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 * 個人DTO.
 */
@Data
public class IndividualDto implements Serializable {

  /** serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** 名前（漢字）. */
  @Size(max = 20, message = ValidationMessageId.V0001E)
  private String nameKanji;

  /** 名前（カナ）. */
  @Size(max = 20, message = ValidationMessageId.V0001E)
  private String nameKana;

  /** 性別. */
  private GenderVo gender;

  /** 国籍. */
  private NationalityVo nationality;

  /** 永住権有無. */
  private YesNoVo permanentResidency;

  /** 在留カード番号. */
  @Size(max = 12, message = ValidationMessageId.V0001E)
  private String residentCardNumber;

  /** 郵便番号. */
  @Size(max = 7, message = ValidationMessageId.V0001E)
  private String addressZip;

  /** 住所. */
  @Size(max = 60, message = ValidationMessageId.V0001E)
  private String address;

  /**
   * 性別コードを取得します.
   *
   * @return 性別コード
   */
  public String getGenderCode() {
    return gender == null ? null : gender.getCode();
  }

  /**
   * 性別コードを設定します.
   *
   * @param genderCode 性別コード
   */

  public void setGenderCode(String genderCode) {
    this.gender = CodeUtils.decode(genderCode, GenderVo.class);
  }

  /**
   * 性別Itemを取得します.
   *
   * @return 性別Item
   */
  public GenderVo[] getGenderItems() {
    return GenderVo.values();
  }

  public String getNationalityCode() {
    return nationality == null ? null : nationality.getCode();
  }

  public void setNationalityCode(String nationalityCode) {
    this.nationality = CodeUtils.decode(nationalityCode, NationalityVo.class);
  }

  public NationalityVo[] getNationalityJapanGroupItems() {
    return NationalityVo.getNationalityJapanGroup();
  }

  public NationalityVo[] getNationalityBesidesJapanGroupItems() {
    return NationalityVo.getNationalityBesidesJapanGroup();
  }

  /**
   * 永住権有無コードを取得します.
   *
   * @return 永住権有無コード
   */
  public String getPermanentResidencyCode() {
    return permanentResidency == null ? null : permanentResidency.getCode();
  }

  /**
   * 永住権有無コードを設定します.
   *
   * @param permanentResidencyCode 永住権有無コード
   */

  public void setPermanentResidencyCode(String permanentResidencyCode) {
    this.permanentResidency = CodeUtils.decode(permanentResidencyCode, YesNoVo.class);
  }

  /**
   * 永住権有無temを取得します.
   *
   * @return 永住権有無Item
   */
  public YesNoVo[] getPermanentResidencyItems() {
    return YesNoVo.values();
  }

}
