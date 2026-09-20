package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class d930 extends l930 {

    /* JADX INFO: renamed from: a */
    public final s730 f46652a;

    public d930(s730 s730Var) {
        this.f46652a = s730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d930) && wj50.m88271j(this.f46652a, ((d930) obj).f46652a);
    }

    public final int hashCode() {
        s730 s730Var = this.f46652a;
        if (s730Var == null) {
            return 0;
        }
        return s730Var.hashCode();
    }
}
