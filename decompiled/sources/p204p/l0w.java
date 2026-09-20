package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l0w implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f128523a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f128524b;

    /* JADX INFO: renamed from: c */
    public final String f128525c;

    /* JADX INFO: renamed from: d */
    public final String f128526d;

    public l0w(int i, String str, String str2, ArrayList arrayList) {
        this.f128523a = i;
        this.f128524b = arrayList;
        this.f128525c = str;
        this.f128526d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0w)) {
            return false;
        }
        l0w l0wVar = (l0w) obj;
        return this.f128523a == l0wVar.f128523a && this.f128524b.equals(l0wVar.f128524b) && wj50.m88271j(this.f128525c, l0wVar.f128525c) && wj50.m88271j(this.f128526d, l0wVar.f128526d);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f128524b, Integer.hashCode(this.f128523a) * 31, 31);
        String str = this.f128525c;
        return this.f128526d.hashCode() + ((iM59700f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
