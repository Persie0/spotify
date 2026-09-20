package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class q390 extends i490 implements f490 {
    public static final Parcelable.Creator<q390> CREATOR = new ct80(23);

    /* JADX INFO: renamed from: a */
    public final boolean f184821a;

    public q390(boolean z) {
        this.f184821a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f184821a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q390) && this.f184821a == ((q390) obj).f184821a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184821a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f184821a ? 1 : 0);
    }
}
