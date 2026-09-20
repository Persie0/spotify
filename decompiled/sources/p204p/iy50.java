package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class iy50 implements Parcelable {
    public static final Parcelable.Creator<iy50> CREATOR = new pq50(12);

    /* JADX INFO: renamed from: a */
    public final t7y f106850a;

    /* JADX INFO: renamed from: b */
    public final t7y f106851b;

    public iy50(t7y t7yVar, t7y t7yVar2) {
        this.f106850a = t7yVar;
        this.f106851b = t7yVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy50)) {
            return false;
        }
        iy50 iy50Var = (iy50) obj;
        return wj50.m88271j(this.f106850a, iy50Var.f106850a) && wj50.m88271j(this.f106851b, iy50Var.f106851b);
    }

    public final int hashCode() {
        return this.f106851b.hashCode() + (this.f106850a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f106850a.writeToParcel(parcel, i);
        this.f106851b.writeToParcel(parcel, i);
    }
}
