package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class se7 implements Parcelable {
    public static final Parcelable.Creator<se7> CREATOR = new na7(3);

    /* JADX INFO: renamed from: a */
    public final String f208226a;

    /* JADX INFO: renamed from: b */
    public final double f208227b;

    /* JADX INFO: renamed from: c */
    public final String f208228c;

    /* JADX INFO: renamed from: d */
    public final String f208229d;

    /* JADX INFO: renamed from: e */
    public final String f208230e;

    /* JADX INFO: renamed from: f */
    public final String f208231f;

    public se7(String str, double d, String str2, String str3, String str4, String str5) {
        this.f208226a = str;
        this.f208227b = d;
        this.f208228c = str2;
        this.f208229d = str3;
        this.f208230e = str4;
        this.f208231f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se7)) {
            return false;
        }
        se7 se7Var = (se7) obj;
        return wj50.m88271j(this.f208226a, se7Var.f208226a) && Double.compare(this.f208227b, se7Var.f208227b) == 0 && wj50.m88271j(this.f208228c, se7Var.f208228c) && wj50.m88271j(this.f208229d, se7Var.f208229d) && wj50.m88271j(this.f208230e, se7Var.f208230e) && wj50.m88271j(this.f208231f, se7Var.f208231f);
    }

    public final int hashCode() {
        return this.f208231f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(xl81.m91399h(this.f208227b, this.f208226a.hashCode() * 31, 31), 31, this.f208228c), 31, this.f208229d), 31, this.f208230e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f208226a);
        parcel.writeDouble(this.f208227b);
        parcel.writeString(this.f208228c);
        parcel.writeString(this.f208229d);
        parcel.writeString(this.f208230e);
        parcel.writeString(this.f208231f);
    }
}
