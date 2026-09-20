package com.spotify.extendedmetadata.extensions.audioattributesv2impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioAttributesV2Proto$AudioAttributes extends AbstractC0269h implements sre0 {
    public static final int BPM_FIELD_NUMBER = 1;
    private static final AudioAttributesV2Proto$AudioAttributes DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private double bpm_;
    private Key key_;

    public static final class Key extends AbstractC0269h implements sre0 {
        public static final int CAMELOT_KEY_FIELD_NUMBER = 3;
        private static final Key DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        public static final int MODE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private CamelotKey camelotKey_;
        private String key_ = "";
        private int mode_;

        public static final class CamelotKey extends AbstractC0269h implements sre0 {
            public static final int COLOR_FIELD_NUMBER = 2;
            private static final CamelotKey DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private String value_ = "";
            private String color_ = "";

            static {
                CamelotKey camelotKey = new CamelotKey();
                DEFAULT_INSTANCE = camelotKey;
                AbstractC0269h.registerDefaultInstance(CamelotKey.class, camelotKey);
            }

            private CamelotKey() {
            }

            /* JADX INFO: renamed from: o */
            public static CamelotKey m9853o() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"value_", "color_"});
                }
                if (iOrdinal == 3) {
                    return new CamelotKey();
                }
                if (iOrdinal == 4) {
                    return new C0729c(DEFAULT_INSTANCE);
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
                synchronized (CamelotKey.class) {
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

            /* JADX INFO: renamed from: n */
            public final String m9854n() {
                return this.color_;
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
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            AbstractC0269h.registerDefaultInstance(Key.class, key);
        }

        private Key() {
        }

        /* JADX INFO: renamed from: o */
        public static Key m9850o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "key_", "mode_", "camelotKey_"});
            }
            if (iOrdinal == 3) {
                return new Key();
            }
            if (iOrdinal == 4) {
                return new C0728b(DEFAULT_INSTANCE);
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
            synchronized (Key.class) {
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

        public final String getKey() {
            return this.key_;
        }

        /* JADX INFO: renamed from: n */
        public final CamelotKey m9851n() {
            CamelotKey camelotKey = this.camelotKey_;
            return camelotKey == null ? CamelotKey.m9853o() : camelotKey;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final EnumC0730d m9852p() {
            EnumC0730d enumC0730d;
            int i = this.mode_;
            if (i == 0) {
                enumC0730d = EnumC0730d.MODE_UNKNOWN;
            } else if (i != 1) {
                enumC0730d = i != 2 ? null : EnumC0730d.MODE_MAJOR;
            } else {
                enumC0730d = EnumC0730d.MODE_MINOR;
            }
            return enumC0730d == null ? EnumC0730d.UNRECOGNIZED : enumC0730d;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AudioAttributesV2Proto$AudioAttributes audioAttributesV2Proto$AudioAttributes = new AudioAttributesV2Proto$AudioAttributes();
        DEFAULT_INSTANCE = audioAttributesV2Proto$AudioAttributes;
        AbstractC0269h.registerDefaultInstance(AudioAttributesV2Proto$AudioAttributes.class, audioAttributesV2Proto$AudioAttributes);
    }

    private AudioAttributesV2Proto$AudioAttributes() {
    }

    /* JADX INFO: renamed from: p */
    public static AudioAttributesV2Proto$AudioAttributes m9847p(byte[] bArr) {
        return (AudioAttributesV2Proto$AudioAttributes) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "bpm_", "key_"});
        }
        if (iOrdinal == 3) {
            return new AudioAttributesV2Proto$AudioAttributes();
        }
        if (iOrdinal == 4) {
            return new C0727a(DEFAULT_INSTANCE);
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
        synchronized (AudioAttributesV2Proto$AudioAttributes.class) {
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
    public final double m9848n() {
        return this.bpm_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Key m9849o() {
        Key key = this.key_;
        return key == null ? Key.m9850o() : key;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
