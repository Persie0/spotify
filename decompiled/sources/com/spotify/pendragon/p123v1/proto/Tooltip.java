package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lq51;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t281;
import p204p.u281;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Tooltip extends AbstractC0269h implements sre0 {
    public static final int ANCHOR_VIEW_TYPE_FIELD_NUMBER = 5;
    public static final int ARROW_DIRECTION_FIELD_NUMBER = 7;
    public static final int AUTO_DISMISS_TIMER_LENGTH_FIELD_NUMBER = 6;
    public static final int BASE_TOOLTIP_FIELD_NUMBER = 4;
    private static final Tooltip DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int anchorViewType_;
    private int arrowDirection_;
    private int autoDismissTimerLength_;
    private int bitField0_;
    private int tooltipTemplateCase_ = 0;
    private Object tooltipTemplate_;

    static {
        Tooltip tooltip = new Tooltip();
        DEFAULT_INSTANCE = tooltip;
        AbstractC0269h.registerDefaultInstance(Tooltip.class, tooltip);
    }

    private Tooltip() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static Tooltip m17305s() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004<\u0000\u0005\f\u0006င\u0000\u0007\f", new Object[]{"tooltipTemplate_", "tooltipTemplateCase_", "bitField0_", BaseTooltip.class, "anchorViewType_", "autoDismissTimerLength_", "arrowDirection_"});
        }
        if (iOrdinal == 3) {
            return new Tooltip();
        }
        if (iOrdinal == 4) {
            return new qm71(19);
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
        synchronized (Tooltip.class) {
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
    public final t281 m17306o() {
        t281 t281VarM79893a = t281.m79893a(this.anchorViewType_);
        return t281VarM79893a == null ? t281.UNRECOGNIZED : t281VarM79893a;
    }

    /* JADX INFO: renamed from: p */
    public final u281 m17307p() {
        u281 u281VarM82244a = u281.m82244a(this.arrowDirection_);
        return u281VarM82244a == null ? u281.UNRECOGNIZED : u281VarM82244a;
    }

    /* JADX INFO: renamed from: q */
    public final int m17308q() {
        return this.autoDismissTimerLength_;
    }

    /* JADX INFO: renamed from: r */
    public final BaseTooltip m17309r() {
        return this.tooltipTemplateCase_ == 4 ? (BaseTooltip) this.tooltipTemplate_ : BaseTooltip.m17088q();
    }

    /* JADX INFO: renamed from: t */
    public final int m17310t() {
        return lq51.m59696b(this.tooltipTemplateCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
