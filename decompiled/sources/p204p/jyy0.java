package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jyy0 implements Parcelable {
    public static final Parcelable.Creator<jyy0> CREATOR = new lpy0(6);

    /* JADX INFO: renamed from: a */
    public final String f117517a;

    /* JADX INFO: renamed from: b */
    public final String f117518b;

    /* JADX INFO: renamed from: c */
    public final String f117519c;

    /* JADX INFO: renamed from: d */
    public final boolean f117520d;

    /* JADX INFO: renamed from: e */
    public final boolean f117521e;

    /* JADX INFO: renamed from: f */
    public final nuf f117522f;

    public jyy0(String str, String str2, String str3, boolean z, boolean z2, nuf nufVar) {
        this.f117517a = str;
        this.f117518b = str2;
        this.f117519c = str3;
        this.f117520d = z;
        this.f117521e = z2;
        this.f117522f = nufVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyy0)) {
            return false;
        }
        jyy0 jyy0Var = (jyy0) obj;
        return wj50.m88271j(this.f117517a, jyy0Var.f117517a) && wj50.m88271j(this.f117518b, jyy0Var.f117518b) && wj50.m88271j(this.f117519c, jyy0Var.f117519c) && this.f117520d == jyy0Var.f117520d && this.f117521e == jyy0Var.f117521e && this.f117522f == jyy0Var.f117522f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f117517a.hashCode() * 31, 31, this.f117518b);
        String str = this.f117519c;
        int iM77245d = s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f117520d), 31, this.f117521e);
        nuf nufVar = this.f117522f;
        return iM77245d + (nufVar != null ? nufVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117517a);
        parcel.writeString(this.f117518b);
        parcel.writeString(this.f117519c);
        parcel.writeInt(this.f117520d ? 1 : 0);
        parcel.writeInt(this.f117521e ? 1 : 0);
        nuf nufVar = this.f117522f;
        if (nufVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(nufVar.name());
        }
    }

    public /* synthetic */ jyy0(String str, String str2, String str3, boolean z, nuf nufVar, int i) {
        this(str, str2, str3, z, false, (i & 32) != 0 ? null : nufVar);
    }
}
