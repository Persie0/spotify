package com.spotify.featuregate.p068v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class FeatureAccessResult extends AbstractC0269h implements sre0 {
    private static final FeatureAccessResult DEFAULT_INSTANCE;
    public static final int DENY_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PERMIT_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    public static final class Deny extends AbstractC0269h implements sre0 {
        private static final Deny DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int REASONS_FIELD_NUMBER = 1;
        private static final vd50 reasons_converter_ = new C0759b();
        private int reasonsMemoizedSerializedSize;
        private ud50 reasons_ = AbstractC0269h.emptyIntList();

        static {
            Deny deny = new Deny();
            DEFAULT_INSTANCE = deny;
            AbstractC0269h.registerDefaultInstance(Deny.class, deny);
        }

        private Deny() {
        }

        /* JADX INFO: renamed from: n */
        public static Deny m10967n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"reasons_"});
            }
            if (iOrdinal == 3) {
                return new Deny();
            }
            if (iOrdinal == 4) {
                return new C0760c(DEFAULT_INSTANCE);
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
            synchronized (Deny.class) {
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
        public final List m10968o() {
            return new wd50(this.reasons_, reasons_converter_);
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Permit extends AbstractC0269h implements sre0 {
        private static final Permit DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            Permit permit = new Permit();
            DEFAULT_INSTANCE = permit;
            AbstractC0269h.registerDefaultInstance(Permit.class, permit);
        }

        private Permit() {
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
                return new Permit();
            }
            if (iOrdinal == 4) {
                return new C0761d(DEFAULT_INSTANCE);
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
            synchronized (Permit.class) {
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
        FeatureAccessResult featureAccessResult = new FeatureAccessResult();
        DEFAULT_INSTANCE = featureAccessResult;
        AbstractC0269h.registerDefaultInstance(FeatureAccessResult.class, featureAccessResult);
    }

    private FeatureAccessResult() {
    }

    /* JADX INFO: renamed from: n */
    public static FeatureAccessResult m10963n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", Permit.class, Deny.class});
        }
        if (iOrdinal == 3) {
            return new FeatureAccessResult();
        }
        if (iOrdinal == 4) {
            return new C0758a(DEFAULT_INSTANCE);
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
        synchronized (FeatureAccessResult.class) {
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
    public final Deny m10964o() {
        return this.resultCase_ == 2 ? (Deny) this.result_ : Deny.m10967n();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10965p() {
        return this.resultCase_ == 2;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10966q() {
        return this.resultCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
