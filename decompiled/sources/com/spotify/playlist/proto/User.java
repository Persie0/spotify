package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class User extends AbstractC0269h implements sre0 {
    public static final int COLOR_FIELD_NUMBER = 6;
    private static final User DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int THUMBNAIL_URI_FIELD_NUMBER = 5;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private int color_;
    private String link_ = "";
    private String username_ = "";
    private String displayName_ = "";
    private String imageUri_ = "";
    private String thumbnailUri_ = "";

    static {
        User user = new User();
        DEFAULT_INSTANCE = user;
        AbstractC0269h.registerDefaultInstance(User.class, user);
    }

    private User() {
    }

    /* JADX INFO: renamed from: o */
    public static User m18670o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"bitField0_", "link_", "username_", "displayName_", "imageUri_", "thumbnailUri_", "color_"});
        }
        if (iOrdinal == 3) {
            return new User();
        }
        if (iOrdinal == 4) {
            return new kea1(6);
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
        synchronized (User.class) {
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

    public final int getColor() {
        return this.color_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getLink() {
        return this.link_;
    }

    public final String getUsername() {
        return this.username_;
    }

    public final boolean hasColor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m18671p() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m18672q() {
        return this.thumbnailUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
