package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class gvz0 {

    /* JADX INFO: renamed from: a */
    public final String f84859a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f84860b;

    public gvz0(String str, ArrayList arrayList) {
        this.f84859a = str;
        this.f84860b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvz0)) {
            return false;
        }
        gvz0 gvz0Var = (gvz0) obj;
        return wj50.m88271j(this.f84859a, gvz0Var.f84859a) && this.f84860b.equals(gvz0Var.f84860b);
    }

    public final int hashCode() {
        return this.f84860b.hashCode() + (this.f84859a.hashCode() * 31);
    }
}
