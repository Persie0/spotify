package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ptd implements qtd {
    public static final Parcelable.Creator<ptd> CREATOR = new fjd(13);

    /* JADX INFO: renamed from: a */
    public final String f181103a;

    /* JADX INFO: renamed from: b */
    public final xcl0 f181104b;

    public ptd(String str, xcl0 xcl0Var) {
        this.f181103a = str;
        this.f181104b = xcl0Var;
    }

    @Override // p204p.qtd
    /* JADX INFO: renamed from: a */
    public final String mo65613a() {
        return this.f181103a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptd)) {
            return false;
        }
        ptd ptdVar = (ptd) obj;
        return wj50.m88271j(this.f181103a, ptdVar.f181103a) && wj50.m88271j(this.f181104b, ptdVar.f181104b);
    }

    public final int hashCode() {
        return this.f181104b.hashCode() + (this.f181103a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f181103a);
        parcel.writeParcelable(this.f181104b, i);
    }
}
