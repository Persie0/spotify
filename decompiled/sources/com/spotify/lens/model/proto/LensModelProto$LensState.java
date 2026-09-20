package com.spotify.lens.model.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.y580;
import p204p.z110;
import p204p.z580;

/* JADX INFO: loaded from: classes7.dex */
public final class LensModelProto$LensState extends AbstractC0269h implements z580 {
    private static final LensModelProto$LensState DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REVISION_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String identifier_ = "";
    private gva revision_ = gva.f84678b;
    private LensModelProto$LensStatus status_;

    static {
        LensModelProto$LensState lensModelProto$LensState = new LensModelProto$LensState();
        DEFAULT_INSTANCE = lensModelProto$LensState;
        AbstractC0269h.registerDefaultInstance(LensModelProto$LensState.class, lensModelProto$LensState);
    }

    private LensModelProto$LensState() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "identifier_", "revision_", "status_"});
        }
        if (iOrdinal == 3) {
            return new LensModelProto$LensState();
        }
        if (iOrdinal == 4) {
            return new y580(DEFAULT_INSTANCE);
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
        synchronized (LensModelProto$LensState.class) {
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
