package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ylc1 implements Parcelable {
    public static final Parcelable.Creator<ylc1> CREATOR = new nlc1(8);

    /* JADX INFO: renamed from: a */
    public final String f273979a;

    /* JADX INFO: renamed from: b */
    public final xlc1 f273980b;

    public ylc1(String str, xlc1 xlc1Var) {
        this.f273979a = str;
        this.f273980b = xlc1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylc1)) {
            return false;
        }
        ylc1 ylc1Var = (ylc1) obj;
        return wj50.m88271j(this.f273979a, ylc1Var.f273979a) && wj50.m88271j(this.f273980b, ylc1Var.f273980b);
    }

    public final int hashCode() {
        return this.f273980b.hashCode() + (this.f273979a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f273979a);
        parcel.writeParcelable(this.f273980b, i);
    }
}
