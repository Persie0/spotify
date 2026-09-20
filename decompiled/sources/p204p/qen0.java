package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class qen0 implements Parcelable {
    public static final Parcelable.Creator<qen0> CREATOR = new n9n0(9);

    /* JADX INFO: renamed from: a */
    public final String f187975a;

    public /* synthetic */ qen0(String str) {
        this.f187975a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qen0) {
            return wj50.m88271j(this.f187975a, ((qen0) obj).f187975a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f187975a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("PaymentMethodId(value=", this.f187975a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f187975a);
    }
}
