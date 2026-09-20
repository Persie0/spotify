package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Cta extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 2;
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int COLORS_FIELD_NUMBER = 3;
    private static final Cta DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private Action action_;
    private int bitField0_;
    private Colors colors_;
    private String label_ = "";
    private String accessibilityText_ = "";
    private String ubiId_ = "";

    static {
        Cta cta = new Cta();
        DEFAULT_INSTANCE = cta;
        AbstractC0269h.registerDefaultInstance(Cta.class, cta);
    }

    private Cta() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001d\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003dለ\u0004", new Object[]{"bitField0_", "label_", "accessibilityText_", "colors_", "action_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new Cta();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 21);
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
        synchronized (Cta.class) {
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
    public final Action m21730n() {
        Action action = this.action_;
        return action == null ? Action.m21697o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Colors m21731o() {
        Colors colors = this.colors_;
        return colors == null ? Colors.m21721o() : colors;
    }

    /* JADX INFO: renamed from: p */
    public final String m21732p() {
        return this.label_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21733q() {
        return this.ubiId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
