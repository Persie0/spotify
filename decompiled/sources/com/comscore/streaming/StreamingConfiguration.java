package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class StreamingConfiguration extends CppJavaBinder {

    /* JADX INFO: renamed from: b */
    private long f1599b;

    /* JADX INFO: renamed from: c */
    private WeakHashMap<String, StreamingPublisherConfiguration> f1600c;

    /* JADX INFO: renamed from: d */
    private final Object f1601d;

    public /* synthetic */ StreamingConfiguration(int i, long j) {
        this(j);
    }

    private native void addLabelsNative(long j, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void autoResumeStateOnAssetChangeNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long buildNative(long j);

    private native long copyNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void customStartMinimumPlaybackNative(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j);

    private native void destroyCppInstanceNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void heartbeatIntervalsNative(long j, List<Map<String, Long>> list);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void heartbeatMeasurementNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void includedPublishersNative(long j, List<String> list);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void keepAliveIntervalNative(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void keepAliveMeasurementNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void labelsNative(long j, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void pauseOnBufferingIntervalNative(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void pauseOnBufferingNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void playbackIntervalMergeToleranceNative(long j, long j2);

    private native void removeAllLabelsNative(long j);

    private native void removeLabelNative(long j, String str);

    private native void setLabelNative(long j, String str, String str2);

    public void addLabels(Map<String, String> map) {
        try {
            addLabelsNative(this.f1599b, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.f1599b);
            this.f1599b = 0L;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public StreamingPublisherConfiguration getStreamingPublisherConfiguration(String str) {
        synchronized (this.f1601d) {
            try {
                StreamingPublisherConfiguration streamingPublisherConfiguration = this.f1600c.get(str);
                if (streamingPublisherConfiguration != null) {
                    return streamingPublisherConfiguration;
                }
                StreamingPublisherConfiguration streamingPublisherConfiguration2 = new StreamingPublisherConfiguration(this, str);
                this.f1600c.put(str, streamingPublisherConfiguration2);
                return streamingPublisherConfiguration2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeAllLabels() {
        try {
            removeAllLabelsNative(this.f1599b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeLabel(String str) {
        try {
            removeLabelNative(this.f1599b, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabel(String str, String str2) {
        try {
            setLabelNative(this.f1599b, str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public static class Builder extends CppJavaBinder {

        /* JADX INFO: renamed from: b */
        long f1602b;

        public Builder() {
            this.f1602b = 0L;
            try {
                this.f1602b = StreamingConfiguration.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder autoResumeStateOnAssetChange(boolean z) {
            try {
                StreamingConfiguration.autoResumeStateOnAssetChangeNative(this.f1602b, z);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public StreamingConfiguration build() {
            int i = 0;
            try {
                return new StreamingConfiguration(i, StreamingConfiguration.buildNative(this.f1602b));
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return new StreamingConfiguration(i, 0L);
            }
        }

        public Builder customStartMinimumPlayback(long j) {
            try {
                StreamingConfiguration.customStartMinimumPlaybackNative(this.f1602b, j);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        @Override // com.comscore.util.cpp.CppJavaBinder
        public void destroyCppObject() {
            try {
                StreamingConfiguration.destroyCppInstanceBuilderNative(this.f1602b);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder heartbeatIntervals(List<Map<String, Long>> list) {
            if (list == null) {
                return this;
            }
            Iterator<Map<String, Long>> it = list.iterator();
            while (it.hasNext()) {
                for (Map.Entry<String, Long> entry : it.next().entrySet()) {
                    if (!(entry.getKey() instanceof String) || !(entry.getValue() instanceof Long)) {
                        throw new IllegalArgumentException("intervals must be an object of type ArrayList<HashMap<String, Long>>");
                    }
                }
            }
            try {
                StreamingConfiguration.heartbeatIntervalsNative(this.f1602b, list);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder heartbeatMeasurement(boolean z) {
            try {
                StreamingConfiguration.heartbeatMeasurementNative(this.f1602b, z);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder includedPublishers(List<String> list) {
            try {
                StreamingConfiguration.includedPublishersNative(this.f1602b, list);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder keepAliveInterval(long j) {
            try {
                StreamingConfiguration.keepAliveIntervalNative(this.f1602b, j);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder keepAliveMeasurement(boolean z) {
            try {
                StreamingConfiguration.keepAliveMeasurementNative(this.f1602b, z);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder labels(Map<String, String> map) {
            try {
                StreamingConfiguration.labelsNative(this.f1602b, map);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder pauseOnBuffering(boolean z) {
            try {
                StreamingConfiguration.pauseOnBufferingNative(this.f1602b, z);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder pauseOnBufferingInterval(long j) {
            try {
                StreamingConfiguration.pauseOnBufferingIntervalNative(this.f1602b, j);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder playbackIntervalMergeTolerance(long j) {
            try {
                StreamingConfiguration.playbackIntervalMergeToleranceNative(this.f1602b, j);
                return this;
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return this;
            }
        }

        public Builder includedPublishers(String... strArr) {
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr);
            includedPublishers(arrayList);
            return this;
        }
    }

    private StreamingConfiguration(long j) {
        this.f1601d = new Object();
        this.f1599b = j;
        this.f1600c = new WeakHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public long m1395a() {
        return this.f1599b;
    }

    @Deprecated
    public StreamingConfiguration(StreamingConfiguration streamingConfiguration) {
        this.f1599b = 0L;
        this.f1601d = new Object();
        try {
            this.f1599b = copyNative(streamingConfiguration.f1599b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
