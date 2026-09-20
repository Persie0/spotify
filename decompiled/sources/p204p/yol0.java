package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class yol0 implements iet0 {
    public static final Parcelable.Creator<yol0> CREATOR = new hbl0(29);

    /* JADX INFO: renamed from: a */
    public final int f274697a;

    /* JADX INFO: renamed from: b */
    public final String f274698b;

    /* JADX INFO: renamed from: c */
    public final String f274699c;

    /* JADX INFO: renamed from: d */
    public final String f274700d;

    public yol0(String str, String str2, int i, String str3) {
        this.f274697a = i;
        this.f274698b = str;
        this.f274699c = str2;
        this.f274700d = str3;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f274697a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yol0)) {
            return false;
        }
        yol0 yol0Var = (yol0) obj;
        return this.f274697a == yol0Var.f274697a && wj50.m88271j(this.f274698b, yol0Var.f274698b) && wj50.m88271j(this.f274699c, yol0Var.f274699c) && wj50.m88271j(this.f274700d, yol0Var.f274700d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Integer.hashCode(this.f274697a) * 31, 31, this.f274698b), 31, this.f274699c);
        String str = this.f274700d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f274697a);
        parcel.writeString(this.f274698b);
        parcel.writeString(this.f274699c);
        parcel.writeString(this.f274700d);
    }
}
