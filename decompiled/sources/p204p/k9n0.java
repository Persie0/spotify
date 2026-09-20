package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class k9n0 extends v9n0 {
    public static final Parcelable.Creator<k9n0> CREATOR = new pum0(27);

    /* JADX INFO: renamed from: b */
    public final String f120625b;

    public k9n0(String str) {
        super(str);
        this.f120625b = str;
    }

    @Override // p204p.v9n0
    /* JADX INFO: renamed from: c */
    public final String mo55840c() {
        return this.f120625b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9n0) && wj50.m88271j(this.f120625b, ((k9n0) obj).f120625b);
    }

    public final int hashCode() {
        return this.f120625b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120625b);
    }
}
