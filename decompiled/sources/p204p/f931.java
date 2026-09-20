package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class f931 implements vwf, Parcelable {
    public static final Parcelable.Creator<f931> CREATOR = new q321(25);

    /* JADX INFO: renamed from: a */
    public final String f67165a;

    /* JADX INFO: renamed from: b */
    public final long f67166b;

    /* JADX INFO: renamed from: c */
    public final e931 f67167c;

    public f931(String str, long j, e931 e931Var) {
        this.f67165a = str;
        this.f67166b = j;
        this.f67167c = e931Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f931)) {
            return false;
        }
        f931 f931Var = (f931) obj;
        return wj50.m88271j(this.f67165a, f931Var.f67165a) && this.f67166b == f931Var.f67166b && wj50.m88271j(this.f67167c, f931Var.f67167c);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(this.f67165a.hashCode() * 31, this.f67166b, 31);
        e931 e931Var = this.f67167c;
        return iM36605e + (e931Var == null ? 0 : e931Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f67165a);
        parcel.writeLong(this.f67166b);
        e931 e931Var = this.f67167c;
        if (e931Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e931Var.writeToParcel(parcel, i);
        }
    }
}
