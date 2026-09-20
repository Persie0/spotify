package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ie1 implements Parcelable {
    public static final Parcelable.Creator<ie1> CREATOR = new g11(18);

    /* JADX INFO: renamed from: a */
    public final String f101295a;

    /* JADX INFO: renamed from: b */
    public final String f101296b;

    /* JADX INFO: renamed from: c */
    public final String f101297c;

    /* JADX INFO: renamed from: d */
    public final boolean f101298d;

    public ie1(String str, String str2, String str3, boolean z) {
        this.f101295a = str;
        this.f101296b = str2;
        this.f101297c = str3;
        this.f101298d = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m50367c() {
        return this.f101296b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie1)) {
            return false;
        }
        ie1 ie1Var = (ie1) obj;
        return wj50.m88271j(this.f101295a, ie1Var.f101295a) && wj50.m88271j(this.f101296b, ie1Var.f101296b) && wj50.m88271j(this.f101297c, ie1Var.f101297c) && this.f101298d == ie1Var.f101298d;
    }

    /* JADX INFO: renamed from: g */
    public final String m50368g() {
        return this.f101295a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101298d) + s571.m77243b(s571.m77243b(this.f101295a.hashCode() * 31, 31, this.f101296b), 31, this.f101297c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f101295a);
        parcel.writeString(this.f101296b);
        parcel.writeString(this.f101297c);
        parcel.writeInt(this.f101298d ? 1 : 0);
    }
}
