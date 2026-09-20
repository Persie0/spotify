package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class v46 {

    /* JADX INFO: renamed from: a */
    public final String f237083a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f237084b;

    public v46(String str, ArrayList arrayList) {
        this.f237083a = str;
        this.f237084b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v46)) {
            return false;
        }
        v46 v46Var = (v46) obj;
        return wj50.m88271j(this.f237083a, v46Var.f237083a) && this.f237084b.equals(v46Var.f237084b);
    }

    public final int hashCode() {
        String str = this.f237083a;
        return this.f237084b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
