package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class nk00 implements Parcelable {
    public static final Parcelable.Creator<nk00> CREATOR = new k700(10);

    /* JADX INFO: renamed from: a */
    public final pk00 f154743a;

    public nk00(pk00 pk00Var) {
        this.f154743a = pk00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk00) && this.f154743a == ((nk00) obj).f154743a;
    }

    public final int hashCode() {
        return this.f154743a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f154743a.name());
    }
}
