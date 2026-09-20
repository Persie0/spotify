package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zi91 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        rvh0 rvh0Var = (rvh0) obj;
        w2x w2xVar = (w2x) obj2;
        oh91 oh91Var = rvh0Var.f203086a;
        boolean zEquals = w2xVar.equals(itw.f105781d);
        het hetVar = het.f90506a;
        mh91 mh91Var = mh91.f143752a;
        if (zEquals) {
            return Next.m15607i(rvh0.m76480a(rvh0Var, mh91Var), bk5.m29624m1(new wmt[]{hetVar, cht.f38076a}));
        }
        if (w2xVar.equals(itw.f105783f)) {
            return Next.m15607i(rvh0.m76480a(rvh0Var, mh91Var), bk5.m29624m1(new wmt[]{hetVar, ght.f79973a}));
        }
        boolean zEquals2 = w2xVar.equals(itw.f105782e);
        nh91 nh91Var = nh91.f153906a;
        if (zEquals2) {
            return oh91Var.equals(nh91Var) ? Next.m15608j() : Next.m15607i(rvh0.m76480a(rvh0Var, kh91.f122572a), Collections.singleton(fht.f69701a));
        }
        boolean zEquals3 = w2xVar.equals(itw.f105779b);
        zet zetVar = zet.f282124a;
        if (zEquals3) {
            return oh91Var.equals(mh91Var) ? Next.m15608j() : Next.m15605a(bk5.m29624m1(new wmt[]{zetVar, pgt.f177393a}));
        }
        if (w2xVar.equals(itw.f105784g)) {
            return Next.m15607i(rvh0.m76480a(rvh0Var, mh91Var), Collections.singleton(cit.f38431a));
        }
        if (w2xVar.equals(itw.f105778a)) {
            return Next.m15607i(rvh0.m76480a(rvh0Var, nh91Var), Collections.singleton(hlt.f92734a));
        }
        if (w2xVar.equals(itw.f105780c)) {
            return Next.m15607i(rvh0Var, bk5.m29624m1(new wmt[]{xht.f261701a, zetVar}));
        }
        throw new NoWhenBranchMatchedException();
    }
}
