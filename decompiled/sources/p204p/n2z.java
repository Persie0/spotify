package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class n2z implements Parcelable {
    public static final Parcelable.Creator<n2z> CREATOR = new c2z(2);

    /* JADX INFO: renamed from: a */
    public final String f149875a;

    /* JADX INFO: renamed from: b */
    public final boolean f149876b;

    /* JADX INFO: renamed from: c */
    public final m2z f149877c;

    public n2z(String str, boolean z, m2z m2zVar) {
        this.f149875a = str;
        this.f149876b = z;
        this.f149877c = m2zVar;
    }

    /* JADX INFO: renamed from: c */
    public static n2z m63573c(n2z n2zVar, boolean z) {
        String str = n2zVar.f149875a;
        m2z m2zVar = n2zVar.f149877c;
        n2zVar.getClass();
        return new n2z(str, z, m2zVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2z)) {
            return false;
        }
        n2z n2zVar = (n2z) obj;
        return wj50.m88271j(this.f149875a, n2zVar.f149875a) && this.f149876b == n2zVar.f149876b && wj50.m88271j(this.f149877c, n2zVar.f149877c);
    }

    /* JADX INFO: renamed from: g */
    public final m2z m63574g() {
        return this.f149877c;
    }

    public final int hashCode() {
        return this.f149877c.hashCode() + s571.m77245d(this.f149875a.hashCode() * 31, 31, this.f149876b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149875a);
        parcel.writeInt(this.f149876b ? 1 : 0);
        parcel.writeParcelable(this.f149877c, i);
    }
}
