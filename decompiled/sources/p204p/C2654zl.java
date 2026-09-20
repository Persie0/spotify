package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.zl */
/* JADX INFO: loaded from: classes.dex */
public final class C2654zl implements Parcelable {
    public static final Parcelable.Creator<C2654zl> CREATOR = new C2047kc(26);

    /* JADX INFO: renamed from: a */
    public final String f283874a;

    /* JADX INFO: renamed from: b */
    public final String f283875b;

    public C2654zl(String str, String str2) {
        this.f283874a = str;
        this.f283875b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2654zl)) {
            return false;
        }
        C2654zl c2654zl = (C2654zl) obj;
        return wj50.m88271j(this.f283874a, c2654zl.f283874a) && wj50.m88271j(this.f283875b, c2654zl.f283875b);
    }

    public final int hashCode() {
        return this.f283875b.hashCode() + (this.f283874a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283874a);
        parcel.writeString(this.f283875b);
    }
}
