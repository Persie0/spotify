package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ise1 implements Parcelable {
    public static final Parcelable.Creator<ise1> CREATOR = new tne1(6);

    /* JADX INFO: renamed from: a */
    public final int f105232a;

    public ise1(int i) {
        this.f105232a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ise1) && this.f105232a == ((ise1) obj).f105232a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f105232a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f105232a);
    }
}
