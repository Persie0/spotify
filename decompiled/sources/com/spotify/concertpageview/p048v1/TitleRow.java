package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class TitleRow extends AbstractC0269h implements sre0 {
    public static final int CTA_DESTINATION_FIELD_NUMBER = 3;
    public static final int CTA_FIELD_NUMBER = 2;
    private static final TitleRow DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String value_ = "";
    private String cta_ = "";
    private String ctaDestination_ = "";

    static {
        TitleRow titleRow = new TitleRow();
        DEFAULT_INSTANCE = titleRow;
        AbstractC0269h.registerDefaultInstance(TitleRow.class, titleRow);
    }

    private TitleRow() {
    }

    /* JADX INFO: renamed from: p */
    public static TitleRow m7186p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "value_", "cta_", "ctaDestination_"});
        }
        if (iOrdinal == 3) {
            return new TitleRow();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 13);
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
        synchronized (TitleRow.class) {
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

    public final String getValue() {
        return this.value_;
    }

    /* JADX INFO: renamed from: n */
    public final String m7187n() {
        return this.cta_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7188o() {
        return this.ctaDestination_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7189q() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7190r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
