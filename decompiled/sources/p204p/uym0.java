package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class uym0 implements Parcelable {
    public static final Parcelable.Creator<uym0> CREATOR = new pum0(14);

    /* JADX INFO: renamed from: a */
    public final String f235337a;

    /* JADX INFO: renamed from: b */
    public final gy91 f235338b;

    /* JADX INFO: renamed from: c */
    public final String f235339c;

    /* JADX INFO: renamed from: d */
    public final String f235340d;

    public uym0(String str, gy91 gy91Var, String str2, String str3) {
        this.f235337a = str;
        this.f235338b = gy91Var;
        this.f235339c = str2;
        this.f235340d = str3;
    }

    /* JADX INFO: renamed from: c */
    public static uym0 m84274c(uym0 uym0Var, gy91 gy91Var, String str, int i) {
        String str2 = uym0Var.f235337a;
        if ((i & 2) != 0) {
            gy91Var = uym0Var.f235338b;
        }
        if ((i & 4) != 0) {
            str = uym0Var.f235339c;
        }
        String str3 = uym0Var.f235340d;
        uym0Var.getClass();
        return new uym0(str2, gy91Var, str, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uym0)) {
            return false;
        }
        uym0 uym0Var = (uym0) obj;
        return wj50.m88271j(this.f235337a, uym0Var.f235337a) && wj50.m88271j(this.f235338b, uym0Var.f235338b) && wj50.m88271j(this.f235339c, uym0Var.f235339c) && wj50.m88271j(this.f235340d, uym0Var.f235340d);
    }

    public final int hashCode() {
        int iHashCode = (this.f235338b.hashCode() + (this.f235337a.hashCode() * 31)) * 31;
        String str = this.f235339c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f235340d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f235337a);
        parcel.writeParcelable(this.f235338b, i);
        parcel.writeString(this.f235339c);
        parcel.writeString(this.f235340d);
    }

    public /* synthetic */ uym0(String str, String str2) {
        this(str, ey91.f63995a, null, str2);
    }
}
