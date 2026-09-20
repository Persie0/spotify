package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class pua1 implements Parcelable {
    public static final Parcelable.Creator<pua1> CREATOR = new u2a1(19);

    /* JADX INFO: renamed from: a */
    public final oua1 f181399a;

    /* JADX INFO: renamed from: b */
    public final String f181400b;

    /* JADX INFO: renamed from: c */
    public final long f181401c;

    public pua1(oua1 oua1Var, String str, long j) {
        this.f181399a = oua1Var;
        this.f181400b = str;
        this.f181401c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pua1)) {
            return false;
        }
        pua1 pua1Var = (pua1) obj;
        return wj50.m88271j(this.f181399a, pua1Var.f181399a) && wj50.m88271j(this.f181400b, pua1Var.f181400b) && this.f181401c == pua1Var.f181401c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f181401c) + s571.m77243b(this.f181399a.hashCode() * 31, 31, this.f181400b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f181399a, i);
        parcel.writeString(this.f181400b);
        parcel.writeLong(this.f181401c);
    }
}
