package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class tu80 extends av80 {

    /* JADX INFO: renamed from: a */
    public final int f223790a;

    /* JADX INFO: renamed from: b */
    public final List f223791b;

    public tu80(int i, List list) {
        this.f223790a = i;
        this.f223791b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu80)) {
            return false;
        }
        tu80 tu80Var = (tu80) obj;
        return this.f223790a == tu80Var.f223790a && wj50.m88271j(this.f223791b, tu80Var.f223791b);
    }

    public final int hashCode() {
        return this.f223791b.hashCode() + (Integer.hashCode(this.f223790a) * 31);
    }
}
