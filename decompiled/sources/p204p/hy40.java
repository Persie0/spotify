package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hy40 implements Parcelable {
    public static final Parcelable.Creator<hy40> CREATOR = new y240(23);

    /* JADX INFO: renamed from: a */
    public final String f96459a;

    /* JADX INFO: renamed from: b */
    public final String f96460b;

    /* JADX INFO: renamed from: c */
    public final String f96461c;

    /* JADX INFO: renamed from: d */
    public final String f96462d;

    public hy40(String str, String str2, String str3, String str4) {
        this.f96459a = str;
        this.f96460b = str2;
        this.f96461c = str3;
        this.f96462d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy40)) {
            return false;
        }
        hy40 hy40Var = (hy40) obj;
        return wj50.m88271j(this.f96459a, hy40Var.f96459a) && wj50.m88271j(this.f96460b, hy40Var.f96460b) && wj50.m88271j(this.f96461c, hy40Var.f96461c) && wj50.m88271j(this.f96462d, hy40Var.f96462d);
    }

    public final int hashCode() {
        int iHashCode = this.f96459a.hashCode() * 31;
        String str = this.f96460b;
        return this.f96462d.hashCode() + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f96461c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96459a);
        parcel.writeString(this.f96460b);
        parcel.writeString(this.f96461c);
        parcel.writeString(this.f96462d);
    }
}
