package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class e490 extends i490 implements f490 {
    public static final Parcelable.Creator<e490> CREATOR = new x390(5);

    /* JADX INFO: renamed from: a */
    public final boolean f56031a;

    public e490(boolean z) {
        this.f56031a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f56031a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e490) && this.f56031a == ((e490) obj).f56031a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56031a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56031a ? 1 : 0);
    }
}
