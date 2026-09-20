package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ud1 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        td1 td1Var = (td1) obj2;
        if (td1Var instanceof sd1) {
            sd1 sd1Var = (sd1) td1Var;
            return Next.m15605a(Collections.singleton(new qd1(sd1Var.f207849a, sd1Var.f207850b, sd1Var.f207851c)));
        }
        if (!(td1Var instanceof rd1)) {
            throw new NoWhenBranchMatchedException();
        }
        rd1 rd1Var = (rd1) td1Var;
        return Next.m15605a(Collections.singleton(new pd1(rd1Var.f198005a, rd1Var.f198006b, rd1Var.f198007c)));
    }
}
