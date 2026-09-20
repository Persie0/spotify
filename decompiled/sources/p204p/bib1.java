package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes7.dex */
public final class bib1 implements iib1 {

    /* JADX INFO: renamed from: a */
    public final boolean f27382a;

    /* JADX INFO: renamed from: b */
    public final VideoSurfaceView f27383b;

    public bib1(VideoSurfaceView videoSurfaceView, boolean z) {
        this.f27382a = z;
        this.f27383b = videoSurfaceView;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29306a() {
        return this.f27382a;
    }

    /* JADX INFO: renamed from: b */
    public final VideoSurfaceView m29307b() {
        return this.f27383b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bib1)) {
            return false;
        }
        bib1 bib1Var = (bib1) obj;
        return this.f27382a == bib1Var.f27382a && wj50.m88271j(this.f27383b, bib1Var.f27383b);
    }

    public final int hashCode() {
        return this.f27383b.hashCode() + (Boolean.hashCode(this.f27382a) * 31);
    }
}
