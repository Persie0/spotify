package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class qmd implements Parcelable {
    public static final Parcelable.Creator<qmd> CREATOR = new fjd(3);

    /* JADX INFO: renamed from: a */
    public final String f190200a;

    /* JADX INFO: renamed from: b */
    public final String f190201b;

    public qmd(String str, String str2) {
        this.f190200a = str;
        this.f190201b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m73270c() {
        return this.f190200a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmd)) {
            return false;
        }
        qmd qmdVar = (qmd) obj;
        return wj50.m88271j(this.f190200a, qmdVar.f190200a) && wj50.m88271j(this.f190201b, qmdVar.f190201b);
    }

    public final int hashCode() {
        return this.f190201b.hashCode() + (this.f190200a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f190200a);
        parcel.writeString(this.f190201b);
    }
}
