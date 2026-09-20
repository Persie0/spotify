package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wme0 implements ene0 {

    /* JADX INFO: renamed from: a */
    public final z650 f252843a;

    public wme0(z650 z650Var) {
        this.f252843a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wme0) && wj50.m88271j(this.f252843a, ((wme0) obj).f252843a);
    }

    public final int hashCode() {
        z650 z650Var = this.f252843a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
