package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class gcr0 extends icr0 {
    public static final Parcelable.Creator<gcr0> CREATOR = new vzq0(21);

    /* JADX INFO: renamed from: a */
    public final String f78646a;

    /* JADX INFO: renamed from: b */
    public final String f78647b;

    public gcr0(String str, String str2) {
        this.f78646a = str;
        this.f78647b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcr0)) {
            return false;
        }
        gcr0 gcr0Var = (gcr0) obj;
        return wj50.m88271j(this.f78646a, gcr0Var.f78646a) && wj50.m88271j(this.f78647b, gcr0Var.f78647b);
    }

    public final int hashCode() {
        return this.f78647b.hashCode() + (this.f78646a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f78646a);
        parcel.writeString(this.f78647b);
    }

    public gcr0(Uri uri, String str) {
        this(uri.toString(), str);
    }
}
