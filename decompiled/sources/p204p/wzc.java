package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wzc implements Parcelable {
    public static final Parcelable.Creator<wzc> CREATOR = new qvc(6);

    /* JADX INFO: renamed from: a */
    public final int f256565a;

    /* JADX INFO: renamed from: b */
    public final String f256566b;

    /* JADX INFO: renamed from: c */
    public final wwu f256567c;

    /* JADX INFO: renamed from: d */
    public final String f256568d;

    /* JADX INFO: renamed from: e */
    public final boolean f256569e;

    public wzc(int i, String str, wwu wwuVar, String str2, boolean z) {
        this.f256565a = i;
        this.f256566b = str;
        this.f256567c = wwuVar;
        this.f256568d = str2;
        this.f256569e = z;
    }

    /* JADX INFO: renamed from: c */
    public final int m89419c() {
        return this.f256565a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzc)) {
            return false;
        }
        wzc wzcVar = (wzc) obj;
        return this.f256565a == wzcVar.f256565a && wj50.m88271j(this.f256566b, wzcVar.f256566b) && wj50.m88271j(this.f256567c, wzcVar.f256567c) && wj50.m88271j(this.f256568d, wzcVar.f256568d) && this.f256569e == wzcVar.f256569e;
    }

    public final String getUri() {
        return this.f256568d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256569e) + s571.m77243b((this.f256567c.hashCode() + s571.m77243b(edb.m38547C(this.f256565a) * 31, 31, this.f256566b)) * 31, 31, this.f256568d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(m6b.m61001p(this.f256565a));
        parcel.writeString(this.f256566b);
        parcel.writeParcelable(this.f256567c, i);
        parcel.writeString(this.f256568d);
        parcel.writeInt(this.f256569e ? 1 : 0);
    }
}
