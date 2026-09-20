package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class avv {

    /* JADX INFO: renamed from: a */
    public final String f20280a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f20281b;

    /* JADX INFO: renamed from: c */
    public final String f20282c;

    /* JADX INFO: renamed from: d */
    public final boolean f20283d;

    /* JADX INFO: renamed from: e */
    public final String f20284e;

    public avv(String str, String str2, String str3, ArrayList arrayList, boolean z) {
        this.f20280a = str;
        this.f20281b = arrayList;
        this.f20282c = str2;
        this.f20283d = z;
        this.f20284e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avv)) {
            return false;
        }
        avv avvVar = (avv) obj;
        return wj50.m88271j(this.f20280a, avvVar.f20280a) && this.f20281b.equals(avvVar.f20281b) && wj50.m88271j(this.f20282c, avvVar.f20282c) && this.f20283d == avvVar.f20283d && wj50.m88271j(this.f20284e, avvVar.f20284e);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f20281b, this.f20280a.hashCode() * 31, 31);
        String str = this.f20282c;
        int iM77245d = s571.m77245d((iM59700f + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20283d);
        String str2 = this.f20284e;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}
