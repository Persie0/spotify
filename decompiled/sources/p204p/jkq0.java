package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jkq0 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        gkq0 gkq0Var = (gkq0) obj2;
        if (!(gkq0Var instanceof dkq0)) {
            if (gkq0Var instanceof ekq0) {
                return Next.m15606h(new ikq0(okq0.f166655a));
            }
            if (gkq0Var instanceof fkq0) {
                return Next.m15607i(new ikq0(qkq0.f189634a), Collections.singleton(rjq0.f199885a));
            }
            if (gkq0Var instanceof akq0) {
                return Next.m15605a(Collections.singleton(new tjq0(((akq0) gkq0Var).f16625a)));
            }
            throw new NoWhenBranchMatchedException();
        }
        dkq0 dkq0Var = (dkq0) gkq0Var;
        boolean z = dkq0Var instanceof ckq0;
        sjq0 sjq0Var = sjq0.f209924a;
        if (z) {
            return Next.m15605a(bk5.m29624m1(new xjq0[]{new vjq0(((ckq0) dkq0Var).f39073a), sjq0Var}));
        }
        if (dkq0Var instanceof bkq0) {
            return Next.m15607i(new ikq0(pkq0.f178512a), bk5.m29624m1(new xjq0[]{new ujq0(((bkq0) dkq0Var).f28005a), sjq0Var}));
        }
        throw new NoWhenBranchMatchedException();
    }
}
