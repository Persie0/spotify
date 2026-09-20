package p204p;

import android.os.Parcelable;
import com.spotify.music.R;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class fyh implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final x5a0 f74736a;

    /* JADX INFO: renamed from: b */
    public final hyh f74737b;

    /* JADX INFO: renamed from: c */
    public final lyh f74738c;

    /* JADX INFO: renamed from: d */
    public final ozh f74739d;

    /* JADX INFO: renamed from: e */
    public final qzh f74740e;

    /* JADX INFO: renamed from: f */
    public final hol0 f74741f;

    /* JADX INFO: renamed from: g */
    public final epx f74742g;

    /* JADX INFO: renamed from: h */
    public final luk f74743h;

    /* JADX INFO: renamed from: i */
    public final pfm0 f74744i;

    public fyh(x5a0 x5a0Var, hyh hyhVar, lyh lyhVar, ozh ozhVar, qzh qzhVar, hol0 hol0Var, epx epxVar, luk lukVar) {
        this.f74736a = x5a0Var;
        this.f74737b = hyhVar;
        this.f74738c = lyhVar;
        this.f74739d = ozhVar;
        this.f74740e = qzhVar;
        this.f74741f = hol0Var;
        this.f74742g = epxVar;
        this.f74743h = lukVar;
        pw71 pw71Var = new pw71(new p1x0(R.string.concert_campaign_entity_title));
        h380 h380Var = new h380(k0e1.f118061v);
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90731X0 = xgg1.m90731X0();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        String uri = hyhVar.getUri();
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U(uri).m35694A();
        this.f74744i = new pfm0(new qfm0[]{pw71Var, h380Var, new q040(cbm0VarM90731X0, mug1.m62869n(strM35694A == null ? "" : strM35694A), null), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f74744i;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return x5a0.m89980b(this.f74736a, tky.m81027c(new v4a0[0], new mr0(this, null, 27)), new zxh(this, 0), new u5a0(new ayh(this), new oye(this, 3), mc40.f142034O0, new zxh(this, 1)));
    }
}
