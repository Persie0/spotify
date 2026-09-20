package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cq50 implements br50, Parcelable {
    public static final Parcelable.Creator<cq50> CREATOR = new gd50(22);

    /* JADX INFO: renamed from: a */
    public final String f40736a;

    /* JADX INFO: renamed from: b */
    public final String f40737b;

    /* JADX INFO: renamed from: c */
    public final String f40738c;

    /* JADX INFO: renamed from: d */
    public final boolean f40739d;

    /* JADX INFO: renamed from: e */
    public final boolean f40740e;

    /* JADX INFO: renamed from: f */
    public final List f40741f;

    /* JADX INFO: renamed from: g */
    public final int f40742g;

    /* JADX INFO: renamed from: h */
    public final List f40743h;

    public cq50(int i, String str, String str2, String str3, List list, List list2, boolean z, boolean z2) {
        this.f40736a = str;
        this.f40737b = str2;
        this.f40738c = str3;
        this.f40739d = z;
        this.f40740e = z2;
        this.f40741f = list;
        this.f40742g = i;
        this.f40743h = list2;
    }

    /* JADX INFO: renamed from: c */
    public static cq50 m33593c(cq50 cq50Var, int i) {
        return new cq50(i, cq50Var.f40736a, cq50Var.f40737b, cq50Var.f40738c, cq50Var.f40741f, cq50Var.f40743h, cq50Var.f40739d, cq50Var.f40740e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq50)) {
            return false;
        }
        cq50 cq50Var = (cq50) obj;
        return wj50.m88271j(this.f40736a, cq50Var.f40736a) && wj50.m88271j(this.f40737b, cq50Var.f40737b) && wj50.m88271j(this.f40738c, cq50Var.f40738c) && this.f40739d == cq50Var.f40739d && this.f40740e == cq50Var.f40740e && wj50.m88271j(this.f40741f, cq50Var.f40741f) && this.f40742g == cq50Var.f40742g && wj50.m88271j(this.f40743h, cq50Var.f40743h);
    }

    @Override // p204p.br50
    public final String getImageUri() {
        return this.f40738c;
    }

    @Override // p204p.br50
    public final String getName() {
        return this.f40737b;
    }

    @Override // p204p.br50
    public final String getUri() {
        return this.f40736a;
    }

    public final int hashCode() {
        return this.f40743h.hashCode() + f710.m40938f(this.f40742g, s571.m77244c(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f40736a.hashCode() * 31, 31, this.f40737b), 31, this.f40738c), 31, this.f40739d), 31, this.f40740e), 31, this.f40741f), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f40736a);
        parcel.writeString(this.f40737b);
        parcel.writeString(this.f40738c);
        parcel.writeInt(this.f40739d ? 1 : 0);
        parcel.writeInt(this.f40740e ? 1 : 0);
        parcel.writeStringList(this.f40741f);
        int i2 = this.f40742g;
        if (i2 == 1) {
            str = "NOT_APPLICABLE";
        } else if (i2 == 2) {
            str = "ALBUM";
        } else if (i2 == 3) {
            str = "SINGLE";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "APPEARS_ON";
        }
        parcel.writeString(str);
        parcel.writeStringList(this.f40743h);
    }
}
