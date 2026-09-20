package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class t3c {

    /* JADX INFO: renamed from: a */
    public final String f216740a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f216741b;

    public t3c(String str, ArrayList arrayList) {
        this.f216740a = str;
        this.f216741b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3c)) {
            return false;
        }
        t3c t3cVar = (t3c) obj;
        return wj50.m88271j(this.f216740a, t3cVar.f216740a) && this.f216741b.equals(t3cVar.f216741b);
    }

    public final int hashCode() {
        return this.f216741b.hashCode() + (this.f216740a.hashCode() * 31);
    }
}
