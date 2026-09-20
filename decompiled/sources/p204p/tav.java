package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class tav implements Parcelable {
    public static final Parcelable.Creator<tav> CREATOR = new m8v(3);

    /* JADX INFO: renamed from: X */
    public static final hb11 f218685X;

    /* JADX INFO: renamed from: Y */
    public static final hb11 f218686Y;

    /* JADX INFO: renamed from: a */
    public final String f218687a;

    /* JADX INFO: renamed from: b */
    public final ern0 f218688b;

    /* JADX INFO: renamed from: c */
    public final int f218689c;

    /* JADX INFO: renamed from: d */
    public final int f218690d;

    /* JADX INFO: renamed from: e */
    public final int f218691e;

    /* JADX INFO: renamed from: f */
    public final int f218692f;

    /* JADX INFO: renamed from: g */
    public final int f218693g;

    /* JADX INFO: renamed from: h */
    public final boolean f218694h;

    /* JADX INFO: renamed from: i */
    public final String f218695i;

    /* JADX INFO: renamed from: t */
    public final ArrayList f218696t;

    static {
        hb11 hb11VarM52092t = j0g1.m52092t(0, 1, 0, 5);
        f218685X = hb11VarM52092t;
        f218686Y = hb11VarM52092t;
    }

    public tav(String str, ern0 ern0Var, int i, int i2, int i3, int i4, int i5, boolean z, String str2, ArrayList arrayList) {
        this.f218687a = str;
        this.f218688b = ern0Var;
        this.f218689c = i;
        this.f218690d = i2;
        this.f218691e = i3;
        this.f218692f = i4;
        this.f218693g = i5;
        this.f218694h = z;
        this.f218695i = str2;
        this.f218696t = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tav)) {
            return false;
        }
        tav tavVar = (tav) obj;
        return wj50.m88271j(this.f218687a, tavVar.f218687a) && wj50.m88271j(this.f218688b, tavVar.f218688b) && this.f218689c == tavVar.f218689c && this.f218690d == tavVar.f218690d && this.f218691e == tavVar.f218691e && this.f218692f == tavVar.f218692f && this.f218693g == tavVar.f218693g && this.f218694h == tavVar.f218694h && wj50.m88271j(this.f218695i, tavVar.f218695i) && this.f218696t.equals(tavVar.f218696t);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(f710.m40938f(this.f218693g, f710.m40938f(this.f218692f, mt60.m62800g(this.f218691e, mt60.m62800g(this.f218690d, mt60.m62800g(this.f218689c, (this.f218688b.hashCode() + (this.f218687a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31, this.f218694h);
        String str = this.f218695i;
        return this.f218696t.hashCode() + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeString(this.f218687a);
        AbstractC2328r7 abstractC2328r7 = (AbstractC2328r7) this.f218688b;
        parcel.writeInt(abstractC2328r7.mo36659c());
        for (Map.Entry entry : (ig40) abstractC2328r7.mo36657a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.f218689c);
        parcel.writeInt(this.f218690d);
        parcel.writeInt(this.f218691e);
        int i2 = this.f218692f;
        if (i2 == 1) {
            str = "CLASSIC";
        } else if (i2 == 2) {
            str = "WIDE";
        } else if (i2 == 3) {
            str = "NARROW";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "SLANTED";
        }
        parcel.writeString(str);
        int i3 = this.f218693g;
        if (i3 == 1) {
            str2 = "LEFT";
        } else if (i3 == 2) {
            str2 = "CENTER";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "RIGHT";
        }
        parcel.writeString(str2);
        parcel.writeInt(this.f218694h ? 1 : 0);
        parcel.writeString(this.f218695i);
        Iterator itM42469m = fr0.m42469m(this.f218696t, parcel);
        while (itM42469m.hasNext()) {
            ((x5o0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
