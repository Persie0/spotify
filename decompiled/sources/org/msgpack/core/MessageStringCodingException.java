package org.msgpack.core;

import java.nio.charset.CharacterCodingException;

/* JADX INFO: loaded from: classes16.dex */
public class MessageStringCodingException extends MessagePackException {
    public MessageStringCodingException(String str, CharacterCodingException characterCodingException) {
        super(str, characterCodingException);
    }

    public MessageStringCodingException(CharacterCodingException characterCodingException) {
        super(characterCodingException);
    }

    @Override // java.lang.Throwable
    public CharacterCodingException getCause() {
        return (CharacterCodingException) super.getCause();
    }
}
