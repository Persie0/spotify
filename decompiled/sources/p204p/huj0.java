package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class huj0 extends hqg1 {

    /* JADX INFO: renamed from: c */
    public final ArrayList f95413c;

    public huj0(ArrayList arrayList) {
        this.f95413c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof huj0) && this.f95413c.equals(((huj0) obj).f95413c);
    }

    public final int hashCode() {
        return this.f95413c.hashCode();
    }
}
