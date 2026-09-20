package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class o3d1 implements Parcelable {
    public static final Parcelable.Creator<o3d1> CREATOR = new vmc1(23);

    /* JADX INFO: renamed from: a */
    public final String f161344a;

    /* JADX INFO: renamed from: b */
    public final String f161345b;

    /* JADX INFO: renamed from: c */
    public final String f161346c;

    public o3d1(String str, String str2, String str3) {
        this.f161344a = str;
        this.f161345b = str2;
        this.f161346c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m66190c() {
        return this.f161344a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3d1)) {
            return false;
        }
        o3d1 o3d1Var = (o3d1) obj;
        return wj50.m88271j(this.f161344a, o3d1Var.f161344a) && wj50.m88271j(this.f161345b, o3d1Var.f161345b) && wj50.m88271j(this.f161346c, o3d1Var.f161346c);
    }

    public final int hashCode() {
        return this.f161346c.hashCode() + s571.m77243b(this.f161344a.hashCode() * 31, 31, this.f161345b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161344a);
        parcel.writeString(this.f161345b);
        parcel.writeString(this.f161346c);
    }
}
