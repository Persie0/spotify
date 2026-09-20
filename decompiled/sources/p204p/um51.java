package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class um51 implements hn51 {
    public static final Parcelable.Creator<um51> CREATOR = new nc51(10);

    /* JADX INFO: renamed from: a */
    public final String f231743a;

    /* JADX INFO: renamed from: b */
    public final String f231744b;

    /* JADX INFO: renamed from: c */
    public final String f231745c;

    /* JADX INFO: renamed from: d */
    public final String f231746d;

    /* JADX INFO: renamed from: e */
    public final int f231747e;

    public um51(int i, String str, String str2, String str3, String str4) {
        this.f231743a = str;
        this.f231744b = str2;
        this.f231745c = str3;
        this.f231746d = str4;
        this.f231747e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um51)) {
            return false;
        }
        um51 um51Var = (um51) obj;
        return wj50.m88271j(this.f231743a, um51Var.f231743a) && wj50.m88271j(this.f231744b, um51Var.f231744b) && wj50.m88271j(this.f231745c, um51Var.f231745c) && wj50.m88271j(this.f231746d, um51Var.f231746d) && this.f231747e == um51Var.f231747e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f231743a.hashCode() * 31, 31, this.f231744b);
        String str = this.f231745c;
        return Integer.hashCode(this.f231747e) + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f231746d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f231743a);
        parcel.writeString(this.f231744b);
        parcel.writeString(this.f231745c);
        parcel.writeString(this.f231746d);
        parcel.writeInt(this.f231747e);
    }
}
