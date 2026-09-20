package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$GetBeatmatchOptOutTransitionDurationResponse extends AbstractC0269h implements sre0 {
    private static final EsAutomix$GetBeatmatchOptOutTransitionDurationResponse DEFAULT_INSTANCE;
    public static final int MILLISECONDS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int milliseconds_;

    static {
        EsAutomix$GetBeatmatchOptOutTransitionDurationResponse esAutomix$GetBeatmatchOptOutTransitionDurationResponse = new EsAutomix$GetBeatmatchOptOutTransitionDurationResponse();
        DEFAULT_INSTANCE = esAutomix$GetBeatmatchOptOutTransitionDurationResponse;
        AbstractC0269h.registerDefaultInstance(EsAutomix$GetBeatmatchOptOutTransitionDurationResponse.class, esAutomix$GetBeatmatchOptOutTransitionDurationResponse);
    }

    private EsAutomix$GetBeatmatchOptOutTransitionDurationResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static EsAutomix$GetBeatmatchOptOutTransitionDurationResponse m3670o(byte[] bArr) {
        return (EsAutomix$GetBeatmatchOptOutTransitionDurationResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"milliseconds_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetBeatmatchOptOutTransitionDurationResponse();
        }
        if (iOrdinal == 4) {
            return new iiw(DEFAULT_INSTANCE, 3);
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
        synchronized (EsAutomix$GetBeatmatchOptOutTransitionDurationResponse.class) {
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
    public final int m3671n() {
        return this.milliseconds_;
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
