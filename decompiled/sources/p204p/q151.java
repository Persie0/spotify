package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q151 implements Parcelable {
    public static final Parcelable.Creator<q151> CREATOR = new q051(7);

    /* JADX INFO: renamed from: a */
    public final String f184211a;

    /* JADX INFO: renamed from: b */
    public final e10 f184212b;

    /* JADX INFO: renamed from: c */
    public final oiy0 f184213c;

    /* JADX INFO: renamed from: d */
    public final q151 f184214d;

    /* JADX INFO: renamed from: e */
    public final q151 f184215e;

    public q151(String str, e10 e10Var, oiy0 oiy0Var, q151 q151Var, q151 q151Var2) {
        this.f184211a = str;
        this.f184212b = e10Var;
        this.f184213c = oiy0Var;
        this.f184214d = q151Var;
        this.f184215e = q151Var2;
    }

    /* JADX INFO: renamed from: c */
    public static q151 m71870c(q151 q151Var, oiy0 oiy0Var) {
        String str = q151Var.f184211a;
        e10 e10Var = q151Var.f184212b;
        q151 q151Var2 = q151Var.f184214d;
        q151 q151Var3 = q151Var.f184215e;
        q151Var.getClass();
        return new q151(str, e10Var, oiy0Var, q151Var2, q151Var3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q151)) {
            return false;
        }
        q151 q151Var = (q151) obj;
        return wj50.m88271j(this.f184211a, q151Var.f184211a) && wj50.m88271j(this.f184212b, q151Var.f184212b) && wj50.m88271j(this.f184213c, q151Var.f184213c) && wj50.m88271j(this.f184214d, q151Var.f184214d) && wj50.m88271j(this.f184215e, q151Var.f184215e);
    }

    public final String getId() {
        return this.f184211a;
    }

    public final int hashCode() {
        int iHashCode = (this.f184213c.hashCode() + ((this.f184212b.hashCode() + (this.f184211a.hashCode() * 31)) * 31)) * 31;
        q151 q151Var = this.f184214d;
        int iHashCode2 = (iHashCode + (q151Var == null ? 0 : q151Var.hashCode())) * 31;
        q151 q151Var2 = this.f184215e;
        return iHashCode2 + (q151Var2 != null ? q151Var2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f184211a);
        parcel.writeParcelable(this.f184212b, i);
        parcel.writeParcelable(this.f184213c, i);
        q151 q151Var = this.f184214d;
        if (q151Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            q151Var.writeToParcel(parcel, i);
        }
        q151 q151Var2 = this.f184215e;
        if (q151Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            q151Var2.writeToParcel(parcel, i);
        }
    }
}
