package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class et41 implements ou41 {
    public static final Parcelable.Creator<et41> CREATOR = new tj41(16);

    /* JADX INFO: renamed from: a */
    public final String f62617a;

    /* JADX INFO: renamed from: b */
    public final agw f62618b;

    /* JADX INFO: renamed from: c */
    public final boolean f62619c;

    /* JADX INFO: renamed from: d */
    public final boolean f62620d;

    public et41(String str, agw agwVar, boolean z, boolean z2) {
        this.f62617a = str;
        this.f62618b = agwVar;
        this.f62619c = z;
        this.f62620d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et41)) {
            return false;
        }
        et41 et41Var = (et41) obj;
        return wj50.m88271j(this.f62617a, et41Var.f62617a) && wj50.m88271j(this.f62618b, et41Var.f62618b) && this.f62619c == et41Var.f62619c && this.f62620d == et41Var.f62620d;
    }

    public final int hashCode() {
        int iHashCode = this.f62617a.hashCode() * 31;
        agw agwVar = this.f62618b;
        return Boolean.hashCode(this.f62620d) + s571.m77245d((iHashCode + (agwVar == null ? 0 : agwVar.hashCode())) * 31, 31, this.f62619c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f62617a);
        parcel.writeParcelable(this.f62618b, i);
        parcel.writeInt(this.f62619c ? 1 : 0);
        parcel.writeInt(this.f62620d ? 1 : 0);
    }
}
