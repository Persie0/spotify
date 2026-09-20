package com.spotify.listeningactivity.p097v1;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class AudienceUserResponse extends AbstractC0269h implements sre0 {
    private static final AudienceUserResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USER_FIELD_NUMBER = 1;
    private int bitField0_;
    private AudienceUser user_;

    static {
        AudienceUserResponse audienceUserResponse = new AudienceUserResponse();
        DEFAULT_INSTANCE = audienceUserResponse;
        AbstractC0269h.registerDefaultInstance(AudienceUserResponse.class, audienceUserResponse);
    }

    private AudienceUserResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "user_"});
        }
        if (iOrdinal == 3) {
            return new AudienceUserResponse();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 6);
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
        synchronized (AudienceUserResponse.class) {
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

    public final boolean hasUser() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final AudienceUser m12914n() {
        AudienceUser audienceUser = this.user_;
        return audienceUser == null ? AudienceUser.m12908n() : audienceUser;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
