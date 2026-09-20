package p204p;

import com.comscore.util.log.LogLevel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f236236a;

    /* JADX INFO: renamed from: b */
    public final boolean f236237b;

    /* JADX INFO: renamed from: c */
    public final s14 f236238c;

    /* JADX INFO: renamed from: d */
    public final int f236239d;

    /* JADX INFO: renamed from: e */
    public final t14 f236240e;

    /* JADX INFO: renamed from: f */
    public final bji f236241f;

    /* JADX INFO: renamed from: g */
    public final wg61 f236242g = new wg61(new u14(this, 0));

    public v14(int i, boolean z, s14 s14Var, int i2, t14 t14Var, bji bjiVar) {
        this.f236236a = i;
        this.f236237b = z;
        this.f236238c = s14Var;
        this.f236239d = i2;
        this.f236240e = t14Var;
        this.f236241f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m84442a() {
        v14 v14Var = (v14) this.f236242g.getValue();
        return v14Var != null ? v14Var.m84442a() : this.f236236a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84443b() {
        v14 v14Var = (v14) this.f236242g.getValue();
        return v14Var != null ? v14Var.m84443b() : this.f236237b;
    }

    /* JADX INFO: renamed from: c */
    public final s14 m84444c() {
        s14 s14VarM84444c;
        v14 v14Var = (v14) this.f236242g.getValue();
        return (v14Var == null || (s14VarM84444c = v14Var.m84444c()) == null) ? this.f236238c : s14VarM84444c;
    }

    /* JADX INFO: renamed from: d */
    public final int m84445d() {
        v14 v14Var = (v14) this.f236242g.getValue();
        return v14Var != null ? v14Var.m84445d() : this.f236239d;
    }

    /* JADX INFO: renamed from: e */
    public final t14 m84446e() {
        t14 t14VarM84446e;
        v14 v14Var = (v14) this.f236242g.getValue();
        return (v14Var == null || (t14VarM84446e = v14Var.m84446e()) == null) ? this.f236240e : t14VarM84446e;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("device_wait_timeout_ms", "android-device-predictability-app-startup-trigger", m84442a(), 0, LogLevel.NONE);
        k8a k8aVar2 = new k8a("enable", "android-device-predictability-app-startup-trigger", m84443b());
        String str = m84444c().f204594a;
        s14[] s14VarArrValues = s14.values();
        ArrayList arrayList = new ArrayList(s14VarArrValues.length);
        for (s14 s14Var : s14VarArrValues) {
            arrayList.add(s14Var.f204594a);
        }
        k8a k8aVar3 = new k8a("minimum_displayable_confidence_score", "android-device-predictability-app-startup-trigger", str, arrayList);
        k8a k8aVar4 = new k8a("smart_control_nudge_auto_dismiss_timeout_ms", "android-device-predictability-app-startup-trigger", m84445d(), 0, 60000);
        String str2 = m84446e().f216152a;
        t14[] t14VarArrValues = t14.values();
        ArrayList arrayList2 = new ArrayList(t14VarArrValues.length);
        for (t14 t14Var : t14VarArrValues) {
            arrayList2.add(t14Var.f216152a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, new k8a("target_surface", "android-device-predictability-app-startup-trigger", str2, arrayList2));
    }
}
