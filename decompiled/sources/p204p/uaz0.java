package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class uaz0 implements waz0 {
    public static final Parcelable.Creator<uaz0> CREATOR = new lpy0(27);

    /* JADX INFO: renamed from: a */
    public final String f228585a;

    /* JADX INFO: renamed from: b */
    public final String f228586b;

    public uaz0(String str, String str2) {
        this.f228585a = str;
        this.f228586b = str2;
    }

    @Override // p204p.waz0
    /* JADX INFO: renamed from: B */
    public final String mo82709B() {
        return this.f228586b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaz0)) {
            return false;
        }
        uaz0 uaz0Var = (uaz0) obj;
        return wj50.m88271j(this.f228585a, uaz0Var.f228585a) && wj50.m88271j(this.f228586b, uaz0Var.f228586b);
    }

    public final int hashCode() {
        return this.f228586b.hashCode() + (this.f228585a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f228585a);
        parcel.writeString(this.f228586b);
    }
}
