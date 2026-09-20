package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.f6y;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class Face extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 4;
    private static final Face DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int backgroundColor_;
    private String imageUrl_ = "";
    private String username_ = "";
    private String displayName_ = "";

    static {
        Face face = new Face();
        DEFAULT_INSTANCE = face;
        AbstractC0269h.registerDefaultInstance(Face.class, face);
    }

    private Face() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6033n(Face face) {
        face.backgroundColor_ = 16711680;
    }

    /* JADX INFO: renamed from: o */
    public static void m6034o(Face face) {
        face.getClass();
        face.displayName_ = "Smaug";
    }

    /* JADX INFO: renamed from: p */
    public static void m6035p(Face face, String str) {
        face.getClass();
        face.imageUrl_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6036q(Face face) {
        face.getClass();
        face.username_ = "763q4f763t4r";
    }

    /* JADX INFO: renamed from: s */
    public static Face m6037s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static f6y m6038t() {
        return (f6y) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"imageUrl_", "username_", "displayName_", "backgroundColor_"});
        }
        if (iOrdinal == 3) {
            return new Face();
        }
        if (iOrdinal == 4) {
            return new f6y(DEFAULT_INSTANCE);
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
        synchronized (Face.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final int m6039r() {
        return this.backgroundColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
