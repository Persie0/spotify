package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d3t implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        h3t h3tVar = (h3t) obj;
        p2t p2tVar = (p2t) obj2;
        if (p2tVar instanceof m2t) {
            m2t m2tVar = (m2t) p2tVar;
            return Next.m15606h(h3t.m46602a(h3tVar, null, m2tVar.f139459a, m2tVar.f139460b, false, 9));
        }
        if (p2tVar instanceof o2t) {
            return Next.m15606h(h3t.m46602a(h3tVar, ((o2t) p2tVar).f161147a, false, false, false, 14));
        }
        if (p2tVar instanceof n2t) {
            Set set = h3tVar.f87311a;
            return set.isEmpty() ? Next.m15608j() : Next.m15605a(Collections.singleton(new g2t(set)));
        }
        if (p2tVar instanceof k2t) {
            return Next.m15605a(Collections.singleton(new f2t(((k2t) p2tVar).f118687a)));
        }
        if (p2tVar instanceof l2t) {
            return Next.m15606h(h3t.m46602a(h3tVar, null, false, false, ((l2t) p2tVar).f129073a, 7));
        }
        throw new NoWhenBranchMatchedException();
    }
}
