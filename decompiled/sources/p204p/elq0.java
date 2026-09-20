package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class elq0 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        epq0 epq0Var = (epq0) obj;
        joq0 joq0Var = (joq0) obj2;
        x9r0 x9r0Var = epq0Var.f61699d;
        String str = epq0Var.f61697b;
        x9r0 x9r0Var2 = epq0Var.f61699d;
        boolean z = epq0Var.f61701f;
        String str2 = epq0Var.f61696a;
        boolean z2 = epq0Var.f61700e;
        lpq0 lpq0Var = epq0Var.f61698c;
        if (joq0Var instanceof coq0) {
            return Next.m15606h(epq0.m39663a(epq0Var, null, new gpq0(((coq0) joq0Var).f40328a), false, 59));
        }
        if (joq0Var instanceof hoq0) {
            return Next.m15605a(Effects.m15571a(new fnq0(((hoq0) joq0Var).f93589a, x9r0Var)));
        }
        if (joq0Var instanceof foq0) {
            return Next.m15606h(epq0.m39663a(epq0Var, null, new ipq0(((foq0) joq0Var).f71590a), false, 51));
        }
        if (joq0Var instanceof aoq0) {
            fpq0 fpq0Var = ((aoq0) joq0Var).f17744a;
            hnq0 hnq0Var = hnq0.f93383a;
            return !z2 ? Next.m15605a(Effects.m15571a(new lnq0(fpq0Var), hnq0Var)) : Next.m15607i(epq0.m39663a(epq0Var, null, new ipq0(fpq0Var), false, 59), Effects.m15571a(hnq0Var));
        }
        if (joq0Var instanceof znq0) {
            int i = ((znq0) joq0Var).f284548a;
            if (lpq0Var instanceof ipq0) {
                return Next.m15608j();
            }
            return ((lpq0Var instanceof hpq0) && ((hpq0) lpq0Var).f93828a == i) ? Next.m15608j() : Next.m15606h(epq0.m39663a(epq0Var, null, new hpq0(i), false, 51));
        }
        if (joq0Var instanceof doq0) {
            return (!(lpq0Var instanceof kpq0) || ((kpq0) lpq0Var).f125109a) ? Next.m15608j() : Next.m15606h(epq0.m39663a(epq0Var, null, new kpq0(true), false, 59));
        }
        if (joq0Var instanceof ioq0) {
            String str3 = ((ioq0) joq0Var).f104278a;
            if (x9r0Var != null) {
                return Next.m15608j();
            }
            if (str3.equals("premium")) {
                return Next.m15605a(Effects.m15571a(jnq0.f114186a));
            }
            return lpq0Var instanceof kpq0 ? Next.m15607i(epq0.m39663a(epq0Var, str3, null, false, 61), Effects.m15571a(new gnq0(str2, str3, x9r0Var2, z))) : Next.m15608j();
        }
        if (joq0Var instanceof goq0) {
            return x9r0Var != null ? Next.m15608j() : Next.m15606h(epq0Var);
        }
        if (!(joq0Var instanceof boq0)) {
            if (joq0Var instanceof eoq0) {
                return Next.m15606h(epq0.m39663a(epq0Var, null, new ipq0(((eoq0) joq0Var).f61462a), false, 59));
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z3 = ((boq0) joq0Var).f29239a;
        if (z2 && (lpq0Var instanceof ipq0) && !z3) {
            return Next.m15607i(epq0.m39663a(epq0Var, null, null, false, 47), Effects.m15571a(new lnq0(((ipq0) lpq0Var).f104545a)));
        }
        return (z2 || str == null || !z3) ? Next.m15606h(epq0.m39663a(epq0Var, null, null, z3, 47)) : Next.m15607i(epq0.m39663a(epq0Var, null, null, true, 47), Effects.m15571a(new gnq0(str2, str, x9r0Var2, z)));
    }
}
