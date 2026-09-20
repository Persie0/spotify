package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class rd9 implements Parcelable {
    public static final Parcelable.Creator<rd9> CREATOR = new dc9(1);

    /* JADX INFO: renamed from: a */
    public final String f198065a;

    /* JADX INFO: renamed from: b */
    public final String f198066b;

    public rd9(String str, String str2) {
        this.f198065a = str;
        this.f198066b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd9)) {
            return false;
        }
        rd9 rd9Var = (rd9) obj;
        return wj50.m88271j(this.f198065a, rd9Var.f198065a) && wj50.m88271j(this.f198066b, rd9Var.f198066b);
    }

    public final int hashCode() {
        return this.f198066b.hashCode() + (this.f198065a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f198065a);
        parcel.writeString(this.f198066b);
    }
}
