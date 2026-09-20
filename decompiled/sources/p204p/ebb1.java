package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ebb1 implements Update {

    /* JADX INFO: renamed from: a */
    public static final ebb1 f57878a = new ebb1();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        jbb1 jbb1Var = (jbb1) obj;
        dbb1 dbb1Var = (dbb1) obj2;
        boolean z = dbb1Var instanceof yab1;
        qab1 qab1Var = qab1.f186839a;
        if (z) {
            return Next.m15605a(Collections.singleton(qab1Var));
        }
        if (dbb1Var instanceof zab1) {
            return Next.m15605a(Collections.singleton(qab1Var));
        }
        if (dbb1Var instanceof abb1) {
            if (!(jbb1Var instanceof hbb1)) {
                if (jbb1Var instanceof ibb1) {
                    return Next.m15608j();
                }
                throw new NoWhenBranchMatchedException();
            }
            hbb1 hbb1Var = (hbb1) jbb1Var;
            gbb1 gbb1Var = hbb1Var.f89471c;
            return Next.m15605a(Collections.singleton(new pab1(gbb1Var.f78260c, gbb1Var.f78258a, gbb1Var.f78259b, hbb1Var.f89473e)));
        }
        if (dbb1Var instanceof cbb1) {
            return Next.m15608j();
        }
        if (!(dbb1Var instanceof bbb1)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(jbb1Var instanceof hbb1)) {
            if (jbb1Var instanceof ibb1) {
                return Next.m15608j();
            }
            throw new NoWhenBranchMatchedException();
        }
        hbb1 hbb1Var2 = (hbb1) jbb1Var;
        bbb1 bbb1Var = (bbb1) dbb1Var;
        return Next.m15606h(new hbb1(hbb1Var2.f89469a, hbb1Var2.f89470b, hbb1Var2.f89471c, bbb1Var.f25530a, bbb1Var.f25531b));
    }
}
