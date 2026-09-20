package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class o0b0 extends w0b0 {
    public static final Parcelable.Creator<o0b0> CREATOR = new l0b0(2);

    /* JADX INFO: renamed from: a */
    public final String f160330a;

    public o0b0(String str) {
        this.f160330a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0b0) && wj50.m88271j(this.f160330a, ((o0b0) obj).f160330a);
    }

    /* JADX INFO: renamed from: g */
    public final String m66012g() {
        return this.f160330a;
    }

    public final int hashCode() {
        String str = this.f160330a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f160330a);
    }

    public /* synthetic */ o0b0() {
        this(null);
    }
}
