package p204p;

import com.spotify.idj.p082v1.BodySection;
import com.spotify.idj.p082v1.MicPermissionPageResponse;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class gdf0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final jdf0 f78831a;

    /* JADX INFO: renamed from: b */
    public final pkh f78832b;

    /* JADX INFO: renamed from: c */
    public final psc1 f78833c;

    /* JADX INFO: renamed from: d */
    public final z9j0 f78834d;

    /* JADX INFO: renamed from: e */
    public final k5m0 f78835e;

    /* JADX INFO: renamed from: f */
    public final m500 f78836f;

    /* JADX INFO: renamed from: g */
    public final e940 f78837g;

    /* JADX INFO: renamed from: h */
    public final i780 f78838h;

    /* JADX INFO: renamed from: i */
    public final vw90 f78839i;

    /* JADX INFO: renamed from: j */
    public final mdf0 f78840j;

    /* JADX INFO: renamed from: k */
    public final unn0 f78841k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f78842l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    public final pfm0 f78843m;

    public gdf0(jdf0 jdf0Var, pkh pkhVar, psc1 psc1Var, z9j0 z9j0Var, k5m0 k5m0Var, m500 m500Var, e940 e940Var, i780 i780Var, vw90 vw90Var, mdf0 mdf0Var) {
        this.f78831a = jdf0Var;
        this.f78832b = pkhVar;
        this.f78833c = psc1Var;
        this.f78834d = z9j0Var;
        this.f78835e = k5m0Var;
        this.f78836f = m500Var;
        this.f78837g = e940Var;
        this.f78838h = i780Var;
        this.f78839i = vw90Var;
        this.f78840j = mdf0Var;
        this.f78841k = vw90Var.m86543r();
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f78843m = new pfm0(new qfm0[]{new q040(xgg1.m90688R(), xoc1.f264211v4, null), new e6m0(true), new sw91(14, true, false, false), new tkm0(qkm0.f189619a, 0, 2)}, false);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m44422c(MicPermissionPageResponse micPermissionPageResponse) {
        ae50<BodySection> ae50VarM11991n = micPermissionPageResponse.m11991n();
        if (ae50VarM11991n.isEmpty()) {
            return false;
        }
        for (BodySection bodySection : ae50VarM11991n) {
            if (bodySection.hasDescription() && bodySection.m11974n().m11979q().length() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f78843m;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f78832b.m70217a(tky.m81027c(new v4a0[0], new bya0(this, null, 4)), rkk.m75763o(new x7e0(this, 16), true, 1305112405), new hlh(null, null, null, false, 63));
    }
}
