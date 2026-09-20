package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class hjq0 {

    /* JADX INFO: renamed from: a */
    public final String f92219a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f92220b;

    public hjq0(String str, ArrayList arrayList) {
        this.f92219a = str;
        this.f92220b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjq0)) {
            return false;
        }
        hjq0 hjq0Var = (hjq0) obj;
        return wj50.m88271j(this.f92219a, hjq0Var.f92219a) && this.f92220b.equals(hjq0Var.f92220b);
    }

    public final int hashCode() {
        String str = this.f92219a;
        return this.f92220b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
