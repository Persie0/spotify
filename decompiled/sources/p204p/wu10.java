package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wu10 implements Update {

    /* JADX INFO: renamed from: a */
    public static final wu10 f255052a = new wu10();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        k2x k2xVar = (k2x) obj2;
        if (k2xVar.equals(mww.f147890a)) {
            return Next.m15605a(Collections.singleton(met.f142837a));
        }
        if (k2xVar instanceof kxw) {
            return Next.m15605a(Collections.singleton(new vht(((kxw) k2xVar).f127600a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
