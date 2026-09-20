package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class u090 implements Parcelable {
    public static final Parcelable.Creator<u090> CREATOR = new ct80(16);

    /* JADX INFO: renamed from: a */
    public final Intent f225422a;

    /* JADX INFO: renamed from: b */
    public final String f225423b;

    /* JADX INFO: renamed from: c */
    public final t090 f225424c;

    public u090(Intent intent, String str, t090 t090Var) {
        this.f225422a = intent;
        this.f225423b = str;
        this.f225424c = t090Var;
    }

    /* JADX INFO: renamed from: c */
    public static u090 m82112c(u090 u090Var, String str, t090 t090Var, int i) {
        Intent intent = u090Var.f225422a;
        if ((i & 2) != 0) {
            str = u090Var.f225423b;
        }
        if ((i & 4) != 0) {
            t090Var = u090Var.f225424c;
        }
        return new u090(intent, str, t090Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u090)) {
            return false;
        }
        u090 u090Var = (u090) obj;
        return wj50.m88271j(this.f225422a, u090Var.f225422a) && wj50.m88271j(this.f225423b, u090Var.f225423b) && wj50.m88271j(this.f225424c, u090Var.f225424c);
    }

    public final int hashCode() {
        return this.f225424c.hashCode() + s571.m77243b(this.f225422a.hashCode() * 31, 31, this.f225423b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f225422a, i);
        parcel.writeString(this.f225423b);
        parcel.writeParcelable(this.f225424c, i);
    }

    public /* synthetic */ u090(String str, Intent intent) {
        this(intent, str, q090.f183930a);
    }
}
