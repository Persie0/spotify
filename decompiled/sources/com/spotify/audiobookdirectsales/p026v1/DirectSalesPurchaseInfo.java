package com.spotify.audiobookdirectsales.p026v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uro;
import p204p.z110;
import p204p.zc91;

/* JADX INFO: loaded from: classes5.dex */
public final class DirectSalesPurchaseInfo extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_MENU_LABEL_FIELD_NUMBER = 4;
    private static final DirectSalesPurchaseInfo DEFAULT_INSTANCE;
    public static final int ENGAGEMENT_UNLOCK_FIELD_NUMBER = 6;
    public static final int FREE_UNLOCK_FIELD_NUMBER = 5;
    public static final int IS_FREE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_BUY_OPTION_IN_CONTEXT_MENU_FIELD_NUMBER = 1;
    public static final int VARIANT_FIELD_NUMBER = 2;
    public static final int WEB_CHECKOUT_UNLOCK_FIELD_NUMBER = 7;
    private boolean isFree_;
    private boolean showBuyOptionInContextMenu_;
    private Object translationVariant_;
    private Object unlockFlow_;
    private int translationVariantCase_ = 0;
    private int unlockFlowCase_ = 0;
    private String contextMenuLabel_ = "";

    static {
        DirectSalesPurchaseInfo directSalesPurchaseInfo = new DirectSalesPurchaseInfo();
        DEFAULT_INSTANCE = directSalesPurchaseInfo;
        AbstractC0269h.registerDefaultInstance(DirectSalesPurchaseInfo.class, directSalesPurchaseInfo);
    }

    private DirectSalesPurchaseInfo() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static DirectSalesPurchaseInfo m3404t(byte[] bArr) {
        return (DirectSalesPurchaseInfo) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002?\u0000\u0003\u0007\u0004Ȉ\u0005<\u0001\u0006<\u0001\u0007<\u0001", new Object[]{"translationVariant_", "translationVariantCase_", "unlockFlow_", "unlockFlowCase_", "showBuyOptionInContextMenu_", "isFree_", "contextMenuLabel_", FreeUnlock.class, EngagementUnlock.class, WebCheckoutUnlock.class});
        }
        if (iOrdinal == 3) {
            return new DirectSalesPurchaseInfo();
        }
        if (iOrdinal == 4) {
            return new uro(DEFAULT_INSTANCE, 22);
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
        synchronized (DirectSalesPurchaseInfo.class) {
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

    public final boolean getIsFree() {
        return this.isFree_;
    }

    /* JADX INFO: renamed from: n */
    public final String m3405n() {
        return this.contextMenuLabel_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EngagementUnlock m3406o() {
        return this.unlockFlowCase_ == 6 ? (EngagementUnlock) this.unlockFlow_ : EngagementUnlock.m3411r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3407p() {
        return this.showBuyOptionInContextMenu_;
    }

    /* JADX INFO: renamed from: q */
    public final int m3408q() {
        int i = this.unlockFlowCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 5) {
            return 1;
        }
        if (i != 6) {
            return i != 7 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: r */
    public final zc91 m3409r() {
        int i = this.translationVariantCase_;
        zc91 zc91Var = zc91.VARIANT_NORMAL;
        if (i == 2) {
            int iIntValue = ((Integer) this.translationVariant_).intValue();
            if (iIntValue != 0) {
                zc91Var = iIntValue != 1 ? null : zc91.VARIANT_SPECIAL;
            }
            if (zc91Var == null) {
                return zc91.UNRECOGNIZED;
            }
        }
        return zc91Var;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3410s() {
        return this.translationVariantCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
