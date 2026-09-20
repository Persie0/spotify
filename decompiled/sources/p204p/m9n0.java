package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class m9n0 extends v9n0 {
    public static final Parcelable.Creator<m9n0> CREATOR = new pum0(29);

    /* JADX INFO: renamed from: b */
    public final String f141346b;

    /* JADX INFO: renamed from: c */
    public final String f141347c;

    public m9n0(String str, String str2) {
        super(str);
        this.f141346b = str;
        this.f141347c = str2;
    }

    @Override // p204p.v9n0
    /* JADX INFO: renamed from: c */
    public final String mo55840c() {
        return this.f141346b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9n0)) {
            return false;
        }
        m9n0 m9n0Var = (m9n0) obj;
        return wj50.m88271j(this.f141346b, m9n0Var.f141346b) && wj50.m88271j(this.f141347c, m9n0Var.f141347c);
    }

    public final int hashCode() {
        int iHashCode = this.f141346b.hashCode() * 31;
        String str = this.f141347c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f141346b);
        parcel.writeString(this.f141347c);
    }
}
