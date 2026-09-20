package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xwm0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final xwm0 f266705a = new xwm0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        a2x a2xVar = (a2x) obj2;
        if (a2xVar instanceof www) {
            return Next.m15605a(Collections.singleton(new mht(((www) a2xVar).f255842a)));
        }
        if (a2xVar.equals(wxw.f256138a)) {
            return Next.m15605a(Collections.singleton(qet.f188020b));
        }
        if (a2xVar instanceof ixw) {
            return Next.m15605a(Collections.singleton(new eit(((ixw) a2xVar).f106779a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
