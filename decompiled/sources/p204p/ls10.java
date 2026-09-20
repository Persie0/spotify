package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ls10 implements Update {

    /* JADX INFO: renamed from: a */
    public static final ls10 f136410a = new ls10();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        ns10 ns10Var = (ns10) obj;
        h2x h2xVar = (h2x) obj2;
        boolean z = ns10Var.f157638c;
        ss10 ss10Var = ns10Var.f157636a;
        boolean zEquals = h2xVar.equals(lww.f137647d);
        tct tctVar = tct.f219142a;
        if (zEquals) {
            return Next.m15607i(ns10.m65502c(ns10Var, true, false, tctVar, 47), Collections.singleton(new gkt(ss10Var)));
        }
        if (h2xVar.equals(lww.f137646c)) {
            return Next.m15607i(ns10.m65502c(ns10Var, false, true, tctVar, 31), Collections.singleton(new rit(ss10Var)));
        }
        if (h2xVar.equals(lww.f137650g)) {
            return Next.m15605a(Collections.singleton(new iit(ns10Var.f157639d)));
        }
        if (h2xVar.equals(lww.f137644a)) {
            return Next.m15605a(Collections.singleton(ket.f121965b));
        }
        if (h2xVar.equals(lww.f137649f)) {
            return z ? Next.m15605a(Collections.singleton(new vet(true))) : Next.m15608j();
        }
        if (h2xVar.equals(lww.f137648e)) {
            return z ? Next.m15605a(Collections.singleton(new vet(false))) : Next.m15608j();
        }
        if (h2xVar.equals(lww.f137645b)) {
            return Next.m15606h(ns10.m65502c(ns10Var, false, false, tctVar, 63));
        }
        if (h2xVar instanceof jxw) {
            return Next.m15606h(ns10.m65502c(ns10Var, false, false, ((jxw) h2xVar).f117238a, 15));
        }
        throw new NoWhenBranchMatchedException();
    }
}
