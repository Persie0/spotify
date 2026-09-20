package com.comscore.streaming;

import com.comscore.util.ArrayUtils;
import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AdvertisementMetadata extends AssetMetadata {

    public static class Builder extends CppJavaBinder {

        /* JADX INFO: renamed from: b */
        long f1588b;

        public Builder() {
            try {
                this.f1588b = AdvertisementMetadata.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder breakNumber(int i) {
            try {
                AdvertisementMetadata.breakNumberNative(this.f1588b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public AdvertisementMetadata build() {
            try {
                return new AdvertisementMetadata(AdvertisementMetadata.buildNative(this.f1588b));
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return new AdvertisementMetadata(0L);
            }
        }

        public Builder callToActionUrl(String str) {
            if (str == null) {
                return this;
            }
            try {
                AdvertisementMetadata.callToActionUrlNative(this.f1588b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder classifyAsAudioStream(boolean z) {
            try {
                AdvertisementMetadata.classifyAsAudioStreamNative(this.f1588b, z);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder clipUrl(String str) {
            if (str == null) {
                return this;
            }
            try {
                AdvertisementMetadata.clipUrlNative(this.f1588b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder customLabels(Map<String, String> map) {
            try {
                AdvertisementMetadata.customLabelsNative(this.f1588b, map);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder deliveryType(int i) {
            if (!ArrayUtils.contains(AdvertisementDeliveryType.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                AdvertisementMetadata.deliveryTypeNative(this.f1588b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        @Override // com.comscore.util.cpp.CppJavaBinder
        public void destroyCppObject() {
            try {
                AdvertisementMetadata.destroyCppInstanceBuilderNative(this.f1588b);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder fee(int i) {
            try {
                AdvertisementMetadata.feeNative(this.f1588b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder length(long j) {
            try {
                AdvertisementMetadata.lengthNative(this.f1588b, j);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder mediaType(int i) {
            if (!ArrayUtils.contains(AdvertisementType.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                AdvertisementMetadata.mediaTypeNative(this.f1588b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder numberInBreak(int i) {
            try {
                AdvertisementMetadata.numberInBreakNative(this.f1588b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder owner(int i) {
            if (!ArrayUtils.contains(AdvertisementOwner.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                AdvertisementMetadata.ownerNative(this.f1588b, i);
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
                AdvertisementMetadata.placementIdNative(this.f1588b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder relatedContentMetadata(ContentMetadata contentMetadata) {
            if (contentMetadata == null) {
                return this;
            }
            try {
                AdvertisementMetadata.relatedContentMetadataNative(this.f1588b, contentMetadata.m1289a());
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder server(String str) {
            if (str == null) {
                return this;
            }
            try {
                AdvertisementMetadata.serverNative(this.f1588b, str);
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
                AdvertisementMetadata.serverCampaignIdNative(this.f1588b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder setStack(String str, StackedAdvertisementMetadata stackedAdvertisementMetadata) {
            try {
                AdvertisementMetadata.setStackNative(this.f1588b, str, stackedAdvertisementMetadata.m1344a());
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
                AdvertisementMetadata.siteIdNative(this.f1588b, str);
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
                AdvertisementMetadata.titleNative(this.f1588b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder totalBreaks(int i) {
            try {
                AdvertisementMetadata.totalBreaksNative(this.f1588b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder totalInBreak(int i) {
            try {
                AdvertisementMetadata.totalInBreakNative(this.f1588b, i);
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
                AdvertisementMetadata.uniqueIdNative(this.f1588b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder videoDimensions(int i, int i2) {
            try {
                AdvertisementMetadata.videoDimensionsNative(this.f1588b, i, i2);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }
    }

    public AdvertisementMetadata(long j) {
        super(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void breakNumberNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long buildNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void callToActionUrlNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void classifyAsAudioStreamNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void clipUrlNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void customLabelsNative(long j, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void deliveryTypeNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j);

    private native void destroyCppInstanceNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void feeNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void lengthNative(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void mediaTypeNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void numberInBreakNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void ownerNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void placementIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void relatedContentMetadataNative(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void serverCampaignIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void serverNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void setStackNative(long j, String str, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void siteIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void titleNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void totalBreaksNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void totalInBreakNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void uniqueIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void videoDimensionsNative(long j, int i, int i2);

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(m1289a());
    }
}
