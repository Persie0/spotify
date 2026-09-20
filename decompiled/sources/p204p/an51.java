package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class an51 implements gn51 {
    public static final Parcelable.Creator<an51> CREATOR = new nc51(15);

    /* JADX INFO: renamed from: a */
    public final String f17309a;

    /* JADX INFO: renamed from: b */
    public final String f17310b;

    /* JADX INFO: renamed from: c */
    public final String f17311c;

    /* JADX INFO: renamed from: d */
    public final String f17312d;

    /* JADX INFO: renamed from: e */
    public final String f17313e;

    /* JADX INFO: renamed from: f */
    public final xm51 f17314f;

    public an51(String str, String str2, String str3, String str4, String str5, xm51 xm51Var) {
        this.f17309a = str;
        this.f17310b = str2;
        this.f17311c = str3;
        this.f17312d = str4;
        this.f17313e = str5;
        this.f17314f = xm51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an51)) {
            return false;
        }
        an51 an51Var = (an51) obj;
        return wj50.m88271j(this.f17309a, an51Var.f17309a) && wj50.m88271j(this.f17310b, an51Var.f17310b) && wj50.m88271j(this.f17311c, an51Var.f17311c) && wj50.m88271j(this.f17312d, an51Var.f17312d) && wj50.m88271j(this.f17313e, an51Var.f17313e) && wj50.m88271j(this.f17314f, an51Var.f17314f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f17309a.hashCode() * 31, 31, this.f17310b);
        String str = this.f17311c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17312d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17313e;
        return this.f17314f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17309a);
        parcel.writeString(this.f17310b);
        parcel.writeString(this.f17311c);
        parcel.writeString(this.f17312d);
        parcel.writeString(this.f17313e);
        this.f17314f.writeToParcel(parcel, i);
    }
}
