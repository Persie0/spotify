package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ky50 implements Parcelable {
    public static final Parcelable.Creator<ky50> CREATOR = new pq50(13);

    /* JADX INFO: renamed from: a */
    public final iy50 f127655a;

    public ky50(iy50 iy50Var) {
        this.f127655a = iy50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky50) && wj50.m88271j(this.f127655a, ((ky50) obj).f127655a);
    }

    public final int hashCode() {
        return this.f127655a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f127655a.writeToParcel(parcel, i);
    }
}
