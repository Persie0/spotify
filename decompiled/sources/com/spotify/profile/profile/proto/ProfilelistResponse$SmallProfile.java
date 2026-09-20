package com.spotify.profile.profile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfilelistResponse$SmallProfile extends AbstractC0269h implements sre0 {
    public static final int COLOR_FIELD_NUMBER = 11;
    private static final ProfilelistResponse$SmallProfile DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int FOLLOWING_COUNT_FIELD_NUMBER = 5;
    public static final int FOLLOW_DISABLED_FIELD_NUMBER = 10;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_DISMISSED_FIELD_NUMBER = 8;
    public static final int IS_FOLLOWED_FIELD_NUMBER = 6;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 7;
    public static final int IS_VERIFIED_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int color_;
    private boolean followDisabled_;
    private int followersCount_;
    private int followingCount_;
    private boolean isDismissed_;
    private boolean isFollowed_;
    private boolean isFollowing_;
    private boolean isVerified_;
    private String uri_ = "";
    private String name_ = "";
    private String imageUrl_ = "";

    static {
        ProfilelistResponse$SmallProfile profilelistResponse$SmallProfile = new ProfilelistResponse$SmallProfile();
        DEFAULT_INSTANCE = profilelistResponse$SmallProfile;
        AbstractC0269h.registerDefaultInstance(ProfilelistResponse$SmallProfile.class, profilelistResponse$SmallProfile);
    }

    private ProfilelistResponse$SmallProfile() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0004", new Object[]{"uri_", "name_", "imageUrl_", "followersCount_", "followingCount_", "isFollowed_", "isFollowing_", "isDismissed_", "isVerified_", "followDisabled_", "color_"});
        }
        if (iOrdinal == 3) {
            return new ProfilelistResponse$SmallProfile();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 20);
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
        synchronized (ProfilelistResponse$SmallProfile.class) {
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

    public final boolean getIsFollowing() {
        return this.isFollowing_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final int m19803n() {
        return this.followersCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m19804o() {
        return this.followingCount_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m19805p() {
        return this.isDismissed_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
