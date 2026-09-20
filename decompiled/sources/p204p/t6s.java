package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class t6s {

    /* JADX INFO: renamed from: a */
    public final String f217598a;

    /* JADX INFO: renamed from: b */
    public final String f217599b;

    /* JADX INFO: renamed from: c */
    public final List f217600c;

    /* JADX INFO: renamed from: d */
    public final ka80 f217601d;

    public t6s(String str, String str2, List list, ka80 ka80Var) {
        this.f217598a = str;
        this.f217599b = str2;
        this.f217600c = list;
        this.f217601d = ka80Var;
    }

    /* JADX INFO: renamed from: a */
    public final ka80 m80162a() {
        return this.f217601d;
    }

    /* JADX INFO: renamed from: b */
    public final String m80163b() {
        return this.f217599b;
    }

    /* JADX INFO: renamed from: c */
    public final List m80164c() {
        return this.f217600c;
    }

    /* JADX INFO: renamed from: d */
    public final String m80165d() {
        return this.f217598a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6s)) {
            return false;
        }
        t6s t6sVar = (t6s) obj;
        return wj50.m88271j(this.f217598a, t6sVar.f217598a) && wj50.m88271j(this.f217599b, t6sVar.f217599b) && wj50.m88271j(this.f217600c, t6sVar.f217600c) && wj50.m88271j(this.f217601d, t6sVar.f217601d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(this.f217598a.hashCode() * 31, 31, this.f217599b), 31, this.f217600c);
        ka80 ka80Var = this.f217601d;
        return iM77244c + (ka80Var == null ? 0 : ka80Var.hashCode());
    }
}
