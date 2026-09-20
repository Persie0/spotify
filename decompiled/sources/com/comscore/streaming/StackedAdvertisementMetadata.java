package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class StackedAdvertisementMetadata extends CppJavaBinder {

    /* JADX INFO: renamed from: b */
    private long f1591b;

    public static class Builder extends CppJavaBinder {

        /* JADX INFO: renamed from: b */
        long f1592b;

        public Builder() {
            try {
                this.f1592b = StackedAdvertisementMetadata.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public StackedAdvertisementMetadata build() {
            try {
                return new StackedAdvertisementMetadata(StackedAdvertisementMetadata.buildNative(this.f1592b));
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return new StackedAdvertisementMetadata(0L);
            }
        }

        public Builder customLabels(Map<String, String> map) {
            try {
                StackedAdvertisementMetadata.customLabelsNative(this.f1592b, map);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        @Override // com.comscore.util.cpp.CppJavaBinder
        public void destroyCppObject() {
            try {
                StackedAdvertisementMetadata.destroyCppInstanceBuilderNative(this.f1592b);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder fee(int i) {
            try {
                StackedAdvertisementMetadata.feeNative(this.f1592b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder placementId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.placementIdNative(this.f1592b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder serverCampaignId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.serverCampaignIdNative(this.f1592b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder siteId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.siteIdNative(this.f1592b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder title(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.titleNative(this.f1592b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder uniqueId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.uniqueIdNative(this.f1592b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }
    }

    public StackedAdvertisementMetadata(long j) {
        this.f1591b = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long buildNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void customLabelsNative(long j, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j);

    private native void destroyCppInstanceNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void feeNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void placementIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void serverCampaignIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void siteIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void titleNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void uniqueIdNative(long j, String str);

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(m1344a());
    }

    /* JADX INFO: renamed from: a */
    public long m1344a() {
        return this.f1591b;
    }
}
