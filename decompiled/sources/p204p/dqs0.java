package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class dqs0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final dqs0 f52081a = new dqs0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        tb6 tb6Var = (tb6) obj;
        qb6 qb6Var = (qb6) obj2;
        if (qb6Var instanceof pb6) {
            return Next.m15606h(tb6.m80378a(tb6Var, ejy0.f60320b, ((pb6) qb6Var).f175721a, 1));
        }
        if (qb6Var.equals(ob6.f163544a)) {
            return Next.m15606h(tb6.m80378a(tb6Var, ejy0.f60319a, 0, 5));
        }
        throw new NoWhenBranchMatchedException();
    }
}
