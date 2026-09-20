package p204p;

import android.os.Parcelable;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class ecw implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final acw f58398a;

    /* JADX INFO: renamed from: b */
    public final x0r0 f58399b;

    /* JADX INFO: renamed from: c */
    public final h6a0 f58400c;

    /* JADX INFO: renamed from: d */
    public final nr91 f58401d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f58402e;

    public ecw(kcw kcwVar, acw acwVar, x0r0 x0r0Var, h6a0 h6a0Var, nr91 nr91Var) {
        this.f58398a = acwVar;
        this.f58399b = x0r0Var;
        this.f58400c = h6a0Var;
        this.f58401d = nr91Var;
        pw71 pw71Var = new pw71(new p1x0(R.string.equalizer_page_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90805h5 = xgg1.m90805h5();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f58402e = new pfm0(new qfm0[]{pw71Var, new q040(cbm0VarM90805h5, mug1.m62869n(kcwVar.getUri()), null)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f58402e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        acw acwVar = this.f58398a;
        return h6a0.m46706b(this.f58400c, v3h1.m84575H(Single.zip(acwVar.m25486b(), acwVar.m25485a(), this.f58399b.m89607a(), lew0.f132751b1)), new f6v(this, 23));
    }
}
