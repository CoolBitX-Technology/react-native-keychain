package com.oblador.keychain.exceptions;

import androidx.annotation.Nullable;

import java.security.GeneralSecurityException;

public class CryptoFailedException extends GeneralSecurityException {
  public @interface ErrorCode {
    int UNKNOWN = -1;
    int CANCEL_BUTTON_CLICKED = 13;
    int CANCEL_BY_PRESS_OUTSIDE_PROMPT = 10;
    int FAILED_MULTIPLE_TIMES = 7;
  }
  private int errorCode = ErrorCode.UNKNOWN;

  public CryptoFailedException(String message) {
    super(message);
  }

  public CryptoFailedException(String message, Throwable t) {
    super(message, t);
  }

  public CryptoFailedException(int errorCode, CharSequence errString) {
    super("code: " + errorCode + ", msg: " + errString);
    this.errorCode = errorCode;
  }

  public static void reThrowOnError(@Nullable final Throwable error) throws CryptoFailedException {
    if(null == error) return;

    if (error instanceof CryptoFailedException)
      throw (CryptoFailedException) error;

    throw new CryptoFailedException("Wrapped error: " + error.getMessage(), error);

  }

  public int getErrorCode() {
    return errorCode;
  }
}
