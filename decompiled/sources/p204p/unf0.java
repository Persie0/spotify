package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class unf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f232162a;

    public unf0(d850 d850Var) {
        this.f232162a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unf0) && wj50.m88271j(this.f232162a, ((unf0) obj).f232162a);
    }

    public final int hashCode() {
        d850 d850Var = this.f232162a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
