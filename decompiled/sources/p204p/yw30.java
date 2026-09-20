package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class yw30 extends fx30 {
    public static final Parcelable.Creator<yw30> CREATOR = new bw30(20);

    /* JADX INFO: renamed from: c */
    public final boolean f276847c;

    public yw30(boolean z) {
        super(12, 2);
        this.f276847c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw30) && this.f276847c == ((yw30) obj).f276847c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276847c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f276847c ? 1 : 0);
    }
}
