package p204p;

import com.google.protobuf.AbstractC0274m;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class eux extends dux {

    /* JADX INFO: renamed from: a */
    public static final long f63102a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f63103b = 0;

    static {
        try {
            f63102a = b5a1.f23536c.m89845l(f110.class.getDeclaredField("b"));
        } catch (Throwable th) {
            throw new IllegalStateException("Unable to lookup extension field offset", th);
        }
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: a */
    public final int mo2110a(Map.Entry entry) {
        ikc0.m50942n(entry.getKey());
        throw null;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: b */
    public final Object mo2111b(aux auxVar, pre0 pre0Var, int i) {
        j4x.m52411i(pre0Var);
        throw null;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: c */
    public final kuy mo2112c(Object obj) {
        return (kuy) b5a1.f23536c.m89844k(f63102a, obj);
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: d */
    public final kuy mo2113d(Object obj) {
        kuy kuyVarMo2112c = mo2112c(obj);
        if (!kuyVarMo2112c.f126736b) {
            return kuyVarMo2112c;
        }
        kuy kuyVarClone = kuyVarMo2112c.clone();
        b5a1.m28169p(obj, f63102a, kuyVarClone);
        return kuyVarClone;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: e */
    public final boolean mo2114e(pre0 pre0Var) {
        return false;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: f */
    public final void mo2115f(Object obj) {
        mo2112c(obj).m57423k();
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: g */
    public final Object mo2116g(Object obj, iru0 iru0Var, Object obj2, aux auxVar, kuy kuyVar, Object obj3, AbstractC0274m abstractC0274m) {
        mt60.m62805l(obj2);
        throw null;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: h */
    public final void mo2117h(iru0 iru0Var, Object obj, aux auxVar, kuy kuyVar) {
        mt60.m62805l(obj);
        throw null;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: i */
    public final void mo2118i(gva gvaVar, Object obj, aux auxVar, kuy kuyVar) {
        mt60.m62805l(obj);
        throw null;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: j */
    public final void mo2119j(gd8 gd8Var, Map.Entry entry) {
        ikc0.m50942n(entry.getKey());
        throw null;
    }
}
