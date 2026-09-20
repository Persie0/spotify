package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class o86 implements Parcelable {
    public static final Parcelable.Creator<o86> CREATOR = new vp5(16);

    /* JADX INFO: renamed from: a */
    public final String f162718a;

    /* JADX INFO: renamed from: b */
    public final Integer f162719b;

    /* JADX INFO: renamed from: c */
    public final Integer f162720c;

    public o86(String str, Integer num, Integer num2) {
        this.f162718a = str;
        this.f162719b = num;
        this.f162720c = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o86)) {
            return false;
        }
        o86 o86Var = (o86) obj;
        return wj50.m88271j(this.f162718a, o86Var.f162718a) && wj50.m88271j(this.f162719b, o86Var.f162719b) && wj50.m88271j(this.f162720c, o86Var.f162720c);
    }

    public final int hashCode() {
        int iHashCode = this.f162718a.hashCode() * 31;
        Integer num = this.f162719b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f162720c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f162718a);
        Integer num = this.f162719b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        Integer num2 = this.f162720c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num2);
        }
    }
}
