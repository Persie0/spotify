package com.spotify.identity.proto.p081v3;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import p204p.a530;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityV3$UserProfile extends AbstractC0269h implements sre0 {
    public static final int ABUSE_REPORTED_BIO_FIELD_NUMBER = 17;
    public static final int ABUSE_REPORTED_IMAGE_FIELD_NUMBER = 8;
    public static final int ABUSE_REPORTED_NAME_FIELD_NUMBER = 7;
    public static final int ACCOUNT_ID_FIELD_NUMBER = 24;
    public static final int BIO_FIELD_NUMBER = 15;
    public static final int COLOR_FIELD_NUMBER = 11;
    private static final IdentityV3$UserProfile DEFAULT_INSTANCE;
    public static final int EDIT_BIO_DISABLED_FIELD_NUMBER = 20;
    public static final int EDIT_IMAGE_DISABLED_FIELD_NUMBER = 19;
    public static final int EDIT_NAME_DISABLED_FIELD_NUMBER = 18;
    public static final int EDIT_PROFILE_DISABLED_FIELD_NUMBER = 5;
    public static final int HAS_SPOTIFY_IMAGE_FIELD_NUMBER = 10;
    public static final int HAS_SPOTIFY_NAME_FIELD_NUMBER = 9;
    public static final int IMAGES_FIELD_NUMBER = 3;
    public static final int IS_KID_FIELD_NUMBER = 21;
    public static final int IS_PRIVATE_FIELD_NUMBER = 12;
    public static final int LOCATION_FIELD_NUMBER = 14;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRONOUNS_FIELD_NUMBER = 13;
    public static final int REPORT_ABUSE_DISABLED_FIELD_NUMBER = 6;
    public static final int SOCIAL_HANDLE_FIELD_NUMBER = 22;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int VERIFIED_FIELD_NUMBER = 4;
    private BoolValue abuseReportedBio_;
    private BoolValue abuseReportedImage_;
    private BoolValue abuseReportedName_;
    private StringValue accountId_;
    private StringValue bio_;
    private int bitField0_;
    private Int32Value color_;
    private BoolValue editBioDisabled_;
    private BoolValue editImageDisabled_;
    private BoolValue editNameDisabled_;
    private BoolValue editProfileDisabled_;
    private BoolValue hasSpotifyImage_;
    private BoolValue hasSpotifyName_;
    private ae50 images_ = AbstractC0269h.emptyProtobufList();
    private BoolValue isKid_;
    private BoolValue isPrivate_;
    private StringValue location_;
    private StringValue name_;
    private StringValue pronouns_;
    private BoolValue reportAbuseDisabled_;
    private StringValue socialHandle_;
    private StringValue username_;
    private BoolValue verified_;

    static {
        IdentityV3$UserProfile identityV3$UserProfile = new IdentityV3$UserProfile();
        DEFAULT_INSTANCE = identityV3$UserProfile;
        AbstractC0269h.registerDefaultInstance(IdentityV3$UserProfile.class, identityV3$UserProfile);
    }

    private IdentityV3$UserProfile() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0001\u0001\u0018\u0016\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fဉ\n\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013ဉ\u0010\u0014ဉ\u0011\u0015ဉ\u0012\u0016ဉ\u0013\u0018ဉ\u0014", new Object[]{"bitField0_", "username_", "name_", "images_", IdentityV3$Image.class, "verified_", "editProfileDisabled_", "reportAbuseDisabled_", "abuseReportedName_", "abuseReportedImage_", "hasSpotifyName_", "hasSpotifyImage_", "color_", "isPrivate_", "pronouns_", "location_", "bio_", "abuseReportedBio_", "editNameDisabled_", "editImageDisabled_", "editBioDisabled_", "isKid_", "socialHandle_", "accountId_"});
        }
        if (iOrdinal == 3) {
            return new IdentityV3$UserProfile();
        }
        if (iOrdinal == 4) {
            return new a530(24);
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
        synchronized (IdentityV3$UserProfile.class) {
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

    public final Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.m1943p() : int32Value;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BoolValue m11962o() {
        BoolValue boolValue = this.abuseReportedImage_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    /* JADX INFO: renamed from: p */
    public final BoolValue m11963p() {
        BoolValue boolValue = this.abuseReportedName_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    /* JADX INFO: renamed from: q */
    public final StringValue m11964q() {
        StringValue stringValue = this.accountId_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: r */
    public final BoolValue m11965r() {
        BoolValue boolValue = this.editProfileDisabled_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    /* JADX INFO: renamed from: s */
    public final BoolValue m11966s() {
        BoolValue boolValue = this.hasSpotifyImage_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    /* JADX INFO: renamed from: t */
    public final BoolValue m11967t() {
        BoolValue boolValue = this.hasSpotifyName_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m11968u() {
        return this.images_;
    }

    /* JADX INFO: renamed from: v */
    public final BoolValue m11969v() {
        BoolValue boolValue = this.isKid_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    /* JADX INFO: renamed from: w */
    public final StringValue m11970w() {
        StringValue stringValue = this.name_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: x */
    public final BoolValue m11971x() {
        BoolValue boolValue = this.reportAbuseDisabled_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    /* JADX INFO: renamed from: y */
    public final StringValue m11972y() {
        StringValue stringValue = this.socialHandle_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: z */
    public final StringValue m11973z() {
        StringValue stringValue = this.username_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }
}
