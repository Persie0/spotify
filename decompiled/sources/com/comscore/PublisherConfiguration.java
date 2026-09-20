package com.comscore;

/* JADX INFO: loaded from: classes.dex */
public class PublisherConfiguration extends ClientConfiguration {

    /* JADX INFO: renamed from: d */
    private PublisherUniqueDeviceIdListener f1527d;

    public static class Builder extends ClientConfiguration.Builder<Builder, PublisherConfiguration> {

        /* JADX INFO: renamed from: a */
        private PublisherUniqueDeviceIdListener f1528a;

        public Builder() {
        }

        @Override // com.comscore.ClientConfiguration.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Builder mo1198a() {
            return new Builder(this);
        }

        public Builder publisherId(String str) {
            setClientId(str);
            return this;
        }

        public Builder publisherUniqueDeviceIdListener(PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener) {
            this.f1528a = publisherUniqueDeviceIdListener;
            return this;
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public Builder self() {
            return this;
        }

        private Builder(Builder builder) {
            super(builder);
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public PublisherConfiguration build() {
            return new PublisherConfiguration(this, this.f1528a, 0);
        }
    }

    public /* synthetic */ PublisherConfiguration(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener, int i) {
        this(builder, publisherUniqueDeviceIdListener);
    }

    private static native void destroyCppInstanceNative(long j, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener);

    private static native String getPublisherIdNative(long j);

    private static native long newCppInstanceNative(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener);

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(this.f1522b, this.f1527d);
    }

    public String getPublisherId() {
        try {
            return getPublisherIdNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public PublisherConfiguration(long j) {
        this.f1522b = j;
    }

    private PublisherConfiguration(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener) {
        super(builder);
        this.f1527d = publisherUniqueDeviceIdListener;
        try {
            this.f1522b = newCppInstanceNative(builder, publisherUniqueDeviceIdListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
