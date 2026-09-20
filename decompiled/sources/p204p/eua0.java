package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class eua0 implements fua0 {
    public static final Parcelable.Creator<eua0> CREATOR = new ama0(12);

    /* JADX INFO: renamed from: a */
    public final String f62927a;

    /* JADX INFO: renamed from: b */
    public final String f62928b;

    public eua0(String str, String str2) {
        this.f62927a = str;
        this.f62928b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eua0)) {
            return false;
        }
        eua0 eua0Var = (eua0) obj;
        return wj50.m88271j(this.f62927a, eua0Var.f62927a) && wj50.m88271j(this.f62928b, eua0Var.f62928b);
    }

    public final int hashCode() {
        return this.f62928b.hashCode() + (this.f62927a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f62927a);
        parcel.writeString(this.f62928b);
    }
}
