package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class kaj {

    /* JADX INFO: renamed from: a */
    public final String f120917a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f120918b;

    public kaj(String str, ArrayList arrayList) {
        this.f120917a = str;
        this.f120918b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaj)) {
            return false;
        }
        kaj kajVar = (kaj) obj;
        return this.f120917a.equals(kajVar.f120917a) && this.f120918b.equals(kajVar.f120918b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + lq51.m59700f(this.f120918b, this.f120917a.hashCode() * 31, 31);
    }
}
