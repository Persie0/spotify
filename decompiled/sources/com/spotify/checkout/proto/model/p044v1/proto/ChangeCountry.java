package com.spotify.checkout.proto.model.p044v1.proto;

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

/* JADX INFO: loaded from: classes5.dex */
public final class ChangeCountry extends AbstractC0269h implements sre0 {
    private static final ChangeCountry DEFAULT_INSTANCE;
    public static final int FORM_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private PickerForm form_;
    private String label_ = "";

    public static final class PickerForm extends AbstractC0269h implements sre0 {
        public static final int COUNTRIES_FIELD_NUMBER = 10;
        public static final int CTA_FIELD_NUMBER = 1;
        private static final PickerForm DEFAULT_INSTANCE;
        public static final int INPUT_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private Cta cta_;
        private SearchInput input_;
        private String title_ = "";
        private ae50 countries_ = AbstractC0269h.emptyProtobufList();

        public static final class CountryType extends AbstractC0269h implements sre0 {
            public static final int ACTIVE_FIELD_NUMBER = 2;
            private static final CountryType DEFAULT_INSTANCE;
            public static final int INACTIVE_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private int typeCase_ = 0;
            private Object type_;

            public static final class Active extends AbstractC0269h implements sre0 {
                public static final int CODE_FIELD_NUMBER = 1;
                private static final Active DEFAULT_INSTANCE;
                public static final int NAME_FIELD_NUMBER = 2;
                private static volatile r2n0 PARSER;
                private String code_ = "";
                private String name_ = "";

                static {
                    Active active = new Active();
                    DEFAULT_INSTANCE = active;
                    AbstractC0269h.registerDefaultInstance(Active.class, active);
                }

                private Active() {
                }

                /* JADX INFO: renamed from: n */
                public static void m5964n(Active active, String str) {
                    active.getClass();
                    str.getClass();
                    active.code_ = str;
                }

