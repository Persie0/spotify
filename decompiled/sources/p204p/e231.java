package p204p;

import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class e231 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f55324a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f55325b;

    /* JADX INFO: renamed from: c */
    public final pfm0 f55326c;

    public e231(doh dohVar, z9j0 z9j0Var) {
        this.f55324a = dohVar;
        this.f55325b = z9j0Var;
        pw71 pw71Var = new pw71(new p1x0(R.string.play_mode_item_smart_shuffle_intro_dialog_title_rollout));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f55326c = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90899v5(), xoc1.f263859C4, null)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f55326c;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f55324a.m36532a(rkk.m75763o(new g511(this, 27), true, -1952882474));
    }
}
