package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jju0 implements Parcelable {
    public static final Parcelable.Creator<jju0> CREATOR = new v5u0(18);

    /* JADX INFO: renamed from: a */
    public final String f113109a;

    /* JADX INFO: renamed from: b */
    public final String f113110b;

    /* JADX INFO: renamed from: c */
    public final String f113111c;

    /* JADX INFO: renamed from: d */
    public final Integer f113112d;

    public jju0(String str, String str2, Integer num, String str3) {
        this.f113109a = str;
        this.f113110b = str2;
        this.f113111c = str3;
        this.f113112d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jju0)) {
            return false;
        }
        jju0 jju0Var = (jju0) obj;
        return wj50.m88271j(this.f113109a, jju0Var.f113109a) && wj50.m88271j(this.f113110b, jju0Var.f113110b) && wj50.m88271j(this.f113111c, jju0Var.f113111c) && wj50.m88271j(this.f113112d, jju0Var.f113112d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f113109a.hashCode() * 31, 31, this.f113110b);
        String str = this.f113111c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f113112d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f113109a);
        parcel.writeString(this.f113110b);
        parcel.writeString(this.f113111c);
        Integer num = this.f113112d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
