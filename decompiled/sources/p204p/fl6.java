package p204p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class fl6 implements k330, vze, sqz, hsr {

    /* JADX INFO: renamed from: a */
    public final String f70705a;

    /* JADX INFO: renamed from: b */
    public final String f70706b;

    /* JADX INFO: renamed from: c */
    public final un20 f70707c;

    /* JADX INFO: renamed from: d */
    public final t3x0 f70708d;

    /* JADX INFO: renamed from: e */
    public final gl6 f70709e;

    public fl6(String str, String str2, un20 un20Var, t3x0 t3x0Var, gl6 gl6Var) {
        this.f70705a = str;
        this.f70706b = str2;
        this.f70707c = un20Var;
        this.f70708d = t3x0Var;
        this.f70709e = gl6Var;
    }

    @Override // p204p.vze
    /* JADX INFO: renamed from: a */
    public final Set mo24932a() {
        return Collections.singleton(this.f70709e.f81003a);
    }

    @Override // p204p.hsr
    /* JADX INFO: renamed from: b */
    public final String mo24933b() {
        return this.f70709e.f81003a;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        Object izd0Var;
        gl6 gl6Var = this.f70709e;
        String str = gl6Var.f81004b;
        un20 un20Var = this.f70707c;
        if (un20Var != null) {
            String str2 = gl6Var.f81003a;
            String str3 = this.f70705a;
            izd0Var = new jzd0(str3, b250Var, new ezs0(str3, this.f70706b, str, str2, un20Var, null, null, null, null, 480));
        } else {
            String str4 = gl6Var.f81003a;
            String str5 = this.f70705a;
            izd0Var = new izd0(str5, b250Var, new ezs0(str5, this.f70706b, str, str4, null, null, null, null, null, 480));
        }
        return Collections.singletonList(izd0Var);
    }

    @Override // p204p.sqz
    /* JADX INFO: renamed from: e */
    public final String mo24935e() {
        return this.f70705a;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f70708d;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f70705a;
    }
}
