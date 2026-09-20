package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
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
public final class ProductBreakdown extends AbstractC0269h implements sre0 {
    public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 4;
    private static final ProductBreakdown DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TOTAL_LABEL_FIELD_NUMBER = 2;
    public static final int TOTAL_PRICE_FIELD_NUMBER = 3;
    private ae50 groups_ = AbstractC0269h.emptyProtobufList();
    private String totalLabel_ = "";
    private String totalPrice_ = "";
    private String additionalTaxLabel_ = "";

    public static final class BreakdownGroup extends AbstractC0269h implements sre0 {
        private static final BreakdownGroup DEFAULT_INSTANCE;
        public static final int GROUPTYPE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int ROWS_FIELD_NUMBER = 1;
        private int groupType_;
        private ae50 rows_ = AbstractC0269h.emptyProtobufList();

        public static final class BreakdownRow extends AbstractC0269h implements sre0 {
            public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 3;
            private static final BreakdownRow DEFAULT_INSTANCE;
            public static final int LABEL_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER = null;
            public static final int PRICE_FIELD_NUMBER = 2;
            public static final int ROWTYPE_FIELD_NUMBER = 4;
            private int rowType_;
            private String label_ = "";
            private String price_ = "";
            private String additionalTaxLabel_ = "";

            static {
                BreakdownRow breakdownRow = new BreakdownRow();
                DEFAULT_INSTANCE = breakdownRow;
                AbstractC0269h.registerDefaultInstance(BreakdownRow.class, breakdownRow);
            }

            private BreakdownRow() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6313n(BreakdownRow breakdownRow, String str) {
                breakdownRow.getClass();
                breakdownRow.additionalTaxLabel_ = str;
            }

            /* JADX INFO: renamed from: o */
            public static void m6314o(BreakdownRow breakdownRow, String str) {
                breakdownRow.getClass();
                breakdownRow.label_ = str;
            }

            /* JADX INFO: renamed from: p */
            public static void m6315p(BreakdownRow breakdownRow, String str) {
                breakdownRow.getClass();
                breakdownRow.price_ = str;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static void m6316q(BreakdownRow breakdownRow, EnumC0518q0 enumC0518q0) {
                breakdownRow.getClass();
                breakdownRow.rowType_ = enumC0518q0.getNumber();
            }

            /* JADX INFO: renamed from: v */
            public static C0521r0 m6317v() {
                return (C0521r0) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"label_", "price_", "additionalTaxLabel_", "rowType_"});
                }
                if (iOrdinal == 3) {
                    return new BreakdownRow();
                }
                if (iOrdinal == 4) {
                    return new C0521r0(DEFAULT_INSTANCE);
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
                synchronized (BreakdownRow.class) {
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
            public final String m6318r() {
                return this.additionalTaxLabel_;
            }

            /* JADX INFO: renamed from: s */
            public final String m6319s() {
                return this.label_;
            }

            /* JADX INFO: renamed from: t */
            public final String m6320t() {
                return this.price_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            /* JADX INFO: renamed from: u */
            public final EnumC0518q0 m6321u() {
                EnumC0518q0 enumC0518q0;
                int i = this.rowType_;
                if (i == 0) {
                    enumC0518q0 = EnumC0518q0.DEFAULT;
                } else if (i == 1) {
                    enumC0518q0 = EnumC0518q0.ADDED;
                } else if (i != 2) {
                    enumC0518q0 = i != 3 ? null : EnumC0518q0.STRIKETHROUGH;
                } else {
                    enumC0518q0 = EnumC0518q0.REMOVED;
                }
                return enumC0518q0 == null ? EnumC0518q0.UNRECOGNIZED : enumC0518q0;
            }
        }

        static {
            BreakdownGroup breakdownGroup = new BreakdownGroup();
            DEFAULT_INSTANCE = breakdownGroup;
            AbstractC0269h.registerDefaultInstance(BreakdownGroup.class, breakdownGroup);
        }

        private BreakdownGroup() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6307n(BreakdownGroup breakdownGroup, Iterable iterable) {
            ae50 ae50Var = breakdownGroup.rows_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                breakdownGroup.rows_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(iterable, breakdownGroup.rows_);
        }

        /* JADX INFO: renamed from: o */
        public static void m6308o(BreakdownGroup breakdownGroup, EnumC0515p0 enumC0515p0) {
            breakdownGroup.getClass();
            breakdownGroup.groupType_ = enumC0515p0.getNumber();
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: s */
        public static C0524s0 m6309s() {
            return (C0524s0) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"rows_", BreakdownRow.class, "groupType_"});
            }
            if (iOrdinal == 3) {
                return new BreakdownGroup();
            }
            if (iOrdinal == 4) {
                return new C0524s0(DEFAULT_INSTANCE);
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
            synchronized (BreakdownGroup.class) {
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
        public final EnumC0515p0 m6310p() {
            EnumC0515p0 enumC0515p0;
            int i = this.groupType_;
            if (i != 0) {
                enumC0515p0 = i != 1 ? null : EnumC0515p0.HIGHLIGHTED;
            } else {
                enumC0515p0 = EnumC0515p0.DEFAULT;
            }
            return enumC0515p0 == null ? EnumC0515p0.UNRECOGNIZED : enumC0515p0;
        }

        /* JADX INFO: renamed from: q */
        public final int m6311q() {
            return this.rows_.size();
        }

        /* JADX INFO: renamed from: r */
        public final ae50 m6312r() {
            return this.rows_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ProductBreakdown productBreakdown = new ProductBreakdown();
        DEFAULT_INSTANCE = productBreakdown;
        AbstractC0269h.registerDefaultInstance(ProductBreakdown.class, productBreakdown);
    }

    private ProductBreakdown() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6297n(ProductBreakdown productBreakdown, List list) {
        ae50 ae50Var = productBreakdown.groups_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            productBreakdown.groups_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, productBreakdown.groups_);
    }

    /* JADX INFO: renamed from: o */
    public static void m6298o(ProductBreakdown productBreakdown) {
        productBreakdown.getClass();
        productBreakdown.additionalTaxLabel_ = "+ tax";
    }

    /* JADX INFO: renamed from: p */
    public static void m6299p(ProductBreakdown productBreakdown) {
        productBreakdown.getClass();
        productBreakdown.totalLabel_ = "New monthly total:";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6300q(ProductBreakdown productBreakdown, String str) {
        productBreakdown.getClass();
        productBreakdown.totalPrice_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static ProductBreakdown m6301s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static C0526t0 m6302w() {
        return (C0526t0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"groups_", BreakdownGroup.class, "totalLabel_", "totalPrice_", "additionalTaxLabel_"});
        }
        if (iOrdinal == 3) {
            return new ProductBreakdown();
        }
        if (iOrdinal == 4) {
            return new C0526t0(DEFAULT_INSTANCE);
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
        synchronized (ProductBreakdown.class) {
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
    public final String m6303r() {
        return this.additionalTaxLabel_;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m6304t() {
        return this.groups_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m6305u() {
        return this.totalLabel_;
    }

    /* JADX INFO: renamed from: v */
    public final String m6306v() {
        return this.totalPrice_;
    }
}
