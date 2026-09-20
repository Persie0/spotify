package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ev1 implements gv1 {
    public static final Parcelable.Creator<ev1> CREATOR = new zt1(5);

    /* JADX INFO: renamed from: a */
    public final agw f63119a;

    public ev1(agw agwVar) {
        this.f63119a = agwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev1) && wj50.m88271j(this.f63119a, ((ev1) obj).f63119a);
    }

    public final int hashCode() {
        agw agwVar = this.f63119a;
        if (agwVar == null) {
            return 0;
        }
        return agwVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f63119a, i);
    }
}
