package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d33 implements Parcelable {
    public static final Parcelable.Creator<d33> CREATOR = new lb2(26);

    /* JADX INFO: renamed from: a */
    public final String f44752a;

    /* JADX INFO: renamed from: b */
    public final String f44753b;

    /* JADX INFO: renamed from: c */
    public final String f44754c;

    /* JADX INFO: renamed from: d */
    public final boolean f44755d;

    public d33(String str, String str2, String str3, boolean z) {
        this.f44752a = str;
        this.f44753b = str2;
        this.f44754c = str3;
        this.f44755d = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m34801c() {
        return this.f44754c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d33)) {
            return false;
        }
        d33 d33Var = (d33) obj;
        return wj50.m88271j(this.f44752a, d33Var.f44752a) && wj50.m88271j(this.f44753b, d33Var.f44753b) && wj50.m88271j(this.f44754c, d33Var.f44754c) && this.f44755d == d33Var.f44755d;
    }

    public final String getUri() {
        return this.f44752a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f44752a.hashCode() * 31, 31, this.f44753b);
        String str = this.f44754c;
        return Boolean.hashCode(this.f44755d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44752a);
        parcel.writeString(this.f44753b);
        parcel.writeString(this.f44754c);
        parcel.writeInt(this.f44755d ? 1 : 0);
    }

    public /* synthetic */ d33(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }
}
