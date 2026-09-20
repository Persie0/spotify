package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ina1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class UserAuthorMetadata extends AbstractC0269h implements sre0 {
    private static final UserAuthorMetadata DEFAULT_INSTANCE;
    public static final int DISPLAY_MEMBERSHIP_BADGE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_COVER_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int USER_FULL_NAME_FIELD_NUMBER = 2;
    private boolean displayMembershipBadge_;
    private String username_ = "";
    private String userFullName_ = "";
    private String userCoverImageUrl_ = "";

    static {
        UserAuthorMetadata userAuthorMetadata = new UserAuthorMetadata();
        DEFAULT_INSTANCE = userAuthorMetadata;
        AbstractC0269h.registerDefaultInstance(UserAuthorMetadata.class, userAuthorMetadata);
    }

    private UserAuthorMetadata() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22263n(UserAuthorMetadata userAuthorMetadata, String str) {
        userAuthorMetadata.getClass();
        userAuthorMetadata.userCoverImageUrl_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22264o(UserAuthorMetadata userAuthorMetadata, String str) {
        userAuthorMetadata.getClass();
        str.getClass();
        userAuthorMetadata.userFullName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m22265p(UserAuthorMetadata userAuthorMetadata, String str) {
        userAuthorMetadata.getClass();
        str.getClass();
        userAuthorMetadata.username_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static UserAuthorMetadata m22266q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static ina1 m22267u() {
        return (ina1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"username_", "userFullName_", "userCoverImageUrl_", "displayMembershipBadge_"});
        }
        if (iOrdinal == 3) {
            return new UserAuthorMetadata();
        }
        if (iOrdinal == 4) {
            return new ina1(DEFAULT_INSTANCE);
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
        synchronized (UserAuthorMetadata.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22268r() {
        return this.displayMembershipBadge_;
    }

    /* JADX INFO: renamed from: s */
    public final String m22269s() {
        return this.userCoverImageUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final String m22270t() {
        return this.userFullName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
