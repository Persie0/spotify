package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class hmc1 implements Parcelable {
    public static final Parcelable.Creator<hmc1> CREATOR = new nlc1(17);

    /* JADX INFO: renamed from: a */
    public final String f92891a;

    /* JADX INFO: renamed from: b */
    public final String f92892b;

    public hmc1(String str, String str2) {
        this.f92891a = str;
        this.f92892b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmc1)) {
            return false;
        }
        hmc1 hmc1Var = (hmc1) obj;
        return wj50.m88271j(this.f92891a, hmc1Var.f92891a) && wj50.m88271j(this.f92892b, hmc1Var.f92892b);
    }

    public final int hashCode() {
        return this.f92892b.hashCode() + (this.f92891a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92891a);
        parcel.writeString(this.f92892b);
    }
}
