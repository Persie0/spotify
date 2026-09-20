package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class BackendTransition extends AbstractC0269h implements sre0 {
    public static final int BACKEND_TYPE_FIELD_NUMBER = 2;
    public static final int CURRENT_DEFAULT_FIELD_NUMBER = 5;
    private static final BackendTransition DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 4;
    public static final int INCLUDE_IN_COMPARISON_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSITION_FIELD_NUMBER = 1;
    private int backendType_;
    private boolean currentDefault_;
    private boolean includeInComparison_;
    private String transition_ = "";
    private String identifier_ = "";

    static {
        BackendTransition backendTransition = new BackendTransition();
        DEFAULT_INSTANCE = backendTransition;
        AbstractC0269h.registerDefaultInstance(BackendTransition.class, backendTransition);
    }

    private BackendTransition() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007\u0004Ȉ\u0005\u0007", new Object[]{"transition_", "backendType_", "includeInComparison_", "identifier_", "currentDefault_"});
        }
        if (iOrdinal == 3) {
            return new BackendTransition();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 3);
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
        synchronized (BackendTransition.class) {
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
    public final boolean m19371n() {
        return this.currentDefault_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m19372o() {
        return this.identifier_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m19373p() {
        return this.includeInComparison_;
    }

    /* JADX INFO: renamed from: q */
    public final String m19374q() {
        return this.transition_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
