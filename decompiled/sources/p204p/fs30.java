package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class fs30 implements ht30 {

    /* JADX INFO: renamed from: a */
    public final String f72759a;

    /* JADX INFO: renamed from: b */
    public final pf40 f72760b;

    public fs30(String str, pf40 pf40Var) {
        this.f72759a = str;
        this.f72760b = pf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs30)) {
            return false;
        }
        fs30 fs30Var = (fs30) obj;
        return wj50.m88271j(this.f72759a, fs30Var.f72759a) && wj50.m88271j(this.f72760b, fs30Var.f72760b);
    }

    public final int hashCode() {
        return Objects.hash(this.f72759a, this.f72760b);
    }
}
