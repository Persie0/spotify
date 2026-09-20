package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class o9u0 implements Parcelable {
    public static final Parcelable.Creator<o9u0> CREATOR = new v5u0(5);

    /* JADX INFO: renamed from: a */
    public final String f163132a;

    /* JADX INFO: renamed from: b */
    public final String f163133b;

    /* JADX INFO: renamed from: c */
    public final boolean f163134c;

    /* JADX INFO: renamed from: d */
    public final Integer f163135d;

    public o9u0(String str, String str2, boolean z, Integer num) {
        this.f163132a = str;
        this.f163133b = str2;
        this.f163134c = z;
        this.f163135d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9u0)) {
            return false;
        }
        o9u0 o9u0Var = (o9u0) obj;
        return wj50.m88271j(this.f163132a, o9u0Var.f163132a) && wj50.m88271j(this.f163133b, o9u0Var.f163133b) && this.f163134c == o9u0Var.f163134c && wj50.m88271j(this.f163135d, o9u0Var.f163135d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f163132a.hashCode() * 31, 31, this.f163133b), 31, this.f163134c);
        Integer num = this.f163135d;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f163132a);
        parcel.writeString(this.f163133b);
        parcel.writeInt(this.f163134c ? 1 : 0);
        Integer num = this.f163135d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
