package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Callback extends AbstractC0269h implements sre0 {
    public static final int AUTO_DISMISS_FIELD_NUMBER = 4;
    private static final Callback DEFAULT_INSTANCE;
    public static final int ON_ERROR_FIELD_NUMBER = 3;
    public static final int ON_SUCCESS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    private boolean autoDismiss_;
    private int bitField0_;
    private Action onError_;
    private Action onSuccess_;
    private String path_ = "";

    static {
        Callback callback = new Callback();
        DEFAULT_INSTANCE = callback;
        AbstractC0269h.registerDefaultInstance(Callback.class, callback);
    }

    private Callback() {
    }

    /* JADX INFO: renamed from: o */
    public static Callback m13216o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007", new Object[]{"bitField0_", "path_", "onSuccess_", "onError_", "autoDismiss_"});
        }
        if (iOrdinal == 3) {
            return new Callback();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 9);
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
        synchronized (Callback.class) {
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

    public final String getPath() {
        return this.path_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m13217n() {
        return this.autoDismiss_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Action m13218p() {
        Action action = this.onError_;
        return action == null ? Action.m13197o() : action;
    }

    /* JADX INFO: renamed from: q */
    public final Action m13219q() {
        Action action = this.onSuccess_;
        return action == null ? Action.m13197o() : action;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13220r() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13221s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
