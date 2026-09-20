package com.spotify.upsells.p173v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetUpsellResponse extends AbstractC0269h implements sre0 {
    public static final int BOTTOM_SHEET_FIELD_NUMBER = 2;
    private static final GetUpsellResponse DEFAULT_INSTANCE;
    public static final int INLINE_UPSELL_FIELD_NUMBER = 3;
    public static final int NO_UPSELL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int upsellCase_ = 0;
    private Object upsell_;

    static {
        GetUpsellResponse getUpsellResponse = new GetUpsellResponse();
        DEFAULT_INSTANCE = getUpsellResponse;
        AbstractC0269h.registerDefaultInstance(GetUpsellResponse.class, getUpsellResponse);
    }

    private GetUpsellResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"upsell_", "upsellCase_", NoUpsell.class, BottomSheet.class, InlineUpsell.class});
        }
        if (iOrdinal == 3) {
            return new GetUpsellResponse();
        }
        if (iOrdinal == 4) {
            return new qb10(DEFAULT_INSTANCE, 15);
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
        synchronized (GetUpsellResponse.class) {
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
    public final BottomSheet m22068n() {
        return this.upsellCase_ == 2 ? (BottomSheet) this.upsell_ : BottomSheet.m22050o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final InlineUpsell m22069o() {
        return this.upsellCase_ == 3 ? (InlineUpsell) this.upsell_ : InlineUpsell.m22072o();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22070p() {
        return this.upsellCase_ == 2;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22071q() {
        return this.upsellCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
