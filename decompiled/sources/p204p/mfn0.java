package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mfn0 implements Parcelable {
    public static final Parcelable.Creator<mfn0> CREATOR = new n9n0(16);

    /* JADX INFO: renamed from: a */
    public final String f143100a;

    public /* synthetic */ mfn0(String str) {
        this.f143100a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mfn0) {
            return wj50.m88271j(this.f143100a, ((mfn0) obj).f143100a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f143100a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("PaymentSessionId(value=", this.f143100a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f143100a);
    }
}
