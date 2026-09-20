package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class wte1 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        vte1 vte1Var = (vte1) obj2;
        if (vte1Var instanceof qte1) {
            qte1 qte1Var = (qte1) vte1Var;
            return Next.m15605a(Collections.singleton(new kte1(qte1Var.f192370a, qte1Var.f192371b)));
        }
        if (vte1Var instanceof pte1) {
            return Next.m15605a(Collections.singleton(new mte1(((pte1) vte1Var).f181142a)));
        }
        if (vte1Var instanceof rte1) {
            return Next.m15605a(Collections.singleton(new lte1(((rte1) vte1Var).f202573a)));
        }
        if (vte1Var instanceof ste1) {
            return Next.m15605a(Collections.singleton(new nte1(((ste1) vte1Var).f213898a)));
        }
        if (vte1Var instanceof tte1) {
            tte1 tte1Var = (tte1) vte1Var;
            return Next.m15605a(Collections.singleton(new jte1(tte1Var.f223582a, tte1Var.f223583b)));
        }
        if (!(vte1Var instanceof ute1)) {
            throw new NoWhenBranchMatchedException();
        }
        ute1 ute1Var = (ute1) vte1Var;
        return Next.m15605a(Collections.singleton(new ote1(ute1Var.f233905a, ute1Var.f233906b)));
    }
}
