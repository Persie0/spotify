package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.oiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$GetLoopingBlocksRequest extends AbstractC0269h implements sre0 {
    private static final EsAutomix$GetLoopingBlocksRequest DEFAULT_INSTANCE;
    public static final int LOOPING_STYLE_IDS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int loopingStyleIdsMemoizedSerializedSize = -1;
    private ud50 loopingStyleIds_ = AbstractC0269h.emptyIntList();

    static {
        EsAutomix$GetLoopingBlocksRequest esAutomix$GetLoopingBlocksRequest = new EsAutomix$GetLoopingBlocksRequest();
        DEFAULT_INSTANCE = esAutomix$GetLoopingBlocksRequest;
        AbstractC0269h.registerDefaultInstance(EsAutomix$GetLoopingBlocksRequest.class, esAutomix$GetLoopingBlocksRequest);
    }

    private EsAutomix$GetLoopingBlocksRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m3698n(EsAutomix$GetLoopingBlocksRequest esAutomix$GetLoopingBlocksRequest, ArrayList arrayList) {
        ud50 ud50Var = esAutomix$GetLoopingBlocksRequest.loopingStyleIds_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            esAutomix$GetLoopingBlocksRequest.loopingStyleIds_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        AbstractC2118m8.addAll(arrayList, esAutomix$GetLoopingBlocksRequest.loopingStyleIds_);
    }

    /* JADX INFO: renamed from: o */
    public static oiw m3699o() {
        return (oiw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"loopingStyleIds_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetLoopingBlocksRequest();
        }
        if (iOrdinal == 4) {
            return new oiw(DEFAULT_INSTANCE);
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
        synchronized (EsAutomix$GetLoopingBlocksRequest.class) {
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
