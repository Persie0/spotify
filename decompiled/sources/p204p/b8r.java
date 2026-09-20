package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class b8r implements Parcelable {
    public static final Parcelable.Creator<b8r> CREATOR = new o5r(6);

    /* JADX INFO: renamed from: a */
    public final z7r f24648a;

    /* JADX INFO: renamed from: b */
    public final o86 f24649b;

    /* JADX INFO: renamed from: c */
    public final String f24650c;

    /* JADX INFO: renamed from: d */
    public final String f24651d;

    public b8r(z7r z7rVar, o86 o86Var, String str, String str2) {
        this.f24648a = z7rVar;
        this.f24649b = o86Var;
        this.f24650c = str;
        this.f24651d = str2;
    }

    /* JADX INFO: renamed from: c */
    public final z7r m28435c() {
        return this.f24648a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8r)) {
            return false;
        }
        b8r b8rVar = (b8r) obj;
        return this.f24648a == b8rVar.f24648a && wj50.m88271j(this.f24649b, b8rVar.f24649b) && wj50.m88271j(this.f24650c, b8rVar.f24650c) && wj50.m88271j(this.f24651d, b8rVar.f24651d);
    }

    public final int hashCode() {
        int iHashCode = this.f24648a.hashCode() * 31;
        o86 o86Var = this.f24649b;
        int iHashCode2 = (iHashCode + (o86Var == null ? 0 : o86Var.hashCode())) * 31;
        String str = this.f24650c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24651d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24648a.name());
        parcel.writeParcelable(this.f24649b, i);
        parcel.writeString(this.f24650c);
        parcel.writeString(this.f24651d);
    }
}
