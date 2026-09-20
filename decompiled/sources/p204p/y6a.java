package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class y6a implements z6a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f269713a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f269714b;

    public y6a(ArrayList arrayList, ArrayList arrayList2) {
        this.f269713a = arrayList;
        this.f269714b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6a)) {
            return false;
        }
        y6a y6aVar = (y6a) obj;
        return this.f269713a.equals(y6aVar.f269713a) && this.f269714b.equals(y6aVar.f269714b);
    }

    public final int hashCode() {
        return this.f269714b.hashCode() + (this.f269713a.hashCode() * 31);
    }
}
