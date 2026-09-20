package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ren0 implements Parcelable {
    public static final Parcelable.Creator<ren0> CREATOR = new n9n0(10);

    /* JADX INFO: renamed from: a */
    public final String f198390a;

    public /* synthetic */ ren0(String str) {
        this.f198390a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ren0) {
            return wj50.m88271j(this.f198390a, ((ren0) obj).f198390a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f198390a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("PaymentMethodId(value=", this.f198390a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f198390a);
    }
}
