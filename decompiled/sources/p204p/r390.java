package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class r390 extends i490 implements f490 {
    public static final Parcelable.Creator<r390> CREATOR = new ct80(24);

    /* JADX INFO: renamed from: a */
    public final boolean f195452a;

    public r390(boolean z) {
        this.f195452a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f195452a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r390) && this.f195452a == ((r390) obj).f195452a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195452a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f195452a ? 1 : 0);
    }
}
