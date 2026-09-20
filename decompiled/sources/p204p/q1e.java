package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class q1e implements Parcelable {
    public static final Parcelable.Creator<q1e> CREATOR = new j0e(21);

    /* JADX INFO: renamed from: a */
    public final e1e f184301a;

    /* JADX INFO: renamed from: b */
    public final p1e f184302b;

    /* JADX INFO: renamed from: c */
    public final Uri f184303c;

    public q1e(e1e e1eVar, p1e p1eVar, Uri uri) {
        this.f184301a = e1eVar;
        this.f184302b = p1eVar;
        this.f184303c = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1e)) {
            return false;
        }
        q1e q1eVar = (q1e) obj;
        return wj50.m88271j(this.f184301a, q1eVar.f184301a) && wj50.m88271j(this.f184302b, q1eVar.f184302b) && wj50.m88271j(this.f184303c, q1eVar.f184303c);
    }

    public final int hashCode() {
        return this.f184303c.hashCode() + ((this.f184302b.hashCode() + (this.f184301a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f184301a, i);
        parcel.writeParcelable(this.f184302b, i);
        parcel.writeParcelable(this.f184303c, i);
    }
}
