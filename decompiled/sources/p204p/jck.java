package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jck implements nck {
    public static final Parcelable.Creator<jck> CREATOR = new dnj(29);

    /* JADX INFO: renamed from: a */
    public final boolean f111139a;

    /* JADX INFO: renamed from: b */
    public final boolean f111140b;

    public jck(boolean z, boolean z2) {
        this.f111139a = z;
        this.f111140b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jck)) {
            return false;
        }
        jck jckVar = (jck) obj;
        return this.f111139a == jckVar.f111139a && this.f111140b == jckVar.f111140b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111140b) + (Boolean.hashCode(this.f111139a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f111139a ? 1 : 0);
        parcel.writeInt(this.f111140b ? 1 : 0);
    }
}
