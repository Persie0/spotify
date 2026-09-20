package com.spotify.ondemandtrials.trialstartimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yr41;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class StartTrialResponse extends AbstractC0269h implements sre0 {
    private static final StartTrialResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        StartTrialResponse startTrialResponse = new StartTrialResponse();
        DEFAULT_INSTANCE = startTrialResponse;
        AbstractC0269h.registerDefaultInstance(StartTrialResponse.class, startTrialResponse);
    }

    private StartTrialResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new StartTrialResponse();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 1);
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
        synchronized (StartTrialResponse.class) {
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
    public final yr41 m16253n() {
        yr41 yr41Var;
        int i = this.result_;
        if (i != 0) {
            yr41Var = i != 1 ? null : yr41.NOT_STARTED;
        } else {
            yr41Var = yr41.STARTED;
        }
        return yr41Var == null ? yr41.UNRECOGNIZED : yr41Var;
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
