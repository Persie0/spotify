package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class efz0 implements Parcelable {
    public static final Parcelable.Creator<efz0> CREATOR = new vcz0(2);

    /* JADX INFO: renamed from: a */
    public final String f59175a;

    /* JADX INFO: renamed from: b */
    public final boolean f59176b;

    public efz0(String str, boolean z) {
        this.f59175a = str;
        this.f59176b = z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m38765c() {
        return this.f59176b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efz0)) {
            return false;
        }
        efz0 efz0Var = (efz0) obj;
        return wj50.m88271j(this.f59175a, efz0Var.f59175a) && this.f59176b == efz0Var.f59176b;
    }

    public final String getText() {
        return this.f59175a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59176b) + (this.f59175a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59175a);
        parcel.writeInt(this.f59176b ? 1 : 0);
    }
}
