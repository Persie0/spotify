package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class t420 implements Parcelable {
    public static final Parcelable.Creator<t420> CREATOR = new t320(4);

    /* JADX INFO: renamed from: a */
    public final String f216880a;

    /* JADX INFO: renamed from: b */
    public final String f216881b;

    /* JADX INFO: renamed from: c */
    public final c520 f216882c;

    public t420(String str, String str2, c520 c520Var) {
        this.f216880a = str;
        this.f216881b = str2;
        this.f216882c = c520Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t420)) {
            return false;
        }
        t420 t420Var = (t420) obj;
        return wj50.m88271j(this.f216880a, t420Var.f216880a) && wj50.m88271j(this.f216881b, t420Var.f216881b) && wj50.m88271j(this.f216882c, t420Var.f216882c);
    }

    public final int hashCode() {
        int iHashCode = this.f216880a.hashCode() * 31;
        String str = this.f216881b;
        return this.f216882c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f216880a);
        parcel.writeString(this.f216881b);
        parcel.writeParcelable(this.f216882c, i);
    }
}
