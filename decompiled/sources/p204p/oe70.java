package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class oe70 implements Parcelable {
    public static final Parcelable.Creator<oe70> CREATOR = new w270(6);

    /* JADX INFO: renamed from: a */
    public final String f164356a;

    /* JADX INFO: renamed from: b */
    public final String f164357b;

    /* JADX INFO: renamed from: c */
    public final String f164358c;

    /* JADX INFO: renamed from: d */
    public final String f164359d;

    /* JADX INFO: renamed from: e */
    public final boolean f164360e;

    /* JADX INFO: renamed from: f */
    public final boolean f164361f;

    /* JADX INFO: renamed from: g */
    public final ne70 f164362g;

    public oe70(String str, String str2, String str3, String str4, boolean z, boolean z2, ne70 ne70Var) {
        this.f164356a = str;
        this.f164357b = str2;
        this.f164358c = str3;
        this.f164359d = str4;
        this.f164360e = z;
        this.f164361f = z2;
        this.f164362g = ne70Var;
    }

    /* JADX INFO: renamed from: c */
    public static oe70 m66792c(oe70 oe70Var, String str, ne70 ne70Var, int i) {
        String str2 = oe70Var.f164356a;
        if ((i & 2) != 0) {
            str = oe70Var.f164357b;
        }
        String str3 = str;
        String str4 = oe70Var.f164358c;
        String str5 = oe70Var.f164359d;
        boolean z = oe70Var.f164360e;
        boolean z2 = oe70Var.f164361f;
        if ((i & 64) != 0) {
            ne70Var = oe70Var.f164362g;
        }
        oe70Var.getClass();
        return new oe70(str2, str3, str4, str5, z, z2, ne70Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe70)) {
            return false;
        }
        oe70 oe70Var = (oe70) obj;
        return wj50.m88271j(this.f164356a, oe70Var.f164356a) && wj50.m88271j(this.f164357b, oe70Var.f164357b) && wj50.m88271j(this.f164358c, oe70Var.f164358c) && wj50.m88271j(this.f164359d, oe70Var.f164359d) && this.f164360e == oe70Var.f164360e && this.f164361f == oe70Var.f164361f && wj50.m88271j(this.f164362g, oe70Var.f164362g);
    }

    public final int hashCode() {
        String str = this.f164356a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f164357b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f164358c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f164359d;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f164360e), 31, this.f164361f);
        ne70 ne70Var = this.f164362g;
        return iM77245d + (ne70Var != null ? ne70Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f164356a);
        parcel.writeString(this.f164357b);
        parcel.writeString(this.f164358c);
        parcel.writeString(this.f164359d);
        parcel.writeInt(this.f164360e ? 1 : 0);
        parcel.writeInt(this.f164361f ? 1 : 0);
        ne70 ne70Var = this.f164362g;
        if (ne70Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ne70Var.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ oe70(String str, String str2, int i, String str3) {
        this((i & 1) != 0 ? null : str, null, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, false, (i & 32) == 0, null);
    }
}
