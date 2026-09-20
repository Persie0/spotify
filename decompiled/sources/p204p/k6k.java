package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class k6k implements Parcelable {
    public static final Parcelable.Creator<k6k> CREATOR = new dnj(19);

    /* JADX INFO: renamed from: a */
    public final String f119766a;

    /* JADX INFO: renamed from: b */
    public final m6k f119767b;

    /* JADX INFO: renamed from: c */
    public final voc1 f119768c;

    public k6k(String str, m6k m6kVar, voc1 voc1Var) {
        this.f119766a = str;
        this.f119767b = m6kVar;
        this.f119768c = voc1Var;
    }

    /* JADX INFO: renamed from: c */
    public final voc1 m55598c() {
        return this.f119768c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6k)) {
            return false;
        }
        k6k k6kVar = (k6k) obj;
        return wj50.m88271j(this.f119766a, k6kVar.f119766a) && wj50.m88271j(this.f119767b, k6kVar.f119767b) && wj50.m88271j(this.f119768c, k6kVar.f119768c);
    }

    public final int hashCode() {
        int iHashCode = (this.f119767b.hashCode() + (this.f119766a.hashCode() * 31)) * 31;
        voc1 voc1Var = this.f119768c;
        return iHashCode + (voc1Var == null ? 0 : voc1Var.f243453a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f119766a);
        parcel.writeParcelable(this.f119767b, i);
        parcel.writeParcelable(this.f119768c, i);
    }
}
