package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class b67 extends zq50 {
    public static final Parcelable.Creator<b67> CREATOR = new fi6(26);

    /* JADX INFO: renamed from: a */
    public final String f23858a;

    /* JADX INFO: renamed from: b */
    public final String f23859b;

    /* JADX INFO: renamed from: c */
    public final boolean f23860c;

    public b67(String str, String str2, boolean z) {
        this.f23858a = str;
        this.f23859b = str2;
        this.f23860c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b67)) {
            return false;
        }
        b67 b67Var = (b67) obj;
        return wj50.m88271j(this.f23858a, b67Var.f23858a) && wj50.m88271j(this.f23859b, b67Var.f23859b) && this.f23860c == b67Var.f23860c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23860c) + s571.m77243b(this.f23858a.hashCode() * 31, 31, this.f23859b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23858a);
        parcel.writeString(this.f23859b);
        parcel.writeInt(this.f23860c ? 1 : 0);
    }
}
