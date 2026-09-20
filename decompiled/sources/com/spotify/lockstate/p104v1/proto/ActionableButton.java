package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ActionableButton extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final ActionableButton DEFAULT_INSTANCE;
    public static final int ICON_URI_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SEMANTIC_ACTION_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    private Action action_;
    private int bitField0_;
    private String text_ = "";
    private String iconUri_ = "";
    private String semanticAction_ = "";

    static {
        ActionableButton actionableButton = new ActionableButton();
        DEFAULT_INSTANCE = actionableButton;
        AbstractC0269h.registerDefaultInstance(ActionableButton.class, actionableButton);
    }

    private ActionableButton() {
    }

    /* JADX INFO: renamed from: o */
    public static ActionableButton m13208o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ለ\u0001\u0004ለ\u0002", new Object[]{"bitField0_", "text_", "action_", "iconUri_", "semanticAction_"});
        }
        if (iOrdinal == 3) {
            return new ActionableButton();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 18);
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
        synchronized (ActionableButton.class) {
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
    public final Action m13209n() {
        Action action = this.action_;
        return action == null ? Action.m13197o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m13210p() {
        return this.iconUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m13211q() {
        return this.semanticAction_;
    }

    /* JADX INFO: renamed from: r */
    public final String m13212r() {
        return this.text_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13213s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m13214t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13215u() {
        return (this.bitField0_ & 4) != 0;
    }
}
