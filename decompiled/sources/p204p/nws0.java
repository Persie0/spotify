package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class nws0 implements Parcelable {
    public static final Parcelable.Creator<nws0> CREATOR = new wds0(14);

    /* JADX INFO: renamed from: a */
    public final String f159282a;

    /* JADX INFO: renamed from: b */
    public final lws0 f159283b;

    /* JADX INFO: renamed from: c */
    public final sr01 f159284c;

    /* JADX INFO: renamed from: d */
    public final z0r f159285d;

    public nws0(String str, lws0 lws0Var, sr01 sr01Var, z0r z0rVar) {
        this.f159282a = str;
        this.f159283b = lws0Var;
        this.f159284c = sr01Var;
        this.f159285d = z0rVar;
    }

    /* JADX INFO: renamed from: c */
    public static nws0 m65804c(nws0 nws0Var, lws0 lws0Var, z0r z0rVar, int i) {
        String str = nws0Var.f159282a;
        if ((i & 2) != 0) {
            lws0Var = nws0Var.f159283b;
        }
        sr01 sr01Var = nws0Var.f159284c;
        if ((i & 8) != 0) {
            z0rVar = nws0Var.f159285d;
        }
        nws0Var.getClass();
        return new nws0(str, lws0Var, sr01Var, z0rVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nws0)) {
            return false;
        }
        nws0 nws0Var = (nws0) obj;
        return wj50.m88271j(this.f159282a, nws0Var.f159282a) && wj50.m88271j(this.f159283b, nws0Var.f159283b) && wj50.m88271j(this.f159284c, nws0Var.f159284c) && wj50.m88271j(this.f159285d, nws0Var.f159285d);
    }

    public final int hashCode() {
        int iM75733g = rkh0.m75733g(this.f159284c, (this.f159283b.hashCode() + (this.f159282a.hashCode() * 31)) * 31, 31);
        z0r z0rVar = this.f159285d;
        return iM75733g + (z0rVar == null ? 0 : z0rVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f159282a);
        parcel.writeParcelable(this.f159283b, i);
        parcel.writeParcelable(this.f159284c, i);
    }

    public /* synthetic */ nws0(String str, lws0 lws0Var, sr01 sr01Var, int i) {
        this(str, (i & 2) != 0 ? kws0.f127180a : lws0Var, sr01Var, (z0r) null);
    }
}
