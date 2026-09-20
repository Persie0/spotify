package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.jiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$GetComputedTransitionsRequest extends AbstractC0269h implements sre0 {
    private static final EsAutomix$GetComputedTransitionsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_PAIRS_FIELD_NUMBER = 1;
    private ae50 trackPairs_ = AbstractC0269h.emptyProtobufList();

    static {
        EsAutomix$GetComputedTransitionsRequest esAutomix$GetComputedTransitionsRequest = new EsAutomix$GetComputedTransitionsRequest();
        DEFAULT_INSTANCE = esAutomix$GetComputedTransitionsRequest;
        AbstractC0269h.registerDefaultInstance(EsAutomix$GetComputedTransitionsRequest.class, esAutomix$GetComputedTransitionsRequest);
    }

    private EsAutomix$GetComputedTransitionsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3672n(EsAutomix$GetComputedTransitionsRequest esAutomix$GetComputedTransitionsRequest, ArrayList arrayList) {
        ae50 ae50Var = esAutomix$GetComputedTransitionsRequest.trackPairs_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esAutomix$GetComputedTransitionsRequest.trackPairs_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esAutomix$GetComputedTransitionsRequest.trackPairs_);
    }

    /* JADX INFO: renamed from: o */
    public static jiw m3673o() {
        return (jiw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"trackPairs_", EsAutomix$TrackPair.class});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetComputedTransitionsRequest();
        }
        if (iOrdinal == 4) {
            return new jiw(DEFAULT_INSTANCE);
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
        synchronized (EsAutomix$GetComputedTransitionsRequest.class) {
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
