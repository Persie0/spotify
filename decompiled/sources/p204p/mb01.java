package p204p;

import android.os.Parcelable;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class mb01 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final g6a0 f141758a;

    /* JADX INFO: renamed from: b */
    public final nr91 f141759b;

    /* JADX INFO: renamed from: c */
    public final bc01 f141760c;

    /* JADX INFO: renamed from: d */
    public final pfm0 f141761d;

    public mb01(ic01 ic01Var, g6a0 g6a0Var, nr91 nr91Var, bc01 bc01Var) {
        this.f141758a = g6a0Var;
        this.f141759b = nr91Var;
        this.f141760c = bc01Var;
        pw71 pw71Var = new pw71(new p1x0(R.string.auto_download_settings_page_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90682Q0 = xgg1.m90682Q0();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f141761d = new pfm0(new qfm0[]{pw71Var, new q040(cbm0VarM90682Q0, mug1.m62869n(ic01Var.getUri()), null), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f141761d;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return g6a0.m43685a(this.f141758a, this.f141760c, new nnz0(this, 17));
    }
}
