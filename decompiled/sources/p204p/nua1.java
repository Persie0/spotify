package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class nua1 implements oua1 {
    public static final Parcelable.Creator<nua1> CREATOR = new u2a1(21);

    /* JADX INFO: renamed from: a */
    public final String f158548a;

    /* JADX INFO: renamed from: b */
    public final String f158549b;

    /* JADX INFO: renamed from: c */
    public final String f158550c;

    public nua1(String str, String str2, String str3) {
        this.f158548a = str;
        this.f158549b = str2;
        this.f158550c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nua1)) {
            return false;
        }
        nua1 nua1Var = (nua1) obj;
        return wj50.m88271j(this.f158548a, nua1Var.f158548a) && wj50.m88271j(this.f158549b, nua1Var.f158549b) && wj50.m88271j(this.f158550c, nua1Var.f158550c);
    }

    public final int hashCode() {
        return this.f158550c.hashCode() + s571.m77243b(this.f158548a.hashCode() * 31, 31, this.f158549b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f158548a);
        parcel.writeString(this.f158549b);
        parcel.writeString(this.f158550c);
    }
}
