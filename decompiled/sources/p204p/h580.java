package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h580 implements Update {

    /* JADX INFO: renamed from: a */
    public static final h580 f87770a = new h580();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        j580 j580Var = (j580) obj;
        z1x z1xVar = (z1x) obj2;
        if (z1xVar instanceof lxw) {
            return Next.m15605a(Collections.singleton(new uht(j580Var.f108911d)));
        }
        if (z1xVar instanceof kyw) {
            boolean z = ((kyw) z1xVar).f127928a;
            return Next.m15607i(j580.m52445c(j580Var, z, false, 191), Collections.singleton(new ygt(z)));
        }
        if (z1xVar instanceof sxw) {
            boolean z2 = ((sxw) z1xVar).f215060a;
            return Next.m15607i(j580.m52445c(j580Var, false, z2, 127), Collections.singleton(new aht(z2)));
        }
        if (z1xVar instanceof txw) {
            return Next.m15605a(Collections.singleton(new fit(((txw) z1xVar).f224773a)));
        }
        if (z1xVar instanceof iyw) {
            return Next.m15605a(Collections.singleton(new fit(((iyw) z1xVar).f107084a)));
        }
        if (z1xVar instanceof lyw) {
            return Next.m15605a(Collections.singleton(new fit(((lyw) z1xVar).f138124a)));
        }
        if (z1xVar instanceof jww) {
            return Next.m15605a(Collections.singleton(new fit(((jww) z1xVar).f116729a)));
        }
        if (z1xVar instanceof hxw) {
            return Next.m15605a(Collections.singleton(new fit(((hxw) z1xVar).f96325a)));
        }
        if (z1xVar instanceof gyw) {
            return Next.m15605a(Collections.singleton(new fit(((gyw) z1xVar).f85753a)));
        }
        if (z1xVar.equals(gxw.f85348a)) {
            return Next.m15606h(j580.m52445c(j580Var, false, false, 223));
        }
        if (z1xVar.equals(rww.f203424a)) {
            return Next.m15605a(Collections.singleton(ngt.f153791a));
        }
        if (z1xVar.equals(xxw.f267117a)) {
            return Next.m15605a(Collections.singleton(udt.f229328a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
