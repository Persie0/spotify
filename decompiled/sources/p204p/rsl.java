package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class rsl {

    /* JADX INFO: renamed from: a */
    public final String f202345a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f202346b;

    public rsl(String str, ArrayList arrayList) {
        this.f202345a = str;
        this.f202346b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsl)) {
            return false;
        }
        rsl rslVar = (rsl) obj;
        return wj50.m88271j(this.f202345a, rslVar.f202345a) && this.f202346b.equals(rslVar.f202346b);
    }

    public final int hashCode() {
        return this.f202346b.hashCode() + (this.f202345a.hashCode() * 31);
    }
}
