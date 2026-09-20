package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class avm0 implements Parcelable {
    public static final Parcelable.Creator<avm0> CREATOR = new pum0(7);

    /* JADX INFO: renamed from: a */
    public final int f20213a;

    /* JADX INFO: renamed from: b */
    public final int f20214b;

    /* JADX INFO: renamed from: c */
    public final qfy0 f20215c;

    public avm0(int i, int i2, qfy0 qfy0Var) {
        this.f20213a = i;
        this.f20214b = i2;
        this.f20215c = qfy0Var;
    }

    /* JADX INFO: renamed from: c */
    public final qfy0 m27254c() {
        return this.f20215c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avm0)) {
            return false;
        }
        avm0 avm0Var = (avm0) obj;
        return this.f20213a == avm0Var.f20213a && this.f20214b == avm0Var.f20214b && this.f20215c == avm0Var.f20215c;
    }

    public final int hashCode() {
        return this.f20215c.hashCode() + mt60.m62800g(this.f20214b, edb.m38547C(this.f20213a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f20213a;
        if (i2 == 1) {
            str = "DAILY";
        } else if (i2 == 2) {
            str = "WEEKLY";
        } else if (i2 == 3) {
            str = "NEVER";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "MONTHLY";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f20214b);
        this.f20215c.writeToParcel(parcel, i);
    }
}
