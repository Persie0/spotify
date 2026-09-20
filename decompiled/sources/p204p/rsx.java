package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class rsx implements Parcelable {
    public static final Parcelable.Creator<rsx> CREATOR = new wfw(15);

    /* JADX INFO: renamed from: a */
    public final String f202446a;

    /* JADX INFO: renamed from: b */
    public final String f202447b;

    /* JADX INFO: renamed from: c */
    public final String f202448c;

    /* JADX INFO: renamed from: d */
    public final boolean f202449d;

    /* JADX INFO: renamed from: e */
    public final int f202450e;

    public rsx(int i, String str, String str2, boolean z, String str3) {
        this.f202446a = str;
        this.f202447b = str2;
        this.f202448c = str3;
        this.f202449d = z;
        this.f202450e = i;
        if (z && str3 == null) {
            throw new IllegalArgumentException("Cannot show extended version without an extended version URI");
        }
        if (i != 1 && str3 == null) {
            throw new IllegalArgumentException("Cannot have non-Idle replacement state without an extended version URI");
        }
    }

    /* JADX INFO: renamed from: c */
    public static rsx m76356c(rsx rsxVar, String str, boolean z, int i, int i2) {
        String str2 = rsxVar.f202446a;
        String str3 = rsxVar.f202447b;
        if ((i2 & 4) != 0) {
            str = rsxVar.f202448c;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            z = rsxVar.f202449d;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = rsxVar.f202450e;
        }
        return new rsx(i, str2, str3, z2, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsx)) {
            return false;
        }
        rsx rsxVar = (rsx) obj;
        return wj50.m88271j(this.f202446a, rsxVar.f202446a) && wj50.m88271j(this.f202447b, rsxVar.f202447b) && wj50.m88271j(this.f202448c, rsxVar.f202448c) && this.f202449d == rsxVar.f202449d && this.f202450e == rsxVar.f202450e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f202446a.hashCode() * 31, 31, this.f202447b);
        String str = this.f202448c;
        return edb.m38547C(this.f202450e) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f202449d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f202446a);
        parcel.writeString(this.f202447b);
        parcel.writeString(this.f202448c);
        parcel.writeInt(this.f202449d ? 1 : 0);
        int i2 = this.f202450e;
        if (i2 == 1) {
            str = "Idle";
        } else if (i2 == 2) {
            str = "Replacing";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "Replaced";
        }
        parcel.writeString(str);
    }
}
