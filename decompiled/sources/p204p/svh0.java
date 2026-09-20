package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class svh0 {

    /* JADX INFO: renamed from: a */
    public final String f214439a;

    /* JADX INFO: renamed from: b */
    public final List f214440b;

    public svh0(String str, ro80 ro80Var) {
        this.f214439a = str;
        this.f214440b = ro80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svh0)) {
            return false;
        }
        svh0 svh0Var = (svh0) obj;
        return wj50.m88271j(this.f214439a, svh0Var.f214439a) && wj50.m88271j(this.f214440b, svh0Var.f214440b);
    }

    public final int hashCode() {
        String str = this.f214439a;
        return this.f214440b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
