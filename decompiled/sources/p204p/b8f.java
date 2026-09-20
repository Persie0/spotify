package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class b8f implements Parcelable {
    public static final Parcelable.Creator<b8f> CREATOR = new rae(13);

    /* JADX INFO: renamed from: a */
    public final int f24578a;

    /* JADX INFO: renamed from: b */
    public final int f24579b;

    public b8f(int i, int i2) {
        this.f24578a = i;
        this.f24579b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8f)) {
            return false;
        }
        b8f b8fVar = (b8f) obj;
        return this.f24578a == b8fVar.f24578a && this.f24579b == b8fVar.f24579b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24579b) + (Integer.hashCode(this.f24578a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24578a);
        parcel.writeInt(this.f24579b);
    }
}
