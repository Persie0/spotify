package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ql */
/* JADX INFO: loaded from: classes8.dex */
public final class C2297ql extends AbstractC2419tl {
    public static final Parcelable.Creator<C2297ql> CREATOR = new C2047kc(23);

    /* JADX INFO: renamed from: a */
    public final String f189681a;

    public C2297ql(String str) {
        this.f189681a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2297ql) && wj50.m88271j(this.f189681a, ((C2297ql) obj).f189681a);
    }

    public final int hashCode() {
        return this.f189681a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f189681a);
    }
}
