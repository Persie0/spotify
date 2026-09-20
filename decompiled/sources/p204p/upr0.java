package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class upr0 implements Parcelable {
    public static final Parcelable.Creator<upr0> CREATOR = new uir0(7);

    /* JADX INFO: renamed from: a */
    public final String f232811a;

    /* JADX INFO: renamed from: b */
    public final String f232812b;

    /* JADX INFO: renamed from: c */
    public final String f232813c;

    /* JADX INFO: renamed from: d */
    public final boolean f232814d;

    public upr0(String str, String str2, String str3, boolean z) {
        this.f232811a = str;
        this.f232812b = str2;
        this.f232813c = str3;
        this.f232814d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upr0)) {
            return false;
        }
        upr0 upr0Var = (upr0) obj;
        return wj50.m88271j(this.f232811a, upr0Var.f232811a) && wj50.m88271j(this.f232812b, upr0Var.f232812b) && wj50.m88271j(this.f232813c, upr0Var.f232813c) && this.f232814d == upr0Var.f232814d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f232811a.hashCode() * 31, 31, this.f232812b);
        String str = this.f232813c;
        return Boolean.hashCode(this.f232814d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f232811a);
        parcel.writeString(this.f232812b);
        parcel.writeString(this.f232813c);
        parcel.writeInt(this.f232814d ? 1 : 0);
    }
}
