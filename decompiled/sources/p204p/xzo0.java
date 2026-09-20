package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xzo0 implements Parcelable {
    public static final Parcelable.Creator<xzo0> CREATOR = new igo0(16);

    /* JADX INFO: renamed from: a */
    public final String f267729a;

    public /* synthetic */ xzo0(String str) {
        this.f267729a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xzo0) {
            return wj50.m88271j(this.f267729a, ((xzo0) obj).f267729a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f267729a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("PlaybackId(value=", this.f267729a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f267729a);
    }
}
