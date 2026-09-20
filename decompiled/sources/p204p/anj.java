package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class anj extends onj {
    public static final Parcelable.Creator<anj> CREATOR = new wcj(27);

    /* JADX INFO: renamed from: a */
    public final int f17450a;

    /* JADX INFO: renamed from: b */
    public final int f17451b;

    public anj(int i, int i2) {
        this.f17450a = i;
        this.f17451b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anj)) {
            return false;
        }
        anj anjVar = (anj) obj;
        return this.f17450a == anjVar.f17450a && this.f17451b == anjVar.f17451b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17451b) + (Integer.hashCode(this.f17450a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17450a);
        parcel.writeInt(this.f17451b);
    }
}
