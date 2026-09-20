package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.efn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$InputField extends AbstractC0269h implements sre0 {
    private static final PaymentSdkNativeServiceProto$InputField DEFAULT_INSTANCE;
    public static final int HINT_MESSAGE_FIELD_NUMBER = 8;
    public static final int INITIAL_VALUE_FIELD_NUMBER = 6;
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 4;
    public static final int PREFIX_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 10;
    public static final int VALIDATION_RULES_FIELD_NUMBER = 5;
    private int type_;
    private String label_ = "";
    private String name_ = "";
    private String placeholder_ = "";
    private ae50 validationRules_ = AbstractC0269h.emptyProtobufList();
    private String initialValue_ = "";
    private String prefix_ = "";
    private String hintMessage_ = "";

    public static final class InputValidationRule extends AbstractC0269h implements sre0 {
        public static final int CPF_FOR_BRAZIL_FIELD_NUMBER = 5;
        private static final InputValidationRule DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
        public static final int MAX_LENGTH_FIELD_NUMBER = 2;
        public static final int NO_CARD_NUMBER_FIELD_NUMBER = 6;
        private static volatile r2n0 PARSER = null;
        public static final int REGEX_FIELD_NUMBER = 3;
        public static final int REQUIRED_FIELD_NUMBER = 4;
        private Object rule_;
        private int ruleCase_ = 0;
        private String errorMessage_ = "";

        public static final class CpfForBrazilRule extends AbstractC0269h implements sre0 {
            private static final CpfForBrazilRule DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER;

            static {
                CpfForBrazilRule cpfForBrazilRule = new CpfForBrazilRule();
                DEFAULT_INSTANCE = cpfForBrazilRule;
                AbstractC0269h.registerDefaultInstance(CpfForBrazilRule.class, cpfForBrazilRule);
            }

            private CpfForBrazilRule() {
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
                    return new CpfForBrazilRule();
                }
                if (iOrdinal == 4) {
                    return new C1129o(DEFAULT_INSTANCE);
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
                synchronized (CpfForBrazilRule.class) {
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

        public static final class MaxLengthRule extends AbstractC0269h implements sre0 {
            private static final MaxLengthRule DEFAULT_INSTANCE;
            public static final int MAX_LENGTH_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private int maxLength_;

            static {
                MaxLengthRule maxLengthRule = new MaxLengthRule();
                DEFAULT_INSTANCE = maxLengthRule;
                AbstractC0269h.registerDefaultInstance(MaxLengthRule.class, maxLengthRule);
            }

            private MaxLengthRule() {
            }

            /* JADX INFO: renamed from: n */
            public static MaxLengthRule m16754n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"maxLength_"});
                }
                if (iOrdinal == 3) {
                    return new MaxLengthRule();
                }
                if (iOrdinal == 4) {
                    return new C1131p(DEFAULT_INSTANCE);
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
                synchronized (MaxLengthRule.class) {
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

            /* JADX INFO: renamed from: o */
            public final int m16755o() {
                return this.maxLength_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class NoCardNumberRule extends AbstractC0269h implements sre0 {
            private static final NoCardNumberRule DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER;

            static {
                NoCardNumberRule noCardNumberRule = new NoCardNumberRule();
                DEFAULT_INSTANCE = noCardNumberRule;
                AbstractC0269h.registerDefaultInstance(NoCardNumberRule.class, noCardNumberRule);
            }

            private NoCardNumberRule() {
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
                    return new NoCardNumberRule();
                }
                if (iOrdinal == 4) {
                    return new C1133q(DEFAULT_INSTANCE);
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
                synchronized (NoCardNumberRule.class) {
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

        public static final class RegexRule extends AbstractC0269h implements sre0 {
            private static final RegexRule DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int REGEX_FIELD_NUMBER = 1;
            private String regex_ = "";

            static {
                RegexRule regexRule = new RegexRule();
                DEFAULT_INSTANCE = regexRule;
                AbstractC0269h.registerDefaultInstance(RegexRule.class, regexRule);
            }

            private RegexRule() {
            }

            /* JADX INFO: renamed from: n */
            public static RegexRule m16756n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"regex_"});
                }
                if (iOrdinal == 3) {
                    return new RegexRule();
                }
                if (iOrdinal == 4) {
                    return new C1135r(DEFAULT_INSTANCE);
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
                synchronized (RegexRule.class) {
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

            /* JADX INFO: renamed from: o */
            public final String m16757o() {
                return this.regex_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class RequiredRule extends AbstractC0269h implements sre0 {
            private static final RequiredRule DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER;

            static {
                RequiredRule requiredRule = new RequiredRule();
                DEFAULT_INSTANCE = requiredRule;
                AbstractC0269h.registerDefaultInstance(RequiredRule.class, requiredRule);
            }

            private RequiredRule() {
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
                    return new RequiredRule();
                }
                if (iOrdinal == 4) {
                    return new C1137s(DEFAULT_INSTANCE);
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
                synchronized (RequiredRule.class) {
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
            InputValidationRule inputValidationRule = new InputValidationRule();
            DEFAULT_INSTANCE = inputValidationRule;
            AbstractC0269h.registerDefaultInstance(InputValidationRule.class, inputValidationRule);
        }

        private InputValidationRule() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"rule_", "ruleCase_", "errorMessage_", MaxLengthRule.class, RegexRule.class, RequiredRule.class, CpfForBrazilRule.class, NoCardNumberRule.class});
            }
            if (iOrdinal == 3) {
                return new InputValidationRule();
            }
            if (iOrdinal == 4) {
                return new C1127n(DEFAULT_INSTANCE);
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
            synchronized (InputValidationRule.class) {
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

        /* JADX INFO: renamed from: n */
        public final String m16750n() {
            return this.errorMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final MaxLengthRule m16751o() {
            return this.ruleCase_ == 2 ? (MaxLengthRule) this.rule_ : MaxLengthRule.m16754n();
        }

        /* JADX INFO: renamed from: p */
        public final RegexRule m16752p() {
            return this.ruleCase_ == 3 ? (RegexRule) this.rule_ : RegexRule.m16756n();
        }

        /* JADX INFO: renamed from: q */
        public final int m16753q() {
            int i = this.ruleCase_;
            if (i == 0) {
                return 6;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                return i != 6 ? 0 : 5;
            }
            return 4;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaymentSdkNativeServiceProto$InputField paymentSdkNativeServiceProto$InputField = new PaymentSdkNativeServiceProto$InputField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$InputField;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$InputField.class, paymentSdkNativeServiceProto$InputField);
    }

    private PaymentSdkNativeServiceProto$InputField() {
    }

    /* JADX INFO: renamed from: n */
    public static PaymentSdkNativeServiceProto$InputField m16742n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0002\n\b\u0000\u0001\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006Ȉ\u0007Ȉ\bȈ\n\f", new Object[]{"label_", "name_", "placeholder_", "validationRules_", InputValidationRule.class, "initialValue_", "prefix_", "hintMessage_", "type_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$InputField();
        }
        if (iOrdinal == 4) {
            return new C1125m(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$InputField.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16743o() {
        return this.hintMessage_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16744p() {
        return this.initialValue_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16745q() {
        return this.label_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16746r() {
        return this.placeholder_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16747s() {
        return this.prefix_;
    }

    /* JADX INFO: renamed from: t */
    public final efn0 m16748t() {
        efn0 efn0Var;
        int i = this.type_;
        if (i == 0) {
            efn0Var = efn0.INPUT_FIELD_TYPE_UNKNOWN;
        } else if (i == 1) {
            efn0Var = efn0.INPUT_FIELD_TYPE_TEXT;
        } else if (i == 2) {
            efn0Var = efn0.INPUT_FIELD_TYPE_NUMBER;
        } else if (i == 3) {
            efn0Var = efn0.INPUT_FIELD_TYPE_PHONE;
        } else if (i != 4) {
            efn0Var = i != 5 ? null : efn0.INPUT_FIELD_TYPE_HIDDEN;
        } else {
            efn0Var = efn0.INPUT_FIELD_TYPE_EMAIL;
        }
        return efn0Var == null ? efn0.UNRECOGNIZED : efn0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m16749u() {
        return this.validationRules_;
    }
}
