package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class sae implements Parcelable {
    public static final Parcelable.Creator<sae> CREATOR = new rae(0);

    /* JADX INFO: renamed from: a */
    public final String f207182a;

    /* JADX INFO: renamed from: b */
    public final sv50 f207183b;

    public sae(String str, sv50 sv50Var) {
        this.f207182a = str;
        this.f207183b = sv50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sae)) {
            return false;
        }
        sae saeVar = (sae) obj;
        return wj50.m88271j(this.f207182a, saeVar.f207182a) && wj50.m88271j(this.f207183b, saeVar.f207183b);
    }

    public final int hashCode() {
        return this.f207183b.hashCode() + (this.f207182a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f207182a);
        parcel.writeParcelable(this.f207183b, i);
    }
}
