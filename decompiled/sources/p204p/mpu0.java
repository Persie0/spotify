package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class mpu0 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        ppu0 ppu0Var = (ppu0) obj;
        hpu0 hpu0Var = (hpu0) obj2;
        boolean zEquals = hpu0Var.equals(fpu0.f72004a);
        bpu0 bpu0Var = bpu0.f29607a;
        if (zEquals) {
            return Next.m15605a(Collections.singleton(bpu0Var));
        }
        if (hpu0Var instanceof gpu0) {
            return Next.m15605a(bk5.m29624m1(new epu0[]{new cpu0(ppu0Var.f180108b, ppu0Var.f180109c, ((gpu0) hpu0Var).f83250a), dpu0.f51747a, bpu0Var}));
        }
        throw new NoWhenBranchMatchedException();
    }
}
