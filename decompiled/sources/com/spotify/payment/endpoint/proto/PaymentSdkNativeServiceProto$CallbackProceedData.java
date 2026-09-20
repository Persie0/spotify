package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$CallbackProceedData extends AbstractC0269h implements sre0 {
    private static final PaymentSdkNativeServiceProto$CallbackProceedData DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PENDING_FIELD_NUMBER = 1;
    public static final int URL_PROCEED_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    public static final class UrlProceedData extends AbstractC0269h implements sre0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final UrlProceedData DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private ihc0 data_ = ihc0.f102235b;

        static {
            UrlProceedData urlProceedData = new UrlProceedData();
            DEFAULT_INSTANCE = urlProceedData;
            AbstractC0269h.registerDefaultInstance(UrlProceedData.class, urlProceedData);
        }

        private UrlProceedData() {
        }

        /* JADX INFO: renamed from: n */
        public static ihc0 m16696n(UrlProceedData urlProceedData) {
            ihc0 ihc0Var = urlProceedData.data_;
            if (!ihc0Var.f102236a) {
                urlProceedData.data_ = ihc0Var.m50613h();
            }
            return urlProceedData.data_;
        }

        /* JADX INFO: renamed from: o */
        public static C1107d m16697o() {
            return (C1107d) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"data_", AbstractC1109e.f6423a});
            }
            if (iOrdinal == 3) {
                return new UrlProceedData();
            }
            if (iOrdinal == 4) {
                return new C1107d(DEFAULT_INSTANCE);
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
            synchronized (UrlProceedData.class) {
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

    static {
        PaymentSdkNativeServiceProto$CallbackProceedData paymentSdkNativeServiceProto$CallbackProceedData = new PaymentSdkNativeServiceProto$CallbackProceedData();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CallbackProceedData;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$CallbackProceedData.class, paymentSdkNativeServiceProto$CallbackProceedData);
    }

    private PaymentSdkNativeServiceProto$CallbackProceedData() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16693n(PaymentSdkNativeServiceProto$CallbackProceedData paymentSdkNativeServiceProto$CallbackProceedData, PaymentSdkNativeServiceProto$ProceedData.PendingData pendingData) {
        paymentSdkNativeServiceProto$CallbackProceedData.getClass();
        pendingData.getClass();
        paymentSdkNativeServiceProto$CallbackProceedData.value_ = pendingData;
        paymentSdkNativeServiceProto$CallbackProceedData.valueCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m16694o(PaymentSdkNativeServiceProto$CallbackProceedData paymentSdkNativeServiceProto$CallbackProceedData, UrlProceedData urlProceedData) {
        paymentSdkNativeServiceProto$CallbackProceedData.getClass();
        urlProceedData.getClass();
        paymentSdkNativeServiceProto$CallbackProceedData.value_ = urlProceedData;
        paymentSdkNativeServiceProto$CallbackProceedData.valueCase_ = 3;
    }

    /* JADX INFO: renamed from: p */
    public static C1105c m16695p() {
        return (C1105c) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000", new Object[]{"value_", "valueCase_", PaymentSdkNativeServiceProto$ProceedData.PendingData.class, UrlProceedData.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$CallbackProceedData();
        }
        if (iOrdinal == 4) {
            return new C1105c(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$CallbackProceedData.class) {
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
