package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sva0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final sva0 f214370a = new sva0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        uva0 uva0Var = (uva0) obj;
        mva0 mva0Var = (mva0) obj2;
        if (mva0Var.equals(lva0.f137265a)) {
            return Next.m15605a(Collections.singleton(new hva0(uva0Var.f234405c, uva0Var.f234404b, uva0Var.f234403a)));
        }
        if (mva0Var.equals(kva0.f126808a)) {
            return Next.m15606h(new uva0(uva0Var.f234403a, uva0Var.f234404b, uva0Var.f234405c, uva0Var.f234406d, uva0Var.f234407e, false, uva0Var.f234409g, uva0Var.f234410h));
        }
        throw new NoWhenBranchMatchedException();
    }
}
