package com.spotify.pending_events.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jnf;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CommitPendingEventRequest extends AbstractC0269h implements sre0 {
    private static final CommitPendingEventRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TOKEN_EVENT_NAME_FIELD_NUMBER = 1;
    public static final int TOKEN_SEQUENCE_NO_FIELD_NUMBER = 2;
    private String tokenEventName_ = "";
    private int tokenSequenceNo_;

    static {
        CommitPendingEventRequest commitPendingEventRequest = new CommitPendingEventRequest();
        DEFAULT_INSTANCE = commitPendingEventRequest;
        AbstractC0269h.registerDefaultInstance(CommitPendingEventRequest.class, commitPendingEventRequest);
    }

    private CommitPendingEventRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16965n(CommitPendingEventRequest commitPendingEventRequest, String str) {
        commitPendingEventRequest.getClass();
        str.getClass();
        commitPendingEventRequest.tokenEventName_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16966o(CommitPendingEventRequest commitPendingEventRequest, int i) {
        commitPendingEventRequest.tokenSequenceNo_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static jnf m16967p() {
        return (jnf) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u000b", new Object[]{"tokenEventName_", "tokenSequenceNo_"});
        }
        if (iOrdinal == 3) {
            return new CommitPendingEventRequest();
        }
        if (iOrdinal == 4) {
            return new jnf(DEFAULT_INSTANCE);
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
        synchronized (CommitPendingEventRequest.class) {
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
