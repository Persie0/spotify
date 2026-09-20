package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n370 implements Update {

    /* JADX INFO: renamed from: a */
    public static final n370 f149948a = new n370();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        p370 p370Var = (p370) obj;
        k370 k370Var = (k370) obj2;
        h891 h891Var = p370Var.f173573b;
        if (k370Var.equals(h370.f87154a)) {
            return Next.m15605a(Collections.singleton(e370.f55659b));
        }
        if (k370Var instanceof i370) {
            return Next.m15605a(Collections.singleton(new f370(h891Var, p370Var.f173576e, ((i370) k370Var).f98053a)));
        }
        if (k370Var.equals(h370.f87155b)) {
            return Next.m15605a(Collections.singleton(new d370(h891Var)));
        }
        if (k370Var instanceof j370) {
            return Next.m15605a(Collections.singleton(new g370(((j370) k370Var).f108301a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
