package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fl91 implements Parcelable {
    public static final Parcelable.Creator<fl91> CREATOR = new f891(23);

    /* JADX INFO: renamed from: a */
    public final String f70731a;

    public fl91(String str) {
        this.f70731a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m41983a() {
        return this.f70731a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl91) && wj50.m88271j(this.f70731a, ((fl91) obj).f70731a);
    }

    public final int hashCode() {
        return this.f70731a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f70731a);
    }
}
