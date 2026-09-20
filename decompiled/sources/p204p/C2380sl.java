package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.sl */
/* JADX INFO: loaded from: classes8.dex */
public final class C2380sl extends AbstractC2419tl {
    public static final Parcelable.Creator<C2380sl> CREATOR = new C2047kc(25);

    /* JADX INFO: renamed from: a */
    public final String f210225a;

    public C2380sl(String str) {
        this.f210225a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2380sl) && wj50.m88271j(this.f210225a, ((C2380sl) obj).f210225a);
    }

    public final int hashCode() {
        return this.f210225a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f210225a);
    }
}
