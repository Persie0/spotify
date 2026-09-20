package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class je9 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        pe9 pe9Var = (pe9) obj;
        ae9 ae9Var = (ae9) obj2;
        if (ae9Var.equals(zd9.f281648a)) {
            return Next.m15605a(Collections.singleton(new vd9(pe9Var.f176667n)));
        }
        if (ae9Var.equals(yd9.f271721a)) {
            return Next.m15605a(Collections.singleton(new sd9(pe9Var.f176670q)));
        }
        if (ae9Var instanceof wd9) {
            return Next.m15605a(Collections.singleton(new td9(((wd9) ae9Var).f250237a)));
        }
        if (ae9Var.equals(xd9.f260417a)) {
            return Next.m15605a(Collections.singleton(ud9.f229210a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
