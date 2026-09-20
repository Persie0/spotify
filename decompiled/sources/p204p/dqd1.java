package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dqd1 implements Update {

    /* JADX INFO: renamed from: a */
    public static final dqd1 f51974a = new dqd1();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        d2x d2xVar = (d2x) obj2;
        if (d2xVar instanceof vww) {
            return Next.m15605a(Collections.singleton(new jht(((vww) d2xVar).f245560a)));
        }
        if (d2xVar.equals(sww.f214730a)) {
            return Next.m15605a(Collections.singleton(set.f208386b));
        }
        throw new NoWhenBranchMatchedException();
    }
}
