package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class p390 extends i490 implements f490 {
    public static final Parcelable.Creator<p390> CREATOR = new ct80(22);

    /* JADX INFO: renamed from: a */
    public final boolean f173592a;

    public p390(boolean z) {
        this.f173592a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f173592a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p390) && this.f173592a == ((p390) obj).f173592a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173592a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f173592a ? 1 : 0);
    }
}
