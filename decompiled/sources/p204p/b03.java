package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b03 {

    /* JADX INFO: renamed from: a */
    public final String f21735a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f21736b;

    public b03(String str, ArrayList arrayList) {
        this.f21735a = str;
        this.f21736b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03Var = (b03) obj;
        return wj50.m88271j(this.f21735a, b03Var.f21735a) && this.f21736b.equals(b03Var.f21736b);
    }

    public final int hashCode() {
        return this.f21736b.hashCode() + (this.f21735a.hashCode() * 31);
    }
}
