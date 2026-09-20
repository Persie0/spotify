package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class zvh0 implements Parcelable {
    public static final Parcelable.Creator<zvh0> CREATOR = new xuf0(20);

    /* JADX INFO: renamed from: a */
    public final ouh0 f286711a;

    public zvh0(ouh0 ouh0Var) {
        this.f286711a = ouh0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvh0) && wj50.m88271j(this.f286711a, ((zvh0) obj).f286711a);
    }

    public final int hashCode() {
        ouh0 ouh0Var = this.f286711a;
        if (ouh0Var == null) {
            return 0;
        }
        return ouh0Var.f170295a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ouh0 ouh0Var = this.f286711a;
        if (ouh0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ouh0Var.writeToParcel(parcel, i);
        }
    }
}
