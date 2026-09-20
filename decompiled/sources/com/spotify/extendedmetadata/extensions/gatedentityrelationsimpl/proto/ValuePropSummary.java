package com.spotify.extendedmetadata.extensions.gatedentityrelationsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ValuePropSummary extends AbstractC0269h implements sre0 {
    private static final ValuePropSummary DEFAULT_INSTANCE;
    public static final int FOR_USER_WITHOUT_ACCESS_FIELD_NUMBER = 1;
    public static final int FOR_USER_WITH_ACCESS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String forUserWithoutAccess_ = "";
    private String forUserWithAccess_ = "";

    static {
        ValuePropSummary valuePropSummary = new ValuePropSummary();
        DEFAULT_INSTANCE = valuePropSummary;
        AbstractC0269h.registerDefaultInstance(ValuePropSummary.class, valuePropSummary);
    }

    private ValuePropSummary() {
    }

    /* JADX INFO: renamed from: n */
    public static ValuePropSummary m10139n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "forUserWithoutAccess_", "forUserWithAccess_"});
        }
        if (iOrdinal == 3) {
            return new ValuePropSummary();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 5);
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
        synchronized (ValuePropSummary.class) {
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
    public final String m10140o() {
        return this.forUserWithAccess_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10141p() {
        return this.forUserWithoutAccess_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
