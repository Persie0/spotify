package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class af71 extends bf71 {
    public static final Parcelable.Creator<af71> CREATOR = new c071(11);

    /* JADX INFO: renamed from: a */
    public final nu71 f15057a;

    public af71(nu71 nu71Var) {
        this.f15057a = nu71Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af71) && wj50.m88271j(this.f15057a, ((af71) obj).f15057a);
    }

    public final int hashCode() {
        nu71 nu71Var = this.f15057a;
        if (nu71Var == null) {
            return 0;
        }
        return Long.hashCode(nu71Var.f158526a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f15057a, i);
    }
}
