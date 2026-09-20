package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x0b;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CPGpbCheckoutLoaded extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    public static final int CONTEXT_ID_FIELD_NUMBER = 2;
    private static final CPGpbCheckoutLoaded DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String context_ = "";
    private String contextId_ = "";

    static {
        CPGpbCheckoutLoaded cPGpbCheckoutLoaded = new CPGpbCheckoutLoaded();
        DEFAULT_INSTANCE = cPGpbCheckoutLoaded;
        AbstractC0269h.registerDefaultInstance(CPGpbCheckoutLoaded.class, cPGpbCheckoutLoaded);
    }

    private CPGpbCheckoutLoaded() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11204n(CPGpbCheckoutLoaded cPGpbCheckoutLoaded, String str) {
        cPGpbCheckoutLoaded.getClass();
        str.getClass();
        cPGpbCheckoutLoaded.bitField0_ |= 1;
        cPGpbCheckoutLoaded.context_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11205o(CPGpbCheckoutLoaded cPGpbCheckoutLoaded, String str) {
        cPGpbCheckoutLoaded.getClass();
        str.getClass();
        cPGpbCheckoutLoaded.bitField0_ |= 2;
        cPGpbCheckoutLoaded.contextId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static x0b m11206p() {
        return (x0b) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "context_", "contextId_"});
        }
        if (iOrdinal == 3) {
            return new CPGpbCheckoutLoaded();
        }
        if (iOrdinal == 4) {
            return new x0b(DEFAULT_INSTANCE);
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
        synchronized (CPGpbCheckoutLoaded.class) {
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
