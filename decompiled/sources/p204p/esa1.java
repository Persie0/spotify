package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class esa1 implements Update {

    /* JADX INFO: renamed from: a */
    public static final esa1 f62322a = new esa1();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        gsa1 gsa1Var = (gsa1) obj;
        dsa1 dsa1Var = (dsa1) obj2;
        String str = gsa1Var.f83923a;
        kmo kmoVar = gsa1Var.f83924b;
        int i = 1;
        if (dsa1Var instanceof asa1) {
            gsa1 gsa1VarM45642c = gsa1.m45642c(gsa1Var, ((asa1) dsa1Var).f19364a, null, 0, 62);
            if (gsa1VarM45642c.f83927e == 3) {
                i = 3;
            } else if (!wl51.m88460J0(gsa1VarM45642c.f83923a) && !wl51.m88460J0(gsa1VarM45642c.f83924b.f124182a)) {
                i = 2;
            }
            return Next.m15607i(gsa1.m45642c(gsa1VarM45642c, null, null, i, 47), Collections.singleton(mra1.f146461a));
        }
        if (dsa1Var instanceof zra1) {
            zra1 zra1Var = (zra1) dsa1Var;
            return Next.m15605a(Collections.singleton(new kra1(kmoVar.f124187f, zra1Var.f285599a, zra1Var.f285600b, zra1Var.f285601c, kmoVar.f124188g)));
        }
        if (dsa1Var instanceof yra1) {
            yra1 yra1Var = (yra1) dsa1Var;
            int i2 = yra1Var.f275438f;
            if (i2 != 0) {
                i = 3;
            } else if (!wl51.m88460J0(str)) {
                i = 2;
            }
            return Next.m15607i(gsa1.m45642c(gsa1Var, null, new kmo(yra1Var.f275433a, yra1Var.f275434b, Integer.valueOf(yra1Var.f275435c), Integer.valueOf(yra1Var.f275436d), Integer.valueOf(yra1Var.f275437e), kmoVar.f124187f, kmoVar.f124188g), i, 45), i2 != 0 ? Collections.singleton(new lra1(i2)) : gbu.f78413a);
        }
        if (dsa1Var instanceof bsa1) {
            return gsa1Var.f83927e == 2 ? Next.m15605a(Collections.singleton(new nra1(str, kmoVar.f124182a))) : Next.m15608j();
        }
        if (dsa1Var instanceof xra1) {
            return Next.m15605a(Collections.singleton(jra1.f115126a));
        }
        if (dsa1Var instanceof csa1) {
            return Next.m15605a(Collections.singleton(new ora1(((csa1) dsa1Var).f41499a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
