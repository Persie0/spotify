package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rzc implements Parcelable {
    public static final Parcelable.Creator<rzc> CREATOR = new qvc(4);

    /* JADX INFO: renamed from: a */
    public final wyn0 f204125a;

    public rzc(wyn0 wyn0Var) {
        this.f204125a = wyn0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzc) && wj50.m88271j(this.f204125a, ((rzc) obj).f204125a);
    }

    public final int hashCode() {
        return this.f204125a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f204125a, i);
    }
}
