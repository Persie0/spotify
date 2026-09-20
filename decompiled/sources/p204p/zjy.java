package p204p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: classes8.dex */
public final class zjy {

    /* JADX INFO: renamed from: a */
    public final String f283562a;

    /* JADX INFO: renamed from: b */
    public final String f283563b;

    /* JADX INFO: renamed from: c */
    public final boolean f283564c;

    /* JADX INFO: renamed from: d */
    public final pqy f283565d;

    /* JADX INFO: renamed from: e */
    public final Mode f283566e;

    /* JADX INFO: renamed from: f */
    public final String f283567f;

    /* JADX INFO: renamed from: g */
    public final boolean f283568g;

    public zjy(String str, String str2, boolean z, pqy pqyVar, Mode mode, String str3, boolean z2) {
        this.f283562a = str;
        this.f283563b = str2;
        this.f283564c = z;
        this.f283565d = pqyVar;
        this.f283566e = mode;
        this.f283567f = str3;
        this.f283568g = z2;
    }

    /* JADX INFO: renamed from: a */
    public static zjy m96248a(zjy zjyVar, pqy pqyVar) {
        String str = zjyVar.f283562a;
        String str2 = zjyVar.f283563b;
        boolean z = zjyVar.f283564c;
        Mode mode = zjyVar.f283566e;
        String str3 = zjyVar.f283567f;
        boolean z2 = zjyVar.f283568g;
        zjyVar.getClass();
        return new zjy(str, str2, z, pqyVar, mode, str3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjy)) {
            return false;
        }
        zjy zjyVar = (zjy) obj;
        return wj50.m88271j(this.f283562a, zjyVar.f283562a) && wj50.m88271j(this.f283563b, zjyVar.f283563b) && this.f283564c == zjyVar.f283564c && this.f283565d == zjyVar.f283565d && this.f283566e == zjyVar.f283566e && wj50.m88271j(this.f283567f, zjyVar.f283567f) && this.f283568g == zjyVar.f283568g;
    }

    public final int hashCode() {
        int iHashCode = this.f283562a.hashCode() * 31;
        String str = this.f283563b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f283564c);
        pqy pqyVar = this.f283565d;
        return Boolean.hashCode(this.f283568g) + s571.m77243b((this.f283566e.hashCode() + ((iM77245d + (pqyVar != null ? pqyVar.hashCode() : 0)) * 31)) * 31, 31, this.f283567f);
    }

    public /* synthetic */ zjy(String str, String str2, boolean z, Mode mode, String str3, boolean z2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, (pqy) null, (i & 16) != 0 ? Mode.MARTINI : mode, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z2);
    }
}
