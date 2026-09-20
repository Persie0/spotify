package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zae0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final zae0 f281052a = new zae0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        bbe0 bbe0Var = (bbe0) obj;
        xae0 xae0Var = (xae0) obj2;
        boolean z = xae0Var instanceof vae0;
        jnc1 jnc1Var = zmc1.f284218a;
        if (z) {
            if (((vae0) xae0Var).f239256a.length() == 0) {
                jnc1Var = rlc1.f200279a;
            }
            return Next.m15606h(bbe0.m28633c(bbe0Var, jnc1Var));
        }
        if (xae0Var instanceof uae0) {
            uae0 uae0Var = (uae0) xae0Var;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = uae0Var.f228483a;
            if (i == 1) {
                linkedHashSet.add(new qae0(bbe0Var.f25543a, uae0Var.f228484b));
            }
            if (yae0.f270876a[edb.m38547C(i)] != 1) {
                jnc1Var = dmc1.f50488a;
            }
            return Next.m15607i(bbe0.m28633c(bbe0Var, jnc1Var), linkedHashSet);
        }
        if (xae0Var instanceof wae0) {
            return Next.m15607i(bbe0.m28633c(bbe0Var, fnc1.f71263a), Collections.singleton(new rae0(((wae0) xae0Var).f249460a, bbe0Var.f25544b, bbe0Var.f25545c)));
        }
        if (xae0Var instanceof tae0) {
            return Next.m15606h(bbe0.m28633c(bbe0Var, enc1.f61140a));
        }
        if (xae0Var.equals(sae0.f207185b)) {
            return Next.m15606h(bbe0.m28633c(bbe0Var, bnc1.f28807a));
        }
        if (xae0Var.equals(sae0.f207184a)) {
            return Next.m15606h(bbe0.m28633c(bbe0Var, plc1.f178696a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
