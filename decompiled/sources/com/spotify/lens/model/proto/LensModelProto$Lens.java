package com.spotify.lens.model.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x580;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class LensModelProto$Lens extends AbstractC0269h implements sre0 {
    private static final LensModelProto$Lens DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String identifier_ = "";

    static {
        LensModelProto$Lens lensModelProto$Lens = new LensModelProto$Lens();
        DEFAULT_INSTANCE = lensModelProto$Lens;
        AbstractC0269h.registerDefaultInstance(LensModelProto$Lens.class, lensModelProto$Lens);
    }

    private LensModelProto$Lens() {
    }

    /* JADX INFO: renamed from: n */
    public static LensModelProto$Lens m12585n() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static x580 m12586o(LensModelProto$Lens lensModelProto$Lens) {
        return (x580) DEFAULT_INSTANCE.createBuilder(lensModelProto$Lens);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"identifier_"});
        }
        if (iOrdinal == 3) {
            return new LensModelProto$Lens();
        }
        if (iOrdinal == 4) {
            return new x580(DEFAULT_INSTANCE);
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
        synchronized (LensModelProto$Lens.class) {
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
