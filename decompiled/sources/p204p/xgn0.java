package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xgn0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f261342a;

    /* JADX INFO: renamed from: b */
    public static final wp6 f261341b = new wp6(wgn0.f251110h);
    public static final Parcelable.Creator<xgn0> CREATOR = new n9n0(20);

    public /* synthetic */ xgn0(String str) {
        this.f261342a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xgn0) {
            return wj50.m88271j(this.f261342a, ((xgn0) obj).f261342a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f261342a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("PciLoadTimeoutId(value=", this.f261342a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f261342a);
    }
}
