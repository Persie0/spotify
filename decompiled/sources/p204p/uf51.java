package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uf51 implements Init {

    /* JADX INFO: renamed from: a */
    public static final uf51 f229688a = new uf51();

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public final First mo15576f0(Object obj) {
        long jPow;
        zf51 zf51Var = (zf51) obj;
        la51 la51Var = zf51Var.f282214a;
        if (!wj50.m88271j(la51Var, ia51.f100161a) && !wj50.m88271j(la51Var, ja51.f110326a)) {
            return First.m15574b(zf51Var);
        }
        int i = zf51Var.f282215b;
        if (i > 0) {
            if (i > 5) {
                i = 5;
            }
            jPow = (long) (Math.pow(2.0d, i) * 200);
        } else {
            jPow = 0;
        }
        return First.m15575c(zf51Var, Collections.singleton(new me51(jPow)));
    }
}
