package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q7e0 {

    /* JADX INFO: renamed from: a */
    public final String f186083a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f186084b;

    /* JADX INFO: renamed from: c */
    public final un20 f186085c;

    public q7e0(String str, ArrayList arrayList, un20 un20Var) {
        this.f186083a = str;
        this.f186084b = arrayList;
        this.f186085c = un20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7e0)) {
            return false;
        }
        q7e0 q7e0Var = (q7e0) obj;
        return wj50.m88271j(this.f186083a, q7e0Var.f186083a) && this.f186084b.equals(q7e0Var.f186084b) && wj50.m88271j(this.f186085c, q7e0Var.f186085c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f186084b, this.f186083a.hashCode() * 31, 31);
        un20 un20Var = this.f186085c;
        return iM59700f + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
