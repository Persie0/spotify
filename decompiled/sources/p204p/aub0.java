package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class aub0 extends fub0 {
    public static final Parcelable.Creator<aub0> CREATOR = new apb0(16);

    /* JADX INFO: renamed from: a */
    public final byw0 f19905a;

    public aub0(byw0 byw0Var) {
        this.f19905a = byw0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aub0) && wj50.m88271j(this.f19905a, ((aub0) obj).f19905a);
    }

    public final int hashCode() {
        return this.f19905a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f19905a, i);
    }
}
