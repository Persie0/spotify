package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class FormField extends AbstractC0269h implements sre0 {
    public static final int AUTOCOMPLETE_FIELD_NUMBER = 5;
    private static final FormField DEFAULT_INSTANCE;
    public static final int DROPDOWN_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    public static final int VALIDATION_RULES_FIELD_NUMBER = 100;
    private Object field_;
    private int fieldCase_ = 0;
    private String id_ = "";
    private String label_ = "";
    private ae50 validationRules_ = AbstractC0269h.emptyProtobufList();

    public static final class Autocomplete extends AbstractC0269h implements sre0 {
        public static final int ATTRIBUTION_TEXT_FIELD_NUMBER = 4;
        private static final Autocomplete DEFAULT_INSTANCE;
        public static final int INITIAL_VALUE_FIELD_NUMBER = 5;
        public static final int MANUAL_ENTRY_CTA_FIELD_NUMBER = 2;
        public static final int NO_RESULTS_MESSAGE_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int SEARCH_PLACEHOLDER_FIELD_NUMBER = 1;
        private String searchPlaceholder_ = "";
        private String manualEntryCta_ = "";
        private String noResultsMessage_ = "";
        private String attributionText_ = "";
        private String initialValue_ = "";

        static {
            Autocomplete autocomplete = new Autocomplete();
            DEFAULT_INSTANCE = autocomplete;
            AbstractC0269h.registerDefaultInstance(Autocomplete.class, autocomplete);
        }

        private Autocomplete() {
        }

        /* JADX INFO: renamed from: n */
        public static void m2389n(Autocomplete autocomplete) {
            autocomplete.getClass();
            autocomplete.attributionText_ = "Powered by Google Maps";
        }

        /* JADX INFO: renamed from: o */
        public static void m2390o(Autocomplete autocomplete, String str) {
            autocomplete.getClass();
            autocomplete.initialValue_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m2391p(Autocomplete autocomplete) {
            autocomplete.getClass();
            autocomplete.manualEntryCta_ = "Enter address manually";
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m2392q(Autocomplete autocomplete) {
            autocomplete.getClass();
            autocomplete.noResultsMessage_ = "Keep typing for address suggestions";
        }

        /* JADX INFO: renamed from: r */
        public static void m2393r(Autocomplete autocomplete) {
            autocomplete.getClass();
            autocomplete.searchPlaceholder_ = "Search address";
        }

        /* JADX INFO: renamed from: t */
        public static Autocomplete m2394t() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: y */
        public static C0283d m2395y() {
            return (C0283d) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"searchPlaceholder_", "manualEntryCta_", "noResultsMessage_", "attributionText_", "initialValue_"});
            }
            if (iOrdinal == 3) {
                return new Autocomplete();
            }
            if (iOrdinal == 4) {
                return new C0283d(DEFAULT_INSTANCE);
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
            synchronized (Autocomplete.class) {
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

        /* JADX INFO: renamed from: s */
        public final String m2396s() {
            return this.attributionText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final String m2397u() {
            return this.initialValue_;
        }

        /* JADX INFO: renamed from: v */
        public final String m2398v() {
            return this.manualEntryCta_;
        }

        /* JADX INFO: renamed from: w */
        public final String m2399w() {
            return this.noResultsMessage_;
        }

        /* JADX INFO: renamed from: x */
        public final String m2400x() {
            return this.searchPlaceholder_;
        }
    }

    public static final class Dropdown extends AbstractC0269h implements sre0 {
        private static final Dropdown DEFAULT_INSTANCE;
        public static final int INITIAL_KEY_FIELD_NUMBER = 3;
        public static final int OPTIONS_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int PLACEHOLDER_FIELD_NUMBER = 2;
        private ae50 options_ = AbstractC0269h.emptyProtobufList();
        private String placeholder_ = "";
        private String initialKey_ = "";

        public static final class Option extends AbstractC0269h implements sre0 {
            private static final Option DEFAULT_INSTANCE;
            public static final int LABEL_FIELD_NUMBER = 2;
            private static volatile r2n0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private String value_ = "";
            private String label_ = "";

            static {
                Option option = new Option();
                DEFAULT_INSTANCE = option;
                AbstractC0269h.registerDefaultInstance(Option.class, option);
            }

            private Option() {
            }

            /* JADX INFO: renamed from: n */
            public static void m2409n(Option option, String str) {
                option.getClass();
                str.getClass();
                option.label_ = str;
            }

            /* JADX INFO: renamed from: o */
            public static void m2410o(Option option, String str) {
                option.getClass();
                str.getClass();
                option.value_ = str;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static C0286g m2411q() {
                return (C0286g) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"value_", "label_"});
                }
                if (iOrdinal == 3) {
                    return new Option();
                }
                if (iOrdinal == 4) {
                    return new C0286g(DEFAULT_INSTANCE);
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
                synchronized (Option.class) {
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

            public final String getValue() {
                return this.value_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: p */
            public final String m2412p() {
                return this.label_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Dropdown dropdown = new Dropdown();
            DEFAULT_INSTANCE = dropdown;
            AbstractC0269h.registerDefaultInstance(Dropdown.class, dropdown);
        }

        private Dropdown() {
        }

        /* JADX INFO: renamed from: n */
        public static void m2401n(Dropdown dropdown, ArrayList arrayList) {
            ae50 ae50Var = dropdown.options_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                dropdown.options_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(arrayList, dropdown.options_);
        }

        /* JADX INFO: renamed from: o */
        public static void m2402o(Dropdown dropdown, String str) {
            dropdown.getClass();
            dropdown.initialKey_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m2403p(Dropdown dropdown) {
            dropdown.getClass();
            dropdown.placeholder_ = "Choose a state";
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static Dropdown m2404q() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: u */
        public static C0285f m2405u() {
            return (C0285f) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ", new Object[]{"options_", Option.class, "placeholder_", "initialKey_"});
            }
            if (iOrdinal == 3) {
                return new Dropdown();
            }
            if (iOrdinal == 4) {
                return new C0285f(DEFAULT_INSTANCE);
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
            synchronized (Dropdown.class) {
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

        /* JADX INFO: renamed from: r */
        public final String m2406r() {
            return this.initialKey_;
        }

        /* JADX INFO: renamed from: s */
        public final ae50 m2407s() {
            return this.options_;
        }

        /* JADX INFO: renamed from: t */
        public final String m2408t() {
            return this.placeholder_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Text extends AbstractC0269h implements sre0 {
        private static final Text DEFAULT_INSTANCE;
        public static final int INITIAL_VALUE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String initialValue_ = "";

        static {
            Text text = new Text();
            DEFAULT_INSTANCE = text;
            AbstractC0269h.registerDefaultInstance(Text.class, text);
        }

        private Text() {
        }

        /* JADX INFO: renamed from: n */
        public static void m2413n(Text text, String str) {
            text.getClass();
            text.initialValue_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static Text m2414o() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0287h m2415q() {
            return (C0287h) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"initialValue_"});
            }
            if (iOrdinal == 3) {
                return new Text();
            }
            if (iOrdinal == 4) {
                return new C0287h(DEFAULT_INSTANCE);
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
            synchronized (Text.class) {
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

        /* JADX INFO: renamed from: p */
        public final String m2416p() {
            return this.initialValue_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ValidationRule extends AbstractC0269h implements sre0 {
        private static final ValidationRule DEFAULT_INSTANCE;
        public static final int FAIL_MESSAGE_FIELD_NUMBER = 1;
        public static final int FAIL_MESSAGE_ID_FIELD_NUMBER = 4;
        public static final int MANDATORY_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int REG_EX_FIELD_NUMBER = 3;
        private Object type_;
        private int typeCase_ = 0;
        private String failMessage_ = "";
        private String failMessageId_ = "";

        public static final class Mandatory extends AbstractC0269h implements sre0 {
            private static final Mandatory DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER;

            static {
                Mandatory mandatory = new Mandatory();
                DEFAULT_INSTANCE = mandatory;
                AbstractC0269h.registerDefaultInstance(Mandatory.class, mandatory);
            }

            private Mandatory() {
            }

            /* JADX INFO: renamed from: n */
            public static Mandatory m2425n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                }
                if (iOrdinal == 3) {
                    return new Mandatory();
                }
                if (iOrdinal == 4) {
                    return new C0289j(DEFAULT_INSTANCE);
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
                synchronized (Mandatory.class) {
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

        public static final class RegEx extends AbstractC0269h implements sre0 {
            private static final RegEx DEFAULT_INSTANCE;
            public static final int EXPRESSION_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private String expression_ = "";

            static {
                RegEx regEx = new RegEx();
                DEFAULT_INSTANCE = regEx;
                AbstractC0269h.registerDefaultInstance(RegEx.class, regEx);
            }

            private RegEx() {
            }

            /* JADX INFO: renamed from: n */
            public static void m2426n(RegEx regEx) {
                regEx.getClass();
                regEx.expression_ = "\\d{5}";
            }

            /* JADX INFO: renamed from: o */
            public static RegEx m2427o() {
                return DEFAULT_INSTANCE;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static C0290k m2428q() {
                return (C0290k) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"expression_"});
                }
                if (iOrdinal == 3) {
                    return new RegEx();
                }
                if (iOrdinal == 4) {
                    return new C0290k(DEFAULT_INSTANCE);
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
                synchronized (RegEx.class) {
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

            /* JADX INFO: renamed from: p */
            public final String m2429p() {
                return this.expression_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            ValidationRule validationRule = new ValidationRule();
            DEFAULT_INSTANCE = validationRule;
            AbstractC0269h.registerDefaultInstance(ValidationRule.class, validationRule);
        }

        private ValidationRule() {
        }

        /* JADX INFO: renamed from: n */
        public static void m2417n(ValidationRule validationRule, String str) {
            validationRule.getClass();
            validationRule.failMessage_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m2418o(ValidationRule validationRule, Mandatory mandatory) {
            validationRule.getClass();
            mandatory.getClass();
            validationRule.type_ = mandatory;
            validationRule.typeCase_ = 2;
        }

        /* JADX INFO: renamed from: p */
        public static void m2419p(ValidationRule validationRule, RegEx regEx) {
            validationRule.getClass();
            regEx.getClass();
            validationRule.type_ = regEx;
            validationRule.typeCase_ = 3;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: u */
        public static C0288i m2420u() {
            return (C0288i) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"type_", "typeCase_", "failMessage_", Mandatory.class, RegEx.class, "failMessageId_"});
            }
            if (iOrdinal == 3) {
                return new ValidationRule();
            }
            if (iOrdinal == 4) {
                return new C0288i(DEFAULT_INSTANCE);
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
            synchronized (ValidationRule.class) {
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

        /* JADX INFO: renamed from: q */
        public final String m2421q() {
            return this.failMessage_;
        }

        /* JADX INFO: renamed from: r */
        public final String m2422r() {
            return this.failMessageId_;
        }

        /* JADX INFO: renamed from: s */
        public final RegEx m2423s() {
            return this.typeCase_ == 3 ? (RegEx) this.type_ : RegEx.m2427o();
        }

        /* JADX INFO: renamed from: t */
        public final int m2424t() {
            int i = this.typeCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 2) {
                return i != 3 ? 0 : 2;
            }
            return 1;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        FormField formField = new FormField();
        DEFAULT_INSTANCE = formField;
        AbstractC0269h.registerDefaultInstance(FormField.class, formField);
    }

    private FormField() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2376n(FormField formField, Iterable iterable) {
        ae50 ae50Var = formField.validationRules_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            formField.validationRules_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, formField.validationRules_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2377o(FormField formField, Autocomplete autocomplete) {
        formField.getClass();
        autocomplete.getClass();
        formField.field_ = autocomplete;
        formField.fieldCase_ = 5;
    }

    /* JADX INFO: renamed from: p */
    public static void m2378p(FormField formField, Dropdown dropdown) {
        formField.getClass();
        dropdown.getClass();
        formField.field_ = dropdown;
        formField.fieldCase_ = 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2379q(FormField formField, String str) {
        formField.getClass();
        formField.id_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m2380r(FormField formField, String str) {
        formField.getClass();
        formField.label_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2381s(FormField formField, Text text) {
        formField.getClass();
        text.getClass();
        formField.field_ = text;
        formField.fieldCase_ = 3;
    }

    /* JADX INFO: renamed from: z */
    public static C0284e m2382z() {
        return (C0284e) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001d\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000d\u001b", new Object[]{"field_", "fieldCase_", "id_", "label_", Text.class, Dropdown.class, Autocomplete.class, "validationRules_", ValidationRule.class});
        }
        if (iOrdinal == 3) {
            return new FormField();
        }
        if (iOrdinal == 4) {
            return new C0284e(DEFAULT_INSTANCE);
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
        synchronized (FormField.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: t */
    public final Autocomplete m2383t() {
        return this.fieldCase_ == 5 ? (Autocomplete) this.field_ : Autocomplete.m2394t();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Dropdown m2384u() {
        return this.fieldCase_ == 4 ? (Dropdown) this.field_ : Dropdown.m2404q();
    }

    /* JADX INFO: renamed from: v */
    public final int m2385v() {
        int i = this.fieldCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: w */
    public final String m2386w() {
        return this.label_;
    }

    /* JADX INFO: renamed from: x */
    public final Text m2387x() {
        return this.fieldCase_ == 3 ? (Text) this.field_ : Text.m2414o();
    }

    /* JADX INFO: renamed from: y */
    public final ae50 m2388y() {
        return this.validationRules_;
    }
}
