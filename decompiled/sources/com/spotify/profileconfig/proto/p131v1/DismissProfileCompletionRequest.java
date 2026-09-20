package com.spotify.profileconfig.proto.p131v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dqr0;
import p204p.jsr;
import p204p.nrr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class DismissProfileCompletionRequest extends AbstractC0269h implements sre0 {
    public static final int CURRENTSCREEN_FIELD_NUMBER = 1;
    private static final DismissProfileCompletionRequest DEFAULT_INSTANCE;
    public static final int DISMISSALTRIGGER_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int currentScreen_;
    private int dismissalTrigger_;

    static {
        DismissProfileCompletionRequest dismissProfileCompletionRequest = new DismissProfileCompletionRequest();
        DEFAULT_INSTANCE = dismissProfileCompletionRequest;
        AbstractC0269h.registerDefaultInstance(DismissProfileCompletionRequest.class, dismissProfileCompletionRequest);
    }

    private DismissProfileCompletionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19848n(DismissProfileCompletionRequest dismissProfileCompletionRequest, dqr0 dqr0Var) {
        dismissProfileCompletionRequest.getClass();
        dismissProfileCompletionRequest.currentScreen_ = dqr0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m19849o(DismissProfileCompletionRequest dismissProfileCompletionRequest, jsr jsrVar) {
        dismissProfileCompletionRequest.getClass();
        dismissProfileCompletionRequest.dismissalTrigger_ = jsrVar.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static nrr m19851q() {
        return (nrr) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"currentScreen_", "dismissalTrigger_"});
        }
        if (iOrdinal == 3) {
            return new DismissProfileCompletionRequest();
        }
        if (iOrdinal == 4) {
            return new nrr();
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
        synchronized (DismissProfileCompletionRequest.class) {
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
