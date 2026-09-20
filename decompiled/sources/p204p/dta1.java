package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class dta1 implements eta1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f52756a;

    public dta1(ArrayList arrayList) {
        this.f52756a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dta1) && this.f52756a.equals(((dta1) obj).f52756a);
    }

    public final int hashCode() {
        return this.f52756a.hashCode();
    }
}
