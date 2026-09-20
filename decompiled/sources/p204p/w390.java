package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class w390 extends i490 implements f490 {
    public static final Parcelable.Creator<w390> CREATOR = new ct80(29);

    /* JADX INFO: renamed from: a */
    public final boolean f247527a;

    public w390(boolean z) {
        this.f247527a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f247527a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w390) && this.f247527a == ((w390) obj).f247527a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247527a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f247527a ? 1 : 0);
    }
}
