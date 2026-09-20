package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class stj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f213920a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f213921b;

    public stj(String str, ArrayList arrayList) {
        this.f213920a = str;
        this.f213921b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stj)) {
            return false;
        }
        stj stjVar = (stj) obj;
        return this.f213920a.equals(stjVar.f213920a) && this.f213921b.equals(stjVar.f213921b);
    }

    public final int hashCode() {
        return this.f213921b.hashCode() + (this.f213920a.hashCode() * 31);
    }
}
