package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$BrandSelection extends AbstractC0269h implements sre0 {
    private static final PaymentSdkNativeServiceProto$BrandSelection DEFAULT_INSTANCE;
    public static final int FORM_KEY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 2;
    private String formKey_ = "";
    private ae50 values_ = AbstractC0269h.emptyProtobufList();

    public static final class BrandSelectionValue extends AbstractC0269h implements sre0 {
        public static final int BIN_REGEX_FIELD_NUMBER = 2;
        private static final BrandSelectionValue DEFAULT_INSTANCE;
        public static final int LOGO_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private String value_ = "";
        private String binRegex_ = "";
        private String logo_ = "";

        static {
            BrandSelectionValue brandSelectionValue = new BrandSelectionValue();
            DEFAULT_INSTANCE = brandSelectionValue;
            AbstractC0269h.registerDefaultInstance(BrandSelectionValue.class, brandSelectionValue);
        }

        private BrandSelectionValue() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"value_", "binRegex_", "logo_"});
            }
            if (iOrdinal == 3) {
                return new BrandSelectionValue();
            }
            if (iOrdinal == 4) {
                return new C1101a(DEFAULT_INSTANCE);
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
            synchronized (BrandSelectionValue.class) {
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
        PaymentSdkNativeServiceProto$BrandSelection paymentSdkNativeServiceProto$BrandSelection = new PaymentSdkNativeServiceProto$BrandSelection();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$BrandSelection;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$BrandSelection.class, paymentSdkNativeServiceProto$BrandSelection);
    }

    private PaymentSdkNativeServiceProto$BrandSelection() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"formKey_", "values_", BrandSelectionValue.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$BrandSelection();
        }
        if (iOrdinal == 4) {
            return new C1103b(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$BrandSelection.class) {
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
