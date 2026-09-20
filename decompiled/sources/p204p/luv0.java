package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class luv0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f137159a;

    /* JADX INFO: renamed from: b */
    public final qwx0 f137160b;

    public luv0(ron ronVar, qwx0 qwx0Var) {
        this.f137159a = ronVar;
        this.f137160b = qwx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m60028a() {
        return ((ao4) this.f137159a.get()).m26556a();
    }

    /* JADX INFO: renamed from: b */
    public final yab m60029b() {
        return k0e1.m54985d(((rwx0) this.f137160b).f203428a.map(new x7q0(this, 20)).onErrorReturnItem(Boolean.FALSE));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m60030c(Map map) {
        return !dxf1.m37222K(map) && gwg1.m45947s((String) map.get("pick-and-shuffle"));
    }

    /* JADX INFO: renamed from: d */
    public final Observable m60031d() {
        return ((rwx0) this.f137160b).f203428a.map(new gjv0(this, 2)).onErrorReturnItem(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m60032e() {
        return ((ao4) this.f137159a.get()).m26558c();
    }
}
