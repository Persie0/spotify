package com.spotify.pending_events.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cin0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes9.dex */
public final class CommitPendingEventResponse extends AbstractC0269h implements sre0 {
    private static final CommitPendingEventResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int error_;
    private boolean success_;

    static {
        CommitPendingEventResponse commitPendingEventResponse = new CommitPendingEventResponse();
        DEFAULT_INSTANCE = commitPendingEventResponse;
        AbstractC0269h.registerDefaultInstance(CommitPendingEventResponse.class, commitPendingEventResponse);
    }

    private CommitPendingEventResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static CommitPendingEventResponse m16968p(byte[] bArr) {
        return (CommitPendingEventResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"success_", "error_"});
        }
        if (iOrdinal == 3) {
            return new CommitPendingEventResponse();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 29);
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
        synchronized (CommitPendingEventResponse.class) {
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
    public final cin0 m16969n() {
        cin0 cin0VarM32900a = cin0.m32900a(this.error_);
        return cin0VarM32900a == null ? cin0.UNRECOGNIZED : cin0VarM32900a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16970o() {
        return this.success_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
