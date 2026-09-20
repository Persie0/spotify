package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t1d implements Update {

    /* JADX INFO: renamed from: a */
    public static final t1d f216227a = new t1d();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        y1d y1dVar = (y1d) obj;
        s1d s1dVar = (s1d) obj2;
        if (s1dVar.equals(n1d.f149394a)) {
            return Next.m15606h(y1d.m92646c(y1dVar, null, true, 1));
        }
        if (s1dVar.equals(l1d.f128701a)) {
            return Next.m15606h(y1d.m92646c(y1dVar, null, false, 1));
        }
        if (s1dVar.equals(m1d.f138938a)) {
            return Next.m15607i(y1d.m92646c(y1dVar, null, false, 1), Collections.singleton(y0d.f267963a));
        }
        if (s1dVar.equals(q1d.f184295a)) {
            return Next.m15607i(y1d.m92646c(y1dVar, null, true, 1), Collections.singleton(z0d.f278065a));
        }
        if (s1dVar.equals(o1d.f160697a)) {
            return Next.m15606h(new y1d(n0d.m63387c(y1dVar.f268233a, true, null, null, null, 61), false));
        }
        if (s1dVar.equals(r1d.f194823a)) {
            return Next.m15606h(new y1d(n0d.m63387c(y1dVar.f268233a, false, null, null, null, 61), false));
        }
        boolean zEquals = s1dVar.equals(h1d.f86568a);
        v0d v0dVar = v0d.f235965a;
        if (zEquals) {
            return Next.m15607i(y1d.m92646c(y1dVar, null, false, 1), Collections.singleton(v0dVar));
        }
        if (s1dVar.equals(j1d.f107735a)) {
            return Next.m15607i(y1d.m92646c(y1dVar, null, false, 1), Collections.singleton(v0dVar));
        }
        if (s1dVar.equals(k1d.f118288a)) {
            return Next.m15607i(y1d.m92646c(y1dVar, null, false, 1), Collections.singleton(w0d.f246699a));
        }
        if (s1dVar instanceof p1d) {
            return Next.m15605a(Collections.singleton(new x0d(((p1d) s1dVar).f173051a)));
        }
        if (!(s1dVar instanceof i1d)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((i1d) s1dVar).f97480a;
        n0d n0dVar = y1dVar.f268233a;
        sxd sxdVar = n0dVar.f149023c;
        return !(sxdVar instanceof rxd) ? Next.m15608j() : Next.m15606h(y1d.m92646c(y1dVar, n0d.m63387c(n0dVar, false, new rxd(str, ((rxd) sxdVar).f203576b), null, null, 59), false, 2));
    }
}
