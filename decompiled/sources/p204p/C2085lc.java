package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.lc */
/* JADX INFO: loaded from: classes8.dex */
public final class C2085lc extends AbstractC2209oc implements Parcelable {
    public static final Parcelable.Creator<C2085lc> CREATOR = new C2047kc(0);

    /* JADX INFO: renamed from: a */
    public final boolean f131782a;

    public C2085lc(boolean z) {
        this.f131782a = z;
    }

    @Override // p204p.AbstractC2209oc
    /* JADX INFO: renamed from: c */
    public final boolean mo58677c() {
        return this.f131782a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2085lc) && this.f131782a == ((C2085lc) obj).f131782a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131782a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f131782a ? 1 : 0);
    }
}
