package com.comscore.streaming;

import com.comscore.util.ArrayUtils;
import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class StackedContentMetadata extends CppJavaBinder {

    /* JADX INFO: renamed from: b */
    private long f1593b;

    public static class Builder extends CppJavaBinder {

        /* JADX INFO: renamed from: b */
        long f1594b;

        public Builder() {
            try {
                this.f1594b = StackedContentMetadata.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public StackedContentMetadata build() {
            try {
                return new StackedContentMetadata(StackedContentMetadata.buildNative(this.f1594b));
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return new StackedContentMetadata(0L);
            }
        }

        public Builder customLabels(Map<String, String> map) {
            try {
                StackedContentMetadata.customLabelsNative(this.f1594b, map);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder dateOfDigitalAiring(int i, int i2, int i3) {
            try {
                StackedContentMetadata.dateOfDigitalAiringNative(this.f1594b, i, i2, i3);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder dateOfProduction(int i, int i2, int i3) {
            try {
                StackedContentMetadata.dateOfProductionNative(this.f1594b, i, i2, i3);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder dateOfTvAiring(int i, int i2, int i3) {
            try {
                StackedContentMetadata.dateOfTvAiringNative(this.f1594b, i, i2, i3);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder deliveryAdvertisementCapability(int i) {
            if (!ArrayUtils.contains(ContentDeliveryAdvertisementCapability.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                StackedContentMetadata.deliveryAdvertisementCapabilityNative(this.f1594b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder deliveryComposition(int i) {
            if (!ArrayUtils.contains(ContentDeliveryComposition.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                StackedContentMetadata.deliveryCompositionNative(this.f1594b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder deliveryMode(int i) {
            if (!ArrayUtils.contains(ContentDeliveryMode.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                StackedContentMetadata.deliveryModeNative(this.f1594b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder deliverySubscriptionType(int i) {
            if (!ArrayUtils.contains(ContentDeliverySubscriptionType.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                StackedContentMetadata.deliverySubscriptionTypeNative(this.f1594b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        @Override // com.comscore.util.cpp.CppJavaBinder
        public void destroyCppObject() {
            try {
                StackedContentMetadata.destroyCppInstanceBuilderNative(this.f1594b);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder dictionaryClassificationC3(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.dictionaryClassificationC3Native(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder dictionaryClassificationC4(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.dictionaryClassificationC4Native(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder dictionaryClassificationC6(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.dictionaryClassificationC6Native(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder distributionModel(int i) {
            if (!ArrayUtils.contains(ContentDistributionModel.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                StackedContentMetadata.distributionModelNative(this.f1594b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder episodeId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.episodeIdNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder episodeNumber(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.episodeNumberNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder episodeSeasonNumber(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.episodeSeasonNumberNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder episodeTitle(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.episodeTitleNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder fee(int i) {
            try {
                StackedContentMetadata.feeNative(this.f1594b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder genreId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.genreIdNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder genreName(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.genreNameNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder mediaFormat(int i) {
            if (!ArrayUtils.contains(ContentMediaFormat.ALLOWED_VALUES, i)) {
                return this;
            }
            try {
                StackedContentMetadata.mediaFormatNative(this.f1594b, i);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder networkAffiliate(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.networkAffiliateNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder playlistTitle(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.playlistTitleNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder programId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.programIdNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder programTitle(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.programTitleNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder publisherName(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.publisherNameNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder stationCode(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.stationCodeNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder stationTitle(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedContentMetadata.stationTitleNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder timeOfDigitalAiring(int i, int i2) {
            try {
                StackedContentMetadata.timeOfDigitalAiringNative(this.f1594b, i, i2);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder timeOfProduction(int i, int i2) {
            try {
                StackedContentMetadata.timeOfProductionNative(this.f1594b, i, i2);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder timeOfTvAiring(int i, int i2) {
            try {
                StackedContentMetadata.timeOfTvAiringNative(this.f1594b, i, i2);
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
                StackedContentMetadata.uniqueIdNative(this.f1594b, str);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }
    }

    public StackedContentMetadata(long j) {
        this.f1593b = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long buildNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void customLabelsNative(long j, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void dateOfDigitalAiringNative(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void dateOfProductionNative(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void dateOfTvAiringNative(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void deliveryAdvertisementCapabilityNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void deliveryCompositionNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void deliveryModeNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void deliverySubscriptionTypeNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j);

    private native void destroyCppInstanceNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void dictionaryClassificationC3Native(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void dictionaryClassificationC4Native(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void dictionaryClassificationC6Native(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void distributionModelNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void episodeIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void episodeNumberNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void episodeSeasonNumberNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void episodeTitleNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void feeNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void genreIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void genreNameNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void mediaFormatNative(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void networkAffiliateNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void playlistTitleNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void programIdNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void programTitleNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void publisherNameNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void stationCodeNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void stationTitleNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void timeOfDigitalAiringNative(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void timeOfProductionNative(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void timeOfTvAiringNative(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void uniqueIdNative(long j, String str);

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(this.f1593b);
    }

    /* JADX INFO: renamed from: a */
    public long m1379a() {
        return this.f1593b;
    }
}
