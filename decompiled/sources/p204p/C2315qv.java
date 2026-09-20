package p204p;

import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: renamed from: p.qv */
/* JADX INFO: loaded from: classes17.dex */
public final class C2315qv implements Predicate {

    /* JADX INFO: renamed from: a */
    public static final C2315qv f192846a = new C2315qv();

    /* JADX INFO: renamed from: a */
    public static C1993iw m73956a(C2230ow c2230ow) {
        String strM68148i = c2230ow.m68148i();
        eg7 eg7Var = new eg7(strM68148i, C2100lr.m59779b(c2230ow.m68141b()));
        C2105lw c2105lwM68147h = c2230ow.m68147h();
        return new C1993iw(new wi7(strM68148i, c2105lwM68147h != null ? new C1856fd(c2105lwM68147h.m60086c(), c2105lwM68147h.m60085b(), c2105lwM68147h.m60084a()) : null, eg7Var), c2230ow.m68143d(), c2230ow.m68142c(), c2230ow.m68140a(), c2230ow.m68146g(), c2230ow.m68145f(), c2230ow.m68144e());
    }

    /* JADX INFO: renamed from: b */
    public static C2230ow m73957b(C1993iw c1993iw) {
        wi7 wi7VarM51772b = c1993iw.m51772b();
        eg7 eg7Var = wi7VarM51772b.f251544c;
        if (!(eg7Var instanceof eg7)) {
            eg7Var = null;
        }
        byte[] bArr = eg7Var != null ? eg7Var.f59235b : null;
        if (bArr == null) {
            return null;
        }
        String strM59778a = C2100lr.m59778a(bArr);
        String str = wi7VarM51772b.f251542a;
        C1856fd c1856fd = wi7VarM51772b.f251543b;
        return new C2230ow(str, strM59778a, c1856fd != null ? new C2105lw(c1856fd.f68281a, c1856fd.f68282b, c1856fd.f68283c) : null, c1993iw.m51775e(), c1993iw.m51774d(), c1993iw.m51773c(), c1993iw.m51778h(), c1993iw.m51777g(), c1993iw.m51776f());
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }
}
