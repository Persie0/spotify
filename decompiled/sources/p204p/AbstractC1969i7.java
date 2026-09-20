package p204p;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: p.i7 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1969i7 implements qkq, ghz, ld21, en91, sr60 {

    /* JADX INFO: renamed from: a */
    public final lpv0 f99384a;

    public AbstractC1969i7(eh00 eh00Var) {
        lpv0 lpv0VarM56357t = null;
        lpv0 lpv0Var = eh00Var instanceof lpv0 ? (lpv0) eh00Var : null;
        if (lpv0Var != null) {
            lpv0VarM56357t = lpv0Var;
        } else if (eh00Var != null) {
            lpv0VarM56357t = kgg1.m56357t(null, eh00Var);
        }
        this.f99384a = lpv0VarM56357t;
    }

    /* JADX INFO: renamed from: A */
    public abstract up60 mo32812A();

    /* JADX INFO: renamed from: C */
    public abstract boolean mo32813C();

    /* JADX INFO: renamed from: G */
    public abstract boolean mo32814G();

    /* JADX INFO: renamed from: I */
    public abstract boolean mo32815I();

    /* JADX INFO: renamed from: M */
    public abstract boolean mo32816M();

    /* JADX INFO: renamed from: N */
    public abstract AbstractC1969i7 mo32817N();

    /* JADX INFO: renamed from: O */
    public abstract AbstractC1969i7 mo32818O(boolean z);

    /* JADX INFO: renamed from: P */
    public abstract AbstractC1969i7 mo32819P(boolean z);

    /* JADX INFO: renamed from: Q */
    public abstract AbstractC1969i7 mo32820Q();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC1969i7) && akg1.m26238w(oyq0.f171867g, this, (kd70) obj);
    }

    /* JADX INFO: renamed from: g */
    public abstract sr60 mo32821g();

    public int hashCode() {
        kq60 kq60VarMo27067y = mo27067y();
        return Boolean.hashCode(mo27066q()) + ((mo27065K().hashCode() + ((kq60VarMo27067y != null ? kq60VarMo27067y.hashCode() : 0) * 31)) * 31);
    }

    /* JADX INFO: renamed from: p */
    public final Type m49825p() {
        lpv0 lpv0Var = this.f99384a;
        if (lpv0Var != null) {
            return (Type) lpv0Var.invoke();
        }
        return null;
    }

    public String toString() {
        return qyq0.m74225j(this, false);
    }
}
