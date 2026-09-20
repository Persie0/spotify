package com.comscore;

/* JADX INFO: loaded from: classes3.dex */
public class PartnerConfiguration extends ClientConfiguration {

    public static class Builder extends ClientConfiguration.Builder<Builder, PartnerConfiguration> {
        protected String externalClientId;

        public Builder() {
        }

        @Override // com.comscore.ClientConfiguration.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Builder mo1198a() {
            return new Builder(this);
        }

        public Builder externalClientId(String str) {
            this.externalClientId = str;
            return this;
        }

        public Builder partnerId(String str) {
            setClientId(str);
            return this;
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public Builder self() {
            return this;
        }

        private Builder(Builder builder) {
            super(builder);
            this.externalClientId = builder.externalClientId;
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public PartnerConfiguration build() {
            return new PartnerConfiguration(this, 0);
        }
    }

    public /* synthetic */ PartnerConfiguration(Builder builder, int i) {
        this(builder);
    }

    private static native void destroyCppInstanceNative(long j);

    private static native String getExternalClientIdNative(long j);

    private static native String getPartnerIdNative(long j);

    private static native long newCppInstanceNative(Builder builder);

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(this.f1522b);
    }

    public String getExternalClientId() {
        try {
            return getExternalClientIdNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getPartnerId() {
        try {
            return getPartnerIdNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public PartnerConfiguration(long j) {
        this.f1522b = j;
    }

    private PartnerConfiguration(Builder builder) {
        super(builder);
        try {
            this.f1522b = newCppInstanceNative(builder);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
