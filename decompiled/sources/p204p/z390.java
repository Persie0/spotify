package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class z390 extends i490 implements f490 {
    public static final Parcelable.Creator<z390> CREATOR = new x390(1);

    /* JADX INFO: renamed from: a */
    public final boolean f278819a;

    public z390(boolean z) {
        this.f278819a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f278819a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z390) && this.f278819a == ((z390) obj).f278819a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f278819a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f278819a ? 1 : 0);
    }
}
