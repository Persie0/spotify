package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class jz80 implements Parcelable {
    public static final Parcelable.Creator<jz80> CREATOR = new ct80(15);

    /* JADX INFO: renamed from: a */
    public final gvl0 f117618a;

    /* JADX INFO: renamed from: b */
    public final h5u0 f117619b;

    /* JADX INFO: renamed from: c */
    public final dw50 f117620c;

    /* JADX INFO: renamed from: d */
    public final int f117621d;

    /* JADX INFO: renamed from: e */
    public final int f117622e;

    /* JADX INFO: renamed from: f */
    public final j1v0 f117623f;

    public jz80(gvl0 gvl0Var, h5u0 h5u0Var, dw50 dw50Var, int i, int i2, j1v0 j1v0Var) {
        this.f117618a = gvl0Var;
        this.f117619b = h5u0Var;
        this.f117620c = dw50Var;
        this.f117621d = i;
        this.f117622e = i2;
        this.f117623f = j1v0Var;
    }

    /* JADX INFO: renamed from: c */
    public static jz80 m54849c(jz80 jz80Var, gvl0 gvl0Var, h5u0 h5u0Var, dw50 dw50Var, i1v0 i1v0Var, int i) {
        if ((i & 1) != 0) {
            gvl0Var = jz80Var.f117618a;
        }
        gvl0 gvl0Var2 = gvl0Var;
        if ((i & 2) != 0) {
            h5u0Var = jz80Var.f117619b;
        }
        h5u0 h5u0Var2 = h5u0Var;
        if ((i & 4) != 0) {
            dw50Var = jz80Var.f117620c;
        }
        dw50 dw50Var2 = dw50Var;
        int i2 = jz80Var.f117621d;
        int i3 = jz80Var.f117622e;
        j1v0 j1v0Var = i1v0Var;
        if ((i & 32) != 0) {
            j1v0Var = jz80Var.f117623f;
        }
        jz80Var.getClass();
        return new jz80(gvl0Var2, h5u0Var2, dw50Var2, i2, i3, j1v0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz80)) {
            return false;
        }
        jz80 jz80Var = (jz80) obj;
        return wj50.m88271j(this.f117618a, jz80Var.f117618a) && wj50.m88271j(this.f117619b, jz80Var.f117619b) && wj50.m88271j(this.f117620c, jz80Var.f117620c) && this.f117621d == jz80Var.f117621d && this.f117622e == jz80Var.f117622e && wj50.m88271j(this.f117623f, jz80Var.f117623f);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m54850g() {
        ibj ibjVar = this.f117618a.f84784e;
        return (ibjVar instanceof ebj ? (ebj) ibjVar : null) != null;
    }

    public final int hashCode() {
        return this.f117623f.hashCode() + mt60.m62800g(this.f117622e, mt60.m62800g(this.f117621d, (this.f117620c.hashCode() + ((this.f117619b.hashCode() + (this.f117618a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f117618a.writeToParcel(parcel, i);
        this.f117619b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f117620c, i);
        parcel.writeInt(this.f117621d);
        parcel.writeInt(this.f117622e);
        parcel.writeParcelable(this.f117623f, i);
    }
}
