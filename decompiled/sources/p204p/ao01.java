package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ao01 implements bo01 {
    public static final Parcelable.Creator<ao01> CREATOR = new vj01(13);

    /* JADX INFO: renamed from: a */
    public final e2r f17539a;

    public ao01(e2r e2rVar) {
        this.f17539a = e2rVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao01) && wj50.m88271j(this.f17539a, ((ao01) obj).f17539a);
    }

    public final int hashCode() {
        return this.f17539a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f17539a, i);
    }
}
