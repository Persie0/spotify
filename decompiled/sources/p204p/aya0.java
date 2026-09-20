package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class aya0 implements Parcelable {
    public static final Parcelable.Creator<aya0> CREATOR = new ama0(20);

    /* JADX INFO: renamed from: a */
    public final String f21172a;

    /* JADX INFO: renamed from: b */
    public final String f21173b;

    /* JADX INFO: renamed from: c */
    public final String f21174c;

    /* JADX INFO: renamed from: d */
    public final tyv f21175d;

    /* JADX INFO: renamed from: e */
    public final Integer f21176e;

    /* JADX INFO: renamed from: f */
    public final qrv0 f21177f;

    public aya0(String str, String str2, String str3, tyv tyvVar, Integer num, qrv0 qrv0Var) {
        this.f21172a = str;
        this.f21173b = str2;
        this.f21174c = str3;
        this.f21175d = tyvVar;
        this.f21176e = num;
        this.f21177f = qrv0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aya0)) {
            return false;
        }
        aya0 aya0Var = (aya0) obj;
        return wj50.m88271j(this.f21172a, aya0Var.f21172a) && wj50.m88271j(this.f21173b, aya0Var.f21173b) && wj50.m88271j(this.f21174c, aya0Var.f21174c) && wj50.m88271j(this.f21175d, aya0Var.f21175d) && wj50.m88271j(this.f21176e, aya0Var.f21176e) && this.f21177f == aya0Var.f21177f;
    }

    public final int hashCode() {
        int iHashCode = (this.f21175d.hashCode() + s571.m77243b(s571.m77243b(this.f21172a.hashCode() * 31, 31, this.f21173b), 31, this.f21174c)) * 31;
        Integer num = this.f21176e;
        return this.f21177f.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21172a);
        parcel.writeString(this.f21173b);
        parcel.writeString(this.f21174c);
        parcel.writeParcelable(this.f21175d, i);
        Integer num = this.f21176e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f21177f.name());
    }
}
