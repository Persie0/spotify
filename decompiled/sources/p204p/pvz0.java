package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class pvz0 extends qvz0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f181868a;

    /* JADX INFO: renamed from: b */
    public final String f181869b;

    public pvz0(ArrayList arrayList, String str) {
        this.f181868a = arrayList;
        this.f181869b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvz0)) {
            return false;
        }
        pvz0 pvz0Var = (pvz0) obj;
        return this.f181868a.equals(pvz0Var.f181868a) && wj50.m88271j(this.f181869b, pvz0Var.f181869b);
    }

    public final int hashCode() {
        return this.f181869b.hashCode() + (this.f181868a.hashCode() * 31);
    }
}
