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
public final class PaymentSdkNativeServiceProto$DropdownField extends AbstractC0269h implements sre0 {
    public static final int CHOICES_FIELD_NUMBER = 3;
    private static final PaymentSdkNativeServiceProto$DropdownField DEFAULT_INSTANCE;
    public static final int INITIAL_VALUE_FIELD_NUMBER = 4;
    public static final int LABEL_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String label_ = "";
    private String name_ = "";
    private ae50 choices_ = AbstractC0269h.emptyProtobufList();
    private String initialValue_ = "";

    public static final class DropdownChoice extends AbstractC0269h implements sre0 {
        private static final DropdownChoice DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String label_ = "";
        private String id_ = "";

        static {
            DropdownChoice dropdownChoice = new DropdownChoice();
            DEFAULT_INSTANCE = dropdownChoice;
            AbstractC0269h.registerDefaultInstance(DropdownChoice.class, dropdownChoice);
        }

        private DropdownChoice() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"label_", "id_"});
            }
            if (iOrdinal == 3) {
                return new DropdownChoice();
            }
            if (iOrdinal == 4) {
                return new C1121k(DEFAULT_INSTANCE);
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
            synchronized (DropdownChoice.class) {
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

        public final String getId() {
            return this.id_;
        }

        /* JADX INFO: renamed from: n */
        public final String m16722n() {
            return this.label_;
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
        PaymentSdkNativeServiceProto$DropdownField paymentSdkNativeServiceProto$DropdownField = new PaymentSdkNativeServiceProto$DropdownField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$DropdownField;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$DropdownField.class, paymentSdkNativeServiceProto$DropdownField);
    }

    private PaymentSdkNativeServiceProto$DropdownField() {
    }

    /* JADX INFO: renamed from: o */
    public static PaymentSdkNativeServiceProto$DropdownField m16718o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ", new Object[]{"label_", "name_", "choices_", DropdownChoice.class, "initialValue_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$DropdownField();
        }
        if (iOrdinal == 4) {
            return new C1119j(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$DropdownField.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m16719n() {
        return this.choices_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m16720p() {
        return this.initialValue_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16721q() {
        return this.label_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
