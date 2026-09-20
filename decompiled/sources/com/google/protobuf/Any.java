package com.google.protobuf;

import p204p.gva;
import p204p.j35;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Any extends AbstractC0269h implements sre0 {
    private static final Any DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private gva value_ = gva.f84678b;

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        AbstractC0269h.registerDefaultInstance(Any.class, any);
    }

    private Any() {
    }

    /* JADX INFO: renamed from: n */
    public static void m1907n(Any any, gva gvaVar) {
        any.getClass();
        gvaVar.getClass();
        any.value_ = gvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static Any m1909p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static j35 m1910s() {
        return (j35) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: t */
    public static Any m1911t(byte[] bArr) {
        return (Any) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
        }
        if (iOrdinal == 3) {
            return new Any();
        }
        if (iOrdinal == 4) {
            return new j35();
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
        synchronized (Any.class) {
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

    /* JADX INFO: renamed from: q */
    public final String m1912q() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final gva m1913r() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
