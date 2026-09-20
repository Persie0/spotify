package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Lock extends AbstractC0269h implements sre0 {
    public static final int BACK_ACTION_FIELD_NUMBER = 3;
    private static final Lock DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 2;
    public static final int LOCK_TYPE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private Action backAction_;
    private int bitField0_;
    private LockLayout layout_;
    private String lockTypeId_ = "";

    static {
        Lock lock = new Lock();
        DEFAULT_INSTANCE = lock;
        AbstractC0269h.registerDefaultInstance(Lock.class, lock);
    }

    private Lock() {
    }

    /* JADX INFO: renamed from: o */
    public static Lock m13239o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "lockTypeId_", "layout_", "backAction_"});
        }
        if (iOrdinal == 3) {
            return new Lock();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 27);
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
        synchronized (Lock.class) {
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
    public final Action m13240n() {
        Action action = this.backAction_;
        return action == null ? Action.m13197o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final LockLayout m13241p() {
        LockLayout lockLayout = this.layout_;
        return lockLayout == null ? LockLayout.m13245o() : lockLayout;
    }

    /* JADX INFO: renamed from: q */
    public final String m13242q() {
        return this.lockTypeId_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13243r() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13244s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
