package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class vsl {

    /* JADX INFO: renamed from: a */
    public final String f244458a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f244459b;

    public vsl(String str, ArrayList arrayList) {
        this.f244458a = str;
        this.f244459b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsl)) {
            return false;
        }
        vsl vslVar = (vsl) obj;
        return wj50.m88271j(this.f244458a, vslVar.f244458a) && this.f244459b.equals(vslVar.f244459b);
    }

    public final int hashCode() {
        return this.f244459b.hashCode() + (this.f244458a.hashCode() * 31);
    }
}
