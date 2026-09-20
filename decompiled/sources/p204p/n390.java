package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class n390 extends i490 implements f490 {
    public static final Parcelable.Creator<n390> CREATOR = new n6f1(27);

    /* JADX INFO: renamed from: a */
    public final boolean f149980a;

    public n390(boolean z) {
        this.f149980a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f149980a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n390) && this.f149980a == ((n390) obj).f149980a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149980a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f149980a ? 1 : 0);
    }
}
