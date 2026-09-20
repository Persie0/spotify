package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class h490 extends i490 implements f490 {
    public static final Parcelable.Creator<h490> CREATOR = new x390(7);

    /* JADX INFO: renamed from: a */
    public final boolean f87472a;

    public h490(boolean z) {
        this.f87472a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f87472a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h490) && this.f87472a == ((h490) obj).f87472a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87472a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f87472a ? 1 : 0);
    }
}
