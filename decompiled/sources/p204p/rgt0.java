package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class rgt0 {

    /* JADX INFO: renamed from: a */
    public final String f199013a;

    /* JADX INFO: renamed from: b */
    public final List f199014b;

    /* JADX INFO: renamed from: c */
    public final String f199015c;

    public rgt0(String str, List list, String str2) {
        this.f199013a = str;
        this.f199014b = list;
        this.f199015c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgt0)) {
            return false;
        }
        rgt0 rgt0Var = (rgt0) obj;
        return wj50.m88271j(this.f199013a, rgt0Var.f199013a) && wj50.m88271j(this.f199014b, rgt0Var.f199014b) && wj50.m88271j(this.f199015c, rgt0Var.f199015c);
    }

    public final int hashCode() {
        return this.f199015c.hashCode() + s571.m77244c(this.f199013a.hashCode() * 31, 31, this.f199014b);
    }
}