                /* JADX INFO: renamed from: o */
                public static void m5965o(Active active, String str) {
                    active.getClass();
                    str.getClass();
                    active.name_ = str;
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: q */
                public static Active m5966q() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: r */
                public static C0475c m5967r() {
                    return (C0475c) DEFAULT_INSTANCE.createBuilder();
                }

                @Override // com.google.protobuf.AbstractC0269h
                public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                    r2n0 r110Var;
                    int iOrdinal = z110Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"code_", "name_"});
                    }
                    if (iOrdinal == 3) {
                        return new Active();
                    }
                    if (iOrdinal == 4) {
                        return new C0475c(DEFAULT_INSTANCE);
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
                    synchronized (Active.class) {
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

                /* JADX INFO: renamed from: p */
                public final String m5968p() {
                    return this.code_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            public static final class Inactive extends AbstractC0269h implements sre0 {
                public static final int CODE_FIELD_NUMBER = 1;
                private static final Inactive DEFAULT_INSTANCE;
                public static final int NAME_FIELD_NUMBER = 2;
                private static volatile r2n0 PARSER = null;
                public static final int URL_FIELD_NUMBER = 3;
                private String code_ = "";
                private String name_ = "";
                private String url_ = "";

                static {
                    Inactive inactive = new Inactive();
                    DEFAULT_INSTANCE = inactive;
                    AbstractC0269h.registerDefaultInstance(Inactive.class, inactive);
                }

                private Inactive() {
                }

                /* JADX INFO: renamed from: n */
                public static void m5969n(Inactive inactive, String str) {
                    inactive.getClass();
                    str.getClass();
                    inactive.code_ = str;
                }

                /* JADX INFO: renamed from: o */
                public static void m5970o(Inactive inactive, String str) {
                    inactive.getClass();
                    str.getClass();
                    inactive.name_ = str;
                }

                /* JADX INFO: renamed from: p */
                public static void m5971p(Inactive inactive, String str) {
                    inactive.getClass();
                    str.getClass();
                    inactive.url_ = str;
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: r */
                public static Inactive m5972r() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: s */
                public static C0481e m5973s() {
                    return (C0481e) DEFAULT_INSTANCE.createBuilder();
                }

                @Override // com.google.protobuf.AbstractC0269h
                public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                    r2n0 r110Var;
                    int iOrdinal = z110Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"code_", "name_", "url_"});
                    }
                    if (iOrdinal == 3) {
                        return new Inactive();
                    }
                    if (iOrdinal == 4) {
                        return new C0481e(DEFAULT_INSTANCE);
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
                    synchronized (Inactive.class) {
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

                public final String getUrl() {
                    return this.url_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                    return newBuilderForType();
                }

                /* JADX INFO: renamed from: q */
                public final String m5974q() {
                    return this.code_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                CountryType countryType = new CountryType();
                DEFAULT_INSTANCE = countryType;
                AbstractC0269h.registerDefaultInstance(CountryType.class, countryType);
            }

            private CountryType() {
            }

            /* JADX INFO: renamed from: n */
            public static void m5957n(CountryType countryType, Active active) {
                countryType.getClass();
                active.getClass();
                countryType.type_ = active;
                countryType.typeCase_ = 2;
            }

            /* JADX INFO: renamed from: o */
            public static void m5958o(CountryType countryType, Inactive inactive) {
                countryType.getClass();
                inactive.getClass();
                countryType.type_ = inactive;
                countryType.typeCase_ = 1;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: t */
            public static C0478d m5959t() {
                return (C0478d) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", Inactive.class, Active.class});
                }
                if (iOrdinal == 3) {
                    return new CountryType();
                }
                if (iOrdinal == 4) {
                    return new C0478d(DEFAULT_INSTANCE);
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
                synchronized (CountryType.class) {
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
            public final Active m5960p() {
                return this.typeCase_ == 2 ? (Active) this.type_ : Active.m5966q();
            }

            /* JADX INFO: renamed from: q */
            public final Inactive m5961q() {
                return this.typeCase_ == 1 ? (Inactive) this.type_ : Inactive.m5972r();
            }

            /* JADX INFO: renamed from: r */
            public final int m5962r() {
                int i = this.typeCase_;
                if (i == 0) {
                    return 3;
                }
                int i2 = 1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        return 0;
                    }
                }
                return i2;
            }

            /* JADX INFO: renamed from: s */
            public final boolean m5963s() {
                return this.typeCase_ == 2;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Cta extends AbstractC0269h implements sre0 {
            private static final Cta DEFAULT_INSTANCE;
            public static final int LABEL_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private String label_ = "";

            static {
                Cta cta = new Cta();
                DEFAULT_INSTANCE = cta;
                AbstractC0269h.registerDefaultInstance(Cta.class, cta);
            }

            private Cta() {
            }

            /* JADX INFO: renamed from: n */
            public static void m5975n(Cta cta) {
                cta.getClass();
                cta.label_ = "Change Country";
            }

            /* JADX INFO: renamed from: o */
            public static Cta m5976o() {
                return DEFAULT_INSTANCE;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static C0484f m5977q() {
                return (C0484f) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"label_"});
                }
                if (iOrdinal == 3) {
                    return new Cta();
                }
                if (iOrdinal == 4) {
                    return new C0484f(DEFAULT_INSTANCE);
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
                synchronized (Cta.class) {
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
            public final String m5978p() {
                return this.label_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class SearchInput extends AbstractC0269h implements sre0 {
            private static final SearchInput DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int PLACEHOLDER_FIELD_NUMBER = 1;
            private String placeholder_ = "";

            static {
                SearchInput searchInput = new SearchInput();
                DEFAULT_INSTANCE = searchInput;
                AbstractC0269h.registerDefaultInstance(SearchInput.class, searchInput);
            }

            private SearchInput() {
            }

            /* JADX INFO: renamed from: n */
            public static void m5979n(SearchInput searchInput) {
                searchInput.getClass();
                searchInput.placeholder_ = "Find your country";
            }

            /* JADX INFO: renamed from: o */
            public static SearchInput m5980o() {
                return DEFAULT_INSTANCE;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static C0487g m5981q() {
                return (C0487g) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"placeholder_"});
                }
                if (iOrdinal == 3) {
                    return new SearchInput();
                }
                if (iOrdinal == 4) {
                    return new C0487g(DEFAULT_INSTANCE);
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
                synchronized (SearchInput.class) {
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
            public final String m5982p() {
                return this.placeholder_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            PickerForm pickerForm = new PickerForm();
            DEFAULT_INSTANCE = pickerForm;
            AbstractC0269h.registerDefaultInstance(PickerForm.class, pickerForm);
        }

        private PickerForm() {
        }

        /* JADX INFO: renamed from: n */
        public static void m5948n(PickerForm pickerForm, ArrayList arrayList) {
            ae50 ae50Var = pickerForm.countries_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                pickerForm.countries_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(arrayList, pickerForm.countries_);
        }

        /* JADX INFO: renamed from: o */
        public static void m5949o(PickerForm pickerForm, Cta cta) {
            pickerForm.getClass();
            cta.getClass();
            pickerForm.cta_ = cta;
            pickerForm.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: p */
        public static void m5950p(PickerForm pickerForm, SearchInput searchInput) {
            pickerForm.getClass();
            searchInput.getClass();
            pickerForm.input_ = searchInput;
            pickerForm.bitField0_ |= 2;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m5951q(PickerForm pickerForm) {
            pickerForm.getClass();
            pickerForm.title_ = "Choose your country";
        }

        /* JADX INFO: renamed from: t */
        public static PickerForm m5952t() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: v */
        public static C0472b m5953v() {
            return (C0472b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\n\u001b", new Object[]{"bitField0_", "cta_", "title_", "input_", "countries_", CountryType.class});
            }
            if (iOrdinal == 3) {
                return new PickerForm();
            }
            if (iOrdinal == 4) {
                return new C0472b(DEFAULT_INSTANCE);
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
            synchronized (PickerForm.class) {
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

        public final String getTitle() {
            return this.title_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: r */
        public final ae50 m5954r() {
            return this.countries_;
        }

        /* JADX INFO: renamed from: s */
        public final Cta m5955s() {
            Cta cta = this.cta_;
            return cta == null ? Cta.m5976o() : cta;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final SearchInput m5956u() {
            SearchInput searchInput = this.input_;
            return searchInput == null ? SearchInput.m5980o() : searchInput;
        }
    }

    static {
        ChangeCountry changeCountry = new ChangeCountry();
        DEFAULT_INSTANCE = changeCountry;
        AbstractC0269h.registerDefaultInstance(ChangeCountry.class, changeCountry);
    }

    private ChangeCountry() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5942n(ChangeCountry changeCountry, PickerForm pickerForm) {
        changeCountry.getClass();
        pickerForm.getClass();
        changeCountry.form_ = pickerForm;
        changeCountry.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m5943o(ChangeCountry changeCountry) {
        changeCountry.getClass();
        changeCountry.label_ = "France";
    }

    /* JADX INFO: renamed from: p */
    public static ChangeCountry m5944p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static C0469a m5945s() {
        return (C0469a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "label_", "form_"});
        }
        if (iOrdinal == 3) {
            return new ChangeCountry();
        }
        if (iOrdinal == 4) {
            return new C0469a(DEFAULT_INSTANCE);
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
        synchronized (ChangeCountry.class) {
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
    public final PickerForm m5946q() {
        PickerForm pickerForm = this.form_;
        return pickerForm == null ? PickerForm.m5952t() : pickerForm;
    }

    /* JADX INFO: renamed from: r */
    public final String m5947r() {
        return this.label_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
