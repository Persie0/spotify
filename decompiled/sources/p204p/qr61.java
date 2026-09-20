package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class qr61 {

    /* JADX INFO: renamed from: a */
    public final Object f191747a;

    /* JADX INFO: renamed from: b */
    public final ipg1 f191748b;

    /* JADX INFO: renamed from: c */
    public final Integer f191749c;

    public qr61(List list, ipg1 ipg1Var, Integer num) {
        this.f191747a = list;
        this.f191748b = ipg1Var;
        this.f191749c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr61)) {
            return false;
        }
        qr61 qr61Var = (qr61) obj;
        return this.f191747a.equals(qr61Var.f191747a) && wj50.m88271j(this.f191748b, qr61Var.f191748b) && wj50.m88271j(this.f191749c, qr61Var.f191749c);
    }

    public final int hashCode() {
        int iHashCode = (this.f191748b.hashCode() + (this.f191747a.hashCode() * 31)) * 31;
        Integer num = this.f191749c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
