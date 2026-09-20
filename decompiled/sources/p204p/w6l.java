package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class w6l implements x6l {

    /* JADX INFO: renamed from: a */
    public final int f248415a;

    /* JADX INFO: renamed from: b */
    public final pla1 f248416b;

    /* JADX INFO: renamed from: c */
    public final boolean f248417c;

    /* JADX INFO: renamed from: d */
    public final boolean f248418d;

    /* JADX INFO: renamed from: e */
    public final String f248419e;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public w6l(int i, String str, pla1 pla1Var, boolean z, boolean z2) {
        this.f248415a = i;
        this.f248416b = pla1Var;
        this.f248417c = z;
        this.f248418d = z2;
        this.f248419e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6l)) {
            return false;
        }
        w6l w6lVar = (w6l) obj;
        return this.f248415a == w6lVar.f248415a && wj50.m88271j(this.f248416b, w6lVar.f248416b) && this.f248417c == w6lVar.f248417c && this.f248418d == w6lVar.f248418d && this.f248419e.equals(w6lVar.f248419e);
    }

    public final int hashCode() {
        return this.f248419e.hashCode() + s571.m77245d(s571.m77245d(ydj.m93448g(this.f248416b, Integer.hashCode(this.f248415a) * 31, 31), 31, this.f248417c), 31, this.f248418d);
    }
}
