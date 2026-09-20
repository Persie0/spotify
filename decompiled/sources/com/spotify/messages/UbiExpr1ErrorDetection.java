package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.du91;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class UbiExpr1ErrorDetection extends AbstractC0269h implements sre0 {
    public static final int BREADCRUMBS_FIELD_NUMBER = 2;
    private static final UbiExpr1ErrorDetection DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int bitField0_;
    private String reason_ = "";
    private String breadcrumbs_ = "";

    static {
        UbiExpr1ErrorDetection ubiExpr1ErrorDetection = new UbiExpr1ErrorDetection();
        DEFAULT_INSTANCE = ubiExpr1ErrorDetection;
        AbstractC0269h.registerDefaultInstance(UbiExpr1ErrorDetection.class, ubiExpr1ErrorDetection);
    }

    private UbiExpr1ErrorDetection() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14485n(UbiExpr1ErrorDetection ubiExpr1ErrorDetection, String str) {
        ubiExpr1ErrorDetection.getClass();
        str.getClass();
        ubiExpr1ErrorDetection.bitField0_ |= 2;
        ubiExpr1ErrorDetection.breadcrumbs_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14486o(UbiExpr1ErrorDetection ubiExpr1ErrorDetection, String str) {
        ubiExpr1ErrorDetection.getClass();
        ubiExpr1ErrorDetection.bitField0_ |= 1;
        ubiExpr1ErrorDetection.reason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static du91 m14487p() {
        return (du91) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "reason_", "breadcrumbs_"});
        }
        if (iOrdinal == 3) {
            return new UbiExpr1ErrorDetection();
        }
        if (iOrdinal == 4) {
            return new du91(DEFAULT_INSTANCE);
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
        synchronized (UbiExpr1ErrorDetection.class) {
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
