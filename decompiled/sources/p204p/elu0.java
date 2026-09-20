package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class elu0 {

    /* JADX INFO: renamed from: a */
    public final String f60758a;

    /* JADX INFO: renamed from: b */
    public final String f60759b;

    /* JADX INFO: renamed from: c */
    public final boolean f60760c;

    public elu0(String str, String str2, boolean z) {
        this.f60758a = str;
        this.f60759b = str2;
        this.f60760c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elu0)) {
            return false;
        }
        elu0 elu0Var = (elu0) obj;
        return wj50.m88271j(this.f60758a, elu0Var.f60758a) && wj50.m88271j(this.f60759b, elu0Var.f60759b) && this.f60760c == elu0Var.f60760c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60760c) + s571.m77243b(this.f60758a.hashCode() * 31, 31, this.f60759b);
    }
}
