package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class mbe0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final mbe0 f141895a = new mbe0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        obe0 obe0Var = (obe0) obj;
        lbe0 lbe0Var = (lbe0) obj2;
        if (lbe0Var instanceof jbe0) {
            return Next.m15607i(obe0.m66642c(obe0Var, xmc1.f263340a), Collections.singleton(new hbe0(obe0Var.f163629a, wl51.m88491o1(((jbe0) lbe0Var).f110751a).toString())));
        }
        if (lbe0Var instanceof kbe0) {
            return Next.m15606h(obe0.m66642c(obe0Var, !wl51.m88460J0(wl51.m88491o1(((kbe0) lbe0Var).f121192a).toString()) ? tlc1.f221448a : qlc1.f189827a));
        }
        if (lbe0Var.equals(ibe0.f100519b)) {
            return Next.m15606h(obe0.m66642c(obe0Var, anc1.f17366a));
        }
        if (lbe0Var.equals(ibe0.f100520c)) {
            return Next.m15606h(obe0.m66642c(obe0Var, dnc1.f50755a));
        }
        if (lbe0Var.equals(ibe0.f100518a)) {
            return Next.m15606h(obe0.m66642c(obe0Var, olc1.f166821a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
