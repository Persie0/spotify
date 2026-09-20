package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class eq80 implements m6k {
    public static final Parcelable.Creator<eq80> CREATOR = new i980(18);

    /* JADX INFO: renamed from: a */
    public final String f61808a;

    /* JADX INFO: renamed from: b */
    public final voc1 f61809b;

    /* JADX INFO: renamed from: c */
    public final agy f61810c;

    /* JADX INFO: renamed from: d */
    public final ump0 f61811d;

    /* JADX INFO: renamed from: e */
    public final z6k f61812e;

    public eq80(String str, voc1 voc1Var, agy agyVar, ump0 ump0Var) {
        this.f61808a = str;
        this.f61809b = voc1Var;
        this.f61810c = agyVar;
        this.f61811d = ump0Var;
        this.f61812e = new z6k(str, (String) null, 6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq80)) {
            return false;
        }
        eq80 eq80Var = (eq80) obj;
        return wj50.m88271j(this.f61808a, eq80Var.f61808a) && wj50.m88271j(this.f61809b, eq80Var.f61809b) && wj50.m88271j(this.f61810c, eq80Var.f61810c) && wj50.m88271j(this.f61811d, eq80Var.f61811d);
    }

    @Override // p204p.m6k
    public final z6k getTarget() {
        return this.f61812e;
    }

    public final int hashCode() {
        return this.f61811d.hashCode() + ((this.f61810c.hashCode() + s571.m77243b(this.f61808a.hashCode() * 31, 31, this.f61809b.f243453a)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61808a);
        parcel.writeParcelable(this.f61809b, i);
        parcel.writeParcelable(this.f61810c, i);
        this.f61811d.writeToParcel(parcel, i);
    }

    public /* synthetic */ eq80(String str, voc1 voc1Var, agy agyVar) {
        this(str, voc1Var, agyVar, new ump0(null, null, false, null));
    }
}
