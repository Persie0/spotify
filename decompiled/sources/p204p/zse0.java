package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zse0 {

    /* JADX INFO: renamed from: a */
    public final List f285931a;

    /* JADX INFO: renamed from: b */
    public final List f285932b;

    /* JADX INFO: renamed from: c */
    public final List f285933c;

    public zse0(List list, List list2, List list3) {
        this.f285931a = list;
        this.f285932b = list2;
        this.f285933c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zse0)) {
            return false;
        }
        zse0 zse0Var = (zse0) obj;
        return wj50.m88271j(this.f285931a, zse0Var.f285931a) && wj50.m88271j(this.f285932b, zse0Var.f285932b) && wj50.m88271j(this.f285933c, zse0Var.f285933c);
    }

    public final int hashCode() {
        return this.f285933c.hashCode() + s571.m77244c(this.f285931a.hashCode() * 31, 31, this.f285932b);
    }
}
