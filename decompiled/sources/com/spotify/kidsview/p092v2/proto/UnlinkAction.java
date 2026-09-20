package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g3a1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UnlinkAction extends AbstractC0269h implements sre0 {
    private static final UnlinkAction DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;

    static {
        UnlinkAction unlinkAction = new UnlinkAction();
        DEFAULT_INSTANCE = unlinkAction;
        AbstractC0269h.registerDefaultInstance(UnlinkAction.class, unlinkAction);
    }

    private UnlinkAction() {
    }

    /* JADX INFO: renamed from: n */
    public static UnlinkAction m12516n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"state_"});
        }
        if (iOrdinal == 3) {
            return new UnlinkAction();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 17);
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
        synchronized (UnlinkAction.class) {
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
    public final g3a1 m12517o() {
        g3a1 g3a1Var;
        int i = this.state_;
        if (i == 0) {
            g3a1Var = g3a1.UNLINK_ACTION_STATE_UNSPECIFIED;
        } else if (i != 1) {
            g3a1Var = i != 2 ? null : g3a1.UNLINK_ACTION_STATE_DISABLED_ON_FAMILY_PLAN;
        } else {
            g3a1Var = g3a1.UNLINK_ACTION_STATE_ENABLED;
        }
        return g3a1Var == null ? g3a1.UNRECOGNIZED : g3a1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
