package p204p;

import android.net.Uri;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.music.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class rd51 implements ozo0 {

    /* JADX INFO: renamed from: a */
    public final ra9 f198038a;

    /* JADX INFO: renamed from: b */
    public final l89 f198039b;

    /* JADX INFO: renamed from: c */
    public final hc80 f198040c;

    /* JADX INFO: renamed from: d */
    public final ne2 f198041d = new ne2(this, 19);

    /* JADX INFO: renamed from: e */
    public CircularVideoPreviewView f198042e;

    /* JADX INFO: renamed from: f */
    public pa9 f198043f;

    /* JADX INFO: renamed from: g */
    public String f198044g;

    public rd51(ra9 ra9Var, oe50 oe50Var, l89 l89Var, hc80 hc80Var) {
        this.f198038a = ra9Var;
        this.f198039b = l89Var;
        this.f198040c = hc80Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m75322a() {
        String strM93802o = this.f198044g;
        if (strM93802o == null) {
            return;
        }
        if (!Uri.parse(strM93802o).isAbsolute()) {
            Logger.m3973i("StoryPreviewContentHandler: passed a manifest, prefer URLs", new Object[0]);
            strM93802o = yif1.m93802o(strM93802o);
        }
        l1p0 l1p0Var = new l1p0(strM93802o, 12, null);
        CircularVideoPreviewView circularVideoPreviewView = this.f198042e;
        wj50.m88279p(circularVideoPreviewView);
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) mec1.m61562n(circularVideoPreviewView.getContentView(), R.id.story_preview_video_surface);
        videoSurfaceView.setVideoSurfaceCallback(new b741(this, 5));
        iac1 iac1Var = new iac1();
        iac1Var.m50050b(videoSurfaceView);
        pa9 pa9VarM75103a = ra9.m75103a(this.f198038a, "story-preview-content-handler", l1p0Var, iac1Var, this.f198039b, Collections.singletonList(new px6(this, 6)), false, null, null, 960);
        pa9VarM75103a.m69450p(2);
        pa9VarM75103a.m69451q(true);
        this.f198043f = pa9VarM75103a;
        pa9VarM75103a.m69442g(l1p0Var);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: m */
    public final void mo25538m(long j, long j2) {
        CircularVideoPreviewView circularVideoPreviewView = this.f198042e;
        if (circularVideoPreviewView != null) {
            View view = circularVideoPreviewView.f3765d;
            if (view == null) {
                wj50.m88260d0("contentView");
                throw null;
            }
            if (view.getVisibility() == 0) {
                return;
            }
            View view2 = circularVideoPreviewView.f3765d;
            if (view2 == null) {
                wj50.m88260d0("contentView");
                throw null;
            }
            view2.setAlpha(0.0f);
            View view3 = circularVideoPreviewView.f3765d;
            if (view3 == null) {
                wj50.m88260d0("contentView");
                throw null;
            }
            view3.setVisibility(0);
            View view4 = circularVideoPreviewView.f3765d;
            if (view4 != null) {
                view4.animate().setDuration(300L).alpha(1.0f).withEndAction(new n10(circularVideoPreviewView, 23));
            } else {
                wj50.m88260d0("contentView");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m75323w() {
        pa9 pa9Var = this.f198043f;
        if (pa9Var != null) {
            pa9Var.m69455u();
            this.f198038a.mo72486b(pa9Var);
            pa9Var.m69444i();
            this.f198043f = null;
        }
    }
}
