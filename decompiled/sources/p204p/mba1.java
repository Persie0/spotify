package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mba1 implements Update {

    /* JADX INFO: renamed from: a */
    public static final mba1 f141848a = new mba1();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        lba1 lba1Var = (lba1) obj;
        kba1 kba1Var = (kba1) obj2;
        boolean z = kba1Var instanceof jba1;
        wba1 wba1Var = tba1.f218809a;
        if (z) {
            if (wl51.m88460J0(wl51.m88491o1(((jba1) kba1Var).f110725a).toString())) {
                wba1Var = sba1.f207406a;
            }
            return Next.m15606h(lba1.m58657a(lba1Var, wba1Var));
        }
        if (kba1Var instanceof iba1) {
            return Next.m15607i(lba1.m58657a(lba1Var, uba1.f228672a), Collections.singleton(new aba1(lba1Var.f131613a, wl51.m88491o1(((iba1) kba1Var).f100499a).toString())));
        }
        if (kba1Var.equals(hba1.f89467a)) {
            return Next.m15606h(lba1.m58657a(lba1Var, vba1.f239458a));
        }
        if (kba1Var.equals(gba1.f78252a)) {
            return Next.m15607i(lba1.m58657a(lba1Var, wba1Var), Collections.singleton(zaa1.f281015a));
        }
        if (kba1Var.equals(fba1.f67775a)) {
            return Next.m15606h(lba1.m58657a(lba1Var, rba1.f197538a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
