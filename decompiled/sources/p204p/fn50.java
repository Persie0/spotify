package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fn50 implements hn50 {
    public static final Parcelable.Creator<fn50> CREATOR = new gd50(14);

    /* JADX INFO: renamed from: a */
    public final agw f71185a;

    public fn50(agw agwVar) {
        this.f71185a = agwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn50) && wj50.m88271j(this.f71185a, ((fn50) obj).f71185a);
    }

    public final int hashCode() {
        agw agwVar = this.f71185a;
        if (agwVar == null) {
            return 0;
        }
        return agwVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f71185a, i);
    }
}
