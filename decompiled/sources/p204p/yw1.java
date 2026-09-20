package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class yw1 implements Parcelable {
    public static final Parcelable.Creator<yw1> CREATOR = new zt1(9);

    /* JADX INFO: renamed from: a */
    public final String f276821a;

    public /* synthetic */ yw1(String str) {
        this.f276821a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yw1) {
            return wj50.m88271j(this.f276821a, ((yw1) obj).f276821a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f276821a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("AddressFormExternalId(value=", this.f276821a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f276821a);
    }
}
