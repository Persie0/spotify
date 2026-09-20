package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class p370 implements Parcelable {
    public static final Parcelable.Creator<p370> CREATOR = new w270(3);

    /* JADX INFO: renamed from: a */
    public final String f173572a;

    /* JADX INFO: renamed from: b */
    public final h891 f173573b;

    /* JADX INFO: renamed from: c */
    public final String f173574c;

    /* JADX INFO: renamed from: d */
    public final String f173575d;

    /* JADX INFO: renamed from: e */
    public final b370 f173576e;

    /* JADX INFO: renamed from: f */
    public final dlx f173577f;

    /* JADX INFO: renamed from: g */
    public final boolean f173578g;

    public p370(String str, h891 h891Var, String str2, String str3, b370 b370Var, dlx dlxVar, boolean z) {
        this.f173572a = str;
        this.f173573b = h891Var;
        this.f173574c = str2;
        this.f173575d = str3;
        this.f173576e = b370Var;
        this.f173577f = dlxVar;
        this.f173578g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p370)) {
            return false;
        }
        p370 p370Var = (p370) obj;
        return wj50.m88271j(this.f173572a, p370Var.f173572a) && wj50.m88271j(this.f173573b, p370Var.f173573b) && wj50.m88271j(this.f173574c, p370Var.f173574c) && wj50.m88271j(this.f173575d, p370Var.f173575d) && wj50.m88271j(this.f173576e, p370Var.f173576e) && wj50.m88271j(this.f173577f, p370Var.f173577f) && this.f173578g == p370Var.f173578g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f173573b.hashCode() + (this.f173572a.hashCode() * 31)) * 31, 31, this.f173574c);
        String str = this.f173575d;
        return Boolean.hashCode(this.f173578g) + ((this.f173577f.hashCode() + ((this.f173576e.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f173572a);
        parcel.writeParcelable(this.f173573b, i);
        parcel.writeString(this.f173574c);
        parcel.writeString(this.f173575d);
        parcel.writeParcelable(this.f173576e, i);
        parcel.writeParcelable(this.f173577f, i);
        parcel.writeInt(this.f173578g ? 1 : 0);
    }
}
