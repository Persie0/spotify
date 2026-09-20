package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class yev0 {

    /* JADX INFO: renamed from: a */
    public final List f272067a;

    /* JADX INFO: renamed from: b */
    public final int f272068b;

    public yev0(int i, List list) {
        this.f272067a = list;
        this.f272068b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m93534a() {
        return this.f272068b;
    }

    /* JADX INFO: renamed from: b */
    public final List m93535b() {
        return this.f272067a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yev0)) {
            return false;
        }
        yev0 yev0Var = (yev0) obj;
        return wj50.m88271j(this.f272067a, yev0Var.f272067a) && this.f272068b == yev0Var.f272068b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f272068b) + (this.f272067a.hashCode() * 31);
    }
}
