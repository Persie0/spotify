package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class t4q {

    /* JADX INFO: renamed from: a */
    public final x93 f217055a;

    /* JADX INFO: renamed from: b */
    public final List f217056b;

    /* JADX INFO: renamed from: c */
    public final boolean f217057c;

    public t4q(x93 x93Var, List list, boolean z) {
        this.f217055a = x93Var;
        this.f217056b = list;
        this.f217057c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4q)) {
            return false;
        }
        t4q t4qVar = (t4q) obj;
        return this.f217055a == t4qVar.f217055a && wj50.m88271j(this.f217056b, t4qVar.f217056b) && this.f217057c == t4qVar.f217057c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217057c) + s571.m77244c(this.f217055a.hashCode() * 31, 31, this.f217056b);
    }
}
