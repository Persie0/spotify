package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class j0b0 extends w0b0 {
    public static final Parcelable.Creator<j0b0> CREATOR = new ama0(28);

    /* JADX INFO: renamed from: a */
    public final String f107409a;

    /* JADX INFO: renamed from: b */
    public final String f107410b;

    public j0b0(String str, String str2) {
        this.f107409a = str;
        this.f107410b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0b0)) {
            return false;
        }
        j0b0 j0b0Var = (j0b0) obj;
        return wj50.m88271j(this.f107409a, j0b0Var.f107409a) && wj50.m88271j(this.f107410b, j0b0Var.f107410b);
    }

    public final int hashCode() {
        return this.f107410b.hashCode() + (this.f107409a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f107409a);
        parcel.writeString(this.f107410b);
    }
}
