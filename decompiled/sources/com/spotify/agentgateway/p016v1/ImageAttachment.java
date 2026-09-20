package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.k440;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageAttachment extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 1;
    private static final ImageAttachment DEFAULT_INSTANCE;
    public static final int MIME_TYPE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private gva data_ = gva.f84678b;
    private String mimeType_ = "";

    static {
        ImageAttachment imageAttachment = new ImageAttachment();
        DEFAULT_INSTANCE = imageAttachment;
        AbstractC0269h.registerDefaultInstance(ImageAttachment.class, imageAttachment);
    }

    private ImageAttachment() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2939n(ImageAttachment imageAttachment, cva cvaVar) {
        imageAttachment.getClass();
        imageAttachment.data_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m2940o(ImageAttachment imageAttachment) {
        imageAttachment.getClass();
        imageAttachment.mimeType_ = "image/jpeg";
    }

    /* JADX INFO: renamed from: p */
    public static k440 m2941p() {
        return (k440) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"data_", "mimeType_"});
        }
        if (iOrdinal == 3) {
            return new ImageAttachment();
        }
        if (iOrdinal == 4) {
            return new k440(DEFAULT_INSTANCE);
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
        synchronized (ImageAttachment.class) {
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
