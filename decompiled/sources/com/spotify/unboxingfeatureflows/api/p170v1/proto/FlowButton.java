package com.spotify.unboxingfeatureflows.api.p170v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowButton extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BUTTON_TEXT_FIELD_NUMBER = 1;
    private static final FlowButton DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private Action action_;
    private int bitField0_;
    private String buttonText_ = "";

    static {
        FlowButton flowButton = new FlowButton();
        DEFAULT_INSTANCE = flowButton;
        AbstractC0269h.registerDefaultInstance(FlowButton.class, flowButton);
    }

    private FlowButton() {
    }

    /* JADX INFO: renamed from: p */
    public static FlowButton m21935p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "buttonText_", "action_"});
        }
        if (iOrdinal == 3) {
            return new FlowButton();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 14);
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
        synchronized (FlowButton.class) {
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
    public final Action m21936n() {
        Action action = this.action_;
        return action == null ? Action.m21930n() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21937o() {
        return this.buttonText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
