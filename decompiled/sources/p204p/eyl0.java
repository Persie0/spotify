package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class eyl0 {
    /* JADX INFO: renamed from: a */
    public final Object m40321a(gh00 gh00Var, gh00 gh00Var2) {
        if (this instanceof dyl0) {
            return gh00Var.invoke(this);
        }
        if (this instanceof byl0) {
            return gh00Var2.invoke(this);
        }
        throw new NoWhenBranchMatchedException();
    }
}
