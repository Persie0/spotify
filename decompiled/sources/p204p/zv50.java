package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class zv50 extends dw50 {
    public static final Parcelable.Creator<zv50> CREATOR = new pq50(8);

    /* JADX INFO: renamed from: a */
    public final dw50 f286619a;

    public zv50(dw50 dw50Var) {
        this.f286619a = dw50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv50) && wj50.m88271j(this.f286619a, ((zv50) obj).f286619a);
    }

    public final int hashCode() {
        return this.f286619a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f286619a, i);
    }
}
