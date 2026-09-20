package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class yg51 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        bh51 bh51Var = (bh51) obj;
        xg51 xg51Var = (xg51) obj2;
        if (xg51Var instanceof tg51) {
            return Next.m15605a(Collections.singleton(new qg51(((tg51) xg51Var).f220125a, bh51Var.f27086c, bh51Var.f27087d)));
        }
        boolean z = xg51Var instanceof ug51;
        ih51 ih51Var = ih51.f102173e;
        if (z) {
            return Next.m15605a(bk5.m29624m1(new kh51[]{jh51.f112339e, ih51Var}));
        }
        if (xg51Var.equals(vg51.f241146a)) {
            return Next.m15605a(Collections.singleton(ih51Var));
        }
        if (xg51Var instanceof wg51) {
            return Next.m15605a(Collections.singleton(new hh51(((wg51) xg51Var).f250995a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
