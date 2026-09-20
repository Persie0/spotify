package com.spotify.prefetch_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qlw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsMediaPrefetch$UpdateFutureRequest extends AbstractC0269h implements sre0 {
    private static final EsMediaPrefetch$UpdateFutureRequest DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    public static final int FUTURE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String featureId_ = "";
    private EsMediaPrefetch$Future future_;

    static {
        EsMediaPrefetch$UpdateFutureRequest esMediaPrefetch$UpdateFutureRequest = new EsMediaPrefetch$UpdateFutureRequest();
        DEFAULT_INSTANCE = esMediaPrefetch$UpdateFutureRequest;
        AbstractC0269h.registerDefaultInstance(EsMediaPrefetch$UpdateFutureRequest.class, esMediaPrefetch$UpdateFutureRequest);
    }

    private EsMediaPrefetch$UpdateFutureRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19508n(EsMediaPrefetch$UpdateFutureRequest esMediaPrefetch$UpdateFutureRequest, String str) {
        esMediaPrefetch$UpdateFutureRequest.getClass();
        str.getClass();
        esMediaPrefetch$UpdateFutureRequest.featureId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19509o(EsMediaPrefetch$UpdateFutureRequest esMediaPrefetch$UpdateFutureRequest, EsMediaPrefetch$Future esMediaPrefetch$Future) {
        esMediaPrefetch$UpdateFutureRequest.getClass();
        esMediaPrefetch$Future.getClass();
        esMediaPrefetch$UpdateFutureRequest.future_ = esMediaPrefetch$Future;
        esMediaPrefetch$UpdateFutureRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static qlw m19510p() {
        return (qlw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "featureId_", "future_"});
        }
        if (iOrdinal == 3) {
            return new EsMediaPrefetch$UpdateFutureRequest();
        }
        if (iOrdinal == 4) {
            return new qlw(DEFAULT_INSTANCE);
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
        synchronized (EsMediaPrefetch$UpdateFutureRequest.class) {
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
