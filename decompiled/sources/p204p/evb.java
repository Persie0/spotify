package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class evb {

    /* JADX INFO: renamed from: a */
    public final fv51 f63198a;

    /* JADX INFO: renamed from: b */
    public final List f63199b;

    public evb(fv51 fv51Var, List list) {
        this.f63198a = fv51Var;
        this.f63199b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evb)) {
            return false;
        }
        evb evbVar = (evb) obj;
        return wj50.m88271j(this.f63198a, evbVar.f63198a) && wj50.m88271j(this.f63199b, evbVar.f63199b);
    }

    public final int hashCode() {
        fv51 fv51Var = this.f63198a;
        return this.f63199b.hashCode() + ((fv51Var == null ? 0 : fv51Var.hashCode()) * 31);
    }
}
