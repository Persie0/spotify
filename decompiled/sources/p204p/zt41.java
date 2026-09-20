package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zt41 implements ou41 {
    public static final Parcelable.Creator<zt41> CREATOR = new tj41(21);

    /* JADX INFO: renamed from: a */
    public final String f286056a;

    /* JADX INFO: renamed from: b */
    public final yt41 f286057b;

    public zt41(String str, yt41 yt41Var) {
        this.f286056a = str;
        this.f286057b = yt41Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt41)) {
            return false;
        }
        zt41 zt41Var = (zt41) obj;
        return wj50.m88271j(this.f286056a, zt41Var.f286056a) && wj50.m88271j(this.f286057b, zt41Var.f286057b);
    }

    public final int hashCode() {
        int iHashCode = this.f286056a.hashCode() * 31;
        yt41 yt41Var = this.f286057b;
        return iHashCode + (yt41Var == null ? 0 : Integer.hashCode(yt41Var.f275961a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f286056a);
        parcel.writeParcelable(this.f286057b, i);
    }
}
