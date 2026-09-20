package com.spotify.unboxingfeatureflows.api.p170v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.l70;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Action extends AbstractC0269h implements sre0 {
    private static final Action DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_URI_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String targetUri_ = "";
    private int type_;

    static {
        Action action = new Action();
        DEFAULT_INSTANCE = action;
        AbstractC0269h.registerDefaultInstance(Action.class, action);
    }

    private Action() {
    }

    /* JADX INFO: renamed from: n */
    public static Action m21930n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "targetUri_"});
        }
        if (iOrdinal == 3) {
            return new Action();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 15);
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
        synchronized (Action.class) {
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
    public final String m21931o() {
        return this.targetUri_;
    }

    /* JADX INFO: renamed from: p */
    public final l70 m21932p() {
        l70 l70Var;
        int i = this.type_;
        if (i == 0) {
            l70Var = l70.UNSPECIFIED;
        } else if (i == 1) {
            l70Var = l70.NAVIGATE;
        } else if (i == 2) {
            l70Var = l70.DOWNLOAD;
        } else if (i != 3) {
            l70Var = i != 4 ? null : l70.QUEUE;
        } else {
            l70Var = l70.EXPAND_NPV;
        }
        return l70Var == null ? l70.UNRECOGNIZED : l70Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
