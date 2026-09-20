package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xe9 implements Parcelable {
    public static final Parcelable.Creator<xe9> CREATOR = new dc9(5);

    /* JADX INFO: renamed from: a */
    public final String f260666a;

    /* JADX INFO: renamed from: b */
    public final boolean f260667b;

    public xe9(String str, boolean z) {
        this.f260666a = str;
        this.f260667b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe9)) {
            return false;
        }
        xe9 xe9Var = (xe9) obj;
        return wj50.m88271j(this.f260666a, xe9Var.f260666a) && this.f260667b == xe9Var.f260667b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260667b) + (this.f260666a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f260666a);
        parcel.writeInt(this.f260667b ? 1 : 0);
    }
}
