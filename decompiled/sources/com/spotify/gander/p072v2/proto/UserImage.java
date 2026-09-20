package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gra1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UserImage extends AbstractC0269h implements sre0 {
    private static final UserImage DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int USER_DISPLAY_NAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String imageUrl_ = "";
    private String userDisplayName_ = "";

    static {
        UserImage userImage = new UserImage();
        DEFAULT_INSTANCE = userImage;
        AbstractC0269h.registerDefaultInstance(UserImage.class, userImage);
    }

    private UserImage() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11144n(UserImage userImage, String str) {
        userImage.getClass();
        userImage.bitField0_ |= 1;
        userImage.imageUrl_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11145o(UserImage userImage, String str) {
        userImage.getClass();
        userImage.userDisplayName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static UserImage m11146p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static gra1 m11147r() {
        return (gra1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ", new Object[]{"bitField0_", "imageUrl_", "userDisplayName_"});
        }
        if (iOrdinal == 3) {
            return new UserImage();
        }
        if (iOrdinal == 4) {
            return new gra1(DEFAULT_INSTANCE);
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
        synchronized (UserImage.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final String m11148q() {
        return this.userDisplayName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
