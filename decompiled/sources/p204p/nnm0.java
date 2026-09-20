package p204p;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class nnm0 {

    /* JADX INFO: renamed from: a */
    public final zv41 f156449a = jag1.m52819d(gbu.f78413a);

    /* JADX INFO: renamed from: a */
    public final void m65211a(zam0 zam0Var, boolean z) {
        zv41 zv41Var;
        Object value;
        Set setM43734m1;
        do {
            zv41Var = this.f156449a;
            value = zv41Var.getValue();
            setM43734m1 = g6f.m43734m1((Set) value);
            if (z) {
                setM43734m1.add(zam0Var);
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                setM43734m1.remove(zam0Var);
            }
        } while (!zv41Var.m97089k(value, setM43734m1));
    }
}
