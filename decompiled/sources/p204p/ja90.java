package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ja90 implements na90 {
    public static final Parcelable.Creator<ja90> CREATOR = new x390(22);

    /* JADX INFO: renamed from: a */
    public final String f110415a;

    /* JADX INFO: renamed from: b */
    public final ia90 f110416b;

    /* JADX INFO: renamed from: c */
    public final int f110417c;

    public ja90(String str, ia90 ia90Var, int i) {
        this.f110415a = str;
        this.f110416b = ia90Var;
        this.f110417c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja90)) {
            return false;
        }
        ja90 ja90Var = (ja90) obj;
        return wj50.m88271j(this.f110415a, ja90Var.f110415a) && wj50.m88271j(this.f110416b, ja90Var.f110416b) && this.f110417c == ja90Var.f110417c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f110417c) + ((this.f110416b.hashCode() + (this.f110415a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f110415a);
        this.f110416b.writeToParcel(parcel, i);
        int i2 = this.f110417c;
        if (i2 == 1) {
            str = "Friend";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Following";
        }
        parcel.writeString(str);
    }
}
