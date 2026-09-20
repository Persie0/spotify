package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class faj implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        v9j v9jVar = (v9j) obj2;
        if (v9jVar instanceof q9j) {
            q9j q9jVar = (q9j) v9jVar;
            return Next.m15605a(Collections.singleton(new l9j(q9jVar.f186606a, q9jVar.f186607b, q9jVar.f186608c, q9jVar.f186609d, q9jVar.f186610e)));
        }
        if (v9jVar instanceof r9j) {
            r9j r9jVar = (r9j) v9jVar;
            return Next.m15605a(Collections.singleton(new m9j(r9jVar.f197066a, r9jVar.f197067b, r9jVar.f197068c)));
        }
        if (!(v9jVar instanceof u9j)) {
            throw new NoWhenBranchMatchedException();
        }
        u9j u9jVar = (u9j) v9jVar;
        return Next.m15605a(Collections.singleton(new n9j(u9jVar.f228211a, u9jVar.f228212b, u9jVar.f228213c, u9jVar.f228214d, u9jVar.f228215e)));
    }
}
