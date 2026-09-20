package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ysk0 implements atk0 {
    public static final Parcelable.Creator<ysk0> CREATOR = new fgj0(24);

    /* JADX INFO: renamed from: a */
    public final agw f275808a;

    public ysk0(agw agwVar) {
        this.f275808a = agwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysk0) && wj50.m88271j(this.f275808a, ((ysk0) obj).f275808a);
    }

    public final int hashCode() {
        agw agwVar = this.f275808a;
        if (agwVar == null) {
            return 0;
        }
        return agwVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f275808a, i);
    }
}
