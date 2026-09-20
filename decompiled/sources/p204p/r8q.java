package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class r8q implements Update {

    /* JADX INFO: renamed from: a */
    public static final r8q f196827a = new r8q();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        zb31 zb31Var = (zb31) obj;
        ub31 ub31Var = (ub31) obj2;
        wj50.m88279p(zb31Var);
        wj50.m88279p(ub31Var);
        String str = zb31Var.f281227a;
        if (ub31Var instanceof sb31) {
            return ((sb31) ub31Var).f207331a instanceof nc31 ? Next.m15608j() : Next.m15605a(Collections.singleton(new rb31(str, true)));
        }
        if (ub31Var.equals(tb31.f218738a)) {
            return Next.m15605a(Collections.singleton(new rb31(str, false)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
