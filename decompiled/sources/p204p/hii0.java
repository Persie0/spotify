package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class hii0 {

    /* JADX INFO: renamed from: a */
    public final String f91824a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f91825b;

    public hii0(String str, ArrayList arrayList) {
        this.f91824a = str;
        this.f91825b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hii0)) {
            return false;
        }
        hii0 hii0Var = (hii0) obj;
        return this.f91824a.equals(hii0Var.f91824a) && this.f91825b.equals(hii0Var.f91825b);
    }

    public final int hashCode() {
        return this.f91825b.hashCode() + (this.f91824a.hashCode() * 31);
    }
}
