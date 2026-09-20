package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class qmf implements Parcelable {
    public static final Parcelable.Creator<qmf> CREATOR = new rae(16);

    /* JADX INFO: renamed from: a */
    public final String f190211a;

    /* JADX INFO: renamed from: b */
    public final String f190212b;

    /* JADX INFO: renamed from: c */
    public final boolean f190213c;

    /* JADX INFO: renamed from: d */
    public final boolean f190214d;

    /* JADX INFO: renamed from: e */
    public final xm70 f190215e;

    public qmf(String str, String str2, boolean z, boolean z2, xm70 xm70Var) {
        this.f190211a = str;
        this.f190212b = str2;
        this.f190213c = z;
        this.f190214d = z2;
        this.f190215e = xm70Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmf)) {
            return false;
        }
        qmf qmfVar = (qmf) obj;
        return wj50.m88271j(this.f190211a, qmfVar.f190211a) && wj50.m88271j(this.f190212b, qmfVar.f190212b) && this.f190213c == qmfVar.f190213c && this.f190214d == qmfVar.f190214d && wj50.m88271j(this.f190215e, qmfVar.f190215e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(this.f190211a.hashCode() * 31, 31, this.f190212b), 31, this.f190213c), 31, this.f190214d);
        xm70 xm70Var = this.f190215e;
        return iM77245d + (xm70Var == null ? 0 : xm70Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f190211a);
        parcel.writeString(this.f190212b);
        parcel.writeInt(this.f190213c ? 1 : 0);
        parcel.writeInt(this.f190214d ? 1 : 0);
        parcel.writeParcelable(this.f190215e, i);
    }
}
