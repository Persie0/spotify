package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rd01 implements Parcelable {
    public static final Parcelable.Creator<rd01> CREATOR = new vcz0(22);

    /* JADX INFO: renamed from: a */
    public final cbm0 f198003a;

    /* JADX INFO: renamed from: b */
    public final String f198004b;

    public rd01(cbm0 cbm0Var, String str) {
        this.f198003a = cbm0Var;
        this.f198004b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd01)) {
            return false;
        }
        rd01 rd01Var = (rd01) obj;
        return wj50.m88271j(this.f198003a, rd01Var.f198003a) && wj50.m88271j(this.f198004b, rd01Var.f198004b);
    }

    public final int hashCode() {
        return this.f198004b.hashCode() + (this.f198003a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f198003a);
        parcel.writeString(this.f198004b);
    }
}
