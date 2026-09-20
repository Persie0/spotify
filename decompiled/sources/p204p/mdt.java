package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mdt implements Parcelable {
    public static final Parcelable.Creator<mdt> CREATOR = new qct(4);

    /* JADX INFO: renamed from: a */
    public final int f142491a;

    /* JADX INFO: renamed from: b */
    public final int f142492b;

    /* JADX INFO: renamed from: c */
    public final String f142493c;

    /* JADX INFO: renamed from: d */
    public final b370 f142494d;

    public mdt(int i, int i2, String str, b370 b370Var) {
        this.f142491a = i;
        this.f142492b = i2;
        this.f142493c = str;
        this.f142494d = b370Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdt)) {
            return false;
        }
        mdt mdtVar = (mdt) obj;
        return this.f142491a == mdtVar.f142491a && this.f142492b == mdtVar.f142492b && wj50.m88271j(this.f142493c, mdtVar.f142493c) && wj50.m88271j(this.f142494d, mdtVar.f142494d);
    }

    public final int hashCode() {
        return this.f142494d.hashCode() + s571.m77243b(mt60.m62800g(this.f142492b, Integer.hashCode(this.f142491a) * 31, 31), 31, this.f142493c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f142491a);
        parcel.writeInt(this.f142492b);
        parcel.writeString(this.f142493c);
        parcel.writeParcelable(this.f142494d, i);
    }
}
