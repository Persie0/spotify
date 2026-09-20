package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fv10 implements Update {

    /* JADX INFO: renamed from: a */
    public static final fv10 f73618a = new fv10();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        hv10 hv10Var = (hv10) obj;
        l2x l2xVar = (l2x) obj2;
        if (l2xVar.equals(nww.f159292a)) {
            return Next.m15605a(Collections.singleton(net.f153093b));
        }
        if (l2xVar.equals(nww.f159294c)) {
            if (hv10Var.f95556d) {
                return Next.m15607i(hv10.m48702c(hv10Var, false, true, false, 15), Collections.singleton(new ydt(hv10Var.f95553a)));
            }
            na6.m63957e("User must accept privacy policy to proceed");
            return Next.m15608j();
        }
        if (l2xVar.equals(nww.f159293b)) {
            return Next.m15606h(hv10.m48702c(hv10Var, false, false, false, 31));
        }
        if (l2xVar.equals(nww.f159296e)) {
            return Next.m15605a(Collections.singleton(new git(hv10Var.f95554b)));
        }
        if (l2xVar.equals(nww.f159295d)) {
            return Next.m15606h(hv10.m48702c(hv10Var, false, false, true, 15));
        }
        if (l2xVar instanceof rxw) {
            return Next.m15606h(hv10.m48702c(hv10Var, ((rxw) l2xVar).f203741a, false, false, 55));
        }
        if (l2xVar.equals(nww.f159297f)) {
            return Next.m15606h(hv10.m48702c(hv10Var, false, false, false, 15));
        }
        throw new NoWhenBranchMatchedException();
    }
}
