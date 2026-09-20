package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class gn50 implements hn50 {
    public static final Parcelable.Creator<gn50> CREATOR = new gd50(15);

    /* JADX INFO: renamed from: a */
    public final String f81574a;

    /* JADX INFO: renamed from: b */
    public final String f81575b;

    public gn50(String str, String str2) {
        this.f81574a = str;
        this.f81575b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn50)) {
            return false;
        }
        gn50 gn50Var = (gn50) obj;
        return wj50.m88271j(this.f81574a, gn50Var.f81574a) && wj50.m88271j(this.f81575b, gn50Var.f81575b);
    }

    public final int hashCode() {
        return this.f81575b.hashCode() + (this.f81574a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81574a);
        parcel.writeString(this.f81575b);
    }
}
