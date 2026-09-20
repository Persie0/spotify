package p204p;

import android.os.Parcelable;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class g4u0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final zc21 f76531a;

    /* JADX INFO: renamed from: b */
    public final n4u0 f76532b;

    /* JADX INFO: renamed from: c */
    public final hb5 f76533c;

    /* JADX INFO: renamed from: d */
    public final pfm0 f76534d;

    public g4u0(zc21 zc21Var, n4u0 n4u0Var, hb5 hb5Var) {
        this.f76531a = zc21Var;
        this.f76532b = n4u0Var;
        this.f76533c = hb5Var;
        pw71 pw71Var = new pw71(new p1x0(R.string.radio_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90623H4 = xgg1.m90623H4();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f76534d = new pfm0(new qfm0[]{pw71Var, new q040(cbm0VarM90623H4, mug1.m62869n("spotify:internal:radio"), null), new h380(k0e1.f118022b0), new cs61("radio")}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f76534d;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f76531a.m95896a(new ono0(this, 5), new wc21(new f4u0(this), p3u0.f173745c, nlr0.f155155d, p3u0.f173747d));
    }
}
