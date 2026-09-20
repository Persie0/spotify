package p204p;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class jvl0 implements phi {

    /* JADX INFO: renamed from: b */
    public static final C2109m f116365b;

    /* JADX INFO: renamed from: c */
    public static final jvl0 f116366c;

    /* JADX INFO: renamed from: a */
    public final TreeMap f116367a;

    static {
        C2109m c2109m = new C2109m(24);
        f116365b = c2109m;
        f116366c = new jvl0(new TreeMap(c2109m));
    }

    public jvl0(TreeMap treeMap) {
        this.f116367a = treeMap;
    }

    /* JADX INFO: renamed from: e */
    public static jvl0 m54383e() {
        return f116366c;
    }

    /* JADX INFO: renamed from: j */
    public static jvl0 m54384j(phi phiVar) {
        if (jvl0.class.equals(phiVar.getClass())) {
            return (jvl0) phiVar;
        }
        TreeMap treeMap = new TreeMap(f116365b);
        for (sy7 sy7Var : phiVar.mo39827b()) {
            Set<nhi> setMo39833i = phiVar.mo39833i(sy7Var);
            ArrayMap arrayMap = new ArrayMap();
            for (nhi nhiVar : setMo39833i) {
                arrayMap.put(nhiVar, phiVar.mo39832h(sy7Var, nhiVar));
            }
            treeMap.put(sy7Var, arrayMap);
        }
        return new jvl0(treeMap);
    }

    @Override // p204p.phi
    /* JADX INFO: renamed from: a */
    public final void mo39826a(m94 m94Var) {
        for (Map.Entry entry : this.f116367a.tailMap(new sy7("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((sy7) entry.getKey()).f215171a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            sy7 sy7Var = (sy7) entry.getKey();
            a99 a99Var = (a99) m94Var.f141207b;
            phi phiVar = (phi) m94Var.f141208c;
            ((lpi0) a99Var.f13521b).m59674w(sy7Var, phiVar.mo39831g(sy7Var), phiVar.mo39828c(sy7Var));
        }
    }

    @Override // p204p.phi
    /* JADX INFO: renamed from: b */
    public final Set mo39827b() {
        return Collections.unmodifiableSet(this.f116367a.keySet());
    }

    @Override // p204p.phi
    /* JADX INFO: renamed from: c */
    public final Object mo39828c(sy7 sy7Var) {
        Map map = (Map) this.f116367a.get(sy7Var);
        if (map != null) {
            return map.get((nhi) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + sy7Var);
    }

    @Override // p204p.phi
    /* JADX INFO: renamed from: d */
    public final boolean mo39829d(sy7 sy7Var) {
        return this.f116367a.containsKey(sy7Var);
    }

    @Override // p204p.phi
    /* JADX INFO: renamed from: f */
    public final Object mo39830f(sy7 sy7Var, Object obj) {
        try {
            return mo39828c(sy7Var);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // p204p.phi
    /* JADX INFO: renamed from: g */
    public final nhi mo39831g(sy7 sy7Var) {
        Map map = (Map) this.f116367a.get(sy7Var);
        if (map != null) {
            return (nhi) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + sy7Var);
    }

    @Override // p204p.phi
    /* JADX INFO: renamed from: h */
    public final Object mo39832h(sy7 sy7Var, nhi nhiVar) {
        Map map = (Map) this.f116367a.get(sy7Var);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + sy7Var);
        }
        if (map.containsKey(nhiVar)) {
            return map.get(nhiVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + sy7Var + " with priority=" + nhiVar);
    }

    @Override // p204p.phi
    /* JADX INFO: renamed from: i */
    public final Set mo39833i(sy7 sy7Var) {
        Map map = (Map) this.f116367a.get(sy7Var);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }
}
