package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class t6l implements x6l {

    /* JADX INFO: renamed from: a */
    public final String f217571a;

    /* JADX INFO: renamed from: b */
    public final String f217572b;

    /* JADX INFO: renamed from: c */
    public final List f217573c;

    /* JADX INFO: renamed from: d */
    public final pla1 f217574d;

    /* JADX INFO: renamed from: e */
    public final boolean f217575e;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public t6l(String str, String str2, List list, pla1 pla1Var, boolean z) {
        this.f217571a = str;
        this.f217572b = str2;
        this.f217573c = list;
        this.f217574d = pla1Var;
        this.f217575e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6l)) {
            return false;
        }
        t6l t6lVar = (t6l) obj;
        return wj50.m88271j(this.f217571a, t6lVar.f217571a) && wj50.m88271j(this.f217572b, t6lVar.f217572b) && wj50.m88271j(this.f217573c, t6lVar.f217573c) && wj50.m88271j(this.f217574d, t6lVar.f217574d) && this.f217575e == t6lVar.f217575e;
    }

    public final int hashCode() {
        String str = this.f217571a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f217572b;
        return Boolean.hashCode(this.f217575e) + ydj.m93448g(this.f217574d, s571.m77244c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f217573c), 31);
    }
}
