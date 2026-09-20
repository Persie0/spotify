package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class wmp0 implements Parcelable {
    public static final Parcelable.Creator<wmp0> CREATOR = new igo0(29);

    /* JADX INFO: renamed from: a */
    public final String f252954a;

    /* JADX INFO: renamed from: b */
    public final String f252955b;

    /* JADX INFO: renamed from: c */
    public final String f252956c;

    /* JADX INFO: renamed from: d */
    public final String f252957d;

    public wmp0(String str, String str2, String str3, String str4) {
        this.f252954a = str;
        this.f252955b = str2;
        this.f252956c = str3;
        this.f252957d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmp0)) {
            return false;
        }
        wmp0 wmp0Var = (wmp0) obj;
        return wj50.m88271j(this.f252954a, wmp0Var.f252954a) && wj50.m88271j(this.f252955b, wmp0Var.f252955b) && wj50.m88271j(this.f252956c, wmp0Var.f252956c) && wj50.m88271j(this.f252957d, wmp0Var.f252957d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f252954a.hashCode() * 31, 31, this.f252955b);
        String str = this.f252956c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f252957d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f252954a);
        parcel.writeString(this.f252955b);
        parcel.writeString(this.f252956c);
        parcel.writeString(this.f252957d);
    }
}
