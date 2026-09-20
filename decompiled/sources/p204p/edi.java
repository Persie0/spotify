package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class edi implements Parcelable {
    public static final Parcelable.Creator<edi> CREATOR = new f2i(2);

    /* JADX INFO: renamed from: a */
    public final String f58522a;

    public edi(String str) {
        this.f58522a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edi) && wj50.m88271j(this.f58522a, ((edi) obj).f58522a);
    }

    public final int hashCode() {
        return this.f58522a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f58522a);
    }
}
