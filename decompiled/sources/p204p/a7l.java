package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a7l implements b7l {

    /* JADX INFO: renamed from: a */
    public final Object f13089a;

    /* JADX INFO: renamed from: b */
    public final boolean f13090b;

    /* JADX INFO: renamed from: c */
    public final List f13091c;

    /* JADX INFO: renamed from: d */
    public final pla1 f13092d;

    /* JADX INFO: renamed from: e */
    public final String f13093e;

    /* JADX INFO: renamed from: f */
    public final String f13094f;

    /* JADX INFO: renamed from: g */
    public final boolean f13095g;

    public a7l(Map map, boolean z, ArrayList arrayList, pla1 pla1Var, String str, String str2, boolean z2) {
        this.f13089a = map;
        this.f13090b = z;
        this.f13091c = arrayList;
        this.f13092d = pla1Var;
        this.f13093e = str;
        this.f13094f = str2;
        this.f13095g = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.b7l
    /* JADX INFO: renamed from: a */
    public final Map mo24969a() {
        return this.f13089a;
    }

    @Override // p204p.b7l
    /* JADX INFO: renamed from: b */
    public final String mo24970b() {
        return this.f13094f;
    }

    @Override // p204p.b7l
    /* JADX INFO: renamed from: c */
    public final String mo24971c() {
        return this.f13093e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7l)) {
            return false;
        }
        a7l a7lVar = (a7l) obj;
        return this.f13089a.equals(a7lVar.f13089a) && this.f13090b == a7lVar.f13090b && wj50.m88271j(this.f13091c, a7lVar.f13091c) && wj50.m88271j(this.f13092d, a7lVar.f13092d) && wj50.m88271j(this.f13093e, a7lVar.f13093e) && wj50.m88271j(this.f13094f, a7lVar.f13094f) && this.f13095g == a7lVar.f13095g;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f13089a.hashCode() * 31, 31, this.f13090b);
        List list = this.f13091c;
        int iM93448g = ydj.m93448g(this.f13092d, (iM77245d + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str = this.f13093e;
        int iHashCode = (iM93448g + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13094f;
        return Boolean.hashCode(this.f13095g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
