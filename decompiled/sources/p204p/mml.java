package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mml {

    /* JADX INFO: renamed from: a */
    public final String f145172a;

    /* JADX INFO: renamed from: b */
    public final String f145173b;

    /* JADX INFO: renamed from: c */
    public final String f145174c;

    /* JADX INFO: renamed from: d */
    public final String f145175d;

    /* JADX INFO: renamed from: e */
    public final String f145176e;

    /* JADX INFO: renamed from: f */
    public final List f145177f;

    public mml(String str, String str2, String str3, String str4, List list, String str5) {
        this.f145172a = str;
        this.f145173b = str2;
        this.f145174c = str3;
        this.f145175d = str4;
        this.f145176e = str5;
        this.f145177f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mml)) {
            return false;
        }
        mml mmlVar = (mml) obj;
        return wj50.m88271j(this.f145172a, mmlVar.f145172a) && wj50.m88271j(this.f145173b, mmlVar.f145173b) && wj50.m88271j(this.f145174c, mmlVar.f145174c) && wj50.m88271j(this.f145175d, mmlVar.f145175d) && wj50.m88271j(this.f145176e, mmlVar.f145176e) && wj50.m88271j(this.f145177f, mmlVar.f145177f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f145172a.hashCode() * 31, 31, this.f145173b), 31, this.f145174c);
        String str = this.f145175d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145176e;
        return this.f145177f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
