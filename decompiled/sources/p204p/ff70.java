package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ff70 implements Parcelable {
    public static final Parcelable.Creator<ff70> CREATOR = new w270(8);

    /* JADX INFO: renamed from: a */
    public final String f68928a;

    /* JADX INFO: renamed from: b */
    public final boolean f68929b;

    /* JADX INFO: renamed from: c */
    public final boolean f68930c;

    /* JADX INFO: renamed from: d */
    public final String f68931d;

    public ff70(String str, boolean z, String str2, boolean z2) {
        this.f68928a = str;
        this.f68929b = z;
        this.f68930c = z2;
        this.f68931d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff70)) {
            return false;
        }
        ff70 ff70Var = (ff70) obj;
        return wj50.m88271j(this.f68928a, ff70Var.f68928a) && this.f68929b == ff70Var.f68929b && this.f68930c == ff70Var.f68930c && wj50.m88271j(this.f68931d, ff70Var.f68931d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(this.f68928a.hashCode() * 31, 31, this.f68929b), 31, this.f68930c);
        String str = this.f68931d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68928a);
        parcel.writeInt(this.f68929b ? 1 : 0);
        parcel.writeInt(this.f68930c ? 1 : 0);
        parcel.writeString(this.f68931d);
    }
}
