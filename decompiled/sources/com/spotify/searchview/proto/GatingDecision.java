package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.gw00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GatingDecision extends AbstractC0269h implements sre0 {
    private static final GatingDecision DEFAULT_INSTANCE;
    public static final int DENY_FIELD_NUMBER = 2;
    public static final int INDICATOR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERMIT_FIELD_NUMBER = 1;
    private int indicator_;
    private int resultCase_ = 0;
    private Object result_;

    public static final class Deny extends AbstractC0269h implements sre0 {
        private static final Deny DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int REASONS_FIELD_NUMBER = 1;
        private static final vd50 reasons_converter_ = new C1290d();
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
        public static Deny m20848n() {
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
                return new C1291e(DEFAULT_INSTANCE);
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
        public final List m20849o() {
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
                return new C1292f(DEFAULT_INSTANCE);
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
        GatingDecision gatingDecision = new GatingDecision();
        DEFAULT_INSTANCE = gatingDecision;
        AbstractC0269h.registerDefaultInstance(GatingDecision.class, gatingDecision);
    }

    private GatingDecision() {
    }

    /* JADX INFO: renamed from: n */
    public static GatingDecision m20844n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\f", new Object[]{"result_", "resultCase_", Permit.class, Deny.class, "indicator_"});
        }
        if (iOrdinal == 3) {
            return new GatingDecision();
        }
        if (iOrdinal == 4) {
            return new C1289c(DEFAULT_INSTANCE);
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
        synchronized (GatingDecision.class) {
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
    public final Deny m20845o() {
        return this.resultCase_ == 2 ? (Deny) this.result_ : Deny.m20848n();
    }

    /* JADX INFO: renamed from: p */
    public final gw00 m20846p() {
        gw00 gw00Var;
        int i = this.indicator_;
        if (i != 0) {
            gw00Var = i != 1 ? null : gw00.GATING_INDICATOR_PREMIUM;
        } else {
            gw00Var = gw00.GATING_INDICATOR_UNSPECIFIED;
        }
        return gw00Var == null ? gw00.UNRECOGNIZED : gw00Var;
    }

    /* JADX INFO: renamed from: q */
    public final int m20847q() {
        int i = this.resultCase_;
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
