package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class t390 extends i490 implements f490 {
    public static final Parcelable.Creator<t390> CREATOR = new ct80(26);

    /* JADX INFO: renamed from: a */
    public final boolean f216731a;

    public t390(boolean z) {
        this.f216731a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f216731a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t390) && this.f216731a == ((t390) obj).f216731a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216731a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f216731a ? 1 : 0);
    }
}
