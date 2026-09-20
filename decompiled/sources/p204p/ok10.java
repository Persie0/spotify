package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ok10 implements Parcelable {
    public static final Parcelable.Creator<ok10> CREATOR = new qz00(14);

    /* JADX INFO: renamed from: a */
    public final wir0 f166208a;

    /* JADX INFO: renamed from: b */
    public final String f166209b;

    /* JADX INFO: renamed from: c */
    public final rd9 f166210c;

    /* JADX INFO: renamed from: d */
    public final f2a1 f166211d;

    /* JADX INFO: renamed from: e */
    public final String f166212e;

    public ok10(wir0 wir0Var, String str, rd9 rd9Var, f2a1 f2a1Var, String str2) {
        this.f166208a = wir0Var;
        this.f166209b = str;
        this.f166210c = rd9Var;
        this.f166211d = f2a1Var;
        this.f166212e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok10)) {
            return false;
        }
        ok10 ok10Var = (ok10) obj;
        return wj50.m88271j(this.f166208a, ok10Var.f166208a) && wj50.m88271j(this.f166209b, ok10Var.f166209b) && wj50.m88271j(this.f166210c, ok10Var.f166210c) && wj50.m88271j(this.f166211d, ok10Var.f166211d) && wj50.m88271j(this.f166212e, ok10Var.f166212e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f166208a.hashCode() * 31, 31, this.f166209b);
        rd9 rd9Var = this.f166210c;
        int iHashCode = (iM77243b + (rd9Var == null ? 0 : rd9Var.hashCode())) * 31;
        f2a1 f2a1Var = this.f166211d;
        int iHashCode2 = (iHashCode + (f2a1Var == null ? 0 : f2a1Var.hashCode())) * 31;
        String str = this.f166212e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f166208a, i);
        parcel.writeString(this.f166209b);
        rd9 rd9Var = this.f166210c;
        if (rd9Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rd9Var.writeToParcel(parcel, i);
        }
        f2a1 f2a1Var = this.f166211d;
        if (f2a1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            f2a1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f166212e);
    }
}
