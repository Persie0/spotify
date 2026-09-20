package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p3r implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f173690a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f173691b;

    public p3r(String str, ArrayList arrayList) {
        this.f173690a = str;
        this.f173691b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3r)) {
            return false;
        }
        p3r p3rVar = (p3r) obj;
        return wj50.m88271j(this.f173690a, p3rVar.f173690a) && this.f173691b.equals(p3rVar.f173691b);
    }

    public final int hashCode() {
        return this.f173691b.hashCode() + (this.f173690a.hashCode() * 31);
    }
}
