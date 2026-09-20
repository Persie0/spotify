package com.spotify.rcs.resolver.grpc.p141v0;

import com.google.protobuf.AbstractC0269h;
import com.spotify.rcs.admin.grpc.p140v0.PropertyDefinition$Identifier;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Configuration extends AbstractC0269h implements sre0 {
    public static final int ASSIGNED_VALUES_FIELD_NUMBER = 3;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 1;
    private static final Configuration DEFAULT_INSTANCE;
    public static final int FETCH_TIME_MILLIS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int POLICY_SNAPSHOT_ID_FIELD_NUMBER = 4;
    private long fetchTimeMillis_;
    private long policySnapshotId_;
    private String configurationAssignmentId_ = "";
    private ae50 assignedValues_ = AbstractC0269h.emptyProtobufList();

    public static final class AssignedValue extends AbstractC0269h implements sre0 {
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        private static final AssignedValue DEFAULT_INSTANCE;
        public static final int ENUM_VALUE_FIELD_NUMBER = 5;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        public static final int METADATA_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int PROPERTY_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private Metadata metadata_;
        private PropertyDefinition$Identifier propertyId_;
        private int structuredValueCase_ = 0;
        private Object structuredValue_;

        public static final class BoolValue extends AbstractC0269h implements sre0 {
            private static final BoolValue DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private boolean value_;

            static {
                BoolValue boolValue = new BoolValue();
                DEFAULT_INSTANCE = boolValue;
                AbstractC0269h.registerDefaultInstance(BoolValue.class, boolValue);
            }

            private BoolValue() {
            }

            /* JADX INFO: renamed from: n */
            public static BoolValue m20132n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new BoolValue();
                }
                if (iOrdinal == 4) {
                    return new C1267a(DEFAULT_INSTANCE);
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
                synchronized (BoolValue.class) {
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

            public final boolean getValue() {
                return this.value_;
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

        public static final class EnumValue extends AbstractC0269h implements sre0 {
            private static final EnumValue DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private String value_ = "";

            static {
                EnumValue enumValue = new EnumValue();
                DEFAULT_INSTANCE = enumValue;
                AbstractC0269h.registerDefaultInstance(EnumValue.class, enumValue);
            }

            private EnumValue() {
            }

            /* JADX INFO: renamed from: n */
            public static EnumValue m20133n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new EnumValue();
                }
                if (iOrdinal == 4) {
                    return new C1269c(DEFAULT_INSTANCE);
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
                synchronized (EnumValue.class) {
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

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class IntValue extends AbstractC0269h implements sre0 {
            private static final IntValue DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private int value_;

            static {
                IntValue intValue = new IntValue();
                DEFAULT_INSTANCE = intValue;
                AbstractC0269h.registerDefaultInstance(IntValue.class, intValue);
            }

            private IntValue() {
            }

            /* JADX INFO: renamed from: n */
            public static IntValue m20134n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new IntValue();
                }
                if (iOrdinal == 4) {
                    return new C1270d(DEFAULT_INSTANCE);
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
                synchronized (IntValue.class) {
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

            public final int getValue() {
                return this.value_;
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

        public static final class Metadata extends AbstractC0269h implements sre0 {
            private static final Metadata DEFAULT_INSTANCE;
            public static final int EXTERNAL_REALM_FIELD_NUMBER = 2;
            public static final int EXTERNAL_REALM_ID_FIELD_NUMBER = 3;
            private static volatile r2n0 PARSER = null;
            public static final int POLICY_ID_FIELD_NUMBER = 1;
            private long externalRealmId_;
            private String externalRealm_ = "";
            private long policyId_;

            static {
                Metadata metadata = new Metadata();
                DEFAULT_INSTANCE = metadata;
                AbstractC0269h.registerDefaultInstance(Metadata.class, metadata);
            }

            private Metadata() {
            }

            /* JADX INFO: renamed from: n */
            public static Metadata m20135n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002", new Object[]{"policyId_", "externalRealm_", "externalRealmId_"});
                }
                if (iOrdinal == 3) {
                    return new Metadata();
                }
                if (iOrdinal == 4) {
                    return new C1271e(DEFAULT_INSTANCE);
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
                synchronized (Metadata.class) {
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

            public final long getPolicyId() {
                return this.policyId_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: o */
            public final long m20136o() {
                return this.externalRealmId_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            AssignedValue assignedValue = new AssignedValue();
            DEFAULT_INSTANCE = assignedValue;
            AbstractC0269h.registerDefaultInstance(AssignedValue.class, assignedValue);
        }

        private AssignedValue() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"structuredValue_", "structuredValueCase_", "bitField0_", "propertyId_", "metadata_", BoolValue.class, IntValue.class, EnumValue.class});
            }
            if (iOrdinal == 3) {
                return new AssignedValue();
            }
            if (iOrdinal == 4) {
                return new C1268b(DEFAULT_INSTANCE);
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
            synchronized (AssignedValue.class) {
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
        public final BoolValue m20126n() {
            return this.structuredValueCase_ == 3 ? (BoolValue) this.structuredValue_ : BoolValue.m20132n();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final EnumValue m20127o() {
            return this.structuredValueCase_ == 5 ? (EnumValue) this.structuredValue_ : EnumValue.m20133n();
        }

        /* JADX INFO: renamed from: p */
        public final IntValue m20128p() {
            return this.structuredValueCase_ == 4 ? (IntValue) this.structuredValue_ : IntValue.m20134n();
        }

        /* JADX INFO: renamed from: q */
        public final Metadata m20129q() {
            Metadata metadata = this.metadata_;
            return metadata == null ? Metadata.m20135n() : metadata;
        }

        /* JADX INFO: renamed from: r */
        public final PropertyDefinition$Identifier m20130r() {
            PropertyDefinition$Identifier propertyDefinition$Identifier = this.propertyId_;
            return propertyDefinition$Identifier == null ? PropertyDefinition$Identifier.m20047n() : propertyDefinition$Identifier;
        }

        /* JADX INFO: renamed from: s */
        public final EnumC1272f m20131s() {
            int i = this.structuredValueCase_;
            if (i == 0) {
                return EnumC1272f.STRUCTUREDVALUE_NOT_SET;
            }
            if (i == 3) {
                return EnumC1272f.BOOL_VALUE;
            }
            if (i == 4) {
                return EnumC1272f.INT_VALUE;
            }
            if (i != 5) {
                return null;
            }
            return EnumC1272f.ENUM_VALUE;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Configuration configuration = new Configuration();
        DEFAULT_INSTANCE = configuration;
        AbstractC0269h.registerDefaultInstance(Configuration.class, configuration);
    }

    private Configuration() {
    }

    /* JADX INFO: renamed from: p */
    public static Configuration m20120p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static Configuration m20121s(byte[] bArr) {
        return (Configuration) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u001b\u0004\u0002", new Object[]{"configurationAssignmentId_", "fetchTimeMillis_", "assignedValues_", AssignedValue.class, "policySnapshotId_"});
        }
        if (iOrdinal == 3) {
            return new Configuration();
        }
        if (iOrdinal == 4) {
            return new C1273g(DEFAULT_INSTANCE);
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
        synchronized (Configuration.class) {
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
    public final ae50 m20122n() {
        return this.assignedValues_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20123o() {
        return this.configurationAssignmentId_;
    }

    /* JADX INFO: renamed from: q */
    public final long m20124q() {
        return this.fetchTimeMillis_;
    }

    /* JADX INFO: renamed from: r */
    public final long m20125r() {
        return this.policySnapshotId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
