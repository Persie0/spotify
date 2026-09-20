package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hkb implements okb {

    /* JADX INFO: renamed from: a */
    public final List f92404a;

    /* JADX INFO: renamed from: b */
    public final nkb f92405b;

    /* JADX INFO: renamed from: c */
    public final String f92406c;

    /* JADX INFO: renamed from: d */
    public final String f92407d;

    /* JADX INFO: renamed from: e */
    public final String f92408e;

    public hkb(List list, nkb nkbVar, String str, String str2, String str3) {
        this.f92404a = list;
        this.f92405b = nkbVar;
        this.f92406c = str;
        this.f92407d = str2;
        this.f92408e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m47752a() {
        return this.f92407d;
    }

    /* JADX INFO: renamed from: b */
    public final String m47753b() {
        return this.f92408e;
    }

    /* JADX INFO: renamed from: c */
    public final String m47754c() {
        return this.f92406c;
    }

    /* JADX INFO: renamed from: d */
    public final List m47755d() {
        return this.f92404a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkb)) {
            return false;
        }
        hkb hkbVar = (hkb) obj;
        return wj50.m88271j(this.f92404a, hkbVar.f92404a) && wj50.m88271j(this.f92405b, hkbVar.f92405b) && wj50.m88271j(this.f92406c, hkbVar.f92406c) && wj50.m88271j(this.f92407d, hkbVar.f92407d) && wj50.m88271j(this.f92408e, hkbVar.f92408e);
    }

    @Override // p204p.okb
    public final nkb getType() {
        return this.f92405b;
    }

    public final int hashCode() {
        int iHashCode = (this.f92405b.hashCode() + (this.f92404a.hashCode() * 31)) * 31;
        String str = this.f92406c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92407d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92408e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
