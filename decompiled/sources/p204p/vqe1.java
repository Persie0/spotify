package p204p;

import android.os.Parcelable;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class vqe1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final g6a0 f243937a;

    /* JADX INFO: renamed from: b */
    public final qnh0 f243938b;

    /* JADX INFO: renamed from: c */
    public final nr91 f243939c;

    /* JADX INFO: renamed from: d */
    public final pfm0 f243940d;

    public vqe1(jre1 jre1Var, g6a0 g6a0Var, qnh0 qnh0Var, nr91 nr91Var) {
        this.f243937a = g6a0Var;
        this.f243938b = qnh0Var;
        this.f243939c = nr91Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90813i6 = xgg1.m90813i6();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f243940d = new pfm0(new qfm0[]{new q040(cbm0VarM90813i6, mug1.m62869n(jre1Var.getUri()), null), new h380(k0e1.f118040k0), new pw71(new p1x0(R.string.your_library_search_title)), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f243940d;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return g6a0.m43685a(this.f243937a, this.f243938b, new edd1(this, 27));
    }
}
