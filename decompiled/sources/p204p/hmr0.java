package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hmr0 extends zq50 {
    public static final Parcelable.Creator<hmr0> CREATOR = new uir0(6);

    /* JADX INFO: renamed from: a */
    public final boolean f93057a;

    public hmr0(boolean z) {
        this.f93057a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmr0) && this.f93057a == ((hmr0) obj).f93057a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93057a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f93057a ? 1 : 0);
    }
}
