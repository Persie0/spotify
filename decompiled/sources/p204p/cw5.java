package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class cw5 implements Parcelable {
    public static final Parcelable.Creator<cw5> CREATOR = new vp5(8);

    /* JADX INFO: renamed from: a */
    public final String f42644a;

    /* JADX INFO: renamed from: b */
    public final String f42645b;

    /* JADX INFO: renamed from: c */
    public final boolean f42646c;

    /* JADX INFO: renamed from: d */
    public final String f42647d;

    public cw5(String str, String str2, boolean z, String str3) {
        this.f42644a = str;
        this.f42645b = str2;
        this.f42646c = z;
        this.f42647d = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m34090c() {
        return this.f42644a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw5)) {
            return false;
        }
        cw5 cw5Var = (cw5) obj;
        return wj50.m88271j(this.f42644a, cw5Var.f42644a) && wj50.m88271j(this.f42645b, cw5Var.f42645b) && this.f42646c == cw5Var.f42646c && wj50.m88271j(this.f42647d, cw5Var.f42647d);
    }

    /* JADX INFO: renamed from: g */
    public final String m34091g() {
        return this.f42645b;
    }

    public final int hashCode() {
        return this.f42647d.hashCode() + s571.m77245d(s571.m77243b(this.f42644a.hashCode() * 31, 31, this.f42645b), 31, this.f42646c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42644a);
        parcel.writeString(this.f42645b);
        parcel.writeInt(this.f42646c ? 1 : 0);
        parcel.writeString(this.f42647d);
    }
}
