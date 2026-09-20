package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c121 implements Update {

    /* JADX INFO: renamed from: a */
    public static final c121 f32954a = new c121();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        nvh0 nvh0Var = (nvh0) obj;
        f2x f2xVar = (f2x) obj2;
        String str = nvh0Var.f158909c;
        if (f2xVar.equals(pww.f182147a)) {
            return Next.m15606h(nvh0.m65744a(nvh0Var, null, true, 5));
        }
        if (f2xVar.equals(zww.f287108a)) {
            return Next.m15606h(nvh0.m65744a(nvh0Var, null, false, 5));
        }
        if (f2xVar.equals(mxw.f148208a)) {
            return Next.m15605a(Collections.singleton(lht.f133643b));
        }
        if (f2xVar.equals(uxw.f235058a)) {
            if (str == null) {
                str = "";
            }
            return Next.m15605a(Collections.singleton(new hft(str)));
        }
        if (f2xVar.equals(dyw.f54456a)) {
            return Next.m15607i(nvh0.m65744a(nvh0Var, dy91.f54252d, false, 6), Collections.singleton(nft.f153424b));
        }
        if (f2xVar.equals(dxw.f54109a)) {
            if (str == null) {
                str = "";
            }
            return Next.m15605a(Collections.singleton(new hft(str)));
        }
        if (f2xVar instanceof fyw) {
            return Next.m15606h(new nvh0(fy91.f74662d, false, ((fyw) f2xVar).f74861a));
        }
        if (f2xVar.equals(eyw.f64202a)) {
            return Next.m15606h(nvh0.m65744a(nvh0Var, zx91.f287259d, false, 6));
        }
        throw new NoWhenBranchMatchedException();
    }
}
