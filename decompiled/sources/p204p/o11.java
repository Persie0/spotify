package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class o11 implements x11 {
    public static final Parcelable.Creator<o11> CREATOR = new g11(4);

    /* JADX INFO: renamed from: a */
    public final boolean f160562a;

    /* JADX INFO: renamed from: b */
    public final cix f160563b;

    public o11(boolean z, cix cixVar) {
        this.f160562a = z;
        this.f160563b = cixVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o11)) {
            return false;
        }
        o11 o11Var = (o11) obj;
        return this.f160562a == o11Var.f160562a && wj50.m88271j(this.f160563b, o11Var.f160563b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f160562a) * 31;
        cix cixVar = this.f160563b;
        return iHashCode + (cixVar == null ? 0 : cixVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f160562a ? 1 : 0);
        parcel.writeParcelable(this.f160563b, i);
    }
}
