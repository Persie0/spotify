package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class be7 implements Parcelable {
    public static final Parcelable.Creator<be7> CREATOR = new na7(2);

    /* JADX INFO: renamed from: a */
    public final String f26294a;

    public be7(String str) {
        this.f26294a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m28909c() {
        return this.f26294a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be7) && wj50.m88271j(this.f26294a, ((be7) obj).f26294a);
    }

    public final int hashCode() {
        return this.f26294a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26294a);
    }
}
