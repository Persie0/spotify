package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p1t implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        t1t t1tVar = (t1t) obj;
        f1t f1tVar = (f1t) obj2;
        Set set = t1tVar.f216351b;
        if (f1tVar instanceof b1t) {
            b1t b1tVar = (b1t) f1tVar;
            if (set.isEmpty()) {
                return Next.m15608j();
            }
            return b1tVar.f22403a == 1 ? Next.m15605a(Collections.singleton(new y0t(1, set))) : Next.m15606h(t1t.m79883a(t1tVar, false, null, true, 3));
        }
        if (f1tVar instanceof d1t) {
            return Next.m15606h(t1t.m79883a(t1tVar, ((d1t) f1tVar).f44353a, null, false, 6));
        }
        if (f1tVar instanceof e1t) {
            return Next.m15606h(t1t.m79883a(t1tVar, false, ((e1t) f1tVar).f55249a, false, 5));
        }
        if (!(f1tVar instanceof c1t)) {
            throw new NoWhenBranchMatchedException();
        }
        t1t t1tVarM79883a = t1t.m79883a(t1tVar, false, null, false, 3);
        return ((c1t) f1tVar).f33183a ? Next.m15607i(t1tVarM79883a, Collections.singleton(new y0t(2, set))) : Next.m15606h(t1tVarM79883a);
    }
}
