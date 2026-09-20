package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class y01 extends z01 implements c01 {
    public static final Parcelable.Creator<y01> CREATOR = new zz0(23);

    /* JADX INFO: renamed from: a */
    public final String f267837a;

    /* JADX INFO: renamed from: b */
    public final String f267838b;

    public y01(String str, String str2) {
        this.f267837a = str;
        this.f267838b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y01)) {
            return false;
        }
        y01 y01Var = (y01) obj;
        return wj50.m88271j(this.f267837a, y01Var.f267837a) && wj50.m88271j(this.f267838b, y01Var.f267838b);
    }

    @Override // p204p.c01
    /* JADX INFO: renamed from: g */
    public final String mo31065g() {
        return this.f267838b;
    }

    @Override // p204p.c01
    public final String getTitle() {
        return this.f267837a;
    }

    public final int hashCode() {
        return this.f267838b.hashCode() + (this.f267837a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f267837a);
        parcel.writeString(this.f267838b);
    }
}
