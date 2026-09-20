package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import com.comscore.util.setup.Setup;

/* JADX INFO: loaded from: classes3.dex */
public class StreamingAnalytics extends CppJavaBinder {

    /* JADX INFO: renamed from: b */
    private final Object f1595b;

    /* JADX INFO: renamed from: c */
    private long f1596c;

    /* JADX INFO: renamed from: d */
    private StreamingConfiguration f1597d;

    /* JADX INFO: renamed from: e */
    private StreamingExtendedAnalytics f1598e;

    public StreamingAnalytics() {
        this(null);
    }

    private native void addListenerNative(long j, StreamingListener streamingListener);

    private native void createPlaybackSessionNative(long j);

    private native void destroyCppInstanceNative(long j);

    private native String getPlaybackSessionIdNative(long j);

    private native void loopPlaybackSessionNative(long j);

    private native long newCppInstanceNative(long j);

    private native void notifyBufferStartNative(long j);

    private native void notifyBufferStopNative(long j);

    private native void notifyChangePlaybackRateNative(long j, float f);

    private native void notifyEndNative(long j);

    private native void notifyPauseNative(long j);

    private native void notifyPlayNative(long j);

    private native void notifySeekStartNative(long j);

    private native void removeListenerNative(long j, StreamingListener streamingListener);

    private native void setDvrWindowLengthNative(long j, long j2);

    private native void setImplementationIdNative(long j, String str);

    private native void setMediaPlayerNameNative(long j, String str);

    private native void setMediaPlayerVersionNative(long j, String str);

    private native void setMetadataNative(long j, long j2);

    private native void setProjectIdNative(long j, String str);

    private native void startFromDvrWindowOffsetNative(long j, long j2);

    private native void startFromPositionNative(long j, long j2);

    private native void startFromSegmentNative(long j, int i);

    /* JADX INFO: renamed from: a */
    public long m1380a() {
        return this.f1596c;
    }

    public void addListener(StreamingListener streamingListener) {
        try {
            addListenerNative(this.f1596c, streamingListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void createPlaybackSession() {
        try {
            createPlaybackSessionNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.f1596c);
            this.f1596c = 0L;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof StreamingAnalytics) && ((StreamingAnalytics) obj).f1596c == this.f1596c;
    }

    public StreamingConfiguration getConfiguration() {
        return this.f1597d;
    }

    public StreamingExtendedAnalytics getExtendedAnalytics() {
        if (this.f1598e == null) {
            synchronized (this.f1595b) {
                try {
                    if (this.f1598e == null) {
                        this.f1598e = new StreamingExtendedAnalytics(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1598e;
    }

    public String getPlaybackSessionId() {
        try {
            return getPlaybackSessionIdNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public void loopPlaybackSession() {
        try {
            loopPlaybackSessionNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyBufferStart() {
        try {
            notifyBufferStartNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyBufferStop() {
        try {
            notifyBufferStopNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangePlaybackRate(float f) {
        try {
            notifyChangePlaybackRateNative(this.f1596c, f);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyEnd() {
        try {
            notifyEndNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyPause() {
        try {
            notifyPauseNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyPlay() {
        try {
            notifyPlayNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifySeekStart() {
        try {
            notifySeekStartNative(this.f1596c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeListener(StreamingListener streamingListener) {
        try {
            removeListenerNative(this.f1596c, streamingListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setDvrWindowLength(long j) {
        try {
            setDvrWindowLengthNative(this.f1596c, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setImplementationId(String str) {
        try {
            setImplementationIdNative(this.f1596c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setMediaPlayerName(String str) {
        try {
            setMediaPlayerNameNative(this.f1596c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setMediaPlayerVersion(String str) {
        try {
            setMediaPlayerVersionNative(this.f1596c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setMetadata(AssetMetadata assetMetadata) {
        if (assetMetadata == null) {
            return;
        }
        try {
            setMetadataNative(this.f1596c, assetMetadata.m1289a());
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setProjectId(String str) {
        try {
            setProjectIdNative(this.f1596c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void startFromDvrWindowOffset(long j) {
        try {
            startFromDvrWindowOffsetNative(this.f1596c, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void startFromPosition(long j) {
        try {
            startFromPositionNative(this.f1596c, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void startFromSegment(int i) {
        try {
            startFromSegmentNative(this.f1596c, i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public StreamingAnalytics(StreamingConfiguration streamingConfiguration) {
        this.f1595b = new Object();
        this.f1596c = 0L;
        Setup.setUp();
        streamingConfiguration = streamingConfiguration == null ? new StreamingConfiguration.Builder().build() : streamingConfiguration;
        this.f1597d = streamingConfiguration;
        try {
            this.f1596c = newCppInstanceNative(streamingConfiguration.m1395a());
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
