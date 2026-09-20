package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class omb0 implements Parcelable {
    public static final Parcelable.Creator<omb0> CREATOR = new rib0(8);

    /* JADX INFO: renamed from: a */
    public final tav f167010a;

    public omb0(tav tavVar) {
        this.f167010a = tavVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omb0) && wj50.m88271j(this.f167010a, ((omb0) obj).f167010a);
    }

    public final int hashCode() {
        return this.f167010a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f167010a, i);
    }
}
