package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SendVotesRequest extends AbstractC0269h implements sre0 {
    private static final SendVotesRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_ID_FIELD_NUMBER = 1;
    public static final int VOTES_FIELD_NUMBER = 2;
    private String playlistId_ = "";
    private ae50 votes_ = AbstractC0269h.emptyProtobufList();

    public static final class Vote extends AbstractC0269h implements sre0 {
        private static final Vote DEFAULT_INSTANCE;
        public static final int NOMINEE_ID_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String nomineeId_ = "";

        static {
            Vote vote = new Vote();
            DEFAULT_INSTANCE = vote;
            AbstractC0269h.registerDefaultInstance(Vote.class, vote);
        }

        private Vote() {
        }

        /* JADX INFO: renamed from: n */
        public static void m22402n(Vote vote, String str) {
            vote.getClass();
            str.getClass();
            vote.nomineeId_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static C1332h m22403o() {
            return (C1332h) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"nomineeId_"});
            }
            if (iOrdinal == 3) {
                return new Vote();
            }
            if (iOrdinal == 4) {
                return new C1332h(DEFAULT_INSTANCE);
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
            synchronized (Vote.class) {
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

    static {
        SendVotesRequest sendVotesRequest = new SendVotesRequest();
        DEFAULT_INSTANCE = sendVotesRequest;
        AbstractC0269h.registerDefaultInstance(SendVotesRequest.class, sendVotesRequest);
    }

    private SendVotesRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22399n(SendVotesRequest sendVotesRequest, ArrayList arrayList) {
        ae50 ae50Var = sendVotesRequest.votes_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            sendVotesRequest.votes_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, sendVotesRequest.votes_);
    }

    /* JADX INFO: renamed from: o */
    public static void m22400o(SendVotesRequest sendVotesRequest, String str) {
        sendVotesRequest.getClass();
        str.getClass();
        sendVotesRequest.playlistId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static C1331g m22401p() {
        return (C1331g) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"playlistId_", "votes_", Vote.class});
        }
        if (iOrdinal == 3) {
            return new SendVotesRequest();
        }
        if (iOrdinal == 4) {
            return new C1331g(DEFAULT_INSTANCE);
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
        synchronized (SendVotesRequest.class) {
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
