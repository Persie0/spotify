package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class w241 implements Parcelable {
    public static final Parcelable.Creator<w241> CREATOR = new ln31(18);

    /* JADX INFO: renamed from: a */
    public final String f247226a;

    /* JADX INFO: renamed from: b */
    public final int f247227b;

    /* JADX INFO: renamed from: c */
    public final String f247228c;

    public w241(String str, int i, String str2) {
        this.f247226a = str;
        this.f247227b = i;
        this.f247228c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w241)) {
            return false;
        }
        w241 w241Var = (w241) obj;
        return wj50.m88271j(this.f247226a, w241Var.f247226a) && this.f247227b == w241Var.f247227b && wj50.m88271j(this.f247228c, w241Var.f247228c);
    }

    public final int hashCode() {
        return this.f247228c.hashCode() + f710.m40938f(this.f247227b, this.f247226a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f247226a);
        if (this.f247227b != 1) {
            throw null;
        }
        parcel.writeString("OptIn");
        parcel.writeString(this.f247228c);
    }
}
