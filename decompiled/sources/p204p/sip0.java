package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class sip0 implements Parcelable {
    public static final Parcelable.Creator<sip0> CREATOR = new igo0(26);

    /* JADX INFO: renamed from: a */
    public final boolean f209582a;

    /* JADX INFO: renamed from: b */
    public final String f209583b;

    /* JADX INFO: renamed from: c */
    public final lnn0 f209584c;

    /* JADX INFO: renamed from: d */
    public final String f209585d;

    public sip0(String str, String str2, lnn0 lnn0Var, boolean z) {
        this.f209582a = z;
        this.f209583b = str;
        this.f209584c = lnn0Var;
        this.f209585d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sip0)) {
            return false;
        }
        sip0 sip0Var = (sip0) obj;
        return this.f209582a == sip0Var.f209582a && wj50.m88271j(this.f209583b, sip0Var.f209583b) && this.f209584c == sip0Var.f209584c && wj50.m88271j(this.f209585d, sip0Var.f209585d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f209582a) * 31;
        String str = this.f209583b;
        return this.f209585d.hashCode() + ((this.f209584c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f209582a ? 1 : 0);
        parcel.writeString(this.f209583b);
        parcel.writeString(this.f209584c.name());
        parcel.writeString(this.f209585d);
    }
}
