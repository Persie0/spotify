package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class n2m extends as01 {
    public static final Parcelable.Creator<n2m> CREATOR = new pkl(10);

    /* JADX INFO: renamed from: a */
    public final String f149785a;

    /* JADX INFO: renamed from: b */
    public final String f149786b;

    /* JADX INFO: renamed from: c */
    public final String f149787c;

    /* JADX INFO: renamed from: d */
    public final String f149788d;

    /* JADX INFO: renamed from: e */
    public final rgy f149789e;

    /* JADX INFO: renamed from: f */
    public final icr0 f149790f;

    public n2m(String str, String str2, String str3, String str4, rgy rgyVar, icr0 icr0Var) {
        this.f149785a = str;
        this.f149786b = str2;
        this.f149787c = str3;
        this.f149788d = str4;
        this.f149789e = rgyVar;
        this.f149790f = icr0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2m)) {
            return false;
        }
        n2m n2mVar = (n2m) obj;
        return wj50.m88271j(this.f149785a, n2mVar.f149785a) && wj50.m88271j(this.f149786b, n2mVar.f149786b) && wj50.m88271j(this.f149787c, n2mVar.f149787c) && wj50.m88271j(this.f149788d, n2mVar.f149788d) && wj50.m88271j(this.f149789e, n2mVar.f149789e) && wj50.m88271j(this.f149790f, n2mVar.f149790f);
    }

    public final int hashCode() {
        return this.f149790f.hashCode() + ((this.f149789e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f149785a.hashCode() * 31, 31, this.f149786b), 31, this.f149787c), 31, this.f149788d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149785a);
        parcel.writeString(this.f149786b);
        parcel.writeString(this.f149787c);
        parcel.writeString(this.f149788d);
        parcel.writeParcelable(this.f149789e, i);
        parcel.writeParcelable(this.f149790f, i);
    }
}
