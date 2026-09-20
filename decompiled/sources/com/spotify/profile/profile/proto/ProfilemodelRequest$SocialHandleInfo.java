package com.spotify.profile.profile.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfilemodelRequest$SocialHandleInfo extends AbstractC0269h implements sre0 {
    private static final ProfilemodelRequest$SocialHandleInfo DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RATE_LIMIT_MAX_CHANGES_FIELD_NUMBER = 2;
    public static final int RATE_LIMIT_WINDOW_FIELD_NUMBER = 3;
    public static final int RESTRICTED_UNTIL_FIELD_NUMBER = 1;
    private int bitField0_;
    private int rateLimitMaxChanges_;
    private Duration rateLimitWindow_;
    private Timestamp restrictedUntil_;

    static {
        ProfilemodelRequest$SocialHandleInfo profilemodelRequest$SocialHandleInfo = new ProfilemodelRequest$SocialHandleInfo();
        DEFAULT_INSTANCE = profilemodelRequest$SocialHandleInfo;
        AbstractC0269h.registerDefaultInstance(ProfilemodelRequest$SocialHandleInfo.class, profilemodelRequest$SocialHandleInfo);
    }

    private ProfilemodelRequest$SocialHandleInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static ProfilemodelRequest$SocialHandleInfo m19827n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003ဉ\u0001", new Object[]{"bitField0_", "restrictedUntil_", "rateLimitMaxChanges_", "rateLimitWindow_"});
        }
        if (iOrdinal == 3) {
            return new ProfilemodelRequest$SocialHandleInfo();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 23);
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
        synchronized (ProfilemodelRequest$SocialHandleInfo.class) {
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

    /* JADX INFO: renamed from: o */
    public final int m19828o() {
        return this.rateLimitMaxChanges_;
    }

    /* JADX INFO: renamed from: p */
    public final Duration m19829p() {
        Duration duration = this.rateLimitWindow_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m19830q() {
        Timestamp timestamp = this.restrictedUntil_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m19831r() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m19832s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
