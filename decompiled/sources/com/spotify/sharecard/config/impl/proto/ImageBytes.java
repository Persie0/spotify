package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.m440;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ImageBytes extends AbstractC0269h implements sre0 {
    private static final ImageBytes DEFAULT_INSTANCE;
    public static final int IMAGE_BYTES_FIELD_NUMBER = 1;
    public static final int MIME_TYPE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private gva imageBytes_ = gva.f84678b;
    private String mimeType_ = "";

    static {
        ImageBytes imageBytes = new ImageBytes();
        DEFAULT_INSTANCE = imageBytes;
        AbstractC0269h.registerDefaultInstance(ImageBytes.class, imageBytes);
    }

    private ImageBytes() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21149n(ImageBytes imageBytes, cva cvaVar) {
        imageBytes.getClass();
        imageBytes.imageBytes_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m21150o(ImageBytes imageBytes, String str) {
        imageBytes.getClass();
        imageBytes.mimeType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static m440 m21151p() {
        return (m440) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"imageBytes_", "mimeType_"});
        }
        if (iOrdinal == 3) {
            return new ImageBytes();
        }
        if (iOrdinal == 4) {
            return new m440(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (ImageBytes.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
