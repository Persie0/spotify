package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class i0m {

    /* JADX INFO: renamed from: a */
    public final j9c f97266a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f97267b;

    public i0m(j9c j9cVar, ArrayList arrayList) {
        this.f97266a = j9cVar;
        this.f97267b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0m)) {
            return false;
        }
        i0m i0mVar = (i0m) obj;
        return wj50.m88271j(this.f97266a, i0mVar.f97266a) && this.f97267b.equals(i0mVar.f97267b);
    }

    public final int hashCode() {
        return this.f97267b.hashCode() + (this.f97266a.hashCode() * 31);
    }
}
