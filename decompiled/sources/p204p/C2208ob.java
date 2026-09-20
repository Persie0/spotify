package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ob */
/* JADX INFO: loaded from: classes8.dex */
public final class C2208ob extends AbstractC2332rb implements Parcelable {
    public static final Parcelable.Creator<C2208ob> CREATOR = new ora(13);

    /* JADX INFO: renamed from: a */
    public final boolean f163499a;

    /* JADX INFO: renamed from: b */
    public final boolean f163500b;

    public C2208ob(boolean z, boolean z2) {
        this.f163499a = z;
        this.f163500b = z2;
    }

    @Override // p204p.AbstractC2332rb
    /* JADX INFO: renamed from: c */
    public final boolean mo66584c() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208ob)) {
            return false;
        }
        C2208ob c2208ob = (C2208ob) obj;
        return this.f163499a == c2208ob.f163499a && this.f163500b == c2208ob.f163500b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163500b) + (Boolean.hashCode(this.f163499a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f163499a ? 1 : 0);
        parcel.writeInt(this.f163500b ? 1 : 0);
    }
}
