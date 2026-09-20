package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wya0 implements Parcelable {
    public static final Parcelable.Creator<wya0> CREATOR = new ama0(22);

    /* JADX INFO: renamed from: a */
    public final cyz0 f256245a;

    public wya0(cyz0 cyz0Var) {
        this.f256245a = cyz0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wya0) && wj50.m88271j(this.f256245a, ((wya0) obj).f256245a);
    }

    public final int hashCode() {
        return this.f256245a.f43409a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f256245a.writeToParcel(parcel, i);
    }
}
