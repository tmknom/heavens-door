package library.errorhandler.internal

import play.api.Logger
import play.api.mvc.RequestHeader

/**
  * エラー用の通知
  *
  * Rollbarへの通知処理
  */
private[errorhandler] object ErrorNotification {

  /**
    * エラーを通知する
    *
    * @param requestHeader リクエストヘッダー
    * @param throwable     スローされた例外
    */
  def notify(requestHeader: RequestHeader, throwable: Throwable): Unit = {
    Logger.trace(s"please implement me! - ${requestHeader.toString} ${throwable.toString}")
  }
}
