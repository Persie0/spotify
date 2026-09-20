package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ta11 {

    /* JADX INFO: renamed from: a */
    public final String f218417a;

    /* JADX INFO: renamed from: b */
    public final List f218418b;

    public ta11(String str, qf40 qf40Var) {
        this.f218417a = str;
        this.f218418b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta11)) {
            return false;
        }
        ta11 ta11Var = (ta11) obj;
        return wj50.m88271j(this.f218417a, ta11Var.f218417a) && wj50.m88271j(this.f218418b, ta11Var.f218418b);
    }

    public final int hashCode() {
        return this.f218418b.hashCode() + (this.f218417a.hashCode() * 31);
    }
}
