package com.google.protobuf;

import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.juy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class FieldMask extends AbstractC0269h implements sre0 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private ae50 paths_ = AbstractC0269h.emptyProtobufList();

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        AbstractC0269h.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    /* JADX INFO: renamed from: n */
    public static void m1937n(FieldMask fieldMask, String str) {
        fieldMask.getClass();
        ae50 ae50Var = fieldMask.paths_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            fieldMask.paths_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        fieldMask.paths_.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static FieldMask m1938o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static juy m1939p() {
        return (juy) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static juy m1940q(FieldMask fieldMask) {
        return (juy) DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
        }
        if (iOrdinal == 3) {
            return new FieldMask();
        }
        if (iOrdinal == 4) {
            return new juy(DEFAULT_INSTANCE);
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
        synchronized (FieldMask.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
