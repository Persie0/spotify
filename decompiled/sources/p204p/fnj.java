package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fnj extends onj {
    public static final Parcelable.Creator<fnj> CREATOR = new dnj(1);

    /* JADX INFO: renamed from: a */
    public final b221 f71308a;

    /* JADX INFO: renamed from: b */
    public final boolean f71309b;

    /* JADX INFO: renamed from: c */
    public final String f71310c;

    /* JADX INFO: renamed from: d */
    public final List f71311d;

    /* JADX INFO: renamed from: e */
    public final List f71312e;

    /* JADX INFO: renamed from: f */
    public final String f71313f;

    public fnj(b221 b221Var, boolean z, String str, ArrayList arrayList, List list, String str2) {
        this.f71308a = b221Var;
        this.f71309b = z;
        this.f71310c = str;
        this.f71311d = arrayList;
        this.f71312e = list;
        this.f71313f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnj)) {
            return false;
        }
        fnj fnjVar = (fnj) obj;
        return wj50.m88271j(this.f71308a, fnjVar.f71308a) && this.f71309b == fnjVar.f71309b && wj50.m88271j(this.f71310c, fnjVar.f71310c) && wj50.m88271j(this.f71311d, fnjVar.f71311d) && wj50.m88271j(this.f71312e, fnjVar.f71312e) && wj50.m88271j(this.f71313f, fnjVar.f71313f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f71308a.hashCode() * 31, 31, this.f71309b);
        String str = this.f71310c;
        return this.f71313f.hashCode() + s571.m77244c(s571.m77244c((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f71311d), 31, this.f71312e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f71308a, i);
        parcel.writeInt(this.f71309b ? 1 : 0);
        parcel.writeString(this.f71310c);
        parcel.writeStringList(this.f71311d);
        Iterator itM42468l = fr0.m42468l(parcel, this.f71312e);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeString(this.f71313f);
    }
}
