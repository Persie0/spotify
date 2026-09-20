package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.e4 */
/* JADX INFO: loaded from: classes10.dex */
public final class C1801e4 implements Parcelable {
    public static final Parcelable.Creator<C1801e4> CREATOR = new ora(7);

    /* JADX INFO: renamed from: a */
    public final String f55910a;

    public C1801e4(String str) {
        this.f55910a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final String m37704e() {
        return this.f55910a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1801e4) && wj50.m88271j(this.f55910a, ((C1801e4) obj).f55910a);
    }

    public final int hashCode() {
        return this.f55910a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55910a);
    }
}
