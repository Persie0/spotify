package com.spotify.identity.proto.p081v3;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import p204p.ae50;
import p204p.k140;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Identity$UserProfile extends AbstractC0269h implements sre0 {
    public static final int ABUSE_REPORTED_IMAGE_FIELD_NUMBER = 8;
    public static final int ABUSE_REPORTED_NAME_FIELD_NUMBER = 7;
    public static final int ACCOUNT_ID_FIELD_NUMBER = 24;
    public static final int COLOR_FIELD_NUMBER = 11;
    private static final Identity$UserProfile DEFAULT_INSTANCE;
    public static final int EDIT_IMAGE_DISABLED_FIELD_NUMBER = 19;
    public static final int EDIT_NAME_DISABLED_FIELD_NUMBER = 18;
    public static final int EDIT_PROFILE_DISABLED_FIELD_NUMBER = 5;
    public static final int HAS_SPOTIFY_IMAGE_FIELD_NUMBER = 10;
    public static final int HAS_SPOTIFY_NAME_FIELD_NUMBER = 9;
    public static final int IMAGES_FIELD_NUMBER = 3;
    public static final int IS_KID_FIELD_NUMBER = 21;
    public static final int LOCATION_FIELD_NUMBER = 14;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRONOUNS_FIELD_NUMBER = 13;
    public static final int REPORT_ABUSE_DISABLED_FIELD_NUMBER = 6;
    public static final int SOCIAL_HANDLE_EDITABLE_FIELD_NUMBER = 23;
    public static final int SOCIAL_HANDLE_FIELD_NUMBER = 22;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int VERIFIED_FIELD_NUMBER = 4;
    private BoolValue abuseReportedImage_;
    private BoolValue abuseReportedName_;
    private StringValue accountId_;
    private int bitField0_;
    private Int32Value color_;
    private BoolValue editImageDisabled_;
    private BoolValue editNameDisabled_;
    private BoolValue editProfileDisabled_;
    private BoolValue hasSpotifyImage_;
    private BoolValue hasSpotifyName_;
    private ae50 images_ = AbstractC0269h.emptyProtobufList();
    private BoolValue isKid_;
    private StringValue location_;
    private StringValue name_;
    private StringValue pronouns_;
    private BoolValue reportAbuseDisabled_;
    private BoolValue socialHandleEditable_;
    private StringValue socialHandle_;
    private StringValue username_;
    private BoolValue verified_;

    static {
        Identity$UserProfile identity$UserProfile = new Identity$UserProfile();
        DEFAULT_INSTANCE = identity$UserProfile;
        AbstractC0269h.registerDefaultInstance(Identity$UserProfile.class, identity$UserProfile);
    }

    private Identity$UserProfile() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11942n(Identity$UserProfile identity$UserProfile, StringValue stringValue) {
        identity$UserProfile.getClass();
        stringValue.getClass();
        identity$UserProfile.location_ = stringValue;
        identity$UserProfile.bitField0_ |= 2048;
    }

    /* JADX INFO: renamed from: o */
    public static void m11943o(Identity$UserProfile identity$UserProfile, StringValue stringValue) {
        identity$UserProfile.getClass();
        stringValue.getClass();
        identity$UserProfile.pronouns_ = stringValue;
        identity$UserProfile.bitField0_ |= 1024;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: y */
    public static k140 m11944y() {
        return (k140) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0001\u0001\u0018\u0013\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\rဉ\n\u000eဉ\u000b\u0012ဉ\f\u0013ဉ\r\u0015ဉ\u000e\u0016ဉ\u000f\u0017ဉ\u0010\u0018ဉ\u0011", new Object[]{"bitField0_", "username_", "name_", "images_", Identity$Image.class, "verified_", "editProfileDisabled_", "reportAbuseDisabled_", "abuseReportedName_", "abuseReportedImage_", "hasSpotifyName_", "hasSpotifyImage_", "color_", "pronouns_", "location_", "editNameDisabled_", "editImageDisabled_", "isKid_", "socialHandle_", "socialHandleEditable_", "accountId_"});
        }
        if (iOrdinal == 3) {
            return new Identity$UserProfile();
        }
        if (iOrdinal == 4) {
            return new k140(DEFAULT_INSTANCE);
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
        synchronized (Identity$UserProfile.class) {
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

    /* JADX INFO: renamed from: p */
    public final StringValue m11945p() {
        StringValue stringValue = this.accountId_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: q */
    public final BoolValue m11946q() {
        BoolValue boolValue = this.hasSpotifyImage_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m11947r() {
        return this.images_;
    }

    /* JADX INFO: renamed from: s */
    public final BoolValue m11948s() {
        BoolValue boolValue = this.isKid_;
        return boolValue == null ? BoolValue.m1916p() : boolValue;
    }

    /* JADX INFO: renamed from: t */
    public final StringValue m11949t() {
        StringValue stringValue = this.location_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final StringValue m11950u() {
        StringValue stringValue = this.name_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: v */
    public final StringValue m11951v() {
        StringValue stringValue = this.pronouns_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: w */
    public final StringValue m11952w() {
        StringValue stringValue = this.socialHandle_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    /* JADX INFO: renamed from: x */
    public final StringValue m11953x() {
        StringValue stringValue = this.username_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }
}
