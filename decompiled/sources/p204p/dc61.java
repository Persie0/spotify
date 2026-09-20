package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class dc61 extends hc61 {
    public static final Parcelable.Creator<dc61> CREATOR = new e361(23);

    /* JADX INFO: renamed from: a */
    public final Uri f47441a;

    /* JADX INFO: renamed from: b */
    public final String f47442b;

    public dc61(Uri uri, String str) {
        this.f47441a = uri;
        this.f47442b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc61)) {
            return false;
        }
        dc61 dc61Var = (dc61) obj;
        return wj50.m88271j(this.f47441a, dc61Var.f47441a) && wj50.m88271j(this.f47442b, dc61Var.f47442b);
    }

    public final int hashCode() {
        return this.f47442b.hashCode() + (this.f47441a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f47441a, i);
        parcel.writeString(this.f47442b);
    }
}
