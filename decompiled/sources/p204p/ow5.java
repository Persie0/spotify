package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class ow5 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f170642a;

    /* JADX INFO: renamed from: b */
    public final String f170643b;

    /* JADX INFO: renamed from: c */
    public final String f170644c;
    public static final nw5 Companion = new nw5();
    public static final Parcelable.Creator<ow5> CREATOR = new vp5(10);

    public /* synthetic */ ow5(String str, String str2, int i, String str3) {
        if ((i & 1) == 0) {
            this.f170642a = null;
        } else {
            this.f170642a = str;
        }
        if ((i & 2) == 0) {
            this.f170643b = null;
        } else {
            this.f170643b = str2;
        }
        if ((i & 4) == 0) {
            this.f170644c = null;
        } else {
            this.f170644c = str3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow5)) {
            return false;
        }
        ow5 ow5Var = (ow5) obj;
        return wj50.m88271j(this.f170642a, ow5Var.f170642a) && wj50.m88271j(this.f170643b, ow5Var.f170643b) && wj50.m88271j(this.f170644c, ow5Var.f170644c);
    }

    public final int hashCode() {
        String str = this.f170642a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f170643b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f170644c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170642a);
        parcel.writeString(this.f170643b);
        parcel.writeString(this.f170644c);
    }

    public ow5(String str, String str2, String str3) {
        this.f170642a = str;
        this.f170643b = str2;
        this.f170644c = str3;
    }
}
