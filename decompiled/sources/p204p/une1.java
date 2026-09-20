package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class une1 implements wne1 {
    public static final Parcelable.Creator<une1> CREATOR = new tne1(0);

    /* JADX INFO: renamed from: a */
    public final String f232161a;

    public une1(String str) {
        this.f232161a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof une1) && wj50.m88271j(this.f232161a, ((une1) obj).f232161a);
    }

    public final int hashCode() {
        return this.f232161a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f232161a);
    }
}
