package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class en9 implements Parcelable {
    public static final Parcelable.Creator<en9> CREATOR = new dc9(9);

    /* JADX INFO: renamed from: a */
    public final String f61106a;

    /* JADX INFO: renamed from: b */
    public final String f61107b;

    public en9(String str, String str2) {
        this.f61106a = str;
        this.f61107b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m39480c() {
        return this.f61106a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en9)) {
            return false;
        }
        en9 en9Var = (en9) obj;
        return wj50.m88271j(this.f61106a, en9Var.f61106a) && wj50.m88271j(this.f61107b, en9Var.f61107b);
    }

    public final int hashCode() {
        int iHashCode = this.f61106a.hashCode() * 31;
        String str = this.f61107b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61106a);
        parcel.writeString(this.f61107b);
    }
}
