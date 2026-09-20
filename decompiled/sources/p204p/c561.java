package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c561 implements Parcelable {
    public static final Parcelable.Creator<c561> CREATOR = new e361(5);

    /* JADX INFO: renamed from: a */
    public final String f34096a;

    /* JADX INFO: renamed from: b */
    public final String f34097b;

    public c561(String str, String str2) {
        this.f34096a = str;
        this.f34097b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c561)) {
            return false;
        }
        c561 c561Var = (c561) obj;
        return wj50.m88271j(this.f34096a, c561Var.f34096a) && wj50.m88271j(this.f34097b, c561Var.f34097b);
    }

    public final int hashCode() {
        return this.f34097b.hashCode() + (this.f34096a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34096a);
        parcel.writeString(this.f34097b);
    }
}
