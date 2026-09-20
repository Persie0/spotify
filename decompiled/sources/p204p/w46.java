package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w46 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f247713a;

    /* JADX INFO: renamed from: b */
    public final String f247714b;

    /* JADX INFO: renamed from: c */
    public final wzk f247715c;

    /* JADX INFO: renamed from: d */
    public final List f247716d;

    /* JADX INFO: renamed from: e */
    public final List f247717e;

    /* JADX INFO: renamed from: f */
    public final List f247718f;

    /* JADX INFO: renamed from: g */
    public final List f247719g;

    public w46(String str, String str2, wzk wzkVar, List list, List list2, List list3, List list4) {
        this.f247713a = str;
        this.f247714b = str2;
        this.f247715c = wzkVar;
        this.f247716d = list;
        this.f247717e = list2;
        this.f247718f = list3;
        this.f247719g = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w46)) {
            return false;
        }
        w46 w46Var = (w46) obj;
        return wj50.m88271j(this.f247713a, w46Var.f247713a) && wj50.m88271j(this.f247714b, w46Var.f247714b) && wj50.m88271j(this.f247715c, w46Var.f247715c) && wj50.m88271j(this.f247716d, w46Var.f247716d) && wj50.m88271j(this.f247717e, w46Var.f247717e) && wj50.m88271j(this.f247718f, w46Var.f247718f) && wj50.m88271j(this.f247719g, w46Var.f247719g);
    }

    public final int hashCode() {
        return this.f247719g.hashCode() + s571.m77244c(s571.m77244c(s571.m77244c((this.f247715c.hashCode() + s571.m77243b(this.f247713a.hashCode() * 31, 31, this.f247714b)) * 31, 31, this.f247716d), 31, this.f247717e), 31, this.f247718f);
    }
}
