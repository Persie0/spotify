package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class h9d1 {

    /* JADX INFO: renamed from: a */
    public final String f88925a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f88926b;

    public h9d1(String str, ArrayList arrayList) {
        this.f88925a = str;
        this.f88926b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9d1)) {
            return false;
        }
        h9d1 h9d1Var = (h9d1) obj;
        return wj50.m88271j(this.f88925a, h9d1Var.f88925a) && this.f88926b.equals(h9d1Var.f88926b);
    }

    public final int hashCode() {
        return this.f88926b.hashCode() + (this.f88925a.hashCode() * 31);
    }
}
