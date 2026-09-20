package com.spotify.profile.editprofile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ia7;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UserprofileviewV4$UpdateBioResponse extends AbstractC0269h implements sre0 {
    public static final int BIO_FIELD_NUMBER = 1;
    private static final UserprofileviewV4$UpdateBioResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RATE_LIMIT_FIELD_NUMBER = 3;
    public static final int VIOLATIONS_FIELD_NUMBER = 2;
    private static final vd50 violations_converter_ = new ia7(29);
    private UserprofileviewV4$Bio bio_;
    private int bitField0_;
    private UserprofileviewV4$RateLimitInfo rateLimit_;
    private int violationsMemoizedSerializedSize;
    private ud50 violations_ = AbstractC0269h.emptyIntList();

    static {
        UserprofileviewV4$UpdateBioResponse userprofileviewV4$UpdateBioResponse = new UserprofileviewV4$UpdateBioResponse();
        DEFAULT_INSTANCE = userprofileviewV4$UpdateBioResponse;
        AbstractC0269h.registerDefaultInstance(UserprofileviewV4$UpdateBioResponse.class, userprofileviewV4$UpdateBioResponse);
    }

    private UserprofileviewV4$UpdateBioResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002,\u0003ဉ\u0001", new Object[]{"bitField0_", "bio_", "violations_", "rateLimit_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$UpdateBioResponse();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 26);
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
        synchronized (UserprofileviewV4$UpdateBioResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final UserprofileviewV4$Bio m19789n() {
        UserprofileviewV4$Bio userprofileviewV4$Bio = this.bio_;
        return userprofileviewV4$Bio == null ? UserprofileviewV4$Bio.m19774o() : userprofileviewV4$Bio;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final UserprofileviewV4$RateLimitInfo m19790o() {
        UserprofileviewV4$RateLimitInfo userprofileviewV4$RateLimitInfo = this.rateLimit_;
        return userprofileviewV4$RateLimitInfo == null ? UserprofileviewV4$RateLimitInfo.m19782n() : userprofileviewV4$RateLimitInfo;
    }

    /* JADX INFO: renamed from: p */
    public final wd50 m19791p() {
        return new wd50(this.violations_, violations_converter_);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m19792q() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
