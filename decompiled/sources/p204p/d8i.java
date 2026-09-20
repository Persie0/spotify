package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final x26 f46465a;

    public d8i(x26 x26Var) {
        this.f46465a = x26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8i) && wj50.m88271j(this.f46465a, ((d8i) obj).f46465a);
    }

    public final int hashCode() {
        return this.f46465a.hashCode();
    }
}
