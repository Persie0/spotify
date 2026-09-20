package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ttd extends vtd {
    public static final Parcelable.Creator<ttd> CREATOR = new fjd(17);

    /* JADX INFO: renamed from: a */
    public final agw f223576a;

    public ttd(agw agwVar) {
        this.f223576a = agwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ttd) && wj50.m88271j(this.f223576a, ((ttd) obj).f223576a);
    }

    public final int hashCode() {
        agw agwVar = this.f223576a;
        if (agwVar == null) {
            return 0;
        }
        return agwVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f223576a, i);
    }
}
