package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class h2m implements Parcelable {
    public static final Parcelable.Creator<h2m> CREATOR = new pkl(9);

    /* JADX INFO: renamed from: a */
    public final String f87026a;

    /* JADX INFO: renamed from: b */
    public final String f87027b;

    /* JADX INFO: renamed from: c */
    public final String f87028c;

    /* JADX INFO: renamed from: d */
    public final String f87029d;

    /* JADX INFO: renamed from: e */
    public final icr0 f87030e;

    /* JADX INFO: renamed from: f */
    public final int f87031f;

    /* JADX INFO: renamed from: g */
    public final rgy f87032g;

    /* JADX INFO: renamed from: h */
    public final xr01 f87033h;

    public h2m(String str, String str2, String str3, String str4, icr0 icr0Var, int i, rgy rgyVar, xr01 xr01Var) {
        this.f87026a = str;
        this.f87027b = str2;
        this.f87028c = str3;
        this.f87029d = str4;
        this.f87030e = icr0Var;
        this.f87031f = i;
        this.f87032g = rgyVar;
        this.f87033h = xr01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2m)) {
            return false;
        }
        h2m h2mVar = (h2m) obj;
        return wj50.m88271j(this.f87026a, h2mVar.f87026a) && wj50.m88271j(this.f87027b, h2mVar.f87027b) && wj50.m88271j(this.f87028c, h2mVar.f87028c) && wj50.m88271j(this.f87029d, h2mVar.f87029d) && wj50.m88271j(this.f87030e, h2mVar.f87030e) && this.f87031f == h2mVar.f87031f && wj50.m88271j(this.f87032g, h2mVar.f87032g) && wj50.m88271j(this.f87033h, h2mVar.f87033h);
    }

    public final int hashCode() {
        return this.f87033h.f265192a.hashCode() + ((this.f87032g.hashCode() + f710.m40938f(this.f87031f, (this.f87030e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f87026a.hashCode() * 31, 31, this.f87027b), 31, this.f87028c), 31, this.f87029d)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f87026a);
        parcel.writeString(this.f87027b);
        parcel.writeString(this.f87028c);
        parcel.writeString(this.f87029d);
        parcel.writeParcelable(this.f87030e, i);
        parcel.writeString(stz0.m79362p(this.f87031f));
        parcel.writeParcelable(this.f87032g, i);
        parcel.writeParcelable(this.f87033h, i);
    }
}
