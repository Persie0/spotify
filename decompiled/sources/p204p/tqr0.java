package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class tqr0 implements Parcelable {
    public static final Parcelable.Creator<tqr0> CREATOR = new uir0(9);

    /* JADX INFO: renamed from: a */
    public final String f222872a;

    /* JADX INFO: renamed from: b */
    public final String f222873b;

    /* JADX INFO: renamed from: c */
    public final String f222874c;

    /* JADX INFO: renamed from: d */
    public final boolean f222875d;

    public tqr0(String str, String str2, String str3, boolean z) {
        this.f222872a = str;
        this.f222873b = str2;
        this.f222874c = str3;
        this.f222875d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqr0)) {
            return false;
        }
        tqr0 tqr0Var = (tqr0) obj;
        return wj50.m88271j(this.f222872a, tqr0Var.f222872a) && wj50.m88271j(this.f222873b, tqr0Var.f222873b) && wj50.m88271j(this.f222874c, tqr0Var.f222874c) && this.f222875d == tqr0Var.f222875d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f222872a.hashCode() * 31, 31, this.f222873b);
        String str = this.f222874c;
        return Boolean.hashCode(this.f222875d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f222872a);
        parcel.writeString(this.f222873b);
        parcel.writeString(this.f222874c);
        parcel.writeInt(this.f222875d ? 1 : 0);
    }
}
