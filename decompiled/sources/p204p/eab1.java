package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class eab1 implements Update {

    /* JADX INFO: renamed from: a */
    public static final eab1 f57618a = new eab1();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        dab1 dab1Var = (dab1) obj2;
        kab1 kab1Var = ((lab1) obj).f131326a;
        if (!dab1Var.equals(cab1.f35793a)) {
            if (dab1Var.equals(z9b1.f280738a) || dab1Var.equals(aab1.f13810a)) {
                return Next.m15605a(Collections.singleton(r9b1.f197012a));
            }
            if (dab1Var instanceof bab1) {
                return Next.m15605a(Collections.singleton(new s9b1(((bab1) dab1Var).f25172a)));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(kab1Var instanceof iab1)) {
            if (kab1Var instanceof jab1) {
                throw new IllegalStateException("Next button can not be clicked in first step");
            }
            throw new NoWhenBranchMatchedException();
        }
        iab1 iab1Var = (iab1) kab1Var;
        int iOrdinal = iab1Var.f100213a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Next button can not be clicked in first step");
        }
        return Next.m15607i(new lab1(new iab1(hab1.SECOND, iab1Var.f100214b, iab1Var.f100215c, iab1Var.f100216d)), Collections.singleton(t9b1.f218239a));
    }
}
