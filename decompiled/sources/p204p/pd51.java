package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pd51 implements Parcelable {
    public static final Parcelable.Creator<pd51> CREATOR = new nc51(3);

    /* JADX INFO: renamed from: a */
    public final int f176353a;

    /* JADX INFO: renamed from: b */
    public final rc51 f176354b;

    /* JADX INFO: renamed from: c */
    public final int f176355c;

    /* JADX INFO: renamed from: d */
    public final hdn0 f176356d;

    /* JADX INFO: renamed from: e */
    public final kb51 f176357e;

    public pd51(int i, rc51 rc51Var, int i2, hdn0 hdn0Var, kb51 kb51Var) {
        this.f176353a = i;
        this.f176354b = rc51Var;
        this.f176355c = i2;
        this.f176356d = hdn0Var;
        this.f176357e = kb51Var;
    }

    /* JADX INFO: renamed from: c */
    public static pd51 m69641c(pd51 pd51Var, rc51 rc51Var, int i, hdn0 hdn0Var, kb51 kb51Var, int i2) {
        rc51 rc51Var2 = rc51Var;
        int i3 = pd51Var.f176353a;
        if ((i2 & 2) != 0) {
            rc51Var2 = pd51Var.f176354b;
        }
        if ((i2 & 4) != 0) {
            i = pd51Var.f176355c;
        }
        if ((i2 & 8) != 0) {
            hdn0Var = pd51Var.f176356d;
        }
        if ((i2 & 16) != 0) {
            kb51Var = pd51Var.f176357e;
        }
        kb51 kb51Var2 = kb51Var;
        pd51Var.getClass();
        hdn0 hdn0Var2 = hdn0Var;
        return new pd51(i3, rc51Var2, i, hdn0Var2, kb51Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd51)) {
            return false;
        }
        pd51 pd51Var = (pd51) obj;
        return this.f176353a == pd51Var.f176353a && wj50.m88271j(this.f176354b, pd51Var.f176354b) && this.f176355c == pd51Var.f176355c && this.f176356d == pd51Var.f176356d && wj50.m88271j(this.f176357e, pd51Var.f176357e);
    }

    /* JADX INFO: renamed from: g */
    public final hdn0 m69642g() {
        return this.f176356d;
    }

    /* JADX INFO: renamed from: h */
    public final kb51 m69643h() {
        return this.f176357e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f176357e.f121097a) + ((this.f176356d.hashCode() + mt60.m62800g(this.f176355c, (this.f176354b.hashCode() + (Integer.hashCode(this.f176353a) * 31)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f176353a);
        parcel.writeParcelable(this.f176354b, i);
        parcel.writeInt(this.f176355c);
        parcel.writeString(this.f176356d.name());
        this.f176357e.writeToParcel(parcel, i);
    }

    public /* synthetic */ pd51(int i) {
        this(i, pc51.f175960a, 0, hdn0.f90167b, new kb51(2));
    }
}
