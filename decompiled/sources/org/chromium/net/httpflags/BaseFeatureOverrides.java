package org.chromium.net.httpflags;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p204p.aux;
import p204p.gva;
import p204p.ihc0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vgc0;
import p204p.vyd1;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class BaseFeatureOverrides extends AbstractC0269h implements BaseFeatureOverridesOrBuilder {
    private static final BaseFeatureOverrides DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 featureStates_ = ihc0.f102235b;

    /* JADX INFO: renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$1 */
    public static /* synthetic */ class C16411 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f10949xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f10949xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10949xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10949xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10949xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10949xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10949xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10949xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements BaseFeatureOverridesOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder clearFeatureStates() {
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().clear();
            return this;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public boolean containsFeatureStates(String str) {
            str.getClass();
            return ((BaseFeatureOverrides) this.instance).getFeatureStatesMap().containsKey(str);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        @Deprecated
        public Map<String, FeatureState> getFeatureStates() {
            return getFeatureStatesMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public int getFeatureStatesCount() {
            return ((BaseFeatureOverrides) this.instance).getFeatureStatesMap().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public Map<String, FeatureState> getFeatureStatesMap() {
            return Collections.unmodifiableMap(((BaseFeatureOverrides) this.instance).getFeatureStatesMap());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public FeatureState getFeatureStatesOrDefault(String str, FeatureState featureState) {
            str.getClass();
            Map<String, FeatureState> featureStatesMap = ((BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            return featureStatesMap.containsKey(str) ? featureStatesMap.get(str) : featureState;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public FeatureState getFeatureStatesOrThrow(String str) {
            str.getClass();
            Map<String, FeatureState> featureStatesMap = ((BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            if (featureStatesMap.containsKey(str)) {
                return featureStatesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFeatureStates(Map<String, FeatureState> map) {
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().putAll(map);
            return this;
        }

        public Builder putFeatureStates(String str, FeatureState featureState) {
            str.getClass();
            featureState.getClass();
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().put(str, featureState);
            return this;
        }

        public Builder removeFeatureStates(String str) {
            str.getClass();
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().remove(str);
            return this;
        }

        private Builder() {
            super(BaseFeatureOverrides.DEFAULT_INSTANCE);
        }
    }

    public static final class FeatureState extends AbstractC0269h implements FeatureStateOrBuilder {
        private static final FeatureState DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private boolean enabled_;
        private ihc0 params_ = ihc0.f102235b;

        public static final class Builder extends AbstractC0268g implements FeatureStateOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((FeatureState) this.instance).clearEnabled();
                return this;
            }

            public Builder clearParams() {
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().clear();
                return this;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean containsParams(String str) {
                str.getClass();
                return ((FeatureState) this.instance).getParamsMap().containsKey(str);
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean getEnabled() {
                return ((FeatureState) this.instance).getEnabled();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            @Deprecated
            public Map<String, gva> getParams() {
                return getParamsMap();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public int getParamsCount() {
                return ((FeatureState) this.instance).getParamsMap().size();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public Map<String, gva> getParamsMap() {
                return Collections.unmodifiableMap(((FeatureState) this.instance).getParamsMap());
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public gva getParamsOrDefault(String str, gva gvaVar) {
                str.getClass();
                Map<String, gva> paramsMap = ((FeatureState) this.instance).getParamsMap();
                return paramsMap.containsKey(str) ? paramsMap.get(str) : gvaVar;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public gva getParamsOrThrow(String str) {
                str.getClass();
                Map<String, gva> paramsMap = ((FeatureState) this.instance).getParamsMap();
                if (paramsMap.containsKey(str)) {
                    return paramsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean hasEnabled() {
                return ((FeatureState) this.instance).hasEnabled();
            }

            public Builder putAllParams(Map<String, gva> map) {
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().putAll(map);
                return this;
            }

            public Builder putParams(String str, gva gvaVar) {
                str.getClass();
                gvaVar.getClass();
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().put(str, gvaVar);
                return this;
            }

            public Builder removeParams(String str) {
                str.getClass();
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().remove(str);
                return this;
            }

            public Builder setEnabled(boolean z) {
                copyOnWrite();
                ((FeatureState) this.instance).setEnabled(z);
                return this;
            }

            private Builder() {
                super(FeatureState.DEFAULT_INSTANCE);
            }
        }

        public static final class ParamsDefaultEntryHolder {
            static final vgc0 defaultEntry = new vgc0(vyd1.f246078g, "", vyd1.f246081t, gva.f84678b);

            private ParamsDefaultEntryHolder() {
            }
        }

        static {
            FeatureState featureState = new FeatureState();
            DEFAULT_INSTANCE = featureState;
            AbstractC0269h.registerDefaultInstance(FeatureState.class, featureState);
        }

        private FeatureState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.bitField0_ &= -2;
            this.enabled_ = false;
        }

        public static FeatureState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, gva> getMutableParamsMap() {
            return internalGetMutableParams();
        }

        private ihc0 internalGetMutableParams() {
            ihc0 ihc0Var = this.params_;
            if (!ihc0Var.f102236a) {
                this.params_ = ihc0Var.m50613h();
            }
            return this.params_;
        }

        private ihc0 internalGetParams() {
            return this.params_;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureState parseDelimitedFrom(InputStream inputStream) {
            return (FeatureState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureState parseFrom(ByteBuffer byteBuffer) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.bitField0_ |= 1;
            this.enabled_ = z;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean containsParams(String str) {
            str.getClass();
            return internalGetParams().containsKey(str);
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", ParamsDefaultEntryHolder.defaultEntry});
                case 3:
                    return new FeatureState();
                case 4:
                    return new Builder(0);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    r2n0 r2n0Var = PARSER;
                    if (r2n0Var != null) {
                        return r2n0Var;
                    }
                    synchronized (FeatureState.class) {
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

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        @Deprecated
        public Map<String, gva> getParams() {
            return getParamsMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public int getParamsCount() {
            return internalGetParams().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public Map<String, gva> getParamsMap() {
            return Collections.unmodifiableMap(internalGetParams());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public gva getParamsOrDefault(String str, gva gvaVar) {
            str.getClass();
            ihc0 ihc0VarInternalGetParams = internalGetParams();
            return ihc0VarInternalGetParams.containsKey(str) ? (gva) ihc0VarInternalGetParams.get(str) : gvaVar;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public gva getParamsOrThrow(String str) {
            str.getClass();
            ihc0 ihc0VarInternalGetParams = internalGetParams();
            if (ihc0VarInternalGetParams.containsKey(str)) {
                return (gva) ihc0VarInternalGetParams.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FeatureState featureState) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(featureState);
        }

        public static FeatureState parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (FeatureState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static FeatureState parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static FeatureState parseFrom(gva gvaVar) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static FeatureState parseFrom(gva gvaVar, aux auxVar) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static FeatureState parseFrom(byte[] bArr) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureState parseFrom(byte[] bArr, aux auxVar) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static FeatureState parseFrom(InputStream inputStream) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureState parseFrom(InputStream inputStream, aux auxVar) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static FeatureState parseFrom(owe oweVar) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static FeatureState parseFrom(owe oweVar, aux auxVar) {
            return (FeatureState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface FeatureStateOrBuilder extends sre0 {
        boolean containsParams(String str);

        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        boolean getEnabled();

        @Deprecated
        Map<String, gva> getParams();

        int getParamsCount();

        Map<String, gva> getParamsMap();

        gva getParamsOrDefault(String str, gva gvaVar);

        gva getParamsOrThrow(String str);

        boolean hasEnabled();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    public static final class FeatureStatesDefaultEntryHolder {
        static final vgc0 defaultEntry = new vgc0(vyd1.f246078g, "", vyd1.f246080i, FeatureState.getDefaultInstance());

        private FeatureStatesDefaultEntryHolder() {
        }
    }

    static {
        BaseFeatureOverrides baseFeatureOverrides = new BaseFeatureOverrides();
        DEFAULT_INSTANCE = baseFeatureOverrides;
        AbstractC0269h.registerDefaultInstance(BaseFeatureOverrides.class, baseFeatureOverrides);
    }

    private BaseFeatureOverrides() {
    }

    public static BaseFeatureOverrides getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, FeatureState> getMutableFeatureStatesMap() {
        return internalGetMutableFeatureStates();
    }

    private ihc0 internalGetFeatureStates() {
        return this.featureStates_;
    }

    private ihc0 internalGetMutableFeatureStates() {
        ihc0 ihc0Var = this.featureStates_;
        if (!ihc0Var.f102236a) {
            this.featureStates_ = ihc0Var.m50613h();
        }
        return this.featureStates_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BaseFeatureOverrides parseDelimitedFrom(InputStream inputStream) {
        return (BaseFeatureOverrides) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BaseFeatureOverrides parseFrom(ByteBuffer byteBuffer) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public boolean containsFeatureStates(String str) {
        str.getClass();
        return internalGetFeatureStates().containsKey(str);
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", FeatureStatesDefaultEntryHolder.defaultEntry});
            case 3:
                return new BaseFeatureOverrides();
            case 4:
                return new Builder(0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                r2n0 r2n0Var = PARSER;
                if (r2n0Var != null) {
                    return r2n0Var;
                }
                synchronized (BaseFeatureOverrides.class) {
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

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    @Deprecated
    public Map<String, FeatureState> getFeatureStates() {
        return getFeatureStatesMap();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public int getFeatureStatesCount() {
        return internalGetFeatureStates().size();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public Map<String, FeatureState> getFeatureStatesMap() {
        return Collections.unmodifiableMap(internalGetFeatureStates());
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public FeatureState getFeatureStatesOrDefault(String str, FeatureState featureState) {
        str.getClass();
        ihc0 ihc0VarInternalGetFeatureStates = internalGetFeatureStates();
        return ihc0VarInternalGetFeatureStates.containsKey(str) ? (FeatureState) ihc0VarInternalGetFeatureStates.get(str) : featureState;
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public FeatureState getFeatureStatesOrThrow(String str) {
        str.getClass();
        ihc0 ihc0VarInternalGetFeatureStates = internalGetFeatureStates();
        if (ihc0VarInternalGetFeatureStates.containsKey(str)) {
            return (FeatureState) ihc0VarInternalGetFeatureStates.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(BaseFeatureOverrides baseFeatureOverrides) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(baseFeatureOverrides);
    }

    public static BaseFeatureOverrides parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (BaseFeatureOverrides) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static BaseFeatureOverrides parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static BaseFeatureOverrides parseFrom(gva gvaVar) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static BaseFeatureOverrides parseFrom(gva gvaVar, aux auxVar) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static BaseFeatureOverrides parseFrom(byte[] bArr) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BaseFeatureOverrides parseFrom(byte[] bArr, aux auxVar) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static BaseFeatureOverrides parseFrom(InputStream inputStream) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BaseFeatureOverrides parseFrom(InputStream inputStream, aux auxVar) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static BaseFeatureOverrides parseFrom(owe oweVar) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static BaseFeatureOverrides parseFrom(owe oweVar, aux auxVar) {
        return (BaseFeatureOverrides) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
