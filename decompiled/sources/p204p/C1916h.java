package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1916h implements Parcelable {
    public static final Parcelable.Creator<C1916h> CREATOR = new ora(5);

    /* JADX INFO: renamed from: a */
    public final String f86080a;

    /* JADX INFO: renamed from: b */
    public final String f86081b;

    /* JADX INFO: renamed from: c */
    public final String f86082c;

    public C1916h(String str, String str2, String str3) {
        this.f86080a = str;
        this.f86081b = str2;
        this.f86082c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1916h)) {
            return false;
        }
        C1916h c1916h = (C1916h) obj;
        return wj50.m88271j(this.f86080a, c1916h.f86080a) && wj50.m88271j(this.f86081b, c1916h.f86081b) && wj50.m88271j(this.f86082c, c1916h.f86082c);
    }

    public final int hashCode() {
        return this.f86082c.hashCode() + s571.m77243b(this.f86080a.hashCode() * 31, 31, this.f86081b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f86080a);
        parcel.writeString(this.f86081b);
        parcel.writeString(this.f86082c);
    }
}
