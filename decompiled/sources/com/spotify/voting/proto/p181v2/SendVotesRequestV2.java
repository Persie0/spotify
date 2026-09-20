package com.spotify.voting.proto.p181v2;

import com.google.protobuf.AbstractC0269h;
import p204p.csz0;
import p204p.dsz0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SendVotesRequestV2 extends AbstractC0269h implements sre0 {
    public static final int AWARD_ID_FIELD_NUMBER = 2;
    public static final int CONTEST_ID_FIELD_NUMBER = 1;
    private static final SendVotesRequestV2 DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int VOTES_FIELD_NUMBER = 3;
    private ihc0 votes_ = ihc0.f102235b;
    private String contestId_ = "";
    private String awardId_ = "";
    private String entrypointUri_ = "";

    static {
        SendVotesRequestV2 sendVotesRequestV2 = new SendVotesRequestV2();
        DEFAULT_INSTANCE = sendVotesRequestV2;
        AbstractC0269h.registerDefaultInstance(SendVotesRequestV2.class, sendVotesRequestV2);
    }

    private SendVotesRequestV2() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m22453n(SendVotesRequestV2 sendVotesRequestV2) {
        ihc0 ihc0Var = sendVotesRequestV2.votes_;
        if (!ihc0Var.f102236a) {
            sendVotesRequestV2.votes_ = ihc0Var.m50613h();
        }
        return sendVotesRequestV2.votes_;
    }

    /* JADX INFO: renamed from: o */
    public static void m22454o(SendVotesRequestV2 sendVotesRequestV2, String str) {
        sendVotesRequestV2.getClass();
        str.getClass();
        sendVotesRequestV2.awardId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m22455p(SendVotesRequestV2 sendVotesRequestV2, String str) {
        sendVotesRequestV2.getClass();
        str.getClass();
        sendVotesRequestV2.contestId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m22456q(SendVotesRequestV2 sendVotesRequestV2, String str) {
        sendVotesRequestV2.getClass();
        str.getClass();
        sendVotesRequestV2.entrypointUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static csz0 m22457r() {
        return (csz0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ", new Object[]{"contestId_", "awardId_", "votes_", dsz0.f52677a, "entrypointUri_"});
        }
        if (iOrdinal == 3) {
            return new SendVotesRequestV2();
        }
        if (iOrdinal == 4) {
            return new csz0(DEFAULT_INSTANCE);
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
        synchronized (SendVotesRequestV2.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
