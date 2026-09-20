package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class yt41 implements Parcelable {
    public static final Parcelable.Creator<yt41> CREATOR = new tj41(22);

    /* JADX INFO: renamed from: a */
    public final int f275961a;

    public yt41(int i) {
        this.f275961a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt41) && this.f275961a == ((yt41) obj).f275961a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f275961a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f275961a);
    }
}
