package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sr10 implements Update {

    /* JADX INFO: renamed from: a */
    public static final sr10 f213206a = new sr10();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        mr10 mr10Var = (mr10) obj;
        g2x g2xVar = (g2x) obj2;
        if (g2xVar.equals(oww.f170792a)) {
            return Next.m15605a(Collections.singleton(oet.f164546b));
        }
        if (g2xVar.equals(oww.f170793b)) {
            return Next.m15607i(mr10.m62608c(mr10Var, false), Collections.singleton(bft.f26783a));
        }
        if (g2xVar.equals(oww.f170795d)) {
            return Next.m15607i(mr10.m62608c(mr10Var, true), Collections.singleton(sit.f209609a));
        }
        if (g2xVar instanceof pxw) {
            return Next.m15605a(Collections.singleton(new qht(((pxw) g2xVar).f183265a)));
        }
        if (g2xVar.equals(oww.f170794c)) {
            return Next.m15608j();
        }
        throw new NoWhenBranchMatchedException();
    }
}
