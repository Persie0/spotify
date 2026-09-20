package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x62 implements Update {

    /* JADX INFO: renamed from: a */
    public static final x62 f258562a = new x62();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        mvh0 mvh0Var = (mvh0) obj;
        e2x e2xVar = (e2x) obj2;
        if (e2xVar.equals(qww.f193430a)) {
            return Next.m15606h(mvh0.m62932c(mvh0Var, true));
        }
        if (e2xVar.equals(axw.f21007a)) {
            return Next.m15606h(mvh0.m62932c(mvh0Var, false));
        }
        if (e2xVar instanceof nxw) {
            nxw nxwVar = (nxw) e2xVar;
            return Next.m15605a(Collections.singleton(new kht(nxwVar.f159624a, nxwVar.f159625b)));
        }
        if (!(e2xVar instanceof vxw)) {
            throw new NoWhenBranchMatchedException();
        }
        return Next.m15605a(Collections.singleton(new ift(mvh0Var.f147587c, ((vxw) e2xVar).f245846a)));
    }
}
