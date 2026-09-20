package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class i1e implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f97495a;

    /* JADX INFO: renamed from: b */
    public static final wp6 f97494b = new wp6(h1e.f86579h);
    public static final Parcelable.Creator<i1e> CREATOR = new j0e(20);

    public /* synthetic */ i1e(String str) {
        this.f97495a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i1e) {
            return wj50.m88271j(this.f97495a, ((i1e) obj).f97495a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f97495a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("CheckoutViewId(value=", this.f97495a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f97495a);
    }
}
