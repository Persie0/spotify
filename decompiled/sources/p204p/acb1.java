package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class acb1 implements Update {

    /* JADX INFO: renamed from: a */
    public static final acb1 f14311a = new acb1();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        zbb1 zbb1Var = (zbb1) obj2;
        boolean zEquals = zbb1Var.equals(wbb1.f249731a);
        nbb1 nbb1Var = nbb1.f152238a;
        if (zEquals) {
            return Next.m15605a(Collections.singleton(nbb1Var));
        }
        if (zbb1Var instanceof xbb1) {
            return Next.m15605a(Collections.singleton(new obb1(((xbb1) zbb1Var).f259879a)));
        }
        if (zbb1Var.equals(vbb1.f239468a)) {
            return Next.m15605a(Collections.singleton(pbb1.f175766a));
        }
        if (zbb1Var.equals(ybb1.f271128a)) {
            return Next.m15605a(Collections.singleton(nbb1Var));
        }
        throw new NoWhenBranchMatchedException();
    }
}
