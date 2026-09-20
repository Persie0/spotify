package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.g2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ValidateAccountRequest extends AbstractC0269h implements sre0 {
    public static final int CLIENT_INFO_FIELD_NUMBER = 2;
    private static final ValidateAccountRequest DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRACKING_FIELD_NUMBER = 3;
    private int bitField0_;
    private ClientInfo clientInfo_;
    private ae50 fields_ = AbstractC0269h.emptyProtobufList();
    private Tracking tracking_;

    static {
        ValidateAccountRequest validateAccountRequest = new ValidateAccountRequest();
        DEFAULT_INSTANCE = validateAccountRequest;
        AbstractC0269h.registerDefaultInstance(ValidateAccountRequest.class, validateAccountRequest);
    }

    private ValidateAccountRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21408n(ValidateAccountRequest validateAccountRequest, ValidationAccountField validationAccountField) {
        validateAccountRequest.getClass();
        validationAccountField.getClass();
        ae50 ae50Var = validateAccountRequest.fields_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            validateAccountRequest.fields_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        validateAccountRequest.fields_.add(validationAccountField);
    }

    /* JADX INFO: renamed from: o */
    public static void m21409o(ValidateAccountRequest validateAccountRequest, ClientInfo clientInfo) {
        validateAccountRequest.getClass();
        clientInfo.getClass();
        validateAccountRequest.clientInfo_ = clientInfo;
        validateAccountRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m21410p(ValidateAccountRequest validateAccountRequest, Tracking tracking) {
        validateAccountRequest.getClass();
        tracking.getClass();
        validateAccountRequest.tracking_ = tracking;
        validateAccountRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static g2b1 m21412r() {
        return (g2b1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "fields_", ValidationAccountField.class, "clientInfo_", "tracking_"});
        }
        if (iOrdinal == 3) {
            return new ValidateAccountRequest();
        }
        if (iOrdinal == 4) {
            return new g2b1();
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
        synchronized (ValidateAccountRequest.class) {
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
