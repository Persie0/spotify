package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class df1 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        cf1 cf1Var = (cf1) obj2;
        xf1 xf1Var = ((kf1) obj).f122028d;
        if (cf1Var instanceof xe1) {
            return Next.m15605a(Collections.singleton(new se1(xf1Var.f260806c.f246610e)));
        }
        if (cf1Var instanceof bf1) {
            return Next.m15605a(Collections.singleton(new we1(((wf1) xf1Var.f260805b.get(((bf1) cf1Var).f26512a)).f250658e.f246610e)));
        }
        if (cf1Var instanceof af1) {
            return Next.m15605a(Collections.singleton(new ve1(((af1) cf1Var).f14998a)));
        }
        if (cf1Var instanceof ze1) {
            return Next.m15605a(Collections.singleton(new ue1(((ze1) cf1Var).f281845a)));
        }
        if (cf1Var instanceof ye1) {
            return Next.m15605a(Collections.singleton(new te1(((ye1) cf1Var).f271887a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
