package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.nl */
/* JADX INFO: loaded from: classes8.dex */
public final class C2168nl extends AbstractC2500vl {
    public static final Parcelable.Creator<C2168nl> CREATOR = new C2047kc(19);

    /* JADX INFO: renamed from: a */
    public final String f154978a;

    /* JADX INFO: renamed from: b */
    public final String f154979b;

    public C2168nl(String str, String str2) {
        this.f154978a = str;
        this.f154979b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2168nl)) {
            return false;
        }
        C2168nl c2168nl = (C2168nl) obj;
        return wj50.m88271j(this.f154978a, c2168nl.f154978a) && wj50.m88271j(this.f154979b, c2168nl.f154979b);
    }

    public final int hashCode() {
        return this.f154979b.hashCode() + (this.f154978a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f154978a);
        parcel.writeString(this.f154979b);
    }
}
