package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class yta0 implements fua0 {
    public static final Parcelable.Creator<yta0> CREATOR = new ama0(2);

    /* JADX INFO: renamed from: a */
    public final xta0 f276066a;

    public yta0(xta0 xta0Var) {
        this.f276066a = xta0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yta0) && wj50.m88271j(this.f276066a, ((yta0) obj).f276066a);
    }

    public final int hashCode() {
        return this.f276066a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f276066a, i);
    }
}
