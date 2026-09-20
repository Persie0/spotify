package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class pdn0 implements Parcelable {
    public static final Parcelable.Creator<pdn0> CREATOR = new n9n0(7);

    /* JADX INFO: renamed from: a */
    public final String f176520a;

    /* JADX INFO: renamed from: b */
    public final String f176521b;

    /* JADX INFO: renamed from: c */
    public final String f176522c;

    /* JADX INFO: renamed from: d */
    public final String f176523d;

    /* JADX INFO: renamed from: e */
    public final String f176524e;

    /* JADX INFO: renamed from: f */
    public final List f176525f;

    /* JADX INFO: renamed from: g */
    public final mmr f176526g;

    /* JADX INFO: renamed from: h */
    public final boolean f176527h;

    public pdn0(String str, String str2, String str3, String str4, String str5, List list, mmr mmrVar, boolean z) {
        this.f176520a = str;
        this.f176521b = str2;
        this.f176522c = str3;
        this.f176523d = str4;
        this.f176524e = str5;
        this.f176525f = list;
        this.f176526g = mmrVar;
        this.f176527h = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m69690c() {
        return this.f176522c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdn0)) {
            return false;
        }
        pdn0 pdn0Var = (pdn0) obj;
        return wj50.m88271j(this.f176520a, pdn0Var.f176520a) && wj50.m88271j(this.f176521b, pdn0Var.f176521b) && wj50.m88271j(this.f176522c, pdn0Var.f176522c) && wj50.m88271j(this.f176523d, pdn0Var.f176523d) && wj50.m88271j(this.f176524e, pdn0Var.f176524e) && wj50.m88271j(this.f176525f, pdn0Var.f176525f) && wj50.m88271j(this.f176526g, pdn0Var.f176526g) && this.f176527h == pdn0Var.f176527h;
    }

    /* JADX INFO: renamed from: g */
    public final String m69691g() {
        return this.f176520a;
    }

    /* JADX INFO: renamed from: h */
    public final String m69692h() {
        return this.f176523d;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f176520a.hashCode() * 31, 31, this.f176521b), 31, this.f176522c), 31, this.f176523d), 31, this.f176524e), 31, this.f176525f);
        mmr mmrVar = this.f176526g;
        return Boolean.hashCode(this.f176527h) + ((iM77244c + (mmrVar == null ? 0 : mmrVar.f145229a.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f176520a);
        parcel.writeString(this.f176521b);
        parcel.writeString(this.f176522c);
        parcel.writeString(this.f176523d);
        parcel.writeString(this.f176524e);
        Iterator itM42468l = fr0.m42468l(parcel, this.f176525f);
        while (itM42468l.hasNext()) {
            ((l580) itM42468l.next()).writeToParcel(parcel, i);
        }
        mmr mmrVar = this.f176526g;
        if (mmrVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mmrVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f176527h ? 1 : 0);
    }
}
