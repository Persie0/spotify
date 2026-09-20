package com.spotify.challenges.p042v1.api.pub.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionInProgressResponse extends AbstractC0269h implements sre0 {
    public static final int CHALLENGE_DETAILS_FIELD_NUMBER = 1;
    private static final SessionInProgressResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ChallengeDetails challengeDetails_;

    static {
        SessionInProgressResponse sessionInProgressResponse = new SessionInProgressResponse();
        DEFAULT_INSTANCE = sessionInProgressResponse;
        AbstractC0269h.registerDefaultInstance(SessionInProgressResponse.class, sessionInProgressResponse);
    }

    private SessionInProgressResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static SessionInProgressResponse m5923o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "challengeDetails_"});
        }
        if (iOrdinal == 3) {
            return new SessionInProgressResponse();
        }
        if (iOrdinal == 4) {
            return new h8z0(DEFAULT_INSTANCE, 18);
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
        synchronized (SessionInProgressResponse.class) {
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
    public final ChallengeDetails m5924n() {
        ChallengeDetails challengeDetails = this.challengeDetails_;
        return challengeDetails == null ? ChallengeDetails.m5915o() : challengeDetails;
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
