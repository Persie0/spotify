package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Target extends AbstractC0269h implements sre0 {
    private static final Target DEFAULT_INSTANCE;
    public static final int IN_APP_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int WEB_URL_FIELD_NUMBER = 2;
    private int targetCase_ = 0;
    private Object target_;

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        AbstractC0269h.registerDefaultInstance(Target.class, target);
    }

    private Target() {
    }

    /* JADX INFO: renamed from: n */
    public static Target m13275n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"target_", "targetCase_"});
        }
        if (iOrdinal == 3) {
            return new Target();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 4);
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
        synchronized (Target.class) {
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
    public final String m13276o() {
        return this.targetCase_ == 1 ? (String) this.target_ : "";
    }

    /* JADX INFO: renamed from: p */
    public final String m13277p() {
        return this.targetCase_ == 2 ? (String) this.target_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final boolean m13278q() {
        return this.targetCase_ == 1;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13279r() {
        return this.targetCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
