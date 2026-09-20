package com.comscore.streaming;

import com.comscore.util.ArrayUtils;
import com.comscore.util.cpp.CppJavaBinder;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class StreamingExtendedAnalytics extends CppJavaBinder {

    /* JADX INFO: renamed from: b */
    private WeakReference<StreamingAnalytics> f1603b;

    public StreamingExtendedAnalytics(StreamingAnalytics streamingAnalytics) {
        this.f1603b = new WeakReference<>(streamingAnalytics);
    }

    /* JADX INFO: renamed from: a */
    private StreamingAnalytics m1396a() {
        StreamingAnalytics streamingAnalytics = this.f1603b.get();
        if (streamingAnalytics != null) {
            return streamingAnalytics;
        }
        throw new IllegalStateException("Class " + StreamingExtendedAnalytics.class.getName() + " was created by " + StreamingAnalytics.class.getName() + " but the creator instance is not allocated in memory.");
    }

    private native void notifyCallToActionNative(long j, Map<String, String> map);

    private native void notifyChangeAudioTrackNative(long j, String str, Map<String, String> map);

    private native void notifyChangeBitrateNative(long j, int i, Map<String, String> map);

    private native void notifyChangeCdnNative(long j, String str, Map<String, String> map);

    private native void notifyChangeSubtitleTrackNative(long j, String str, Map<String, String> map);

    private native void notifyChangeVideoTrackNative(long j, String str, Map<String, String> map);

    private native void notifyChangeVolumeNative(long j, float f, Map<String, String> map);

    private native void notifyChangeWindowStateNative(long j, int i, Map<String, String> map);

    private native void notifyCustomEventNative(long j, String str, Map<String, String> map);

    private native void notifyDrmApproveNative(long j, Map<String, String> map);

    private native void notifyDrmDenyNative(long j, Map<String, String> map);

    private native void notifyDrmFailNative(long j, Map<String, String> map);

    private native void notifyEngageNative(long j, Map<String, String> map);

    private native void notifyErrorNative(long j, String str, Map<String, String> map);

    private native void notifyLoadNative(long j, Map<String, String> map);

    private native void notifySkipAdNative(long j, Map<String, String> map);

    private native void notifyTransferPlaybackNative(long j, String str, Map<String, String> map);

    private native void setLoadTimeOffsetNative(long j, long j2);

    private native void setPlaybackSessionExpectedLengthNative(long j, long j2);

    private native void setPlaybackSessionExpectedNumberOfItemsNative(long j, int i);

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
    }

    public void notifyCallToAction(Map<String, String> map) {
        try {
            notifyCallToActionNative(m1396a().m1380a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeAudioTrack(String str) {
        notifyChangeAudioTrack(str, null);
    }

    public void notifyChangeBitrate(int i) {
        notifyChangeBitrate(i, null);
    }

    public void notifyChangeCdn(String str) {
        notifyChangeCdn(str, null);
    }

    public void notifyChangeSubtitleTrack(String str) {
        notifyChangeSubtitleTrack(str, null);
    }

    public void notifyChangeVideoTrack(String str) {
        notifyChangeVideoTrack(str, null);
    }

    public void notifyChangeVolume(float f) {
        notifyChangeVolume(f, null);
    }

    public void notifyChangeWindowState(int i, Map<String, String> map) {
        if (ArrayUtils.contains(WindowState.ALLOWED_VALUES, i)) {
            try {
                notifyChangeWindowStateNative(m1396a().m1380a(), i, map);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void notifyCustomEvent(String str) {
        notifyCustomEvent(str, null);
    }

    public void notifyDrmApprove(Map<String, String> map) {
        try {
            notifyDrmApproveNative(m1396a().m1380a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyDrmDeny() {
        notifyDrmDeny(null);
    }

    public void notifyDrmFail(Map<String, String> map) {
        try {
            notifyDrmFailNative(m1396a().m1380a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyEngage(Map<String, String> map) {
        try {
            notifyEngageNative(m1396a().m1380a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyError(String str, Map<String, String> map) {
        try {
            notifyErrorNative(m1396a().m1380a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyLoad() {
        notifyLoad(null);
    }

    public void notifySkipAd(Map<String, String> map) {
        try {
            notifySkipAdNative(m1396a().m1380a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyTransferPlayback(String str) {
        notifyTransferPlayback(str, null);
    }

    public void setLoadTimeOffset(long j) {
        try {
            setLoadTimeOffsetNative(m1396a().m1380a(), j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPlaybackSessionExpectedLength(long j) {
        try {
            setPlaybackSessionExpectedLengthNative(m1396a().m1380a(), j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPlaybackSessionExpectedNumberOfItems(int i) {
        try {
            setPlaybackSessionExpectedNumberOfItemsNative(m1396a().m1380a(), i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeAudioTrack(String str, Map<String, String> map) {
        try {
            notifyChangeAudioTrackNative(m1396a().m1380a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeBitrate(int i, Map<String, String> map) {
        try {
            notifyChangeBitrateNative(m1396a().m1380a(), i, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeCdn(String str, Map<String, String> map) {
        try {
            notifyChangeCdnNative(m1396a().m1380a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeSubtitleTrack(String str, Map<String, String> map) {
        try {
            notifyChangeSubtitleTrackNative(m1396a().m1380a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeVideoTrack(String str, Map<String, String> map) {
        try {
            notifyChangeVideoTrackNative(m1396a().m1380a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeVolume(float f, Map<String, String> map) {
        try {
            notifyChangeVolumeNative(m1396a().m1380a(), f, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyCustomEvent(String str, Map<String, String> map) {
        try {
            notifyCustomEventNative(m1396a().m1380a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyDrmDeny(Map<String, String> map) {
        try {
            notifyDrmDenyNative(m1396a().m1380a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyLoad(Map<String, String> map) {
        try {
            notifyLoadNative(m1396a().m1380a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyTransferPlayback(String str, Map<String, String> map) {
        try {
            notifyTransferPlaybackNative(m1396a().m1380a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyCallToAction() {
        notifyCallToAction(null);
    }

    public void notifyDrmApprove() {
        notifyDrmApprove(null);
    }

    public void notifyDrmFail() {
        notifyDrmFail(null);
    }

    public void notifyEngage() {
        notifyEngage(null);
    }

    public void notifyError(String str) {
        notifyError(str, null);
    }

    public void notifySkipAd() {
        notifySkipAd(null);
    }

    public void notifyChangeWindowState(int i) {
        notifyChangeWindowState(i, null);
    }
}
