package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class qbm0 implements Parcelable {
    public static final Parcelable.Creator<qbm0> CREATOR = new cpl0(10);

    /* JADX INFO: renamed from: a */
    public final String f187117a;

    /* JADX INFO: renamed from: b */
    public final cbm0 f187118b;

    /* JADX INFO: renamed from: c */
    public final String f187119c;

    /* JADX INFO: renamed from: d */
    public final d850 f187120d;

    /* JADX INFO: renamed from: e */
    public final String f187121e;

    public qbm0(String str, cbm0 cbm0Var, String str2, d850 d850Var, String str3) {
        this.f187117a = str;
        this.f187118b = cbm0Var;
        this.f187119c = str2;
        this.f187120d = d850Var;
        this.f187121e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbm0)) {
            return false;
        }
        qbm0 qbm0Var = (qbm0) obj;
        return wj50.m88271j(this.f187117a, qbm0Var.f187117a) && wj50.m88271j(this.f187118b, qbm0Var.f187118b) && wj50.m88271j(this.f187119c, qbm0Var.f187119c) && wj50.m88271j(this.f187120d, qbm0Var.f187120d) && wj50.m88271j(this.f187121e, qbm0Var.f187121e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f187118b.hashCode() + (this.f187117a.hashCode() * 31)) * 31, 31, this.f187119c);
        d850 d850Var = this.f187120d;
        return this.f187121e.hashCode() + ((iM77243b + (d850Var == null ? 0 : d850Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f187117a);
        parcel.writeSerializable(this.f187118b);
        parcel.writeString(this.f187119c);
        parcel.writeParcelable(this.f187120d, i);
        parcel.writeString(this.f187121e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ qbm0(String str, cbm0 cbm0Var, String str2, int i) {
        String str3 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            cbm0Var = xgg1.m90749Z4();
        }
        this(str3, cbm0Var, (i & 4) != 0 ? "" : str2, null, "");
    }
}
