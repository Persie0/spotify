package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class t5a0 {

    /* JADX INFO: renamed from: a */
    public final int f217255a;

    /* JADX INFO: renamed from: b */
    public final List f217256b;

    /* JADX INFO: renamed from: c */
    public final List f217257c;

    /* JADX INFO: renamed from: d */
    public final Integer f217258d;

    public t5a0(int i, List list, List list2, Integer num) {
        this.f217255a = i;
        this.f217256b = list;
        this.f217257c = list2;
        this.f217258d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5a0)) {
            return false;
        }
        t5a0 t5a0Var = (t5a0) obj;
        return this.f217255a == t5a0Var.f217255a && wj50.m88271j(this.f217256b, t5a0Var.f217256b) && wj50.m88271j(this.f217257c, t5a0Var.f217257c) && wj50.m88271j(this.f217258d, t5a0Var.f217258d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77244c(Integer.hashCode(this.f217255a) * 31, 31, this.f217256b), 31, this.f217257c);
        Integer num = this.f217258d;
        return iM77244c + (num == null ? 0 : num.hashCode());
    }
}
