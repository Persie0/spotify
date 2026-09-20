package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class zgx0 implements Parcelable {
    public static final Parcelable.Creator<zgx0> CREATOR = new xxw0(16);

    /* JADX INFO: renamed from: a */
    public final String f282732a;

    public /* synthetic */ zgx0(String str) {
        this.f282732a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zgx0) {
            return wj50.m88271j(this.f282732a, ((zgx0) obj).f282732a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f282732a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("RiskDeviceId(value=", this.f282732a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f282732a);
    }
}
