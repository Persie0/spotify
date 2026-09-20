package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class pue1 implements Parcelable {
    public static final Parcelable.Creator<pue1> CREATOR = new tne1(9);

    /* JADX INFO: renamed from: a */
    public final String f181433a;

    /* JADX INFO: renamed from: b */
    public final boolean f181434b;

    public pue1(String str, boolean z) {
        this.f181433a = str;
        this.f181434b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pue1)) {
            return false;
        }
        pue1 pue1Var = (pue1) obj;
        return wj50.m88271j(this.f181433a, pue1Var.f181433a) && this.f181434b == pue1Var.f181434b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181434b) + (this.f181433a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f181433a);
        parcel.writeInt(this.f181434b ? 1 : 0);
    }
}
