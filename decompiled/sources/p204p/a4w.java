package p204p;

import android.os.Parcelable;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class a4w implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final h6a0 f12321a;

    /* JADX INFO: renamed from: b */
    public final nr91 f12322b;

    /* JADX INFO: renamed from: c */
    public final ot7 f12323c;

    /* JADX INFO: renamed from: d */
    public final pfm0 f12324d;

    public a4w(i4w i4wVar, h6a0 h6a0Var, nr91 nr91Var, ot7 ot7Var) {
        this.f12321a = h6a0Var;
        this.f12322b = nr91Var;
        this.f12323c = ot7Var;
        pw71 pw71Var = new pw71(new p1x0(R.string.auto_download_episodes_limits_page_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90689R0 = xgg1.m90689R0();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f12324d = new pfm0(new qfm0[]{pw71Var, new q040(cbm0VarM90689R0, mug1.m62869n(i4wVar.getUri()), null), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f12324d;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return h6a0.m46706b(this.f12321a, v3h1.m84575H(this.f12323c.m67771c().firstOrError()), new f6v(this, 15));
    }
}
