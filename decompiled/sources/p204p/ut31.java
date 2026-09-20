package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ut31 implements Parcelable {
    public static final Parcelable.Creator<ut31> CREATOR = new ln31(16);

    /* JADX INFO: renamed from: a */
    public final String f233764a;

    /* JADX INFO: renamed from: b */
    public final String f233765b;

    /* JADX INFO: renamed from: c */
    public final String f233766c;

    public ut31(String str, String str2, String str3) {
        this.f233764a = str;
        this.f233765b = str2;
        this.f233766c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut31)) {
            return false;
        }
        ut31 ut31Var = (ut31) obj;
        return wj50.m88271j(this.f233764a, ut31Var.f233764a) && wj50.m88271j(this.f233765b, ut31Var.f233765b) && wj50.m88271j(this.f233766c, ut31Var.f233766c);
    }

    public final int hashCode() {
        return this.f233766c.hashCode() + s571.m77243b(this.f233764a.hashCode() * 31, 31, this.f233765b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f233764a);
        parcel.writeString(this.f233765b);
        parcel.writeString(this.f233766c);
    }
}
