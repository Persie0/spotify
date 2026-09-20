package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class r6v0 implements Parcelable {
    public static final Parcelable.Creator<r6v0> CREATOR = new h1v0(4);

    /* JADX INFO: renamed from: a */
    public final String f196364a;

    /* JADX INFO: renamed from: b */
    public final String f196365b;

    public r6v0(String str, String str2) {
        this.f196364a = str;
        this.f196365b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6v0)) {
            return false;
        }
        r6v0 r6v0Var = (r6v0) obj;
        return wj50.m88271j(this.f196364a, r6v0Var.f196364a) && wj50.m88271j(this.f196365b, r6v0Var.f196365b);
    }

    public final int hashCode() {
        return this.f196365b.hashCode() + (this.f196364a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f196364a);
        parcel.writeString(this.f196365b);
    }
}
