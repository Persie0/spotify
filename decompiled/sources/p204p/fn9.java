package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fn9 implements Parcelable {
    public static final Parcelable.Creator<fn9> CREATOR = new dc9(10);

    /* JADX INFO: renamed from: a */
    public final String f71233a;

    /* JADX INFO: renamed from: b */
    public final String f71234b;

    /* JADX INFO: renamed from: c */
    public final String f71235c;

    public fn9(String str, String str2, String str3) {
        this.f71233a = str;
        this.f71234b = str2;
        this.f71235c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn9)) {
            return false;
        }
        fn9 fn9Var = (fn9) obj;
        return wj50.m88271j(this.f71233a, fn9Var.f71233a) && wj50.m88271j(this.f71234b, fn9Var.f71234b) && wj50.m88271j(this.f71235c, fn9Var.f71235c);
    }

    public final int hashCode() {
        int iHashCode = this.f71233a.hashCode() * 31;
        String str = this.f71234b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71235c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f71233a);
        parcel.writeString(this.f71234b);
        parcel.writeString(this.f71235c);
    }
}
