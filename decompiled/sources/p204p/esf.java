package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class esf implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f62351a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f62352b;

    public esf(String str, ArrayList arrayList) {
        this.f62351a = str;
        this.f62352b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esf)) {
            return false;
        }
        esf esfVar = (esf) obj;
        return wj50.m88271j(this.f62351a, esfVar.f62351a) && this.f62352b.equals(esfVar.f62352b);
    }

    public final int hashCode() {
        return this.f62352b.hashCode() + (this.f62351a.hashCode() * 31);
    }
}
