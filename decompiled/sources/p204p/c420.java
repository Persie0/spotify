package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class c420 implements Parcelable {
    public static final Parcelable.Creator<c420> CREATOR = new t320(3);

    /* JADX INFO: renamed from: a */
    public final String f33817a;

    /* JADX INFO: renamed from: b */
    public final boolean f33818b;

    public c420(String str, boolean z) {
        this.f33817a = str;
        this.f33818b = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m31418c() {
        return this.f33817a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c420)) {
            return false;
        }
        c420 c420Var = (c420) obj;
        return wj50.m88271j(this.f33817a, c420Var.f33817a) && this.f33818b == c420Var.f33818b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33818b) + (this.f33817a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33817a);
        parcel.writeInt(this.f33818b ? 1 : 0);
    }
}
