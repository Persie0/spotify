package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u9t0 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        t9t0 t9t0Var = (t9t0) obj2;
        boolean z = ((x9t0) obj).f259446a;
        boolean z2 = t9t0Var instanceof p9t0;
        j9t0 j9t0Var = j9t0.f110247c;
        g9t0 g9t0Var = g9t0.f77872c;
        if (z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (z) {
                linkedHashSet.add(j9t0Var);
            }
            linkedHashSet.add(g9t0Var);
            return Next.m15605a(linkedHashSet);
        }
        if (t9t0Var instanceof o9t0) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            if (z) {
                linkedHashSet2.add(j9t0Var);
            }
            linkedHashSet2.add(g9t0Var);
            return Next.m15605a(linkedHashSet2);
        }
        if (t9t0Var instanceof s9t0) {
            return Next.m15605a(Collections.singleton(new h9t0(z)));
        }
        if (t9t0Var instanceof n9t0) {
            return !((n9t0) t9t0Var).f151858a ? Next.m15605a(Collections.singleton(g9t0Var)) : Next.m15608j();
        }
        if ((t9t0Var instanceof r9t0) || (t9t0Var instanceof q9t0)) {
            return Next.m15605a(Collections.singleton(g9t0Var));
        }
        throw new NoWhenBranchMatchedException();
    }
}
