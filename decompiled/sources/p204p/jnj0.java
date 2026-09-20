package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class jnj0 implements Parcelable {
    public static final Parcelable.Creator<jnj0> CREATOR = new fgj0(3);

    /* JADX INFO: renamed from: a */
    public final String f114121a;

    /* JADX INFO: renamed from: b */
    public final String f114122b;

    /* JADX INFO: renamed from: c */
    public final String f114123c;

    /* JADX INFO: renamed from: d */
    public final String f114124d;

    /* JADX INFO: renamed from: e */
    public final int f114125e;

    public jnj0(int i, String str, String str2, String str3, String str4) {
        this.f114121a = str;
        this.f114122b = str2;
        this.f114123c = str3;
        this.f114124d = str4;
        this.f114125e = i;
    }

    /* JADX INFO: renamed from: c */
    public static jnj0 m53823c(jnj0 jnj0Var, int i) {
        String str = jnj0Var.f114121a;
        String str2 = jnj0Var.f114122b;
        String str3 = jnj0Var.f114123c;
        String str4 = jnj0Var.f114124d;
        jnj0Var.getClass();
        return new jnj0(i, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnj0)) {
            return false;
        }
        jnj0 jnj0Var = (jnj0) obj;
        return wj50.m88271j(this.f114121a, jnj0Var.f114121a) && wj50.m88271j(this.f114122b, jnj0Var.f114122b) && wj50.m88271j(this.f114123c, jnj0Var.f114123c) && wj50.m88271j(this.f114124d, jnj0Var.f114124d) && this.f114125e == jnj0Var.f114125e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f114125e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f114121a.hashCode() * 31, 31, this.f114122b), 31, this.f114123c), 31, this.f114124d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f114121a);
        parcel.writeString(this.f114122b);
        parcel.writeString(this.f114123c);
        parcel.writeString(this.f114124d);
        parcel.writeInt(this.f114125e);
    }
}
