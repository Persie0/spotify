package com.spotify.rcs.model;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GranularConfiguration extends AbstractC0269h implements sre0 {
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 3;
    private static final GranularConfiguration DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int POLICY_SNAPSHOT_ID_FIELD_NUMBER = 4;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    public static final int RCS_FETCH_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private long policySnapshotId_;
    private long rcsFetchTime_;
    private ae50 properties_ = AbstractC0269h.emptyProtobufList();
    private String configurationAssignmentId_ = "";
    private String etag_ = "";

    /* JADX INFO: renamed from: com.spotify.rcs.model.GranularConfiguration$1 */
    public static /* synthetic */ class C12651 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6600xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6600xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6600xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6600xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6600xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6600xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6600xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6600xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class AssignedPropertyValue extends AbstractC0269h implements AssignedPropertyValueOrBuilder {
        public static final int BOOL_VALUE_FIELD_NUMBER = 1;
        public static final int CLIENT_ID_FIELD_NUMBER = 4;
        public static final int COMPONENT_ID_FIELD_NUMBER = 5;
        private static final AssignedPropertyValue DEFAULT_INSTANCE;
        public static final int ENUM_VALUE_FIELD_NUMBER = 3;
        public static final int GROUPID_FIELD_NUMBER = 8;
        public static final int INT_VALUE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 6;
        private static volatile r2n0 PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 7;
        public static final int POLICYID_FIELD_NUMBER = 9;
        private long groupId_;
        private int platform_;
        private long policyId_;
        private Object structuredValue_;
        private int structuredValueCase_ = 0;
        private String clientId_ = "";
        private String componentId_ = "";
        private String name_ = "";

        public static final class BoolValue extends AbstractC0269h implements BoolValueOrBuilder {
            private static final BoolValue DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private boolean value_;

            public static final class Builder extends AbstractC0268g implements BoolValueOrBuilder {
                public /* synthetic */ Builder(int i) {
                    this();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ pre0 build() {
                    return build();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ pre0 buildPartial() {
                    return super.buildPartial();
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clear */
                public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                    return mo98325clear();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((BoolValue) this.instance).clearValue();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ Object mo98328clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
                public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                    return super.getDefaultInstanceForType();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.BoolValueOrBuilder
                public boolean getValue() {
                    return ((BoolValue) this.instance).getValue();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                    return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
                public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                    return super.mergeFrom(oweVar, auxVar);
                }

                public Builder setValue(boolean z) {
                    copyOnWrite();
                    ((BoolValue) this.instance).setValue(z);
                    return this;
                }

                private Builder() {
                    super(BoolValue.DEFAULT_INSTANCE);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mo98329mergeFrom(bArr, i, i2);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ ore0 mo98327clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                    return super.mo98330mergeFrom(bArr, i, i2, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                    return super.mo98371mergeFrom(inputStream);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                    return super.mo98372mergeFrom(inputStream, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                    return super.mo98373mergeFrom(gvaVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                    return super.mo98374mergeFrom(gvaVar, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                    return super.mo98375mergeFrom(oweVar);
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                    return super.mergeFrom(oweVar, auxVar);
                }

                @Override // p204p.AbstractC2081l8, p204p.ore0
                public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                    return super.mergeFrom(pre0Var);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                    return super.mo98376mergeFrom(bArr);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mo98329mergeFrom(bArr, i, i2);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                    return super.mo98330mergeFrom(bArr, i, i2, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                    return super.mo98377mergeFrom(bArr, auxVar);
                }
            }

            static {
                BoolValue boolValue = new BoolValue();
                DEFAULT_INSTANCE = boolValue;
                AbstractC0269h.registerDefaultInstance(BoolValue.class, boolValue);
            }

            private BoolValue() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.value_ = false;
            }

            public static BoolValue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static BoolValue parseDelimitedFrom(InputStream inputStream) {
                return (BoolValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BoolValue parseFrom(ByteBuffer byteBuffer) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(boolean z) {
                this.value_ = z;
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
                    return new Builder(0);
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
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return getDefaultInstanceForType();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.BoolValueOrBuilder
            public boolean getValue() {
                return this.value_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            public static Builder newBuilder(BoolValue boolValue) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(boolValue);
            }

            public static BoolValue parseDelimitedFrom(InputStream inputStream, aux auxVar) {
                return (BoolValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
            }

            public static BoolValue parseFrom(ByteBuffer byteBuffer, aux auxVar) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
            }

            public static BoolValue parseFrom(gva gvaVar) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
            }

            public static BoolValue parseFrom(gva gvaVar, aux auxVar) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
            }

            public static BoolValue parseFrom(byte[] bArr) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BoolValue parseFrom(byte[] bArr, aux auxVar) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
            }

            public static BoolValue parseFrom(InputStream inputStream) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BoolValue parseFrom(InputStream inputStream, aux auxVar) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
            }

            public static BoolValue parseFrom(owe oweVar) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
            }

            public static BoolValue parseFrom(owe oweVar, aux auxVar) {
                return (BoolValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
            }
        }

        public interface BoolValueOrBuilder extends sre0 {
            @Override // p204p.sre0
            /* synthetic */ pre0 getDefaultInstanceForType();

            boolean getValue();

            @Override // p204p.sre0
            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends AbstractC0268g implements AssignedPropertyValueOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 build() {
                return build();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ pre0 buildPartial() {
                return super.buildPartial();
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clear */
            public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                return mo98325clear();
            }

            public Builder clearBoolValue() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearBoolValue();
                return this;
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearClientId();
                return this;
            }

            public Builder clearComponentId() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearComponentId();
                return this;
            }

            public Builder clearEnumValue() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearEnumValue();
                return this;
            }

            public Builder clearGroupId() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearGroupId();
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearIntValue();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearName();
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearPlatform();
                return this;
            }

            public Builder clearPolicyId() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearPolicyId();
                return this;
            }

            public Builder clearStructuredValue() {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).clearStructuredValue();
                return this;
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public BoolValue getBoolValue() {
                return ((AssignedPropertyValue) this.instance).getBoolValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public String getClientId() {
                return ((AssignedPropertyValue) this.instance).getClientId();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public gva getClientIdBytes() {
                return ((AssignedPropertyValue) this.instance).getClientIdBytes();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public String getComponentId() {
                return ((AssignedPropertyValue) this.instance).getComponentId();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public gva getComponentIdBytes() {
                return ((AssignedPropertyValue) this.instance).getComponentIdBytes();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public EnumValue getEnumValue() {
                return ((AssignedPropertyValue) this.instance).getEnumValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public long getGroupId() {
                return ((AssignedPropertyValue) this.instance).getGroupId();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public IntValue getIntValue() {
                return ((AssignedPropertyValue) this.instance).getIntValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public String getName() {
                return ((AssignedPropertyValue) this.instance).getName();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public gva getNameBytes() {
                return ((AssignedPropertyValue) this.instance).getNameBytes();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public EnumC1266a getPlatform() {
                return ((AssignedPropertyValue) this.instance).getPlatform();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public int getPlatformValue() {
                return ((AssignedPropertyValue) this.instance).getPlatformValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public long getPolicyId() {
                return ((AssignedPropertyValue) this.instance).getPolicyId();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public StructuredValueCase getStructuredValueCase() {
                return ((AssignedPropertyValue) this.instance).getStructuredValueCase();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public boolean hasBoolValue() {
                return ((AssignedPropertyValue) this.instance).hasBoolValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public boolean hasEnumValue() {
                return ((AssignedPropertyValue) this.instance).hasEnumValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public boolean hasIntValue() {
                return ((AssignedPropertyValue) this.instance).hasIntValue();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            public Builder mergeBoolValue(BoolValue boolValue) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).mergeBoolValue(boolValue);
                return this;
            }

            public Builder mergeEnumValue(EnumValue enumValue) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).mergeEnumValue(enumValue);
                return this;
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            public Builder mergeIntValue(IntValue intValue) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).mergeIntValue(intValue);
                return this;
            }

            public Builder setBoolValue(BoolValue boolValue) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setBoolValue(boolValue);
                return this;
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(gva gvaVar) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setClientIdBytes(gvaVar);
                return this;
            }

            public Builder setComponentId(String str) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setComponentId(str);
                return this;
            }

            public Builder setComponentIdBytes(gva gvaVar) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setComponentIdBytes(gvaVar);
                return this;
            }

            public Builder setEnumValue(EnumValue enumValue) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setEnumValue(enumValue);
                return this;
            }

            public Builder setGroupId(long j) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setGroupId(j);
                return this;
            }

            public Builder setIntValue(IntValue intValue) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setIntValue(intValue);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(gva gvaVar) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setNameBytes(gvaVar);
                return this;
            }

            public Builder setPlatform(EnumC1266a enumC1266a) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setPlatform(enumC1266a);
                return this;
            }

            public Builder setPlatformValue(int i) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setPlatformValue(i);
                return this;
            }

            public Builder setPolicyId(long j) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setPolicyId(j);
                return this;
            }

            private Builder() {
                super(AssignedPropertyValue.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            public Builder setBoolValue(BoolValue.Builder builder) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setBoolValue((BoolValue) builder.build());
                return this;
            }

            public Builder setEnumValue(EnumValue.Builder builder) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setEnumValue((EnumValue) builder.build());
                return this;
            }

            public Builder setIntValue(IntValue.Builder builder) {
                copyOnWrite();
                ((AssignedPropertyValue) this.instance).setIntValue((IntValue) builder.build());
                return this;
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                return super.mo98371mergeFrom(inputStream);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                return super.mo98372mergeFrom(inputStream, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                return super.mo98373mergeFrom(gvaVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                return super.mo98374mergeFrom(gvaVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                return super.mo98375mergeFrom(oweVar);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            @Override // p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                return super.mergeFrom(pre0Var);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                return super.mo98376mergeFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
            }

            @Override // p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                return super.mo98377mergeFrom(bArr, auxVar);
            }
        }

        public static final class EnumValue extends AbstractC0269h implements EnumValueOrBuilder {
            private static final EnumValue DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private String value_ = "";

            public static final class Builder extends AbstractC0268g implements EnumValueOrBuilder {
                public /* synthetic */ Builder(int i) {
                    this();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ pre0 build() {
                    return build();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ pre0 buildPartial() {
                    return super.buildPartial();
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clear */
                public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                    return mo98325clear();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((EnumValue) this.instance).clearValue();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ Object mo98328clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
                public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                    return super.getDefaultInstanceForType();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
                public String getValue() {
                    return ((EnumValue) this.instance).getValue();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
                public gva getValueBytes() {
                    return ((EnumValue) this.instance).getValueBytes();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                    return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
                public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                    return super.mergeFrom(oweVar, auxVar);
                }

                public Builder setValue(String str) {
                    copyOnWrite();
                    ((EnumValue) this.instance).setValue(str);
                    return this;
                }

                public Builder setValueBytes(gva gvaVar) {
                    copyOnWrite();
                    ((EnumValue) this.instance).setValueBytes(gvaVar);
                    return this;
                }

                private Builder() {
                    super(EnumValue.DEFAULT_INSTANCE);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mo98329mergeFrom(bArr, i, i2);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ ore0 mo98327clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                    return super.mo98330mergeFrom(bArr, i, i2, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                    return super.mo98371mergeFrom(inputStream);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                    return super.mo98372mergeFrom(inputStream, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                    return super.mo98373mergeFrom(gvaVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                    return super.mo98374mergeFrom(gvaVar, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                    return super.mo98375mergeFrom(oweVar);
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                    return super.mergeFrom(oweVar, auxVar);
                }

                @Override // p204p.AbstractC2081l8, p204p.ore0
                public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                    return super.mergeFrom(pre0Var);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                    return super.mo98376mergeFrom(bArr);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mo98329mergeFrom(bArr, i, i2);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                    return super.mo98330mergeFrom(bArr, i, i2, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                    return super.mo98377mergeFrom(bArr, auxVar);
                }
            }

            static {
                EnumValue enumValue = new EnumValue();
                DEFAULT_INSTANCE = enumValue;
                AbstractC0269h.registerDefaultInstance(EnumValue.class, enumValue);
            }

            private EnumValue() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static EnumValue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static EnumValue parseDelimitedFrom(InputStream inputStream) {
                return (EnumValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumValue parseFrom(ByteBuffer byteBuffer) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(String str) {
                str.getClass();
                this.value_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValueBytes(gva gvaVar) {
                AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
                this.value_ = gvaVar.m45892u();
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
                    return new Builder(0);
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
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return getDefaultInstanceForType();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
            public String getValue() {
                return this.value_;
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
            public gva getValueBytes() {
                return gva.m45888f(this.value_);
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            public static Builder newBuilder(EnumValue enumValue) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(enumValue);
            }

            public static EnumValue parseDelimitedFrom(InputStream inputStream, aux auxVar) {
                return (EnumValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
            }

            public static EnumValue parseFrom(ByteBuffer byteBuffer, aux auxVar) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
            }

            public static EnumValue parseFrom(gva gvaVar) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
            }

            public static EnumValue parseFrom(gva gvaVar, aux auxVar) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
            }

            public static EnumValue parseFrom(byte[] bArr) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EnumValue parseFrom(byte[] bArr, aux auxVar) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
            }

            public static EnumValue parseFrom(InputStream inputStream) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumValue parseFrom(InputStream inputStream, aux auxVar) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
            }

            public static EnumValue parseFrom(owe oweVar) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
            }

            public static EnumValue parseFrom(owe oweVar, aux auxVar) {
                return (EnumValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
            }
        }

        public interface EnumValueOrBuilder extends sre0 {
            @Override // p204p.sre0
            /* synthetic */ pre0 getDefaultInstanceForType();

            String getValue();

            gva getValueBytes();

            @Override // p204p.sre0
            /* synthetic */ boolean isInitialized();
        }

        public static final class IntValue extends AbstractC0269h implements IntValueOrBuilder {
            private static final IntValue DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private int value_;

            public static final class Builder extends AbstractC0268g implements IntValueOrBuilder {
                public /* synthetic */ Builder(int i) {
                    this();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ pre0 build() {
                    return build();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ pre0 buildPartial() {
                    return super.buildPartial();
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clear */
                public /* bridge */ /* synthetic */ ore0 mo98325clear() {
                    return mo98325clear();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((IntValue) this.instance).clearValue();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ Object mo98328clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
                public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                    return super.getDefaultInstanceForType();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.IntValueOrBuilder
                public int getValue() {
                    return ((IntValue) this.instance).getValue();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                    return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
                public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                    return super.mergeFrom(oweVar, auxVar);
                }

                public Builder setValue(int i) {
                    copyOnWrite();
                    ((IntValue) this.instance).setValue(i);
                    return this;
                }

                private Builder() {
                    super(IntValue.DEFAULT_INSTANCE);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mo98329mergeFrom(bArr, i, i2);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: clone */
                public /* bridge */ /* synthetic */ ore0 mo98327clone() {
                    return super.mo98326clone();
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                    return super.mo98330mergeFrom(bArr, i, i2, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
                    return super.mo98371mergeFrom(inputStream);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
                    return super.mo98372mergeFrom(inputStream, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
                    return super.mo98373mergeFrom(gvaVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
                    return super.mo98374mergeFrom(gvaVar, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
                    return super.mo98375mergeFrom(oweVar);
                }

                @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
                public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
                    return super.mergeFrom(oweVar, auxVar);
                }

                @Override // p204p.AbstractC2081l8, p204p.ore0
                public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
                    return super.mergeFrom(pre0Var);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
                    return super.mo98376mergeFrom(bArr);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mo98329mergeFrom(bArr, i, i2);
                }

                @Override // com.google.protobuf.AbstractC0268g
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                    return super.mo98330mergeFrom(bArr, i, i2, auxVar);
                }

                @Override // p204p.AbstractC2081l8
                /* JADX INFO: renamed from: mergeFrom */
                public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
                    return super.mo98377mergeFrom(bArr, auxVar);
                }
            }

            static {
                IntValue intValue = new IntValue();
                DEFAULT_INSTANCE = intValue;
                AbstractC0269h.registerDefaultInstance(IntValue.class, intValue);
            }

            private IntValue() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.value_ = 0;
            }

            public static IntValue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static IntValue parseDelimitedFrom(InputStream inputStream) {
                return (IntValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static IntValue parseFrom(ByteBuffer byteBuffer) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(int i) {
                this.value_ = i;
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
                    return new Builder(0);
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
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return getDefaultInstanceForType();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.IntValueOrBuilder
            public int getValue() {
                return this.value_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            public static Builder newBuilder(IntValue intValue) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(intValue);
            }

            public static IntValue parseDelimitedFrom(InputStream inputStream, aux auxVar) {
                return (IntValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
            }

            public static IntValue parseFrom(ByteBuffer byteBuffer, aux auxVar) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
            }

            public static IntValue parseFrom(gva gvaVar) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
            }

            public static IntValue parseFrom(gva gvaVar, aux auxVar) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
            }

            public static IntValue parseFrom(byte[] bArr) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static IntValue parseFrom(byte[] bArr, aux auxVar) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
            }

            public static IntValue parseFrom(InputStream inputStream) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static IntValue parseFrom(InputStream inputStream, aux auxVar) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
            }

            public static IntValue parseFrom(owe oweVar) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
            }

            public static IntValue parseFrom(owe oweVar, aux auxVar) {
                return (IntValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
            }
        }

        public interface IntValueOrBuilder extends sre0 {
            @Override // p204p.sre0
            /* synthetic */ pre0 getDefaultInstanceForType();

            int getValue();

            @Override // p204p.sre0
            /* synthetic */ boolean isInitialized();
        }

        public enum StructuredValueCase {
            BOOL_VALUE(1),
            INT_VALUE(2),
            ENUM_VALUE(3),
            STRUCTUREDVALUE_NOT_SET(0);

            private final int value;

            StructuredValueCase(int i) {
                this.value = i;
            }

            public static StructuredValueCase forNumber(int i) {
                if (i == 0) {
                    return STRUCTUREDVALUE_NOT_SET;
                }
                if (i == 1) {
                    return BOOL_VALUE;
                }
                if (i == 2) {
                    return INT_VALUE;
                }
                if (i != 3) {
                    return null;
                }
                return ENUM_VALUE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static StructuredValueCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            AssignedPropertyValue assignedPropertyValue = new AssignedPropertyValue();
            DEFAULT_INSTANCE = assignedPropertyValue;
            AbstractC0269h.registerDefaultInstance(AssignedPropertyValue.class, assignedPropertyValue);
        }

        private AssignedPropertyValue() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolValue() {
            if (this.structuredValueCase_ == 1) {
                this.structuredValueCase_ = 0;
                this.structuredValue_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientId() {
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearComponentId() {
            this.componentId_ = getDefaultInstance().getComponentId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumValue() {
            if (this.structuredValueCase_ == 3) {
                this.structuredValueCase_ = 0;
                this.structuredValue_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGroupId() {
            this.groupId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.structuredValueCase_ == 2) {
                this.structuredValueCase_ = 0;
                this.structuredValue_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatform() {
            this.platform_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPolicyId() {
            this.policyId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStructuredValue() {
            this.structuredValueCase_ = 0;
            this.structuredValue_ = null;
        }

        public static AssignedPropertyValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBoolValue(BoolValue boolValue) {
            boolValue.getClass();
            if (this.structuredValueCase_ != 1 || this.structuredValue_ == BoolValue.getDefaultInstance()) {
                this.structuredValue_ = boolValue;
            } else {
                this.structuredValue_ = ((BoolValue.Builder) BoolValue.newBuilder((BoolValue) this.structuredValue_).mergeFrom((AbstractC0269h) boolValue)).buildPartial();
            }
            this.structuredValueCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEnumValue(EnumValue enumValue) {
            enumValue.getClass();
            if (this.structuredValueCase_ != 3 || this.structuredValue_ == EnumValue.getDefaultInstance()) {
                this.structuredValue_ = enumValue;
            } else {
                this.structuredValue_ = ((EnumValue.Builder) EnumValue.newBuilder((EnumValue) this.structuredValue_).mergeFrom((AbstractC0269h) enumValue)).buildPartial();
            }
            this.structuredValueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIntValue(IntValue intValue) {
            intValue.getClass();
            if (this.structuredValueCase_ != 2 || this.structuredValue_ == IntValue.getDefaultInstance()) {
                this.structuredValue_ = intValue;
            } else {
                this.structuredValue_ = ((IntValue.Builder) IntValue.newBuilder((IntValue) this.structuredValue_).mergeFrom((AbstractC0269h) intValue)).buildPartial();
            }
            this.structuredValueCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AssignedPropertyValue parseDelimitedFrom(InputStream inputStream) {
            return (AssignedPropertyValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssignedPropertyValue parseFrom(ByteBuffer byteBuffer) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolValue(BoolValue boolValue) {
            boolValue.getClass();
            this.structuredValue_ = boolValue;
            this.structuredValueCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.clientId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientIdBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            this.clientId_ = gvaVar.m45892u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setComponentId(String str) {
            str.getClass();
            this.componentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setComponentIdBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            this.componentId_ = gvaVar.m45892u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumValue(EnumValue enumValue) {
            enumValue.getClass();
            this.structuredValue_ = enumValue;
            this.structuredValueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupId(long j) {
            this.groupId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(IntValue intValue) {
            intValue.getClass();
            this.structuredValue_ = intValue;
            this.structuredValueCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            this.name_ = gvaVar.m45892u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatform(EnumC1266a enumC1266a) {
            this.platform_ = enumC1266a.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformValue(int i) {
            this.platform_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPolicyId(long j) {
            this.policyId_ = j;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f\b\u0002\t\u0002", new Object[]{"structuredValue_", "structuredValueCase_", BoolValue.class, IntValue.class, EnumValue.class, "clientId_", "componentId_", "name_", "platform_", "groupId_", "policyId_"});
            }
            if (iOrdinal == 3) {
                return new AssignedPropertyValue();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (AssignedPropertyValue.class) {
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

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public BoolValue getBoolValue() {
            return this.structuredValueCase_ == 1 ? (BoolValue) this.structuredValue_ : BoolValue.getDefaultInstance();
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public String getClientId() {
            return this.clientId_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public gva getClientIdBytes() {
            return gva.m45888f(this.clientId_);
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public String getComponentId() {
            return this.componentId_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public gva getComponentIdBytes() {
            return gva.m45888f(this.componentId_);
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public EnumValue getEnumValue() {
            return this.structuredValueCase_ == 3 ? (EnumValue) this.structuredValue_ : EnumValue.getDefaultInstance();
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public long getGroupId() {
            return this.groupId_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public IntValue getIntValue() {
            return this.structuredValueCase_ == 2 ? (IntValue) this.structuredValue_ : IntValue.getDefaultInstance();
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public gva getNameBytes() {
            return gva.m45888f(this.name_);
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public EnumC1266a getPlatform() {
            EnumC1266a enumC1266aM20119a = EnumC1266a.m20119a(this.platform_);
            return enumC1266aM20119a == null ? EnumC1266a.UNRECOGNIZED : enumC1266aM20119a;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public long getPolicyId() {
            return this.policyId_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public StructuredValueCase getStructuredValueCase() {
            return StructuredValueCase.forNumber(this.structuredValueCase_);
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public boolean hasBoolValue() {
            return this.structuredValueCase_ == 1;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public boolean hasEnumValue() {
            return this.structuredValueCase_ == 3;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public boolean hasIntValue() {
            return this.structuredValueCase_ == 2;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(AssignedPropertyValue assignedPropertyValue) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(assignedPropertyValue);
        }

        public static AssignedPropertyValue parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (AssignedPropertyValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static AssignedPropertyValue parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static AssignedPropertyValue parseFrom(gva gvaVar) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static AssignedPropertyValue parseFrom(gva gvaVar, aux auxVar) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static AssignedPropertyValue parseFrom(byte[] bArr) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssignedPropertyValue parseFrom(byte[] bArr, aux auxVar) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static AssignedPropertyValue parseFrom(InputStream inputStream) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssignedPropertyValue parseFrom(InputStream inputStream, aux auxVar) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static AssignedPropertyValue parseFrom(owe oweVar) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static AssignedPropertyValue parseFrom(owe oweVar, aux auxVar) {
            return (AssignedPropertyValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface AssignedPropertyValueOrBuilder extends sre0 {
        AssignedPropertyValue.BoolValue getBoolValue();

        String getClientId();

        gva getClientIdBytes();

        String getComponentId();

        gva getComponentIdBytes();

        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        AssignedPropertyValue.EnumValue getEnumValue();

        long getGroupId();

        AssignedPropertyValue.IntValue getIntValue();

        String getName();

        gva getNameBytes();

        EnumC1266a getPlatform();

        int getPlatformValue();

        long getPolicyId();

        AssignedPropertyValue.StructuredValueCase getStructuredValueCase();

        boolean hasBoolValue();

        boolean hasEnumValue();

        boolean hasIntValue();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class Builder extends AbstractC0268g implements sre0 {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllProperties(Iterable<? extends AssignedPropertyValue> iterable) {
            copyOnWrite();
            GranularConfiguration.m20058n((GranularConfiguration) this.instance, iterable);
            return this;
        }

        public Builder addProperties(AssignedPropertyValue assignedPropertyValue) {
            copyOnWrite();
            GranularConfiguration.m20060p((GranularConfiguration) this.instance, assignedPropertyValue);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearConfigurationAssignmentId() {
            copyOnWrite();
            GranularConfiguration.m20061q((GranularConfiguration) this.instance);
            return this;
        }

        public Builder clearEtag() {
            copyOnWrite();
            GranularConfiguration.m20062r((GranularConfiguration) this.instance);
            return this;
        }

        public Builder clearPolicySnapshotId() {
            copyOnWrite();
            GranularConfiguration.m20063s((GranularConfiguration) this.instance);
            return this;
        }

        public Builder clearProperties() {
            copyOnWrite();
            GranularConfiguration.m20064t((GranularConfiguration) this.instance);
            return this;
        }

        public Builder clearRcsFetchTime() {
            copyOnWrite();
            GranularConfiguration.m20065u((GranularConfiguration) this.instance);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        public String getConfigurationAssignmentId() {
            return ((GranularConfiguration) this.instance).m20072F();
        }

        public gva getConfigurationAssignmentIdBytes() {
            return ((GranularConfiguration) this.instance).m20073G();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public String getEtag() {
            return ((GranularConfiguration) this.instance).m20074H();
        }

        public gva getEtagBytes() {
            return ((GranularConfiguration) this.instance).m20075I();
        }

        public long getPolicySnapshotId() {
            return ((GranularConfiguration) this.instance).m20076J();
        }

        public AssignedPropertyValue getProperties(int i) {
            return ((GranularConfiguration) this.instance).m20077K(i);
        }

        public int getPropertiesCount() {
            return ((GranularConfiguration) this.instance).m20078L();
        }

        public List<AssignedPropertyValue> getPropertiesList() {
            return Collections.unmodifiableList(((GranularConfiguration) this.instance).m20079M());
        }

        public long getRcsFetchTime() {
            return ((GranularConfiguration) this.instance).m20080N();
        }

        public boolean hasEtag() {
            return ((GranularConfiguration) this.instance).m20081O();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeProperties(int i) {
            copyOnWrite();
            GranularConfiguration.m20066v((GranularConfiguration) this.instance, i);
            return this;
        }

        public Builder setConfigurationAssignmentId(String str) {
            copyOnWrite();
            GranularConfiguration.m20067w((GranularConfiguration) this.instance, str);
            return this;
        }

        public Builder setConfigurationAssignmentIdBytes(gva gvaVar) {
            copyOnWrite();
            GranularConfiguration.m20068x((GranularConfiguration) this.instance, gvaVar);
            return this;
        }

        public Builder setEtag(String str) {
            copyOnWrite();
            GranularConfiguration.m20069y((GranularConfiguration) this.instance, str);
            return this;
        }

        public Builder setEtagBytes(gva gvaVar) {
            copyOnWrite();
            GranularConfiguration.m20070z((GranularConfiguration) this.instance, gvaVar);
            return this;
        }

        public Builder setPolicySnapshotId(long j) {
            copyOnWrite();
            GranularConfiguration.m20052A((GranularConfiguration) this.instance, j);
            return this;
        }

        public Builder setProperties(int i, AssignedPropertyValue assignedPropertyValue) {
            copyOnWrite();
            GranularConfiguration.m20053B((GranularConfiguration) this.instance, i, assignedPropertyValue);
            return this;
        }

        public Builder setRcsFetchTime(long j) {
            copyOnWrite();
            GranularConfiguration.m20054C((GranularConfiguration) this.instance, j);
            return this;
        }

        private Builder() {
            super(GranularConfiguration.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        public Builder addProperties(int i, AssignedPropertyValue assignedPropertyValue) {
            copyOnWrite();
            GranularConfiguration.m20059o((GranularConfiguration) this.instance, i, assignedPropertyValue);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setProperties(int i, AssignedPropertyValue.Builder builder) {
            copyOnWrite();
            GranularConfiguration.m20053B((GranularConfiguration) this.instance, i, (AssignedPropertyValue) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addProperties(AssignedPropertyValue.Builder builder) {
            copyOnWrite();
            GranularConfiguration.m20060p((GranularConfiguration) this.instance, (AssignedPropertyValue) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        public Builder addProperties(int i, AssignedPropertyValue.Builder builder) {
            copyOnWrite();
            GranularConfiguration.m20059o((GranularConfiguration) this.instance, i, (AssignedPropertyValue) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    static {
        GranularConfiguration granularConfiguration = new GranularConfiguration();
        DEFAULT_INSTANCE = granularConfiguration;
        AbstractC0269h.registerDefaultInstance(GranularConfiguration.class, granularConfiguration);
    }

    private GranularConfiguration() {
    }

    /* JADX INFO: renamed from: A */
    public static void m20052A(GranularConfiguration granularConfiguration, long j) {
        granularConfiguration.policySnapshotId_ = j;
    }

    /* JADX INFO: renamed from: B */
    public static void m20053B(GranularConfiguration granularConfiguration, int i, AssignedPropertyValue assignedPropertyValue) {
        granularConfiguration.getClass();
        assignedPropertyValue.getClass();
        granularConfiguration.m20071E();
        granularConfiguration.properties_.set(i, assignedPropertyValue);
    }

    /* JADX INFO: renamed from: C */
    public static void m20054C(GranularConfiguration granularConfiguration, long j) {
        granularConfiguration.rcsFetchTime_ = j;
    }

    /* JADX INFO: renamed from: P */
    public static Builder m20056P() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: Q */
    public static GranularConfiguration m20057Q(byte[] bArr) {
        return (GranularConfiguration) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: renamed from: n */
    public static void m20058n(GranularConfiguration granularConfiguration, Iterable iterable) {
        granularConfiguration.m20071E();
        AbstractC2118m8.addAll(iterable, granularConfiguration.properties_);
    }

    /* JADX INFO: renamed from: o */
    public static void m20059o(GranularConfiguration granularConfiguration, int i, AssignedPropertyValue assignedPropertyValue) {
        granularConfiguration.getClass();
        assignedPropertyValue.getClass();
        granularConfiguration.m20071E();
        granularConfiguration.properties_.add(i, assignedPropertyValue);
    }

    /* JADX INFO: renamed from: p */
    public static void m20060p(GranularConfiguration granularConfiguration, AssignedPropertyValue assignedPropertyValue) {
        granularConfiguration.getClass();
        assignedPropertyValue.getClass();
        granularConfiguration.m20071E();
        granularConfiguration.properties_.add(assignedPropertyValue);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20061q(GranularConfiguration granularConfiguration) {
        granularConfiguration.getClass();
        granularConfiguration.configurationAssignmentId_ = DEFAULT_INSTANCE.configurationAssignmentId_;
    }

    /* JADX INFO: renamed from: r */
    public static void m20062r(GranularConfiguration granularConfiguration) {
        granularConfiguration.bitField0_ &= -2;
        granularConfiguration.etag_ = DEFAULT_INSTANCE.etag_;
    }

    /* JADX INFO: renamed from: s */
    public static void m20063s(GranularConfiguration granularConfiguration) {
        granularConfiguration.policySnapshotId_ = 0L;
    }

    /* JADX INFO: renamed from: t */
    public static void m20064t(GranularConfiguration granularConfiguration) {
        granularConfiguration.getClass();
        granularConfiguration.properties_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: renamed from: u */
    public static void m20065u(GranularConfiguration granularConfiguration) {
        granularConfiguration.rcsFetchTime_ = 0L;
    }

    /* JADX INFO: renamed from: v */
    public static void m20066v(GranularConfiguration granularConfiguration, int i) {
        granularConfiguration.m20071E();
        granularConfiguration.properties_.remove(i);
    }

    /* JADX INFO: renamed from: w */
    public static void m20067w(GranularConfiguration granularConfiguration, String str) {
        granularConfiguration.getClass();
        str.getClass();
        granularConfiguration.configurationAssignmentId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m20068x(GranularConfiguration granularConfiguration, gva gvaVar) {
        granularConfiguration.getClass();
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        granularConfiguration.configurationAssignmentId_ = gvaVar.m45892u();
    }

    /* JADX INFO: renamed from: y */
    public static void m20069y(GranularConfiguration granularConfiguration, String str) {
        granularConfiguration.getClass();
        str.getClass();
        granularConfiguration.bitField0_ |= 1;
        granularConfiguration.etag_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m20070z(GranularConfiguration granularConfiguration, gva gvaVar) {
        granularConfiguration.getClass();
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        granularConfiguration.etag_ = gvaVar.m45892u();
        granularConfiguration.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: E */
    public final void m20071E() {
        ae50 ae50Var = this.properties_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.properties_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    /* JADX INFO: renamed from: F */
    public final String m20072F() {
        return this.configurationAssignmentId_;
    }

    /* JADX INFO: renamed from: G */
    public final gva m20073G() {
        return gva.m45888f(this.configurationAssignmentId_);
    }

    /* JADX INFO: renamed from: H */
    public final String m20074H() {
        return this.etag_;
    }

    /* JADX INFO: renamed from: I */
    public final gva m20075I() {
        return gva.m45888f(this.etag_);
    }

    /* JADX INFO: renamed from: J */
    public final long m20076J() {
        return this.policySnapshotId_;
    }

    /* JADX INFO: renamed from: K */
    public final AssignedPropertyValue m20077K(int i) {
        return (AssignedPropertyValue) this.properties_.get(i);
    }

    /* JADX INFO: renamed from: L */
    public final int m20078L() {
        return this.properties_.size();
    }

    /* JADX INFO: renamed from: M */
    public final List m20079M() {
        return this.properties_;
    }

    /* JADX INFO: renamed from: N */
    public final long m20080N() {
        return this.rcsFetchTime_;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m20081O() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0003Ȉ\u0004\u0002\nለ\u0000", new Object[]{"bitField0_", "properties_", AssignedPropertyValue.class, "rcsFetchTime_", "configurationAssignmentId_", "policySnapshotId_", "etag_"});
        }
        if (iOrdinal == 3) {
            return new GranularConfiguration();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (GranularConfiguration.class) {
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
