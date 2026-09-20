package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class fw10 implements Parcelable {
    public static final Parcelable.Creator<fw10> CREATOR = new km10(22);

    /* JADX INFO: renamed from: a */
    public final boolean f73919a;

    public fw10(boolean z) {
        this.f73919a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw10) && this.f73919a == ((fw10) obj).f73919a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73919a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f73919a ? 1 : 0);
    }
}
