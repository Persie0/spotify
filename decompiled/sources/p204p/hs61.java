package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class hs61 implements vhj {
    public static final Parcelable.Creator<hs61> CREATOR = new luh0(17);

    /* JADX INFO: renamed from: a */
    public final String f94621a;

    /* JADX INFO: renamed from: b */
    public final String f94622b;

    /* JADX INFO: renamed from: c */
    public final int f94623c;

    public hs61(String str, String str2, int i) {
        this.f94621a = str;
        this.f94622b = str2;
        this.f94623c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hs61) && wj50.m88271j(((hs61) obj).f94621a, this.f94621a);
    }

    @Override // p204p.vhj
    public final String getId() {
        return this.f94621a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94623c) + s571.m77243b(this.f94621a.hashCode() * 31, 31, this.f94622b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f94621a);
        parcel.writeString(this.f94622b);
        parcel.writeInt(this.f94623c);
    }
}
