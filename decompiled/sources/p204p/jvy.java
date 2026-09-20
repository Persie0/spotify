package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class jvy implements lvy {
    public static final Parcelable.Creator<jvy> CREATOR = new eqy(15);

    /* JADX INFO: renamed from: a */
    public final String f116541a;

    /* JADX INFO: renamed from: b */
    public final String f116542b;

    /* JADX INFO: renamed from: c */
    public final String f116543c;

    /* JADX INFO: renamed from: d */
    public final String f116544d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f116545e;

    /* JADX INFO: renamed from: f */
    public final String f116546f;

    public jvy(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        this.f116541a = str;
        this.f116542b = str2;
        this.f116543c = str3;
        this.f116544d = str4;
        this.f116545e = arrayList;
        this.f116546f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvy)) {
            return false;
        }
        jvy jvyVar = (jvy) obj;
        return wj50.m88271j(this.f116541a, jvyVar.f116541a) && wj50.m88271j(this.f116542b, jvyVar.f116542b) && wj50.m88271j(this.f116543c, jvyVar.f116543c) && wj50.m88271j(this.f116544d, jvyVar.f116544d) && this.f116545e.equals(jvyVar.f116545e) && wj50.m88271j(this.f116546f, jvyVar.f116546f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f116541a.hashCode() * 31, 31, this.f116542b);
        String str = this.f116543c;
        int iM59700f = lq51.m59700f(this.f116545e, s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f116544d), 31);
        String str2 = this.f116546f;
        return iM59700f + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116541a);
        parcel.writeString(this.f116542b);
        parcel.writeString(this.f116543c);
        parcel.writeString(this.f116544d);
        Iterator itM42469m = fr0.m42469m(this.f116545e, parcel);
        while (itM42469m.hasNext()) {
            ((ivy) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f116546f);
    }
}
