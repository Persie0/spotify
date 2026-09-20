package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ul */
/* JADX INFO: loaded from: classes8.dex */
public final class C2462ul extends AbstractC2500vl {
    public static final Parcelable.Creator<C2462ul> CREATOR = new C2047kc(21);

    /* JADX INFO: renamed from: a */
    public final String f231398a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2419tl f231399b;

    public C2462ul(String str, AbstractC2419tl abstractC2419tl) {
        this.f231398a = str;
        this.f231399b = abstractC2419tl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2462ul)) {
            return false;
        }
        C2462ul c2462ul = (C2462ul) obj;
        return wj50.m88271j(this.f231398a, c2462ul.f231398a) && wj50.m88271j(this.f231399b, c2462ul.f231399b);
    }

    public final int hashCode() {
        return this.f231399b.hashCode() + (this.f231398a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f231398a);
        parcel.writeParcelable(this.f231399b, i);
    }
}
