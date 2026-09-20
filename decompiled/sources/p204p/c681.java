package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class c681 {

    /* JADX INFO: renamed from: a */
    public final String f34426a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f34427b;

    public c681(String str, ArrayList arrayList) {
        this.f34426a = str;
        this.f34427b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c681)) {
            return false;
        }
        c681 c681Var = (c681) obj;
        return wj50.m88271j(this.f34426a, c681Var.f34426a) && this.f34427b.equals(c681Var.f34427b);
    }

    public final int hashCode() {
        return this.f34427b.hashCode() + s571.m77243b(-244151317, 31, this.f34426a);
    }
}
