package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class r8j {

    /* JADX INFO: renamed from: a */
    public final String f196800a;

    /* JADX INFO: renamed from: b */
    public final String f196801b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f196802c;

    /* JADX INFO: renamed from: d */
    public ArrayList f196803d;

    public r8j(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.f196800a = str;
        this.f196801b = str2;
        this.f196802c = arrayList;
        this.f196803d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8j)) {
            return false;
        }
        r8j r8jVar = (r8j) obj;
        return wj50.m88271j(this.f196800a, r8jVar.f196800a) && wj50.m88271j(this.f196801b, r8jVar.f196801b) && this.f196802c.equals(r8jVar.f196802c) && this.f196803d.equals(r8jVar.f196803d);
    }

    public final int hashCode() {
        return this.f196803d.hashCode() + lq51.m59700f(this.f196802c, s571.m77243b(this.f196800a.hashCode() * 31, 31, this.f196801b), 31);
    }
}
