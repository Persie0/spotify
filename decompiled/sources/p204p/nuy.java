package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class nuy implements uuy {
    public static final Parcelable.Creator<nuy> CREATOR = new eqy(5);

    /* JADX INFO: renamed from: a */
    public final String f158736a;

    /* JADX INFO: renamed from: b */
    public final String f158737b;

    /* JADX INFO: renamed from: c */
    public final String f158738c;

    /* JADX INFO: renamed from: d */
    public final boolean f158739d;

    public nuy(String str, String str2, String str3, boolean z) {
        this.f158736a = str;
        this.f158737b = str2;
        this.f158738c = str3;
        this.f158739d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuy)) {
            return false;
        }
        nuy nuyVar = (nuy) obj;
        return wj50.m88271j(this.f158736a, nuyVar.f158736a) && wj50.m88271j(this.f158737b, nuyVar.f158737b) && wj50.m88271j(this.f158738c, nuyVar.f158738c) && this.f158739d == nuyVar.f158739d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f158736a.hashCode() * 31, 31, this.f158737b);
        String str = this.f158738c;
        return Boolean.hashCode(this.f158739d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f158736a);
        parcel.writeString(this.f158737b);
        parcel.writeString(this.f158738c);
        parcel.writeInt(this.f158739d ? 1 : 0);
    }

    public /* synthetic */ nuy(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }
}
