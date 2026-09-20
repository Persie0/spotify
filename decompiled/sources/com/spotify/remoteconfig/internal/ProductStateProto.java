package com.spotify.remoteconfig.internal;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.qkr0;
import p204p.r110;
import p204p.r2n0;
import p204p.rkr0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductStateProto extends AbstractC0269h implements sre0 {
    private static final ProductStateProto DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private ihc0 values_ = ihc0.f102235b;

    static {
        ProductStateProto productStateProto = new ProductStateProto();
        DEFAULT_INSTANCE = productStateProto;
        AbstractC0269h.registerDefaultInstance(ProductStateProto.class, productStateProto);
    }

    private ProductStateProto() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m20414n(ProductStateProto productStateProto) {
        ihc0 ihc0Var = productStateProto.values_;
        if (!ihc0Var.f102236a) {
            productStateProto.values_ = ihc0Var.m50613h();
        }
        return productStateProto.values_;
    }

    /* JADX INFO: renamed from: p */
    public static qkr0 m20415p() {
        return (qkr0) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ProductStateProto m20416q(byte[] bArr) {
        return (ProductStateProto) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", rkr0.f200148a});
        }
        if (iOrdinal == 3) {
            return new ProductStateProto();
        }
        if (iOrdinal == 4) {
            return new qkr0(DEFAULT_INSTANCE);
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
        synchronized (ProductStateProto.class) {
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

    /* JADX INFO: renamed from: o */
    public final Map m20417o() {
        return Collections.unmodifiableMap(this.values_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
