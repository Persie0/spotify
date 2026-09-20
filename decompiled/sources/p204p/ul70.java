package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class ul70 implements Parcelable {
    public static final Parcelable.Creator<ul70> CREATOR = new w270(18);

    /* JADX INFO: renamed from: a */
    public final String f231452a;

    /* JADX INFO: renamed from: b */
    public final String f231453b;

    /* JADX INFO: renamed from: c */
    public final boolean f231454c;

    /* JADX INFO: renamed from: d */
    public final Map f231455d;

    /* JADX INFO: renamed from: e */
    public final boolean f231456e;

    /* JADX INFO: renamed from: f */
    public final Integer f231457f;

    /* JADX INFO: renamed from: g */
    public final b791 f231458g;

    public ul70(String str, String str2, boolean z, Map map, boolean z2, Integer num, b791 b791Var) {
        this.f231452a = str;
        this.f231453b = str2;
        this.f231454c = z;
        this.f231455d = map;
        this.f231456e = z2;
        this.f231457f = num;
        this.f231458g = b791Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m83358c() {
        String str = this.f231453b;
        return str == null ? edb.m38564m("current-incoming:", this.f231452a) : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul70)) {
            return false;
        }
        ul70 ul70Var = (ul70) obj;
        return wj50.m88271j(this.f231452a, ul70Var.f231452a) && wj50.m88271j(this.f231453b, ul70Var.f231453b) && this.f231454c == ul70Var.f231454c && wj50.m88271j(this.f231455d, ul70Var.f231455d) && this.f231456e == ul70Var.f231456e && wj50.m88271j(this.f231457f, ul70Var.f231457f) && wj50.m88271j(this.f231458g, ul70Var.f231458g);
    }

    public final int hashCode() {
        int iHashCode = this.f231452a.hashCode() * 31;
        String str = this.f231453b;
        int iM77245d = s571.m77245d(edb.m38557f(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f231454c), 31, this.f231455d), 31, this.f231456e);
        Integer num = this.f231457f;
        int iHashCode2 = (iM77245d + (num == null ? 0 : num.hashCode())) * 31;
        b791 b791Var = this.f231458g;
        return iHashCode2 + (b791Var != null ? b791Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f231452a);
        parcel.writeString(this.f231453b);
        parcel.writeInt(this.f231454c ? 1 : 0);
        Iterator itM91403l = xl81.m91403l(parcel, this.f231455d);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.f231456e ? 1 : 0);
        Integer num = this.f231457f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeParcelable(this.f231458g, i);
    }
}
