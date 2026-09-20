package p204p;

import com.spotify.adsdisplay.display.videooverlay.videocontrols.VideoControlsOverlayView;

/* JADX INFO: loaded from: classes4.dex */
public final class rsb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202251a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoControlsOverlayView f202252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rsb1(VideoControlsOverlayView videoControlsOverlayView, int i) {
        super(0);
        this.f202251a = i;
        this.f202252b = videoControlsOverlayView;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f202251a) {
            case 0:
                return VideoControlsOverlayView.m2763a(this.f202252b, vc41.PAUSE);
            case 1:
                return VideoControlsOverlayView.m2763a(this.f202252b, vc41.PLAY);
            default:
                return VideoControlsOverlayView.m2763a(this.f202252b, vc41.REPLAY);
        }
    }
}
