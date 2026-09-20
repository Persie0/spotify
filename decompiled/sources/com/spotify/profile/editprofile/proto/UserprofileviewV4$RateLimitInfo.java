package com.spotify.profile.editprofile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UserprofileviewV4$RateLimitInfo extends AbstractC0269h implements sre0 {
    private static final UserprofileviewV4$RateLimitInfo DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RETRY_AFTER_SECONDS_FIELD_NUMBER = 1;
    private long retryAfterSeconds_;

    static {
        UserprofileviewV4$RateLimitInfo userprofileviewV4$RateLimitInfo = new UserprofileviewV4$RateLimitInfo();
        DEFAULT_INSTANCE = userprofileviewV4$RateLimitInfo;
        AbstractC0269h.registerDefaultInstance(UserprofileviewV4$RateLimitInfo.class, userprofileviewV4$RateLimitInfo);
    }

    private UserprofileviewV4$RateLimitInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static UserprofileviewV4$RateLimitInfo m19782n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"retryAfterSeconds_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$RateLimitInfo();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 24);
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
        synchronized (UserprofileviewV4$RateLimitInfo.class) {
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
    public final long m19783o() {
        return this.retryAfterSeconds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
