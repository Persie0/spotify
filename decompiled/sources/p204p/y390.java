package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class y390 extends i490 implements f490 {
    public static final Parcelable.Creator<y390> CREATOR = new x390(0);

    /* JADX INFO: renamed from: a */
    public final boolean f268785a;

    public y390(boolean z) {
        this.f268785a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f268785a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y390) && this.f268785a == ((y390) obj).f268785a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268785a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f268785a ? 1 : 0);
    }
}
