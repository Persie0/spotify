package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class y7r implements Parcelable {
    public static final Parcelable.Creator<y7r> CREATOR = new o5r(4);

    /* JADX INFO: renamed from: a */
    public final z7r f270125a;

    /* JADX INFO: renamed from: b */
    public final o86 f270126b;

    /* JADX INFO: renamed from: c */
    public final String f270127c;

    /* JADX INFO: renamed from: d */
    public final String f270128d;

    public y7r(z7r z7rVar, o86 o86Var, String str, String str2) {
        this.f270125a = z7rVar;
        this.f270126b = o86Var;
        this.f270127c = str;
        this.f270128d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7r)) {
            return false;
        }
        y7r y7rVar = (y7r) obj;
        return this.f270125a == y7rVar.f270125a && wj50.m88271j(this.f270126b, y7rVar.f270126b) && wj50.m88271j(this.f270127c, y7rVar.f270127c) && wj50.m88271j(this.f270128d, y7rVar.f270128d);
    }

    public final int hashCode() {
        int iHashCode = this.f270125a.hashCode() * 31;
        o86 o86Var = this.f270126b;
        int iHashCode2 = (iHashCode + (o86Var == null ? 0 : o86Var.hashCode())) * 31;
        String str = this.f270127c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f270128d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f270125a.name());
        o86 o86Var = this.f270126b;
        if (o86Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o86Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f270127c);
        parcel.writeString(this.f270128d);
    }

    public /* synthetic */ y7r(z7r z7rVar, o86 o86Var, int i) {
        this((i & 1) != 0 ? z7r.f280273b : z7rVar, (i & 2) != 0 ? null : o86Var, null, null);
    }
}
