package com.spotify.kidsaccount.api.p083v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tdb1;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class VerifyPinRequest extends AbstractC0269h implements sre0 {
    private static final VerifyPinRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PIN_FIELD_NUMBER = 2;
    private String pin_ = "";

    static {
        VerifyPinRequest verifyPinRequest = new VerifyPinRequest();
        DEFAULT_INSTANCE = verifyPinRequest;
        AbstractC0269h.registerDefaultInstance(VerifyPinRequest.class, verifyPinRequest);
    }

    private VerifyPinRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12105n(VerifyPinRequest verifyPinRequest, String str) {
        verifyPinRequest.getClass();
        verifyPinRequest.pin_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static tdb1 m12107p() {
        return (tdb1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"pin_"});
        }
        if (iOrdinal == 3) {
            return new VerifyPinRequest();
        }
        if (iOrdinal == 4) {
            return new tdb1();
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
        synchronized (VerifyPinRequest.class) {
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
