package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mgf1 {

    /* JADX INFO: renamed from: a */
    public transient y7f1 f143464a;

    /* JADX INFO: renamed from: b */
    public transient C2485v7 f143465b;

    /* JADX INFO: renamed from: a */
    public final Map m61704a() {
        C2485v7 c2485v7 = this.f143465b;
        if (c2485v7 != null) {
            return c2485v7;
        }
        qgf1 qgf1Var = (qgf1) this;
        C2485v7 c2485v8 = new C2485v7(qgf1Var, qgf1Var.f188464c, 1);
        this.f143465b = c2485v8;
        return c2485v8;
    }

    /* JADX INFO: renamed from: b */
    public final Set m61705b() {
        y7f1 y7f1Var = this.f143464a;
        if (y7f1Var != null) {
            return y7f1Var;
        }
        qgf1 qgf1Var = (qgf1) this;
        y7f1 y7f1Var2 = new y7f1(qgf1Var, qgf1Var.f188464c);
        this.f143464a = y7f1Var2;
        return y7f1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgf1) {
            return m61704a().equals(((mgf1) obj).m61704a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C2485v7) m61704a()).f237997b.hashCode();
    }

    public final String toString() {
        return ((C2485v7) m61704a()).f237997b.toString();
    }
}
