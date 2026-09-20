package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class xm51 implements Parcelable {
    public static final Parcelable.Creator<xm51> CREATOR = new nc51(13);

    /* JADX INFO: renamed from: a */
    public final Integer f263294a;

    /* JADX INFO: renamed from: b */
    public final zt91 f263295b;

    public xm51(Integer num, zt91 zt91Var) {
        this.f263294a = num;
        this.f263295b = zt91Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm51)) {
            return false;
        }
        xm51 xm51Var = (xm51) obj;
        return wj50.m88271j(this.f263294a, xm51Var.f263294a) && wj50.m88271j(this.f263295b, xm51Var.f263295b);
    }

    public final int hashCode() {
        Integer num = this.f263294a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        zt91 zt91Var = this.f263295b;
        return iHashCode + (zt91Var != null ? zt91Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.f263294a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeSerializable(this.f263295b);
    }
}
