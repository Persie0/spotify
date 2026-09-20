package p204p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sa4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final qa4 f207130a;

    /* JADX INFO: renamed from: b */
    public final ra4 f207131b;

    /* JADX INFO: renamed from: c */
    public final int f207132c;

    /* JADX INFO: renamed from: d */
    public final int f207133d;

    /* JADX INFO: renamed from: e */
    public final int f207134e;

    /* JADX INFO: renamed from: f */
    public final int f207135f;

    /* JADX INFO: renamed from: g */
    public final bji f207136g;

    /* JADX INFO: renamed from: h */
    public final wg61 f207137h = new wg61(new ga4(this, 9));

    public sa4(qa4 qa4Var, ra4 ra4Var, int i, int i2, int i3, int i4, bji bjiVar) {
        this.f207130a = qa4Var;
        this.f207131b = ra4Var;
        this.f207132c = i;
        this.f207133d = i2;
        this.f207134e = i3;
        this.f207135f = i4;
        this.f207136g = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final sa4 m77610a() {
        return (sa4) this.f207137h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final qa4 m77611b() {
        qa4 qa4VarM77611b;
        sa4 sa4VarM77610a = m77610a();
        return (sa4VarM77610a == null || (qa4VarM77611b = sa4VarM77610a.m77611b()) == null) ? this.f207130a : qa4VarM77611b;
    }

    /* JADX INFO: renamed from: c */
    public final ra4 m77612c() {
        ra4 ra4VarM77612c;
        sa4 sa4VarM77610a = m77610a();
        return (sa4VarM77610a == null || (ra4VarM77612c = sa4VarM77610a.m77612c()) == null) ? this.f207131b : ra4VarM77612c;
    }

    /* JADX INFO: renamed from: d */
    public final int m77613d() {
        sa4 sa4VarM77610a = m77610a();
        return sa4VarM77610a != null ? sa4VarM77610a.m77613d() : this.f207132c;
    }

    /* JADX INFO: renamed from: e */
    public final int m77614e() {
        sa4 sa4VarM77610a = m77610a();
        return sa4VarM77610a != null ? sa4VarM77610a.m77614e() : this.f207133d;
    }

    /* JADX INFO: renamed from: f */
    public final int m77615f() {
        sa4 sa4VarM77610a = m77610a();
        return sa4VarM77610a != null ? sa4VarM77610a.m77615f() : this.f207134e;
    }

    /* JADX INFO: renamed from: g */
    public final int m77616g() {
        sa4 sa4VarM77610a = m77610a();
        return sa4VarM77610a != null ? sa4VarM77610a.m77616g() : this.f207135f;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m77611b().f186738a;
        qa4[] qa4VarArrValues = qa4.values();
        ArrayList arrayList = new ArrayList(qa4VarArrValues.length);
        for (qa4 qa4Var : qa4VarArrValues) {
            arrayList.add(qa4Var.f186738a);
        }
        k8a k8aVar = new k8a("video_metered_quality", "android-libs-betamax-video-quality", str, arrayList);
        String str2 = m77612c().f197187a;
        ra4[] ra4VarArrValues = ra4.values();
        ArrayList arrayList2 = new ArrayList(ra4VarArrValues.length);
        for (ra4 ra4Var : ra4VarArrValues) {
            arrayList2.add(ra4Var.f197187a);
        }
        return h6f.m46715L(k8aVar, new k8a("video_non_metered_quality", "android-libs-betamax-video-quality", str2, arrayList2), new k8a("video_quality_high", "android-libs-betamax-video-quality", m77613d(), 100, 10000), new k8a("video_quality_low", "android-libs-betamax-video-quality", m77614e(), 100, 10000), new k8a("video_quality_medium", "android-libs-betamax-video-quality", m77615f(), 100, 10000), new k8a("video_quality_very_high", "android-libs-betamax-video-quality", m77616g(), 100, Alert.DURATION_SHOW_INDEFINITELY));
    }
}
