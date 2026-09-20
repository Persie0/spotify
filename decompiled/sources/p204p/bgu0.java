package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class bgu0 implements Parcelable {
    public static final Parcelable.Creator<bgu0> CREATOR = new v5u0(15);

    /* JADX INFO: renamed from: a */
    public final String f27005a;

    /* JADX INFO: renamed from: b */
    public final String f27006b;

    public bgu0(String str, String str2) {
        this.f27005a = str;
        this.f27006b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgu0)) {
            return false;
        }
        bgu0 bgu0Var = (bgu0) obj;
        return wj50.m88271j(this.f27005a, bgu0Var.f27005a) && wj50.m88271j(this.f27006b, bgu0Var.f27006b);
    }

    public final int hashCode() {
        return this.f27006b.hashCode() + (this.f27005a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27005a);
        parcel.writeString(this.f27006b);
    }
}
