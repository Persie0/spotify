package p204p;

import com.comscore.util.log.LogLevel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a24 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f11567a;

    /* JADX INFO: renamed from: b */
    public final y14 f11568b;

    /* JADX INFO: renamed from: c */
    public final int f11569c;

    /* JADX INFO: renamed from: d */
    public final z14 f11570d;

    /* JADX INFO: renamed from: e */
    public final int f11571e;

    /* JADX INFO: renamed from: f */
    public final bji f11572f;

    /* JADX INFO: renamed from: g */
    public final wg61 f11573g = new wg61(new u14(this, 3));

    public a24(boolean z, y14 y14Var, int i, z14 z14Var, int i2, bji bjiVar) {
        this.f11567a = z;
        this.f11568b = y14Var;
        this.f11569c = i;
        this.f11570d = z14Var;
        this.f11571e = i2;
        this.f11572f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24485a() {
        a24 a24Var = (a24) this.f11573g.getValue();
        return a24Var != null ? a24Var.m24485a() : this.f11567a;
    }

    /* JADX INFO: renamed from: b */
    public final y14 m24486b() {
        y14 y14VarM24486b;
        a24 a24Var = (a24) this.f11573g.getValue();
        return (a24Var == null || (y14VarM24486b = a24Var.m24486b()) == null) ? this.f11568b : y14VarM24486b;
    }

    /* JADX INFO: renamed from: c */
    public final int m24487c() {
        a24 a24Var = (a24) this.f11573g.getValue();
        return a24Var != null ? a24Var.m24487c() : this.f11569c;
    }

    /* JADX INFO: renamed from: d */
    public final z14 m24488d() {
        z14 z14VarM24488d;
        a24 a24Var = (a24) this.f11573g.getValue();
        return (a24Var == null || (z14VarM24488d = a24Var.m24488d()) == null) ? this.f11570d : z14VarM24488d;
    }

    /* JADX INFO: renamed from: e */
    public final int m24489e() {
        a24 a24Var = (a24) this.f11573g.getValue();
        return a24Var != null ? a24Var.m24489e() : this.f11571e;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("enable", "android-device-predictability-playback-trigger", m24485a());
        String str = m24486b().f268172a;
        y14[] y14VarArrValues = y14.values();
        ArrayList arrayList = new ArrayList(y14VarArrValues.length);
        for (y14 y14Var : y14VarArrValues) {
            arrayList.add(y14Var.f268172a);
        }
        k8a k8aVar2 = new k8a("minimum_displayable_confidence_score", "android-device-predictability-playback-trigger", str, arrayList);
        k8a k8aVar3 = new k8a("smart_control_nudge_auto_dismiss_timeout_ms", "android-device-predictability-playback-trigger", m24487c(), 0, 60000);
        String str2 = m24488d().f278225a;
        z14[] z14VarArrValues = z14.values();
        ArrayList arrayList2 = new ArrayList(z14VarArrValues.length);
        for (z14 z14Var : z14VarArrValues) {
            arrayList2.add(z14Var.f278225a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, new k8a("target_surface", "android-device-predictability-playback-trigger", str2, arrayList2), new k8a("trigger_delay_ms", "android-device-predictability-playback-trigger", m24489e(), 0, LogLevel.NONE));
    }
}
