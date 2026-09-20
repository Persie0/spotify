package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class g490 extends i490 implements f490 {
    public static final Parcelable.Creator<g490> CREATOR = new x390(6);

    /* JADX INFO: renamed from: a */
    public final boolean f76376a;

    public g490(boolean z) {
        this.f76376a = z;
    }

    @Override // p204p.f490
    /* JADX INFO: renamed from: c */
    public final boolean mo28078c() {
        return this.f76376a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g490) && this.f76376a == ((g490) obj).f76376a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76376a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f76376a ? 1 : 0);
    }
}
