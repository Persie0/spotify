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
public final class PaymentSdkNativeServiceProto$ChipsField extends AbstractC0269h implements sre0 {
    public static final int CHOICES_FIELD_NUMBER = 3;
    private static final PaymentSdkNativeServiceProto$ChipsField DEFAULT_INSTANCE;
    public static final int INITIAL_VALUE_FIELD_NUMBER = 4;
    public static final int LABEL_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String label_ = "";
    private String name_ = "";
    private ae50 choices_ = AbstractC0269h.emptyProtobufList();
    private String initialValue_ = "";

    public static final class ChipsChoice extends AbstractC0269h implements sre0 {
        private static final ChipsChoice DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String label_ = "";
        private String id_ = "";
        private String description_ = "";

        static {
            ChipsChoice chipsChoice = new ChipsChoice();
            DEFAULT_INSTANCE = chipsChoice;
            AbstractC0269h.registerDefaultInstance(ChipsChoice.class, chipsChoice);
        }

        private ChipsChoice() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"label_", "id_", "description_"});
            }
            if (iOrdinal == 3) {
                return new ChipsChoice();
            }
            if (iOrdinal == 4) {
                return new C1117i(DEFAULT_INSTANCE);
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
            synchronized (ChipsChoice.class) {
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

        public final String getDescription() {
            return this.description_;
        }

        public final String getId() {
            return this.id_;
        }

        /* JADX INFO: renamed from: n */
        public final String m16717n() {
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
        PaymentSdkNativeServiceProto$ChipsField paymentSdkNativeServiceProto$ChipsField = new PaymentSdkNativeServiceProto$ChipsField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$ChipsField;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$ChipsField.class, paymentSdkNativeServiceProto$ChipsField);
    }

    private PaymentSdkNativeServiceProto$ChipsField() {
    }

    /* JADX INFO: renamed from: o */
    public static PaymentSdkNativeServiceProto$ChipsField m16713o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ", new Object[]{"label_", "name_", "choices_", ChipsChoice.class, "initialValue_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$ChipsField();
        }
        if (iOrdinal == 4) {
            return new C1115h(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$ChipsField.class) {
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
    public final ae50 m16714n() {
        return this.choices_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m16715p() {
        return this.initialValue_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16716q() {
        return this.label_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
