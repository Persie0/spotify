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
public final class PaymentSdkNativeServiceProto$ProceedData extends AbstractC0269h implements sre0 {
    private static final PaymentSdkNativeServiceProto$ProceedData DEFAULT_INSTANCE;
    public static final int FORM_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PENDING_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    public static final class FormData extends AbstractC0269h implements sre0 {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final FormData DEFAULT_INSTANCE;
        public static final int FORM_ID_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private ihc0 data_ = ihc0.f102235b;
        private String formId_ = "";

        static {
            FormData formData = new FormData();
            DEFAULT_INSTANCE = formData;
            AbstractC0269h.registerDefaultInstance(FormData.class, formData);
        }

        private FormData() {
        }

        /* JADX INFO: renamed from: n */
        public static ihc0 m16833n(FormData formData) {
            ihc0 ihc0Var = formData.data_;
            if (!ihc0Var.f102236a) {
                formData.data_ = ihc0Var.m50613h();
            }
            return formData.data_;
        }

        /* JADX INFO: renamed from: o */
        public static void m16834o(FormData formData, String str) {
            formData.getClass();
            str.getClass();
            formData.formId_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static C1102a0 m16835p() {
            return (C1102a0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"formId_", "data_", AbstractC1104b0.f6422a});
            }
            if (iOrdinal == 3) {
                return new FormData();
            }
            if (iOrdinal == 4) {
                return new C1102a0(DEFAULT_INSTANCE);
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
            synchronized (FormData.class) {
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

    public static final class PendingData extends AbstractC0269h implements sre0 {
        private static final PendingData DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            PendingData pendingData = new PendingData();
            DEFAULT_INSTANCE = pendingData;
            AbstractC0269h.registerDefaultInstance(PendingData.class, pendingData);
        }

        private PendingData() {
        }

        /* JADX INFO: renamed from: n */
        public static C1106c0 m16836n() {
            return (C1106c0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new PendingData();
            }
            if (iOrdinal == 4) {
                return new C1106c0(DEFAULT_INSTANCE);
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
            synchronized (PendingData.class) {
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
        PaymentSdkNativeServiceProto$ProceedData paymentSdkNativeServiceProto$ProceedData = new PaymentSdkNativeServiceProto$ProceedData();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$ProceedData;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$ProceedData.class, paymentSdkNativeServiceProto$ProceedData);
    }

    private PaymentSdkNativeServiceProto$ProceedData() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16830n(PaymentSdkNativeServiceProto$ProceedData paymentSdkNativeServiceProto$ProceedData, FormData formData) {
        paymentSdkNativeServiceProto$ProceedData.getClass();
        formData.getClass();
        paymentSdkNativeServiceProto$ProceedData.value_ = formData;
        paymentSdkNativeServiceProto$ProceedData.valueCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m16831o(PaymentSdkNativeServiceProto$ProceedData paymentSdkNativeServiceProto$ProceedData, PendingData pendingData) {
        paymentSdkNativeServiceProto$ProceedData.getClass();
        pendingData.getClass();
        paymentSdkNativeServiceProto$ProceedData.value_ = pendingData;
        paymentSdkNativeServiceProto$ProceedData.valueCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static C1151z m16832p() {
        return (C1151z) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"value_", "valueCase_", PendingData.class, FormData.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$ProceedData();
        }
        if (iOrdinal == 4) {
            return new C1151z(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$ProceedData.class) {
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
