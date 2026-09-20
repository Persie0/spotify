package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ned1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<ned1> CREATOR = new vmc1(29);

    /* JADX INFO: renamed from: a */
    public final String f152976a;

    /* JADX INFO: renamed from: b */
    public final String f152977b;

    public ned1(String str, String str2) {
        this.f152976a = str;
        this.f152977b = str2;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ned1)) {
            return false;
        }
        ned1 ned1Var = (ned1) obj;
        return wj50.m88271j(this.f152976a, ned1Var.f152976a) && wj50.m88271j(this.f152977b, ned1Var.f152977b);
    }

    public final int hashCode() {
        return this.f152977b.hashCode() + (this.f152976a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f152976a);
        parcel.writeString(this.f152977b);
    }
}
