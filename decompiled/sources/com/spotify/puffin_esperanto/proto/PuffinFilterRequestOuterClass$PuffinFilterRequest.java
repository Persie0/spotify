package com.spotify.puffin_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y8t0;
import p204p.z110;
import p204p.z8t0;

/* JADX INFO: loaded from: classes10.dex */
public final class PuffinFilterRequestOuterClass$PuffinFilterRequest extends AbstractC0269h implements sre0 {
    private static final PuffinFilterRequestOuterClass$PuffinFilterRequest DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int IS_O_FIELD_NUMBER = 3;
    public static final int IS_V_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 5;
    private ae50 filters_ = AbstractC0269h.emptyProtobufList();
    private boolean isO_;
    private boolean isV_;
    private int reason_;

    static {
        PuffinFilterRequestOuterClass$PuffinFilterRequest puffinFilterRequestOuterClass$PuffinFilterRequest = new PuffinFilterRequestOuterClass$PuffinFilterRequest();
        DEFAULT_INSTANCE = puffinFilterRequestOuterClass$PuffinFilterRequest;
        AbstractC0269h.registerDefaultInstance(PuffinFilterRequestOuterClass$PuffinFilterRequest.class, puffinFilterRequestOuterClass$PuffinFilterRequest);
    }

    private PuffinFilterRequestOuterClass$PuffinFilterRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20009n(PuffinFilterRequestOuterClass$PuffinFilterRequest puffinFilterRequestOuterClass$PuffinFilterRequest, Iterable iterable) {
        ae50 ae50Var = puffinFilterRequestOuterClass$PuffinFilterRequest.filters_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            puffinFilterRequestOuterClass$PuffinFilterRequest.filters_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, puffinFilterRequestOuterClass$PuffinFilterRequest.filters_);
    }

    /* JADX INFO: renamed from: o */
    public static void m20010o(PuffinFilterRequestOuterClass$PuffinFilterRequest puffinFilterRequestOuterClass$PuffinFilterRequest, boolean z) {
        puffinFilterRequestOuterClass$PuffinFilterRequest.isO_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m20011p(PuffinFilterRequestOuterClass$PuffinFilterRequest puffinFilterRequestOuterClass$PuffinFilterRequest, boolean z) {
        puffinFilterRequestOuterClass$PuffinFilterRequest.isV_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20012q(PuffinFilterRequestOuterClass$PuffinFilterRequest puffinFilterRequestOuterClass$PuffinFilterRequest, z8t0 z8t0Var) {
        puffinFilterRequestOuterClass$PuffinFilterRequest.getClass();
        puffinFilterRequestOuterClass$PuffinFilterRequest.reason_ = z8t0Var.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static y8t0 m20013r() {
        return (y8t0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u001c\u0003\u0007\u0004\u0007\u0005\f", new Object[]{"filters_", "isO_", "isV_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new PuffinFilterRequestOuterClass$PuffinFilterRequest();
        }
        if (iOrdinal == 4) {
            return new y8t0(DEFAULT_INSTANCE);
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
        synchronized (PuffinFilterRequestOuterClass$PuffinFilterRequest.class) {
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
