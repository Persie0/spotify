package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class au41 implements ou41 {
    public static final Parcelable.Creator<au41> CREATOR = new tj41(23);

    /* JADX INFO: renamed from: a */
    public final String f19841a;

    /* JADX INFO: renamed from: b */
    public final zsk0 f19842b;

    public au41(String str, zsk0 zsk0Var) {
        this.f19841a = str;
        this.f19842b = zsk0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au41)) {
            return false;
        }
        au41 au41Var = (au41) obj;
        return wj50.m88271j(this.f19841a, au41Var.f19841a) && wj50.m88271j(this.f19842b, au41Var.f19842b);
    }

    public final int hashCode() {
        return this.f19842b.hashCode() + (this.f19841a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19841a);
        parcel.writeParcelable(this.f19842b, i);
    }
}
