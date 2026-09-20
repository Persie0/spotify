package p204p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public final class lt30 {

    /* JADX INFO: renamed from: a */
    public final int f136685a;

    /* JADX INFO: renamed from: b */
    public final View f136686b;

    /* JADX INFO: renamed from: c */
    public final qj30 f136687c;

    /* JADX INFO: renamed from: d */
    public final sk30 f136688d;

    /* JADX INFO: renamed from: e */
    public cl8 f136689e;

    public lt30(int i, View view, qj30 qj30Var, sk30 sk30Var) {
        this.f136685a = i;
        view.getClass();
        this.f136686b = view;
        this.f136687c = qj30Var;
        sk30Var.getClass();
        this.f136688d = sk30Var;
        sk30Var.f209997j.mo50111n(view);
    }

    /* JADX INFO: renamed from: b */
    public static lt30 m59863b(int i, ViewGroup viewGroup, sk30 sk30Var) {
        qj30 qj30VarMo45025a = sk30Var.f209991d.mo45025a(i);
        if (qj30VarMo45025a == null) {
            qj30VarMo45025a = sk30Var.f209996i;
        }
        return new lt30(i, qj30VarMo45025a.mo34548b(viewGroup, sk30Var), qj30VarMo45025a, sk30Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m59864a(int i, fk30 fk30Var, mqr mqrVar) {
        this.f136689e = new cl8(fk30Var, i);
        sk30 sk30Var = this.f136688d;
        sk30Var.f209997j.getClass();
        this.f136687c.mo34549d(this.f136686b, fk30Var, sk30Var, mqrVar);
        sk30Var.f209997j.getClass();
    }

    /* JADX INFO: renamed from: c */
    public final int m59865c() {
        return this.f136685a;
    }

    /* JADX INFO: renamed from: d */
    public final cl8 m59866d() {
        cl8 cl8Var = this.f136689e;
        if (cl8Var != null) {
            return cl8Var;
        }
        throw new IllegalArgumentException("View not bound to any component!");
    }

    /* JADX INFO: renamed from: e */
    public final View m59867e() {
        return this.f136686b;
    }

    /* JADX INFO: renamed from: f */
    public final void m59868f(int... iArr) {
        this.f136687c.mo34550e(this.f136686b, (fk30) m59866d().f39207c, iArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("HubsViewHolder[");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" view: ");
        sb.append(this.f136686b);
        sb.append(", binder: ");
        sb.append(this.f136687c);
        sb.append(", binderId: ");
        sb.append(this.f136685a);
        if (this.f136689e != null) {
            sb.append(", position: ");
            sb.append(m59866d().f39206b);
            sb.append(", model: ");
            sb.append((fk30) m59866d().f39207c);
        } else {
            sb.append(", not bound");
        }
        sb.append(']');
        return sb.toString();
    }
}
