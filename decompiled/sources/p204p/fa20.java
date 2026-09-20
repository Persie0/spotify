package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fa20 {

    /* JADX INFO: renamed from: a */
    public final Object f67415a;

    /* JADX INFO: renamed from: b */
    public final String f67416b;

    public fa20(List list, String str) {
        this.f67415a = list;
        this.f67416b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa20)) {
            return false;
        }
        fa20 fa20Var = (fa20) obj;
        return this.f67415a.equals(fa20Var.f67415a) && wj50.m88271j(this.f67416b, fa20Var.f67416b);
    }

    public final int hashCode() {
        return this.f67416b.hashCode() + (this.f67415a.hashCode() * 31);
    }
}
