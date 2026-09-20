package org.chromium.net.httpflags;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class FlagValue extends AbstractC0269h implements FlagValueOrBuilder {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    private static final FlagValue DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 constrainedValues_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: org.chromium.net.httpflags.FlagValue$1 */
    public static /* synthetic */ class C16421 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f10950xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f10950xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10950xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10950xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10950xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10950xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10950xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10950xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements FlagValueOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllConstrainedValues(Iterable<? extends ConstrainedValue> iterable) {
            copyOnWrite();
            ((FlagValue) this.instance).addAllConstrainedValues(iterable);
            return this;
        }

        public Builder addConstrainedValues(ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((FlagValue) this.instance).addConstrainedValues(constrainedValue);
            return this;
        }

        public Builder clearConstrainedValues() {
            copyOnWrite();
            ((FlagValue) this.instance).clearConstrainedValues();
            return this;
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public ConstrainedValue getConstrainedValues(int i) {
            return ((FlagValue) this.instance).getConstrainedValues(i);
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public int getConstrainedValuesCount() {
            return ((FlagValue) this.instance).getConstrainedValuesCount();
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public List<ConstrainedValue> getConstrainedValuesList() {
            return Collections.unmodifiableList(((FlagValue) this.instance).getConstrainedValuesList());
        }

        public Builder removeConstrainedValues(int i) {
            copyOnWrite();
            ((FlagValue) this.instance).removeConstrainedValues(i);
            return this;
        }

        public Builder setConstrainedValues(int i, ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((FlagValue) this.instance).setConstrainedValues(i, constrainedValue);
            return this;
        }

        private Builder() {
            super(FlagValue.DEFAULT_INSTANCE);
        }

        public Builder addConstrainedValues(int i, ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((FlagValue) this.instance).addConstrainedValues(i, constrainedValue);
            return this;
        }

        public Builder setConstrainedValues(int i, ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((FlagValue) this.instance).setConstrainedValues(i, (ConstrainedValue) builder.build());
            return this;
        }

        public Builder addConstrainedValues(ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((FlagValue) this.instance).addConstrainedValues((ConstrainedValue) builder.build());
            return this;
        }

        public Builder addConstrainedValues(int i, ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((FlagValue) this.instance).addConstrainedValues(i, (ConstrainedValue) builder.build());
            return this;
        }
    }

    public static final class ConstrainedValue extends AbstractC0269h implements ConstrainedValueOrBuilder {
        public static final int APPLY_EVEN_IF_CRONET_TELEMETRY_DISABLED_FIELD_NUMBER = 8;
        public static final int APP_ID_FIELD_NUMBER = 1;
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        public static final int BYTES_VALUE_FIELD_NUMBER = 7;
        private static final ConstrainedValue DEFAULT_INSTANCE;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        public static final int MIN_VERSION_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 6;
        private boolean applyEvenIfCronetTelemetryDisabled_;
        private int bitField0_;
        private Object value_;
        private int valueCase_ = 0;
        private String appId_ = "";
        private String minVersion_ = "";

        public static final class Builder extends AbstractC0268g implements ConstrainedValueOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder clearAppId() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearAppId();
                return this;
            }

            public Builder clearApplyEvenIfCronetTelemetryDisabled() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearApplyEvenIfCronetTelemetryDisabled();
                return this;
            }

            public Builder clearBoolValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearBoolValue();
                return this;
            }

            public Builder clearBytesValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearBytesValue();
                return this;
            }

            public Builder clearFloatValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearFloatValue();
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearIntValue();
                return this;
            }

            public Builder clearMinVersion() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearMinVersion();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearStringValue();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearValue();
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getAppId() {
                return ((ConstrainedValue) this.instance).getAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public gva getAppIdBytes() {
                return ((ConstrainedValue) this.instance).getAppIdBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean getApplyEvenIfCronetTelemetryDisabled() {
                return ((ConstrainedValue) this.instance).getApplyEvenIfCronetTelemetryDisabled();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean getBoolValue() {
                return ((ConstrainedValue) this.instance).getBoolValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public gva getBytesValue() {
                return ((ConstrainedValue) this.instance).getBytesValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public float getFloatValue() {
                return ((ConstrainedValue) this.instance).getFloatValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public long getIntValue() {
                return ((ConstrainedValue) this.instance).getIntValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getMinVersion() {
                return ((ConstrainedValue) this.instance).getMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public gva getMinVersionBytes() {
                return ((ConstrainedValue) this.instance).getMinVersionBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getStringValue() {
                return ((ConstrainedValue) this.instance).getStringValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public gva getStringValueBytes() {
                return ((ConstrainedValue) this.instance).getStringValueBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public ValueCase getValueCase() {
                return ((ConstrainedValue) this.instance).getValueCase();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasAppId() {
                return ((ConstrainedValue) this.instance).hasAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasApplyEvenIfCronetTelemetryDisabled() {
                return ((ConstrainedValue) this.instance).hasApplyEvenIfCronetTelemetryDisabled();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasBoolValue() {
                return ((ConstrainedValue) this.instance).hasBoolValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasBytesValue() {
                return ((ConstrainedValue) this.instance).hasBytesValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasFloatValue() {
                return ((ConstrainedValue) this.instance).hasFloatValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasIntValue() {
                return ((ConstrainedValue) this.instance).hasIntValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasMinVersion() {
                return ((ConstrainedValue) this.instance).hasMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasStringValue() {
                return ((ConstrainedValue) this.instance).hasStringValue();
            }

            public Builder setAppId(String str) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setAppId(str);
                return this;
            }

            public Builder setAppIdBytes(gva gvaVar) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setAppIdBytes(gvaVar);
                return this;
            }

            public Builder setApplyEvenIfCronetTelemetryDisabled(boolean z) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setApplyEvenIfCronetTelemetryDisabled(z);
                return this;
            }

            public Builder setBoolValue(boolean z) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setBoolValue(z);
                return this;
            }

            public Builder setBytesValue(gva gvaVar) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setBytesValue(gvaVar);
                return this;
            }

            public Builder setFloatValue(float f) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setFloatValue(f);
                return this;
            }

            public Builder setIntValue(long j) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setIntValue(j);
                return this;
            }

            public Builder setMinVersion(String str) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setMinVersion(str);
                return this;
            }

            public Builder setMinVersionBytes(gva gvaVar) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setMinVersionBytes(gvaVar);
                return this;
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setStringValue(str);
                return this;
            }

            public Builder setStringValueBytes(gva gvaVar) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setStringValueBytes(gvaVar);
                return this;
            }

            private Builder() {
                super(ConstrainedValue.DEFAULT_INSTANCE);
            }
        }

        public enum ValueCase {
            BOOL_VALUE(3),
            INT_VALUE(4),
            FLOAT_VALUE(5),
            STRING_VALUE(6),
            BYTES_VALUE(7),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 3) {
                    return BOOL_VALUE;
                }
                if (i == 4) {
                    return INT_VALUE;
                }
                if (i == 5) {
                    return FLOAT_VALUE;
                }
                if (i == 6) {
                    return STRING_VALUE;
                }
                if (i != 7) {
                    return null;
                }
                return BYTES_VALUE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            ConstrainedValue constrainedValue = new ConstrainedValue();
            DEFAULT_INSTANCE = constrainedValue;
            AbstractC0269h.registerDefaultInstance(ConstrainedValue.class, constrainedValue);
        }

        private ConstrainedValue() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppId() {
            this.bitField0_ &= -2;
            this.appId_ = getDefaultInstance().getAppId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApplyEvenIfCronetTelemetryDisabled() {
            this.bitField0_ &= -5;
            this.applyEvenIfCronetTelemetryDisabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytesValue() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatValue() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinVersion() {
            this.bitField0_ &= -3;
            this.minVersion_ = getDefaultInstance().getMinVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static ConstrainedValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ConstrainedValue parseDelimitedFrom(InputStream inputStream) {
            return (ConstrainedValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConstrainedValue parseFrom(ByteBuffer byteBuffer) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.appId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIdBytes(gva gvaVar) {
            this.appId_ = gvaVar.m45892u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplyEvenIfCronetTelemetryDisabled(boolean z) {
            this.bitField0_ |= 4;
            this.applyEvenIfCronetTelemetryDisabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolValue(boolean z) {
            this.valueCase_ = 3;
            this.value_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytesValue(gva gvaVar) {
            gvaVar.getClass();
            this.valueCase_ = 7;
            this.value_ = gvaVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(float f) {
            this.valueCase_ = 5;
            this.value_ = Float.valueOf(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(long j) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.minVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinVersionBytes(gva gvaVar) {
            this.minVersion_ = gvaVar.m45892u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str) {
            str.getClass();
            this.valueCase_ = 6;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(gva gvaVar) {
            this.value_ = gvaVar.m45892u();
            this.valueCase_ = 6;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            switch (z110Var.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_", "applyEvenIfCronetTelemetryDisabled_"});
                case 3:
                    return new ConstrainedValue();
                case 4:
                    return new Builder(0);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    r2n0 r2n0Var = PARSER;
                    if (r2n0Var != null) {
                        return r2n0Var;
                    }
                    synchronized (ConstrainedValue.class) {
                        try {
                            r110Var = PARSER;
                            if (r110Var == null) {
                                r110Var = new r110(DEFAULT_INSTANCE);
                                PARSER = r110Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return r110Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getAppId() {
            return this.appId_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public gva getAppIdBytes() {
            return gva.m45888f(this.appId_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean getApplyEvenIfCronetTelemetryDisabled() {
            return this.applyEvenIfCronetTelemetryDisabled_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean getBoolValue() {
            if (this.valueCase_ == 3) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public gva getBytesValue() {
            return this.valueCase_ == 7 ? (gva) this.value_ : gva.f84678b;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public float getFloatValue() {
            if (this.valueCase_ == 5) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public long getIntValue() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getMinVersion() {
            return this.minVersion_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public gva getMinVersionBytes() {
            return gva.m45888f(this.minVersion_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getStringValue() {
            return this.valueCase_ == 6 ? (String) this.value_ : "";
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public gva getStringValueBytes() {
            return gva.m45888f(this.valueCase_ == 6 ? (String) this.value_ : "");
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasApplyEvenIfCronetTelemetryDisabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasBoolValue() {
            return this.valueCase_ == 3;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasBytesValue() {
            return this.valueCase_ == 7;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasFloatValue() {
            return this.valueCase_ == 5;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasMinVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasStringValue() {
            return this.valueCase_ == 6;
        }

        public static Builder newBuilder(ConstrainedValue constrainedValue) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(constrainedValue);
        }

        public static ConstrainedValue parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (ConstrainedValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static ConstrainedValue parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static ConstrainedValue parseFrom(gva gvaVar) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static ConstrainedValue parseFrom(gva gvaVar, aux auxVar) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static ConstrainedValue parseFrom(byte[] bArr) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConstrainedValue parseFrom(byte[] bArr, aux auxVar) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static ConstrainedValue parseFrom(InputStream inputStream) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConstrainedValue parseFrom(InputStream inputStream, aux auxVar) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static ConstrainedValue parseFrom(owe oweVar) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static ConstrainedValue parseFrom(owe oweVar, aux auxVar) {
            return (ConstrainedValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface ConstrainedValueOrBuilder extends sre0 {
        String getAppId();

        gva getAppIdBytes();

        boolean getApplyEvenIfCronetTelemetryDisabled();

        boolean getBoolValue();

        gva getBytesValue();

        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        float getFloatValue();

        long getIntValue();

        String getMinVersion();

        gva getMinVersionBytes();

        String getStringValue();

        gva getStringValueBytes();

        ConstrainedValue.ValueCase getValueCase();

        boolean hasAppId();

        boolean hasApplyEvenIfCronetTelemetryDisabled();

        boolean hasBoolValue();

        boolean hasBytesValue();

        boolean hasFloatValue();

        boolean hasIntValue();

        boolean hasMinVersion();

        boolean hasStringValue();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    static {
        FlagValue flagValue = new FlagValue();
        DEFAULT_INSTANCE = flagValue;
        AbstractC0269h.registerDefaultInstance(FlagValue.class, flagValue);
    }

    private FlagValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConstrainedValues(Iterable<? extends ConstrainedValue> iterable) {
        ensureConstrainedValuesIsMutable();
        AbstractC2118m8.addAll(iterable, this.constrainedValues_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConstrainedValues(ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.add(constrainedValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConstrainedValues() {
        this.constrainedValues_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureConstrainedValuesIsMutable() {
        ae50 ae50Var = this.constrainedValues_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.constrainedValues_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static FlagValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FlagValue parseDelimitedFrom(InputStream inputStream) {
        return (FlagValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlagValue parseFrom(ByteBuffer byteBuffer) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConstrainedValues(int i) {
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConstrainedValues(int i, ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.set(i, constrainedValue);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        switch (z110Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", ConstrainedValue.class});
            case 3:
                return new FlagValue();
            case 4:
                return new Builder(0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                r2n0 r2n0Var = PARSER;
                if (r2n0Var != null) {
                    return r2n0Var;
                }
                synchronized (FlagValue.class) {
                    try {
                        r110Var = PARSER;
                        if (r110Var == null) {
                            r110Var = new r110(DEFAULT_INSTANCE);
                            PARSER = r110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return r110Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public ConstrainedValue getConstrainedValues(int i) {
        return (ConstrainedValue) this.constrainedValues_.get(i);
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public int getConstrainedValuesCount() {
        return this.constrainedValues_.size();
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public List<ConstrainedValue> getConstrainedValuesList() {
        return this.constrainedValues_;
    }

    public ConstrainedValueOrBuilder getConstrainedValuesOrBuilder(int i) {
        return (ConstrainedValueOrBuilder) this.constrainedValues_.get(i);
    }

    public List<? extends ConstrainedValueOrBuilder> getConstrainedValuesOrBuilderList() {
        return this.constrainedValues_;
    }

    public static Builder newBuilder(FlagValue flagValue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(flagValue);
    }

    public static FlagValue parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (FlagValue) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static FlagValue parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static FlagValue parseFrom(gva gvaVar) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConstrainedValues(int i, ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.add(i, constrainedValue);
    }

    public static FlagValue parseFrom(gva gvaVar, aux auxVar) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static FlagValue parseFrom(byte[] bArr) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FlagValue parseFrom(byte[] bArr, aux auxVar) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static FlagValue parseFrom(InputStream inputStream) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlagValue parseFrom(InputStream inputStream, aux auxVar) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static FlagValue parseFrom(owe oweVar) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static FlagValue parseFrom(owe oweVar, aux auxVar) {
        return (FlagValue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
