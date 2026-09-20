package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ze2 implements Parcelable {
    public static final Parcelable.Creator<ze2> CREATOR = new lb2(11);

    /* JADX INFO: renamed from: a */
    public final int f281846a;

    /* JADX INFO: renamed from: b */
    public final String f281847b;

    /* JADX INFO: renamed from: c */
    public final String f281848c;

    /* JADX INFO: renamed from: d */
    public final int f281849d;

    /* JADX INFO: renamed from: e */
    public final int f281850e;

    /* JADX INFO: renamed from: f */
    public final int f281851f;

    /* JADX INFO: renamed from: g */
    public final int f281852g;

    /* JADX INFO: renamed from: h */
    public final int f281853h;

    /* JADX INFO: renamed from: i */
    public final String f281854i;

    /* JADX INFO: renamed from: t */
    public final boolean f281855t;

    public ze2(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, String str3, boolean z) {
        this.f281846a = i;
        this.f281847b = str;
        this.f281848c = str2;
        this.f281849d = i2;
        this.f281850e = i3;
        this.f281851f = i4;
        this.f281852g = i5;
        this.f281853h = i6;
        this.f281854i = str3;
        this.f281855t = z;
    }

    /* JADX INFO: renamed from: c */
    public final ye2 m95958c() {
        ye2 ye2Var = new ye2();
        ye2Var.f271892a = this.f281846a;
        ye2Var.f271893b = this.f281847b;
        ye2Var.f271894c = this.f281848c;
        ye2Var.f271895d = this.f281849d;
        ye2Var.f271896e = this.f281850e;
        ye2Var.f271897f = this.f281851f;
        ye2Var.f271898g = this.f281852g;
        ye2Var.f271899h = this.f281853h;
        ye2Var.f271900i = this.f281854i;
        ye2Var.f271901j = this.f281855t;
        return ye2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze2)) {
            return false;
        }
        ze2 ze2Var = (ze2) obj;
        return this.f281846a == ze2Var.f281846a && wj50.m88271j(this.f281847b, ze2Var.f281847b) && wj50.m88271j(this.f281848c, ze2Var.f281848c) && this.f281849d == ze2Var.f281849d && this.f281850e == ze2Var.f281850e && this.f281851f == ze2Var.f281851f && this.f281852g == ze2Var.f281852g && this.f281853h == ze2Var.f281853h && wj50.m88271j(this.f281854i, ze2Var.f281854i) && this.f281855t == ze2Var.f281855t;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(edb.m38547C(this.f281846a) * 31, 31, this.f281847b);
        String str = this.f281848c;
        int iM62800g = mt60.m62800g(this.f281853h, mt60.m62800g(this.f281852g, mt60.m62800g(this.f281851f, mt60.m62800g(this.f281850e, mt60.m62800g(this.f281849d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str2 = this.f281854i;
        return Boolean.hashCode(this.f281855t) + ((iM62800g + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f281846a;
        if (i2 == 1) {
            str = "INITIAL";
        } else if (i2 == 2) {
            str = "LOADED";
        } else if (i2 == 3) {
            str = "FAILED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "RETRYING";
        }
        parcel.writeString(str);
        parcel.writeString(this.f281847b);
        parcel.writeString(this.f281848c);
        parcel.writeInt(this.f281849d);
        parcel.writeInt(this.f281850e);
        parcel.writeInt(this.f281851f);
        parcel.writeInt(this.f281852g);
        parcel.writeInt(this.f281853h);
        parcel.writeString(this.f281854i);
        parcel.writeInt(this.f281855t ? 1 : 0);
    }
}
