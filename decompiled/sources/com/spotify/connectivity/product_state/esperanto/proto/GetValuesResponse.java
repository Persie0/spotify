package com.spotify.connectivity.product_state.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vc10;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class GetValuesResponse extends AbstractC0269h implements sre0 {
    private static final GetValuesResponse DEFAULT_INSTANCE;
    public static final int PAIRS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 pairs_ = ihc0.f102235b;

    static {
        GetValuesResponse getValuesResponse = new GetValuesResponse();
        DEFAULT_INSTANCE = getValuesResponse;
        AbstractC0269h.registerDefaultInstance(GetValuesResponse.class, getValuesResponse);
    }

    private GetValuesResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static GetValuesResponse m7521p(byte[] bArr) {
        return (GetValuesResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"pairs_", vc10.f239639a});
        }
        if (iOrdinal == 3) {
            return new GetValuesResponse();
        }
        if (iOrdinal == 4) {
            return new qb10(19);
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
        synchronized (GetValuesResponse.class) {
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
    public final Map m7522o() {
        return Collections.unmodifiableMap(this.pairs_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
