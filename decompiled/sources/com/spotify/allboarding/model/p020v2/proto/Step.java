package com.spotify.allboarding.model.p020v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class Step extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final Step DEFAULT_INSTANCE;
    public static final int NEXT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SCREEN_FIELD_NUMBER = 2;
    private Action action_;
    private int bitField0_;
    private Step next_;
    private Screen screen_;

    static {
        Step step = new Step();
        DEFAULT_INSTANCE = step;
        AbstractC0269h.registerDefaultInstance(Step.class, step);
    }

    private Step() {
    }

    /* JADX INFO: renamed from: o */
    public static Step m3215o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "action_", "screen_", "next_"});
        }
        if (iOrdinal == 3) {
            return new Step();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 17);
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
        synchronized (Step.class) {
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
    public final Action m3216n() {
        Action action = this.action_;
        return action == null ? Action.m3175n() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Step m3217p() {
        Step step = this.next_;
        return step == null ? DEFAULT_INSTANCE : step;
    }

    /* JADX INFO: renamed from: q */
    public final Screen m3218q() {
        Screen screen = this.screen_;
        return screen == null ? Screen.m3202q() : screen;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3219r() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
