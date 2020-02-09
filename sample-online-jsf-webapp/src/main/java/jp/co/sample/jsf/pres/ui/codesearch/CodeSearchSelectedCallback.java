package jp.co.sample.jsf.pres.ui.codesearch;

import java.io.Serializable;

/**
 * コード検索 選択Callback.
 */
public interface CodeSearchSelectedCallback extends Serializable {

  /**
   * コード検索 コード選択.
   *
   * @param parameterDto コード検索パラメーターDTO
   */
  void selectedCodeValues(CodeSearchParameterDto parameterDto);

}
