package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class l5l implements Parcelable {
    public static final Parcelable.Creator<l5l> CREATOR = new z4l(1);

    /* JADX INFO: renamed from: a */
    public final boolean f129963a;

    /* JADX INFO: renamed from: b */
    public final boolean f129964b;

    /* JADX INFO: renamed from: c */
    public final boolean f129965c;

    /* JADX INFO: renamed from: d */
    public final boolean f129966d;

    /* JADX INFO: renamed from: e */
    public final boolean f129967e;

    /* JADX INFO: renamed from: f */
    public final boolean f129968f;

    public l5l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f129963a = z;
        this.f129964b = z2;
        this.f129965c = z3;
        this.f129966d = z4;
        this.f129967e = z5;
        this.f129968f = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5l)) {
            return false;
        }
        l5l l5lVar = (l5l) obj;
        return this.f129963a == l5lVar.f129963a && this.f129964b == l5lVar.f129964b && this.f129965c == l5lVar.f129965c && this.f129966d == l5lVar.f129966d && this.f129967e == l5lVar.f129967e && this.f129968f == l5lVar.f129968f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129968f) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f129963a) * 31, 31, this.f129964b), 31, this.f129965c), 31, this.f129966d), 31, this.f129967e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f129963a ? 1 : 0);
        parcel.writeInt(this.f129964b ? 1 : 0);
        parcel.writeInt(this.f129965c ? 1 : 0);
        parcel.writeInt(this.f129966d ? 1 : 0);
        parcel.writeInt(this.f129967e ? 1 : 0);
        parcel.writeInt(this.f129968f ? 1 : 0);
    }
}
