package org.java_websocket.exceptions;

import java.nio.charset.CharacterCodingException;

/* JADX INFO: loaded from: classes15.dex */
public class InvalidDataException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f10960a;

    public InvalidDataException(int i) {
        this.f10960a = i;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.f10960a = i;
    }

    public InvalidDataException(CharacterCodingException characterCodingException) {
        super(characterCodingException);
        this.f10960a = 1007;
    }
}
