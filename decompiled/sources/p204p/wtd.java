package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wtd implements Parcelable {
    public static final Parcelable.Creator<wtd> CREATOR = new fjd(15);

    /* JADX INFO: renamed from: a */
    public final vtd f254926a;

    public wtd(vtd vtdVar) {
        this.f254926a = vtdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtd) && wj50.m88271j(this.f254926a, ((wtd) obj).f254926a);
    }

    public final int hashCode() {
        return this.f254926a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f254926a, i);
    }
}
