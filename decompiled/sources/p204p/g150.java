package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class g150 implements m8z0 {
    public static final Parcelable.Creator<g150> CREATOR = new y240(27);

    /* JADX INFO: renamed from: a */
    public final zbv f75527a;

    /* JADX INFO: renamed from: b */
    public final String f75528b;

    /* JADX INFO: renamed from: c */
    public final String f75529c;

    public g150(zbv zbvVar, String str, String str2) {
        this.f75527a = zbvVar;
        this.f75528b = str;
        this.f75529c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g150)) {
            return false;
        }
        g150 g150Var = (g150) obj;
        return wj50.m88271j(this.f75527a, g150Var.f75527a) && wj50.m88271j(this.f75528b, g150Var.f75528b) && wj50.m88271j(this.f75529c, g150Var.f75529c);
    }

    public final int hashCode() {
        return this.f75529c.hashCode() + s571.m77243b(this.f75527a.hashCode() * 31, 31, this.f75528b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f75527a.writeToParcel(parcel, i);
        parcel.writeString(this.f75528b);
        parcel.writeString(this.f75529c);
    }
}
