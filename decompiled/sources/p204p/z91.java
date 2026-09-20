package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class z91 implements Parcelable {
    public static final Parcelable.Creator<z91> CREATOR = new g11(16);

    /* JADX INFO: renamed from: a */
    public final String f280639a;

    /* JADX INFO: renamed from: b */
    public final k8j0 f280640b;

    public z91(String str, k8j0 k8j0Var) {
        this.f280639a = str;
        this.f280640b = k8j0Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m95614c() {
        return this.f280639a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z91)) {
            return false;
        }
        z91 z91Var = (z91) obj;
        return wj50.m88271j(this.f280639a, z91Var.f280639a) && this.f280640b == z91Var.f280640b;
    }

    public final int hashCode() {
        return this.f280640b.hashCode() + (this.f280639a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f280639a);
        parcel.writeString(this.f280640b.name());
    }
}
