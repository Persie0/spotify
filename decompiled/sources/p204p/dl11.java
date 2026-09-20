package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class dl11 implements Parcelable {
    public static final Parcelable.Creator<dl11> CREATOR = new u111(19);

    /* JADX INFO: renamed from: a */
    public final String f50085a;

    /* JADX INFO: renamed from: b */
    public final String f50086b;

    /* JADX INFO: renamed from: c */
    public final String f50087c;

    /* JADX INFO: renamed from: d */
    public final String f50088d;

    /* JADX INFO: renamed from: e */
    public final boolean f50089e;

    /* JADX INFO: renamed from: f */
    public final boolean f50090f;

    /* JADX INFO: renamed from: g */
    public final boolean f50091g;

    public dl11(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.f50085a = str;
        this.f50086b = str2;
        this.f50087c = str3;
        this.f50088d = str4;
        this.f50089e = z;
        this.f50090f = z2;
        this.f50091g = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl11)) {
            return false;
        }
        dl11 dl11Var = (dl11) obj;
        return wj50.m88271j(this.f50085a, dl11Var.f50085a) && wj50.m88271j(this.f50086b, dl11Var.f50086b) && wj50.m88271j(this.f50087c, dl11Var.f50087c) && wj50.m88271j(this.f50088d, dl11Var.f50088d) && this.f50089e == dl11Var.f50089e && this.f50090f == dl11Var.f50090f && this.f50091g == dl11Var.f50091g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f50085a.hashCode() * 31, 31, this.f50086b), 31, this.f50087c);
        String str = this.f50088d;
        return Boolean.hashCode(this.f50091g) + s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f50089e), 31, this.f50090f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50085a);
        parcel.writeString(this.f50086b);
        parcel.writeString(this.f50087c);
        parcel.writeString(this.f50088d);
        parcel.writeInt(this.f50089e ? 1 : 0);
        parcel.writeInt(this.f50090f ? 1 : 0);
        parcel.writeInt(this.f50091g ? 1 : 0);
    }
}
