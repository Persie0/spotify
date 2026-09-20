package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class eac0 implements Parcelable {
    public static final Parcelable.Creator<eac0> CREATOR = new f4c0(3);

    /* JADX INFO: renamed from: a */
    public final String f57620a;

    /* JADX INFO: renamed from: b */
    public final z5c0 f57621b;

    /* JADX INFO: renamed from: c */
    public final voc1 f57622c;

    public eac0(String str, z5c0 z5c0Var, voc1 voc1Var) {
        this.f57620a = str;
        this.f57621b = z5c0Var;
        this.f57622c = voc1Var;
    }

    /* JADX INFO: renamed from: c */
    public final voc1 m38284c() {
        return this.f57622c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eac0)) {
            return false;
        }
        eac0 eac0Var = (eac0) obj;
        return wj50.m88271j(this.f57620a, eac0Var.f57620a) && this.f57621b == eac0Var.f57621b && wj50.m88271j(this.f57622c, eac0Var.f57622c);
    }

    public final int hashCode() {
        return this.f57622c.f243453a.hashCode() + ((this.f57621b.hashCode() + (this.f57620a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57620a);
        parcel.writeString(this.f57621b.name());
        parcel.writeParcelable(this.f57622c, i);
    }
}
