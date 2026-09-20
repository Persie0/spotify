package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class e8o0 implements Parcelable {
    public static final Parcelable.Creator<e8o0> CREATOR = new o2o0(6);

    /* JADX INFO: renamed from: a */
    public final int f57238a;

    /* JADX INFO: renamed from: b */
    public final String f57239b;

    /* JADX INFO: renamed from: c */
    public final String f57240c;

    /* JADX INFO: renamed from: d */
    public final String f57241d;

    /* JADX INFO: renamed from: e */
    public final String f57242e;

    /* JADX INFO: renamed from: f */
    public final String f57243f;

    public e8o0(int i, String str, String str2, String str3, String str4, String str5) {
        this.f57238a = i;
        this.f57239b = str;
        this.f57240c = str2;
        this.f57241d = str3;
        this.f57242e = str4;
        this.f57243f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8o0)) {
            return false;
        }
        e8o0 e8o0Var = (e8o0) obj;
        return this.f57238a == e8o0Var.f57238a && wj50.m88271j(this.f57239b, e8o0Var.f57239b) && wj50.m88271j(this.f57240c, e8o0Var.f57240c) && wj50.m88271j(this.f57241d, e8o0Var.f57241d) && wj50.m88271j(this.f57242e, e8o0Var.f57242e) && wj50.m88271j(this.f57243f, e8o0Var.f57243f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f57238a) * 31;
        String str = this.f57239b;
        int iM77243b = s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57240c), 31, this.f57241d);
        String str2 = this.f57242e;
        int iHashCode2 = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57243f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f57238a);
        parcel.writeString(this.f57239b);
        parcel.writeString(this.f57240c);
        parcel.writeString(this.f57241d);
        parcel.writeString(this.f57242e);
        parcel.writeString(this.f57243f);
    }
}
