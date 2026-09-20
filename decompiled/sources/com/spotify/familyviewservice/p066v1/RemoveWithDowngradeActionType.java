package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class RemoveWithDowngradeActionType extends AbstractC0269h implements sre0 {
    private static final RemoveWithDowngradeActionType DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int WITH_SEAT_FIELD_NUMBER = 1;
    private boolean withSeat_;

    static {
        RemoveWithDowngradeActionType removeWithDowngradeActionType = new RemoveWithDowngradeActionType();
        DEFAULT_INSTANCE = removeWithDowngradeActionType;
        AbstractC0269h.registerDefaultInstance(RemoveWithDowngradeActionType.class, removeWithDowngradeActionType);
    }

    private RemoveWithDowngradeActionType() {
    }

    /* JADX INFO: renamed from: n */
    public static RemoveWithDowngradeActionType m10767n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"withSeat_"});
        }
        if (iOrdinal == 3) {
            return new RemoveWithDowngradeActionType();
        }
        if (iOrdinal == 4) {
            return new i8w0(DEFAULT_INSTANCE, 6);
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
        synchronized (RemoveWithDowngradeActionType.class) {
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
    public final boolean m10768o() {
        return this.withSeat_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
