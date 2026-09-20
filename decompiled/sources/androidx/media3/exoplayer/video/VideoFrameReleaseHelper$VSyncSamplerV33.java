package androidx.media3.exoplayer.video;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import p204p.h0b1;

/* JADX INFO: loaded from: classes3.dex */
final class VideoFrameReleaseHelper$VSyncSamplerV33 extends VideoFrameReleaseHelper$VSyncSampler implements Choreographer$VsyncCallback {
    private final Handler handler;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVsync$0() {
        this.choreographer.postVsyncCallback(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        if (i == 0) {
            this.handler.removeCallbacksAndMessages(null);
            this.choreographer.removeVsyncCallback(this);
            this.choreographer.postVsyncCallback(this);
        }
    }

    public void onVsync(Choreographer.FrameData frameData) {
        this.sampledVsyncTimeNs = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.vsyncDurationNs = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.vsyncDurationNs = -9223372036854775807L;
        }
        this.handler.removeCallbacksAndMessages(null);
        this.handler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.video.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f1092a.lambda$onVsync$0();
            }
        }, 500L);
        VideoFrameReleaseHelper$VSyncSamplerListener videoFrameReleaseHelper$VSyncSamplerListener = this.listener;
        if (videoFrameReleaseHelper$VSyncSamplerListener != null) {
            videoFrameReleaseHelper$VSyncSamplerListener.onVsyncSampled(this);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper$VSyncSampler
    public void register() {
        super.register();
        this.choreographer.removeVsyncCallback(this);
        this.choreographer.postVsyncCallback(this);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper$VSyncSampler
    public void unregister() {
        super.unregister();
        this.handler.removeCallbacksAndMessages(null);
        this.choreographer.removeVsyncCallback(this);
        this.sampledVsyncTimeNs = -9223372036854775807L;
        this.vsyncDurationNs = -9223372036854775807L;
    }

    private VideoFrameReleaseHelper$VSyncSamplerV33(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.handler = h0b1.m46330r(null);
    }
}
