package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class txl0 implements Parcelable {
    public static final Parcelable.Creator<txl0> CREATOR = new cpl0(4);

    /* JADX INFO: renamed from: a */
    public final String f224723a;

    /* JADX INFO: renamed from: b */
    public final String f224724b;

    public txl0(String str, String str2) {
        this.f224723a = str;
        this.f224724b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txl0)) {
            return false;
        }
        txl0 txl0Var = (txl0) obj;
        return wj50.m88271j(this.f224723a, txl0Var.f224723a) && wj50.m88271j(this.f224724b, txl0Var.f224724b);
    }

    public final int hashCode() {
        return this.f224724b.hashCode() + (this.f224723a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f224723a);
        parcel.writeString(this.f224724b);
    }
}
