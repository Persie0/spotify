package com.spotify.wrapped.p194v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class RiveProperty extends AbstractC0269h implements sre0 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    public static final int COLOR_VALUE_FIELD_NUMBER = 5;
    private static final RiveProperty DEFAULT_INSTANCE;
    public static final int ENUM_VALUE_FIELD_NUMBER = 6;
    public static final int IMAGE_URL_FIELD_NUMBER = 7;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 1;
    public static final int TRIGGER_VALUE_FIELD_NUMBER = 4;
    private int kindCase_ = 0;
    private Object kind_;

    public static final class Trigger extends AbstractC0269h implements sre0 {
        private static final Trigger DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            Trigger trigger = new Trigger();
            DEFAULT_INSTANCE = trigger;
            AbstractC0269h.registerDefaultInstance(Trigger.class, trigger);
        }

        private Trigger() {
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
                return new Trigger();
            }
            if (iOrdinal == 4) {
                return new C1392n(DEFAULT_INSTANCE);
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
            synchronized (Trigger.class) {
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
        RiveProperty riveProperty = new RiveProperty();
        DEFAULT_INSTANCE = riveProperty;
        AbstractC0269h.registerDefaultInstance(RiveProperty.class, riveProperty);
    }

    private RiveProperty() {
    }

    /* JADX INFO: renamed from: o */
    public static RiveProperty m23210o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00034\u0000\u0004<\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȼ\u0000", new Object[]{"kind_", "kindCase_", Trigger.class});
        }
        if (iOrdinal == 3) {
            return new RiveProperty();
        }
        if (iOrdinal == 4) {
            return new C1391m(DEFAULT_INSTANCE);
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
        synchronized (RiveProperty.class) {
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

    public final boolean getBoolValue() {
        if (this.kindCase_ == 2) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getImageUrl() {
        return this.kindCase_ == 7 ? (String) this.kind_ : "";
    }

    public final String getStringValue() {
        return this.kindCase_ == 1 ? (String) this.kind_ : "";
    }

    /* JADX INFO: renamed from: n */
    public final String m23211n() {
        return this.kindCase_ == 5 ? (String) this.kind_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m23212p() {
        return this.kindCase_ == 6 ? (String) this.kind_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final int m23213q() {
        switch (this.kindCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: r */
    public final float m23214r() {
        if (this.kindCase_ == 3) {
            return ((Float) this.kind_).floatValue();
        }
        return 0.0f;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
