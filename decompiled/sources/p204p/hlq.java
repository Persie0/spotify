package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class hlq implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f92727a;

    /* JADX INFO: renamed from: b */
    public static final wp6 f92726b = new wp6(glq.f81160h);
    public static final Parcelable.Creator<hlq> CREATOR = new lso(5);

    public /* synthetic */ hlq(String str) {
        this.f92727a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hlq) {
            return wj50.m88271j(this.f92727a, ((hlq) obj).f92727a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92727a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("DelayedSubmitId(value=", this.f92727a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92727a);
    }
}
