package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class akk implements Parcelable {
    public static final Parcelable.Creator<akk> CREATOR = new kck(15);

    /* JADX INFO: renamed from: a */
    public final pla1 f16560a;

    /* JADX INFO: renamed from: b */
    public final sjk f16561b;

    /* JADX INFO: renamed from: c */
    public final xjk f16562c;

    /* JADX INFO: renamed from: d */
    public final pla1 f16563d;

    public akk(pla1 pla1Var, sjk sjkVar, xjk xjkVar, pla1 pla1Var2) {
        this.f16560a = pla1Var;
        this.f16561b = sjkVar;
        this.f16562c = xjkVar;
        this.f16563d = pla1Var2;
    }

    /* JADX INFO: renamed from: c */
    public static akk m26248c(akk akkVar, pla1 pla1Var, pla1 pla1Var2, int i) {
        sjk sjkVar = akkVar.f16561b;
        xjk xjkVar = akkVar.f16562c;
        if ((i & 8) != 0) {
            pla1Var2 = akkVar.f16563d;
        }
        akkVar.getClass();
        return new akk(pla1Var, sjkVar, xjkVar, pla1Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akk)) {
            return false;
        }
        akk akkVar = (akk) obj;
        return wj50.m88271j(this.f16560a, akkVar.f16560a) && wj50.m88271j(this.f16561b, akkVar.f16561b) && wj50.m88271j(this.f16562c, akkVar.f16562c) && wj50.m88271j(this.f16563d, akkVar.f16563d);
    }

    /* JADX INFO: renamed from: g */
    public final String m26249g() {
        return this.f16560a.f178682b;
    }

    public final String getUsername() {
        return this.f16560a.f178681a;
    }

    public final int hashCode() {
        int iHashCode = (this.f16562c.hashCode() + ((this.f16561b.hashCode() + (this.f16560a.hashCode() * 31)) * 31)) * 31;
        pla1 pla1Var = this.f16563d;
        return iHashCode + (pla1Var == null ? 0 : pla1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f16560a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f16561b, i);
        parcel.writeParcelable(this.f16562c, i);
        pla1 pla1Var = this.f16563d;
        if (pla1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pla1Var.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ akk(int i, pla1 pla1Var) {
        sjk sjkVar;
        if ((i & 2) != 0) {
            sjkVar = rjk.f199844a;
        } else {
            sjkVar = qjk.f189264a;
        }
        this(pla1Var, sjkVar, tjk.f220940a, null);
    }
}
