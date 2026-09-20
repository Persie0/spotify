package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ahn0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f15724a;

    /* JADX INFO: renamed from: b */
    public static final wp6 f15723b = new wp6(zgn0.f282681h);
    public static final Parcelable.Creator<ahn0> CREATOR = new n9n0(22);

    public /* synthetic */ ahn0(String str) {
        this.f15724a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahn0) {
            return wj50.m88271j(this.f15724a, ((ahn0) obj).f15724a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15724a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("PciSubmitTimeoutId(value=", this.f15724a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15724a);
    }
}
