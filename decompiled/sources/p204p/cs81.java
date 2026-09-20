package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class cs81 implements Parcelable {
    public static final Parcelable.Creator<cs81> CREATOR = new f881(21);

    /* JADX INFO: renamed from: a */
    public final String f41492a;

    public /* synthetic */ cs81(String str) {
        this.f41492a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cs81) {
            return wj50.m88271j(this.f41492a, ((cs81) obj).f41492a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41492a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("TrackUri(value=", this.f41492a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41492a);
    }
}
