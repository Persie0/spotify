package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class nu10 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        pu10 pu10Var = (pu10) obj;
        iu10 iu10Var = (iu10) obj2;
        if (iu10Var instanceof gu10) {
            return ((gu10) iu10Var).f84334a ? Next.m15607i(pu10.m71054a(pu10Var, 3), Collections.singleton(new eu10(true))) : Next.m15607i(pu10.m71054a(pu10Var, 4), Collections.singleton(new eu10(false)));
        }
        if (iu10Var instanceof hu10) {
            return Next.m15607i(pu10.m71054a(pu10Var, 2), Collections.singleton(new du10(((hu10) iu10Var).f95236a)));
        }
        if (iu10Var.equals(fu10.f73373a)) {
            return Next.m15607i(pu10.m71054a(pu10Var, 2), Collections.singleton(new cu10(pu10Var.f181303c, pu10Var.f181302b)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
