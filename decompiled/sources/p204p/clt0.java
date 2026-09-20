package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class clt0 implements flt0 {
    public static final Parcelable.Creator<clt0> CREATOR = new vit0(2);

    /* JADX INFO: renamed from: a */
    public final String f39382a;

    /* JADX INFO: renamed from: b */
    public final int f39383b;

    /* JADX INFO: renamed from: c */
    public final int f39384c;

    /* JADX INFO: renamed from: d */
    public final String f39385d;

    /* JADX INFO: renamed from: e */
    public final String f39386e;

    public clt0(int i, int i2, String str, String str2, String str3) {
        this.f39382a = str;
        this.f39383b = i;
        this.f39384c = i2;
        this.f39385d = str2;
        this.f39386e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clt0)) {
            return false;
        }
        clt0 clt0Var = (clt0) obj;
        return wj50.m88271j(this.f39382a, clt0Var.f39382a) && this.f39383b == clt0Var.f39383b && this.f39384c == clt0Var.f39384c && wj50.m88271j(this.f39385d, clt0Var.f39385d) && wj50.m88271j(this.f39386e, clt0Var.f39386e);
    }

    public final int hashCode() {
        return this.f39386e.hashCode() + s571.m77243b(mt60.m62800g(this.f39384c, mt60.m62800g(this.f39383b, this.f39382a.hashCode() * 31, 31), 31), 31, this.f39385d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39382a);
        parcel.writeInt(this.f39383b);
        parcel.writeInt(this.f39384c);
        parcel.writeString(this.f39385d);
        parcel.writeString(this.f39386e);
    }
}
