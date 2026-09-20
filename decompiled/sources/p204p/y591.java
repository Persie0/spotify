package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class y591 {

    /* JADX INFO: renamed from: a */
    public final Integer f269379a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f269380b;

    public y591(Integer num, ArrayList arrayList) {
        this.f269379a = num;
        this.f269380b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y591)) {
            return false;
        }
        y591 y591Var = (y591) obj;
        return wj50.m88271j(this.f269379a, y591Var.f269379a) && this.f269380b.equals(y591Var.f269380b);
    }

    public final int hashCode() {
        Integer num = this.f269379a;
        return this.f269380b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
