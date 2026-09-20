package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n91 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        t91 t91Var = (t91) obj;
        m91 m91Var = (m91) obj2;
        if (m91Var instanceof g91) {
            return Next.m15605a(Collections.singleton(new f91(((g91) m91Var).f77642a)));
        }
        if (m91Var.equals(h91.f88856a)) {
            return Next.m15605a(Collections.singleton(e91.f57328a));
        }
        if (m91Var.equals(j91.f110072a)) {
            return Next.m15606h(t91.m80271a(t91Var, 2));
        }
        if (m91Var.equals(i91.f99887a)) {
            return Next.m15606h(t91.m80271a(t91Var, 3));
        }
        if (m91Var.equals(k91.f120502a)) {
            return Next.m15606h(t91.m80271a(t91Var, 1));
        }
        if (m91Var instanceof l91) {
            return Next.m15605a(Collections.singleton(new d91(((l91) m91Var).f130977a, t91Var.f218171c)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
