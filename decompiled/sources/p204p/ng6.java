package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ng6 implements Parcelable {
    public static final Parcelable.Creator<ng6> CREATOR = new vp5(25);

    /* JADX INFO: renamed from: a */
    public final String f153563a;

    /* JADX INFO: renamed from: b */
    public final String f153564b;

    /* JADX INFO: renamed from: c */
    public final String f153565c;

    /* JADX INFO: renamed from: d */
    public final fg6 f153566d;

    public ng6(String str, String str2, String str3, fg6 fg6Var) {
        this.f153563a = str;
        this.f153564b = str2;
        this.f153565c = str3;
        this.f153566d = fg6Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng6)) {
            return false;
        }
        ng6 ng6Var = (ng6) obj;
        return wj50.m88271j(this.f153563a, ng6Var.f153563a) && wj50.m88271j(this.f153564b, ng6Var.f153564b) && wj50.m88271j(this.f153565c, ng6Var.f153565c) && this.f153566d == ng6Var.f153566d;
    }

    public final int hashCode() {
        return this.f153566d.hashCode() + s571.m77243b(s571.m77243b(this.f153563a.hashCode() * 31, 31, this.f153564b), 31, this.f153565c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f153563a);
        parcel.writeString(this.f153564b);
        parcel.writeString(this.f153565c);
        this.f153566d.writeToParcel(parcel, i);
    }
}
