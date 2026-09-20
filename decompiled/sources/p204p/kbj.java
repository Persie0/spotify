package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kbj implements m6k {
    public static final Parcelable.Creator<kbj> CREATOR = new f2i(28);

    /* JADX INFO: renamed from: a */
    public final String f121214a;

    /* JADX INFO: renamed from: b */
    public final voc1 f121215b;

    /* JADX INFO: renamed from: c */
    public final z6k f121216c;

    public kbj(String str, voc1 voc1Var) {
        this.f121214a = str;
        this.f121215b = voc1Var;
        this.f121216c = new z6k(str, (String) null, 6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbj)) {
            return false;
        }
        kbj kbjVar = (kbj) obj;
        return wj50.m88271j(this.f121214a, kbjVar.f121214a) && wj50.m88271j(this.f121215b, kbjVar.f121215b);
    }

    @Override // p204p.m6k
    public final z6k getTarget() {
        return this.f121216c;
    }

    public final int hashCode() {
        return this.f121215b.f243453a.hashCode() + (this.f121214a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121214a);
        parcel.writeParcelable(this.f121215b, i);
    }
}
