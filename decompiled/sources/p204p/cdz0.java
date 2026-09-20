package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cdz0 {

    /* JADX INFO: renamed from: a */
    public final ndz0 f36973a;

    /* JADX INFO: renamed from: b */
    public final ndz0 f36974b;

    public cdz0(ndz0 ndz0Var, ndz0 ndz0Var2) {
        this.f36973a = ndz0Var;
        this.f36974b = ndz0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cdz0.class == obj.getClass()) {
            cdz0 cdz0Var = (cdz0) obj;
            if (this.f36973a.equals(cdz0Var.f36973a) && this.f36974b.equals(cdz0Var.f36974b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36974b.hashCode() + (this.f36973a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        ndz0 ndz0Var = this.f36973a;
        sb.append(ndz0Var);
        ndz0 ndz0Var2 = this.f36974b;
        if (ndz0Var.equals(ndz0Var2)) {
            str = "";
        } else {
            str = ", " + ndz0Var2;
        }
        return dq60.m36616p(str, "]", sb);
    }
}
