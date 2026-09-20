package com.spotify.listeningactivity.p097v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import java.util.Iterator;
import p204p.AbstractC1733c9;
import p204p.k47;
import p204p.n350;
import p204p.niy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.v810;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GetFeedRequest extends AbstractC0269h implements sre0 {
    private static final GetFeedRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_SOURCES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private static final vd50 includeSources_converter_ = new k47(12);
    private int includeSourcesMemoizedSerializedSize;
    private ud50 includeSources_ = AbstractC0269h.emptyIntList();
    private boolean unused_;

    static {
        GetFeedRequest getFeedRequest = new GetFeedRequest();
        DEFAULT_INSTANCE = getFeedRequest;
        AbstractC0269h.registerDefaultInstance(GetFeedRequest.class, getFeedRequest);
    }

    private GetFeedRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m12933n(GetFeedRequest getFeedRequest, ArrayList arrayList) {
        ud50 ud50Var = getFeedRequest.includeSources_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            getFeedRequest.includeSources_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            niy niyVar = (niy) it.next();
            ((n350) getFeedRequest.includeSources_).m63581b(niyVar.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m12934o(GetFeedRequest getFeedRequest) {
        getFeedRequest.unused_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static v810 m12936q() {
        return (v810) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0007\u0003,", new Object[]{"unused_", "includeSources_"});
        }
        if (iOrdinal == 3) {
            return new GetFeedRequest();
        }
        if (iOrdinal == 4) {
            return new v810();
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
        synchronized (GetFeedRequest.class) {
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
