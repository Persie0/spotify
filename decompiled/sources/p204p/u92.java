package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class u92 implements Parcelable {
    public static final Parcelable.Creator<u92> CREATOR = new zt1(25);

    /* JADX INFO: renamed from: a */
    public final zr9 f228057a;

    /* JADX INFO: renamed from: b */
    public final Integer f228058b;

    public u92(zr9 zr9Var, Integer num) {
        this.f228057a = zr9Var;
        this.f228058b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u92)) {
            return false;
        }
        u92 u92Var = (u92) obj;
        return this.f228057a == u92Var.f228057a && wj50.m88271j(this.f228058b, u92Var.f228058b);
    }

    public final int hashCode() {
        int iHashCode = this.f228057a.hashCode() * 31;
        Integer num = this.f228058b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f228057a.name());
        Integer num = this.f228058b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
