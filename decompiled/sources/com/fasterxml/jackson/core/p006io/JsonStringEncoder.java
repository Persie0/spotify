package com.fasterxml.jackson.core.p006io;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonStringEncoder {

    /* JADX INFO: renamed from: HC */
    private static final char[] f1669HC = CharTypes.copyHexChars();

    /* JADX INFO: renamed from: HB */
    private static final byte[] f1668HB = CharTypes.copyHexBytes();
    private static final JsonStringEncoder instance = new JsonStringEncoder();

    public static JsonStringEncoder getInstance() {
        return instance;
    }
}
