package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v120 implements Init {

    /* JADX INFO: renamed from: a */
    public static final v120 f236223a = new v120();

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public final First mo15576f0(Object obj) {
        u120 u120Var = (u120) obj;
        int iOrdinal = u120Var.f225657a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return First.m15575c(u120Var, Collections.singleton(yo9.f274601b));
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    String str = u120Var.f225663g;
                    if (str != null) {
                        return First.m15575c(u120Var, Collections.singleton(new cp9(str)));
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return First.m15574b(u120Var);
    }
}
