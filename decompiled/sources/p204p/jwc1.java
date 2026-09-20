package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class jwc1 extends kwc1 {
    public static final Parcelable.Creator<jwc1> CREATOR = new vmc1(15);

    /* JADX INFO: renamed from: a */
    public final mzc1 f116621a;

    public jwc1(mzc1 mzc1Var) {
        this.f116621a = mzc1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwc1) && this.f116621a == ((jwc1) obj).f116621a;
    }

    public final int hashCode() {
        return this.f116621a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116621a.name());
    }
}
