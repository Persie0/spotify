package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l0k0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final l0k0 f128467a = new l0k0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        p0k0 p0k0Var = (p0k0) obj;
        k0k0 k0k0Var = (k0k0) obj2;
        eyj0 eyj0Var = p0k0Var.f172707b;
        boolean z = k0k0Var instanceof d0k0;
        mzj0 mzj0Var = mzj0.f148722a;
        if (z) {
            zxj0 zxj0Var = eyj0Var.f64111e;
            if (zxj0Var instanceof yxj0) {
                return Next.m15605a(bk5.m29624m1(new rzj0[]{new nzj0(p0k0Var.f172706a), ozj0.f172307a}));
            }
            if (zxj0Var instanceof xxj0) {
                return Next.m15605a(Collections.singleton(mzj0Var));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (k0k0Var instanceof h0k0) {
            boolean z2 = ((h0k0) k0k0Var).f86309a;
            zxj0 zxj0Var2 = eyj0Var.f64111e;
            if (!(zxj0Var2 instanceof yxj0)) {
                if (zxj0Var2 instanceof xxj0) {
                    return Next.m15605a(Collections.singleton(mzj0Var));
                }
                throw new NoWhenBranchMatchedException();
            }
            String str = ((yxj0) zxj0Var2).f277261a;
            if (p0k0Var.f172709d) {
                return z2 ? Next.m15607i(p0k0.m68718a(p0k0Var, false, false, 7), bk5.m29624m1(new rzj0[]{new qzj0(str), mzj0Var})) : Next.m15607i(p0k0.m68718a(p0k0Var, false, false, 7), Collections.singleton(mzj0Var));
            }
            return z2 ? Next.m15605a(bk5.m29624m1(new rzj0[]{new qzj0(str), mzj0Var})) : Next.m15606h(p0k0.m68718a(p0k0Var, true, false, 11));
        }
        if (k0k0Var instanceof j0k0) {
            return Next.m15606h(p0k0.m68718a(p0k0Var, false, true, 3));
        }
        if (k0k0Var instanceof g0k0) {
            return Next.m15605a(Collections.singleton(mzj0Var));
        }
        if (k0k0Var instanceof i0k0) {
            return Next.m15607i(p0k0.m68718a(p0k0Var, false, false, 7), bk5.m29624m1(new rzj0[]{pzj0.f183718a, mzj0Var}));
        }
        if (k0k0Var instanceof f0k0) {
            return Next.m15605a(Collections.singleton(lzj0.f138377a));
        }
        if (k0k0Var instanceof e0k0) {
            return Next.m15608j();
        }
        throw new NoWhenBranchMatchedException();
    }
}
