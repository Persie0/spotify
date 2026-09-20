package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jo7 implements Parcelable {
    public static final Parcelable.Creator<jo7> CREATOR = new na7(14);

    /* JADX INFO: renamed from: a */
    public final boolean f114348a;

    /* JADX INFO: renamed from: b */
    public final boolean f114349b;

    /* JADX INFO: renamed from: c */
    public final boolean f114350c;

    /* JADX INFO: renamed from: d */
    public final mr20 f114351d;

    public jo7(boolean z, boolean z2, boolean z3, mr20 mr20Var) {
        this.f114348a = z;
        this.f114349b = z2;
        this.f114350c = z3;
        this.f114351d = mr20Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo7)) {
            return false;
        }
        jo7 jo7Var = (jo7) obj;
        return this.f114348a == jo7Var.f114348a && this.f114349b == jo7Var.f114349b && this.f114350c == jo7Var.f114350c && wj50.m88271j(this.f114351d, jo7Var.f114351d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(Boolean.hashCode(this.f114348a) * 31, 31, this.f114349b), 31, this.f114350c);
        mr20 mr20Var = this.f114351d;
        return iM77245d + (mr20Var == null ? 0 : mr20Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f114348a ? 1 : 0);
        parcel.writeInt(this.f114349b ? 1 : 0);
        parcel.writeInt(this.f114350c ? 1 : 0);
        parcel.writeParcelable(this.f114351d, i);
    }

    public /* synthetic */ jo7(boolean z, mr20 mr20Var, int i) {
        this(true, true, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : mr20Var);
    }
}
