package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class l8v0 implements Parcelable {
    public static final Parcelable.Creator<l8v0> CREATOR = new h1v0(5);

    /* JADX INFO: renamed from: a */
    public final String f130946a;

    /* JADX INFO: renamed from: b */
    public final Integer f130947b;

    public l8v0(Integer num, String str) {
        this.f130946a = str;
        this.f130947b = num;
    }

    /* JADX INFO: renamed from: c */
    public final String m58484c() {
        return this.f130946a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8v0)) {
            return false;
        }
        l8v0 l8v0Var = (l8v0) obj;
        return wj50.m88271j(this.f130946a, l8v0Var.f130946a) && wj50.m88271j(this.f130947b, l8v0Var.f130947b);
    }

    /* JADX INFO: renamed from: g */
    public final Integer m58485g() {
        return this.f130947b;
    }

    public final int hashCode() {
        String str = this.f130946a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f130947b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f130946a);
        Integer num = this.f130947b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
