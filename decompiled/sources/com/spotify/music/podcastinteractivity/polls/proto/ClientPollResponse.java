package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ime;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ClientPollResponse extends AbstractC0269h implements sre0 {
    private static final ClientPollResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POLL_FIELD_NUMBER = 1;
    public static final int USER_REPORTED_FIELD_NUMBER = 3;
    public static final int USER_VOTE_OPTION_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Poll poll_;
    private boolean userReported_;
    private int userVoteOptionIdsMemoizedSerializedSize = -1;
    private ud50 userVoteOptionIds_ = AbstractC0269h.emptyIntList();

    static {
        ClientPollResponse clientPollResponse = new ClientPollResponse();
        DEFAULT_INSTANCE = clientPollResponse;
        AbstractC0269h.registerDefaultInstance(ClientPollResponse.class, clientPollResponse);
    }

    private ClientPollResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15723n(ClientPollResponse clientPollResponse, Poll poll) {
        clientPollResponse.getClass();
        poll.getClass();
        clientPollResponse.poll_ = poll;
        clientPollResponse.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static ClientPollResponse m15724o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static ime m15725s(ClientPollResponse clientPollResponse) {
        return (ime) DEFAULT_INSTANCE.createBuilder(clientPollResponse);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002'\u0003\u0007", new Object[]{"bitField0_", "poll_", "userVoteOptionIds_", "userReported_"});
        }
        if (iOrdinal == 3) {
            return new ClientPollResponse();
        }
        if (iOrdinal == 4) {
            return new ime(DEFAULT_INSTANCE);
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
        synchronized (ClientPollResponse.class) {
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

    /* JADX INFO: renamed from: p */
    public final Poll m15726p() {
        Poll poll = this.poll_;
        return poll == null ? Poll.m15735p() : poll;
    }

    /* JADX INFO: renamed from: q */
    public final ud50 m15727q() {
        return this.userVoteOptionIds_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m15728r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
