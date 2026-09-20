package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class puh implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f181448a;

    /* JADX INFO: renamed from: b */
    public final String f181449b;

    /* JADX INFO: renamed from: c */
    public final String f181450c;

    /* JADX INFO: renamed from: d */
    public final int f181451d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f181452e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f181453f;

    /* JADX INFO: renamed from: g */
    public final String f181454g;

    /* JADX INFO: renamed from: h */
    public final Long f181455h;

    public puh(String str, String str2, String str3, int i, ArrayList arrayList, ArrayList arrayList2, String str4, Long l) {
        this.f181448a = str;
        this.f181449b = str2;
        this.f181450c = str3;
        this.f181451d = i;
        this.f181452e = arrayList;
        this.f181453f = arrayList2;
        this.f181454g = str4;
        this.f181455h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puh)) {
            return false;
        }
        puh puhVar = (puh) obj;
        return wj50.m88271j(this.f181448a, puhVar.f181448a) && wj50.m88271j(this.f181449b, puhVar.f181449b) && wj50.m88271j(this.f181450c, puhVar.f181450c) && this.f181451d == puhVar.f181451d && this.f181452e.equals(puhVar.f181452e) && this.f181453f.equals(puhVar.f181453f) && wj50.m88271j(this.f181454g, puhVar.f181454g) && wj50.m88271j(this.f181455h, puhVar.f181455h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(lq51.m59700f(this.f181453f, lq51.m59700f(this.f181452e, f710.m40938f(this.f181451d, s571.m77243b(s571.m77243b(this.f181448a.hashCode() * 31, 31, this.f181449b), 31, this.f181450c), 31), 31), 31), 31, this.f181454g);
        Long l = this.f181455h;
        return iM77243b + (l == null ? 0 : l.hashCode());
    }
}
