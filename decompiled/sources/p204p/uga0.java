package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class uga0 implements Parcelable {
    public static final Parcelable.Creator<uga0> CREATOR = new z8a0(22);

    /* JADX INFO: renamed from: a */
    public final vla0 f230058a;

    /* JADX INFO: renamed from: b */
    public final String f230059b;

    /* JADX INFO: renamed from: c */
    public final int f230060c;

    public uga0(vla0 vla0Var, String str, int i) {
        this.f230058a = vla0Var;
        this.f230059b = str;
        this.f230060c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uga0)) {
            return false;
        }
        uga0 uga0Var = (uga0) obj;
        return wj50.m88271j(this.f230058a, uga0Var.f230058a) && wj50.m88271j(this.f230059b, uga0Var.f230059b) && this.f230060c == uga0Var.f230060c;
    }

    public final int hashCode() {
        vla0 vla0Var = this.f230058a;
        return edb.m38547C(this.f230060c) + s571.m77243b((vla0Var == null ? 0 : vla0Var.hashCode()) * 31, 31, this.f230059b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        vla0 vla0Var = this.f230058a;
        if (vla0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vla0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f230059b);
        int i2 = this.f230060c;
        if (i2 == 1) {
            str = "NOT_REQUESTED";
        } else if (i2 == 2) {
            str = "REQUESTING";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "COMPLETED";
        }
        parcel.writeString(str);
    }
}
