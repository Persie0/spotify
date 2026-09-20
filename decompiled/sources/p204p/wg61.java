package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class wg61 implements fr70, Serializable {

    /* JADX INFO: renamed from: a */
    public eh00 f250996a;

    /* JADX INFO: renamed from: b */
    public volatile Object f250997b = hcj0.f89811P0;

    /* JADX INFO: renamed from: c */
    public final Object f250998c = this;

    public wg61(eh00 eh00Var) {
        this.f250996a = eh00Var;
    }

    private final Object writeReplace() {
        return new zq40(getValue());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88008a() {
        return this.f250997b != hcj0.f89811P0;
    }

    @Override // p204p.fr70
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f250997b;
        hcj0 hcj0Var = hcj0.f89811P0;
        if (obj != hcj0Var) {
            return obj;
        }
        synchronized (this.f250998c) {
            objInvoke = this.f250997b;
            if (objInvoke == hcj0Var) {
                eh00 eh00Var = this.f250996a;
                wj50.m88279p(eh00Var);
                objInvoke = eh00Var.invoke();
                this.f250997b = objInvoke;
                this.f250996a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return m88008a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
