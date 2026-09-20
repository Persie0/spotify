package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class djd extends jjd {
    public static final Parcelable.Creator<djd> CREATOR = new qvc(28);

    /* JADX INFO: renamed from: a */
    public final cjd f49658a;

    /* JADX INFO: renamed from: b */
    public final boolean f49659b;

    /* JADX INFO: renamed from: c */
    public final gcl f49660c;

    public djd(cjd cjdVar, boolean z, gcl gclVar) {
        this.f49658a = cjdVar;
        this.f49659b = z;
        this.f49660c = gclVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djd)) {
            return false;
        }
        djd djdVar = (djd) obj;
        return wj50.m88271j(this.f49658a, djdVar.f49658a) && this.f49659b == djdVar.f49659b && wj50.m88271j(this.f49660c, djdVar.f49660c);
    }

    public final int hashCode() {
        return this.f49660c.hashCode() + s571.m77245d(this.f49658a.hashCode() * 31, 31, this.f49659b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f49658a, i);
        parcel.writeInt(this.f49659b ? 1 : 0);
        parcel.writeParcelable(this.f49660c, i);
    }
}
