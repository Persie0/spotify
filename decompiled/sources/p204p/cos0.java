package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cos0 implements Parcelable {
    public static final Parcelable.Creator<cos0> CREATOR = new wds0(6);

    /* JADX INFO: renamed from: a */
    public final String f40332a;

    /* JADX INFO: renamed from: b */
    public final String f40333b;

    /* JADX INFO: renamed from: c */
    public final String f40334c;

    /* JADX INFO: renamed from: d */
    public final String f40335d;

    /* JADX INFO: renamed from: e */
    public final List f40336e;

    /* JADX INFO: renamed from: f */
    public final String f40337f;

    public cos0(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        this.f40332a = str;
        this.f40333b = str2;
        this.f40334c = str3;
        this.f40335d = str4;
        this.f40336e = arrayList;
        this.f40337f = str5;
    }

    /* JADX INFO: renamed from: c */
    public final String m33509c() {
        return this.f40333b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cos0)) {
            return false;
        }
        cos0 cos0Var = (cos0) obj;
        return wj50.m88271j(this.f40332a, cos0Var.f40332a) && wj50.m88271j(this.f40333b, cos0Var.f40333b) && wj50.m88271j(this.f40334c, cos0Var.f40334c) && wj50.m88271j(this.f40335d, cos0Var.f40335d) && wj50.m88271j(this.f40336e, cos0Var.f40336e) && wj50.m88271j(this.f40337f, cos0Var.f40337f);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(s571.m77243b(this.f40332a.hashCode() * 31, 31, this.f40333b), 31, this.f40334c), 31, this.f40335d), 31, this.f40336e);
        String str = this.f40337f;
        return iM77244c + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40332a);
        parcel.writeString(this.f40333b);
        parcel.writeString(this.f40334c);
        parcel.writeString(this.f40335d);
        parcel.writeStringList(this.f40336e);
        parcel.writeString(this.f40337f);
    }
}
