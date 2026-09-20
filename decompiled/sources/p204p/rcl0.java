package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rcl0 implements wcl0 {
    public static final Parcelable.Creator<rcl0> CREATOR = new hbl0(15);

    /* JADX INFO: renamed from: a */
    public final String f197891a;

    /* JADX INFO: renamed from: b */
    public final String f197892b;

    public rcl0(String str, String str2) {
        this.f197891a = str;
        this.f197892b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcl0)) {
            return false;
        }
        rcl0 rcl0Var = (rcl0) obj;
        return wj50.m88271j(this.f197891a, rcl0Var.f197891a) && wj50.m88271j(this.f197892b, rcl0Var.f197892b);
    }

    public final int hashCode() {
        return this.f197892b.hashCode() + (this.f197891a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f197891a);
        parcel.writeString(this.f197892b);
    }
}
