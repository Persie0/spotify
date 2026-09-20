package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class b261 {

    /* JADX INFO: renamed from: a */
    public final String f22507a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f22508b;

    public b261(String str, ArrayList arrayList) {
        this.f22507a = str;
        this.f22508b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b261)) {
            return false;
        }
        b261 b261Var = (b261) obj;
        return this.f22507a.equals(b261Var.f22507a) && this.f22508b.equals(b261Var.f22508b);
    }

    public final int hashCode() {
        return this.f22508b.hashCode() + (this.f22507a.hashCode() * 31);
    }
}
