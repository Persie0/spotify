package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class wb6 {

    /* JADX INFO: renamed from: a */
    public final String f249699a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f249700b;

    public wb6(String str, ArrayList arrayList) {
        this.f249699a = str;
        this.f249700b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb6)) {
            return false;
        }
        wb6 wb6Var = (wb6) obj;
        return wj50.m88271j(this.f249699a, wb6Var.f249699a) && this.f249700b.equals(wb6Var.f249700b);
    }

    public final int hashCode() {
        return this.f249700b.hashCode() + (this.f249699a.hashCode() * 31);
    }
}
