package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class whd implements Parcelable {
    public static final Parcelable.Creator<whd> CREATOR = new qvc(20);

    /* JADX INFO: renamed from: a */
    public final String f251305a;

    /* JADX INFO: renamed from: b */
    public final String f251306b;

    /* JADX INFO: renamed from: c */
    public final String f251307c;

    public whd(String str, String str2, String str3) {
        this.f251305a = str;
        this.f251306b = str2;
        this.f251307c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m88126a() {
        return this.f251305a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whd)) {
            return false;
        }
        whd whdVar = (whd) obj;
        return wj50.m88271j(this.f251305a, whdVar.f251305a) && wj50.m88271j(this.f251306b, whdVar.f251306b) && wj50.m88271j(this.f251307c, whdVar.f251307c);
    }

    public final int hashCode() {
        return this.f251307c.hashCode() + s571.m77243b(this.f251305a.hashCode() * 31, 31, this.f251306b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f251305a);
        parcel.writeString(this.f251306b);
        parcel.writeString(this.f251307c);
    }
}
