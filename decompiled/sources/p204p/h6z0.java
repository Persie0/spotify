package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class h6z0 extends zq50 {
    public static final Parcelable.Creator<h6z0> CREATOR = new lpy0(24);

    /* JADX INFO: renamed from: a */
    public final String f88297a;

    /* JADX INFO: renamed from: b */
    public final int f88298b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f88299c;

    /* JADX INFO: renamed from: d */
    public final String f88300d;

    /* JADX INFO: renamed from: e */
    public final int f88301e;

    /* JADX INFO: renamed from: f */
    public final String f88302f;

    /* JADX INFO: renamed from: g */
    public final List f88303g;

    /* JADX INFO: renamed from: h */
    public final String f88304h;

    public h6z0(String str, int i, ArrayList arrayList, String str2, int i2, String str3, ArrayList arrayList2, String str4) {
        this.f88297a = str;
        this.f88298b = i;
        this.f88299c = arrayList;
        this.f88300d = str2;
        this.f88301e = i2;
        this.f88302f = str3;
        this.f88303g = arrayList2;
        this.f88304h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6z0)) {
            return false;
        }
        h6z0 h6z0Var = (h6z0) obj;
        return wj50.m88271j(this.f88297a, h6z0Var.f88297a) && this.f88298b == h6z0Var.f88298b && this.f88299c.equals(h6z0Var.f88299c) && wj50.m88271j(this.f88300d, h6z0Var.f88300d) && this.f88301e == h6z0Var.f88301e && wj50.m88271j(this.f88302f, h6z0Var.f88302f) && wj50.m88271j(this.f88303g, h6z0Var.f88303g) && wj50.m88271j(this.f88304h, h6z0Var.f88304h);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f88301e, s571.m77243b(lq51.m59700f(this.f88299c, f710.m40938f(this.f88298b, this.f88297a.hashCode() * 31, 31), 31), 31, this.f88300d), 31);
        String str = this.f88302f;
        int iM77244c = s571.m77244c((iM40938f + (str == null ? 0 : str.hashCode())) * 31, 31, this.f88303g);
        String str2 = this.f88304h;
        return iM77244c + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeString(this.f88297a);
        switch (this.f88298b) {
            case 1:
                str = "VIDEO_CAROUSEL";
                break;
            case 2:
                str = "GENERIC";
                break;
            case 3:
                str = "DISCOVERY_FEED";
                break;
            case 4:
                str = "UNKNOWN";
                break;
            case 5:
                str = "CROSSWORD";
                break;
            case 6:
                str = "INSTANT_MIX";
                break;
            case 7:
                str = "DIVIDER";
                break;
            case 8:
                str = "RELATED_SEARCHES";
                break;
            case 9:
                str = "START_A_CHAT";
                break;
            case 10:
                str = "AGENT";
                break;
            case 11:
                str = "CROSS_CONTENT_RELATED";
                break;
            case 12:
                str = "TRACK_VERSIONS";
                break;
            case 13:
                str = "SEARCH_OVERVIEW_PLACEHOLDER";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
        Iterator itM42469m = fr0.m42469m(this.f88299c, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42469m.next(), i);
        }
        parcel.writeString(this.f88300d);
        int i2 = this.f88301e;
        if (i2 == 1) {
            str2 = "UNKNOWN";
        } else if (i2 == 2) {
            str2 = "CAROUSEL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str2 = "LIST";
        }
        parcel.writeString(str2);
        parcel.writeString(this.f88302f);
        parcel.writeStringList(this.f88303g);
        parcel.writeString(this.f88304h);
    }
}
