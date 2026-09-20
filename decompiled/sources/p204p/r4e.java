package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class r4e extends b221 implements ikz0 {
    public static final Parcelable.Creator<r4e> CREATOR = new j0e(27);

    /* JADX INFO: renamed from: a */
    public final String f195728a;

    /* JADX INFO: renamed from: b */
    public final String f195729b;

    /* JADX INFO: renamed from: c */
    public final boolean f195730c;

    /* JADX INFO: renamed from: d */
    public final String f195731d;

    public r4e(String str, String str2, boolean z, String str3) {
        this.f195728a = str;
        this.f195729b = str2;
        this.f195730c = z;
        this.f195731d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4e)) {
            return false;
        }
        r4e r4eVar = (r4e) obj;
        return wj50.m88271j(this.f195728a, r4eVar.f195728a) && wj50.m88271j(this.f195729b, r4eVar.f195729b) && this.f195730c == r4eVar.f195730c && wj50.m88271j(this.f195731d, r4eVar.f195731d);
    }

    @Override // p204p.ikz0
    /* JADX INFO: renamed from: f */
    public final boolean mo28935f() {
        return this.f195730c;
    }

    @Override // p204p.b221
    public final String getUri() {
        return this.f195728a;
    }

    public final int hashCode() {
        return this.f195731d.hashCode() + s571.m77245d(s571.m77243b(this.f195728a.hashCode() * 31, 31, this.f195729b), 31, this.f195730c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f195728a);
        parcel.writeString(this.f195729b);
        parcel.writeInt(this.f195730c ? 1 : 0);
        parcel.writeString(this.f195731d);
    }
}
