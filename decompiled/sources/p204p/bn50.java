package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class bn50 implements dn50 {
    public static final Parcelable.Creator<bn50> CREATOR = new gd50(11);

    /* JADX INFO: renamed from: a */
    public final agw f28701a;

    public bn50(agw agwVar) {
        this.f28701a = agwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn50) && wj50.m88271j(this.f28701a, ((bn50) obj).f28701a);
    }

    public final int hashCode() {
        agw agwVar = this.f28701a;
        if (agwVar == null) {
            return 0;
        }
        return agwVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28701a, i);
    }
}
