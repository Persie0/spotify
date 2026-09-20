package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.d8q0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PollVoteRequest extends AbstractC0269h implements sre0 {
    private static final PollVoteRequest DEFAULT_INSTANCE;
    public static final int OPTIONS_SELECTED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int POLL_ID_FIELD_NUMBER = 1;
    private ae50 optionsSelected_ = AbstractC0269h.emptyProtobufList();
    private int pollId_;

    static {
        PollVoteRequest pollVoteRequest = new PollVoteRequest();
        DEFAULT_INSTANCE = pollVoteRequest;
        AbstractC0269h.registerDefaultInstance(PollVoteRequest.class, pollVoteRequest);
    }

    private PollVoteRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15750n(PollVoteRequest pollVoteRequest, ArrayList arrayList) {
        ae50 ae50Var = pollVoteRequest.optionsSelected_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            pollVoteRequest.optionsSelected_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, pollVoteRequest.optionsSelected_);
    }

    /* JADX INFO: renamed from: o */
    public static void m15751o(PollVoteRequest pollVoteRequest, int i) {
        pollVoteRequest.pollId_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static d8q0 m15752p() {
        return (d8q0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"pollId_", "optionsSelected_", PollOption.class});
        }
        if (iOrdinal == 3) {
            return new PollVoteRequest();
        }
        if (iOrdinal == 4) {
            return new d8q0(DEFAULT_INSTANCE);
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
        synchronized (PollVoteRequest.class) {
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
