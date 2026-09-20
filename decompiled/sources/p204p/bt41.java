package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class bt41 implements ou41 {
    public static final Parcelable.Creator<bt41> CREATOR = new tj41(14);

    /* JADX INFO: renamed from: a */
    public final String f30511a;

    /* JADX INFO: renamed from: b */
    public final boolean f30512b;

    public bt41(String str, boolean z) {
        this.f30511a = str;
        this.f30512b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt41)) {
            return false;
        }
        bt41 bt41Var = (bt41) obj;
        return wj50.m88271j(this.f30511a, bt41Var.f30511a) && this.f30512b == bt41Var.f30512b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30512b) + (this.f30511a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30511a);
        parcel.writeInt(this.f30512b ? 1 : 0);
    }
}
