package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class om01 implements Parcelable {
    public static final Parcelable.Creator<om01> CREATOR = new vj01(8);

    /* JADX INFO: renamed from: a */
    public final String f166954a;

    /* JADX INFO: renamed from: b */
    public final wwu f166955b;

    public om01(String str, wwu wwuVar) {
        this.f166954a = str;
        this.f166955b = wwuVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om01)) {
            return false;
        }
        om01 om01Var = (om01) obj;
        return wj50.m88271j(this.f166954a, om01Var.f166954a) && wj50.m88271j(this.f166955b, om01Var.f166955b);
    }

    public final int hashCode() {
        int iHashCode = this.f166954a.hashCode() * 31;
        wwu wwuVar = this.f166955b;
        return iHashCode + (wwuVar == null ? 0 : wwuVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f166954a);
        parcel.writeParcelable(this.f166955b, i);
    }
}
