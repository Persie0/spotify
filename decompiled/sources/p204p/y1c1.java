package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class y1c1 {

    /* JADX INFO: renamed from: a */
    public final String f268231a;

    /* JADX INFO: renamed from: b */
    public final List f268232b;

    public y1c1(String str, List list) {
        this.f268231a = str;
        this.f268232b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1c1)) {
            return false;
        }
        y1c1 y1c1Var = (y1c1) obj;
        return wj50.m88271j(this.f268231a, y1c1Var.f268231a) && wj50.m88271j(this.f268232b, y1c1Var.f268232b);
    }

    public final int hashCode() {
        return this.f268232b.hashCode() + (this.f268231a.hashCode() * 31);
    }
}
