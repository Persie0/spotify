package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class tae implements Parcelable {
    public static final Parcelable.Creator<tae> CREATOR = new rae(1);

    /* JADX INFO: renamed from: a */
    public final String f218559a;

    /* JADX INFO: renamed from: b */
    public final String f218560b;

    /* JADX INFO: renamed from: c */
    public final String f218561c;

    /* JADX INFO: renamed from: d */
    public final o6e f218562d;

    /* JADX INFO: renamed from: e */
    public final o6e f218563e;

    /* JADX INFO: renamed from: f */
    public final yjc f218564f;

    /* JADX INFO: renamed from: g */
    public final jae f218565g;

    public tae(String str, String str2, String str3, o6e o6eVar, o6e o6eVar2, yjc yjcVar, jae jaeVar) {
        this.f218559a = str;
        this.f218560b = str2;
        this.f218561c = str3;
        this.f218562d = o6eVar;
        this.f218563e = o6eVar2;
        this.f218564f = yjcVar;
        this.f218565g = jaeVar;
    }

    /* JADX INFO: renamed from: c */
    public static tae m80350c(tae taeVar, o6e o6eVar, o6e o6eVar2) {
        String str = taeVar.f218559a;
        String str2 = taeVar.f218560b;
        String str3 = taeVar.f218561c;
        yjc yjcVar = taeVar.f218564f;
        jae jaeVar = taeVar.f218565g;
        taeVar.getClass();
        return new tae(str, str2, str3, o6eVar, o6eVar2, yjcVar, jaeVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tae)) {
            return false;
        }
        tae taeVar = (tae) obj;
        return wj50.m88271j(this.f218559a, taeVar.f218559a) && wj50.m88271j(this.f218560b, taeVar.f218560b) && wj50.m88271j(this.f218561c, taeVar.f218561c) && wj50.m88271j(this.f218562d, taeVar.f218562d) && wj50.m88271j(this.f218563e, taeVar.f218563e) && wj50.m88271j(this.f218564f, taeVar.f218564f) && wj50.m88271j(this.f218565g, taeVar.f218565g);
    }

    /* JADX INFO: renamed from: g */
    public final bc9 m80351g() {
        o6e o6eVarM80352h = m80352h();
        if (o6eVarM80352h != null) {
            return o6eVarM80352h.f162336g;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final o6e m80352h() {
        o6e o6eVar = this.f218562d;
        if (!o6eVar.f162330a) {
            o6eVar = null;
        }
        if (o6eVar != null) {
            return o6eVar;
        }
        o6e o6eVar2 = this.f218563e;
        if (o6eVar2.f162330a) {
            return o6eVar2;
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = (this.f218563e.hashCode() + ((this.f218562d.hashCode() + s571.m77243b(s571.m77243b(this.f218559a.hashCode() * 31, 31, this.f218560b), 31, this.f218561c)) * 31)) * 31;
        yjc yjcVar = this.f218564f;
        int iHashCode2 = (iHashCode + (yjcVar == null ? 0 : yjcVar.hashCode())) * 31;
        jae jaeVar = this.f218565g;
        return iHashCode2 + (jaeVar != null ? jaeVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f218559a);
        parcel.writeString(this.f218560b);
        parcel.writeString(this.f218561c);
        this.f218562d.writeToParcel(parcel, i);
        this.f218563e.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f218564f, i);
        jae jaeVar = this.f218565g;
        if (jaeVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jaeVar.writeToParcel(parcel, i);
        }
    }
}
