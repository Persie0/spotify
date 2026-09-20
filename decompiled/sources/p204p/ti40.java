package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ti40 {

    /* JADX INFO: renamed from: a */
    public final String f220550a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f220551b;

    public ti40(String str, ArrayList arrayList) {
        this.f220550a = str;
        this.f220551b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti40)) {
            return false;
        }
        ti40 ti40Var = (ti40) obj;
        return wj50.m88271j(this.f220550a, ti40Var.f220550a) && this.f220551b.equals(ti40Var.f220551b);
    }

    public final int hashCode() {
        return this.f220551b.hashCode() + (this.f220550a.hashCode() * 31);
    }
}
