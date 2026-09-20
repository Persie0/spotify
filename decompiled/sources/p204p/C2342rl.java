package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.rl */
/* JADX INFO: loaded from: classes8.dex */
public final class C2342rl extends AbstractC2419tl {
    public static final Parcelable.Creator<C2342rl> CREATOR = new C2047kc(24);

    /* JADX INFO: renamed from: a */
    public final String f200185a;

    public C2342rl(String str) {
        this.f200185a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2342rl) && wj50.m88271j(this.f200185a, ((C2342rl) obj).f200185a);
    }

    public final int hashCode() {
        return this.f200185a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f200185a);
    }
}
