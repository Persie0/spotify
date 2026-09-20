package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uro;
import p204p.vqq;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class DenominationItem extends AbstractC0269h implements sre0 {
    public static final int BADGE_FIELD_NUMBER = 2;
    private static final DenominationItem DEFAULT_INSTANCE;
    public static final int DENOMINATION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 3;
    public static final int SELECTION_BUTTON_FIELD_NUMBER = 5;
    public static final int SELECTION_STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private DenominationCta selectionButton_;
    private int selectionState_;
    private String denomination_ = "";
    private String badge_ = "";
    private String price_ = "";

    static {
        DenominationItem denominationItem = new DenominationItem();
        DEFAULT_INSTANCE = denominationItem;
        AbstractC0269h.registerDefaultInstance(DenominationItem.class, denominationItem);
    }

    private DenominationItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004\f\u0005ဉ\u0001", new Object[]{"bitField0_", "denomination_", "badge_", "price_", "selectionState_", "selectionButton_"});
        }
        if (iOrdinal == 3) {
            return new DenominationItem();
        }
        if (iOrdinal == 4) {
            return new uro(DEFAULT_INSTANCE, 12);
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
        synchronized (DenominationItem.class) {
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
    public final String m16426n() {
        return this.badge_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16427o() {
        return this.denomination_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16428p() {
        return this.price_;
    }

    /* JADX INFO: renamed from: q */
    public final DenominationCta m16429q() {
        DenominationCta denominationCta = this.selectionButton_;
        return denominationCta == null ? DenominationCta.m16423o() : denominationCta;
    }

    /* JADX INFO: renamed from: r */
    public final vqq m16430r() {
        vqq vqqVar;
        int i = this.selectionState_;
        if (i == 0) {
            vqqVar = vqq.DENOMINATION_SELECTION_STATE_UNSPECIFIED;
        } else if (i != 1) {
            vqqVar = i != 2 ? null : vqq.DENOMINATION_SELECTION_STATE_PRE_SELECTED;
        } else {
            vqqVar = vqq.DENOMINATION_SELECTION_STATE_DISABLED;
        }
        return vqqVar == null ? vqq.UNRECOGNIZED : vqqVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
