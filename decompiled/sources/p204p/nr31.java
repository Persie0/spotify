package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class nr31 implements Parcelable {
    public static final Parcelable.Creator<nr31> CREATOR = new ln31(7);

    /* JADX INFO: renamed from: a */
    public final String f157437a;

    /* JADX INFO: renamed from: b */
    public final lr31 f157438b;

    /* JADX INFO: renamed from: c */
    public final boolean f157439c;

    /* JADX INFO: renamed from: d */
    public final kr31 f157440d;

    public nr31(String str, lr31 lr31Var, boolean z, kr31 kr31Var) {
        this.f157437a = str;
        this.f157438b = lr31Var;
        this.f157439c = z;
        this.f157440d = kr31Var;
    }

    /* JADX INFO: renamed from: c */
    public static nr31 m65468c(nr31 nr31Var, boolean z, kr31 kr31Var, int i) {
        String str = nr31Var.f157437a;
        lr31 lr31Var = nr31Var.f157438b;
        if ((i & 4) != 0) {
            z = nr31Var.f157439c;
        }
        if ((i & 8) != 0) {
            kr31Var = nr31Var.f157440d;
        }
        nr31Var.getClass();
        return new nr31(str, lr31Var, z, kr31Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr31)) {
            return false;
        }
        nr31 nr31Var = (nr31) obj;
        return wj50.m88271j(this.f157437a, nr31Var.f157437a) && this.f157438b == nr31Var.f157438b && this.f157439c == nr31Var.f157439c && wj50.m88271j(this.f157440d, nr31Var.f157440d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f157438b.hashCode() + (this.f157437a.hashCode() * 31)) * 31, 31, this.f157439c);
        kr31 kr31Var = this.f157440d;
        return iM77245d + (kr31Var == null ? 0 : kr31Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f157437a);
        parcel.writeString(this.f157438b.name());
        parcel.writeInt(this.f157439c ? 1 : 0);
        kr31 kr31Var = this.f157440d;
        if (kr31Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kr31Var.writeToParcel(parcel, i);
        }
    }
}
