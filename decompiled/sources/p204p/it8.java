package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class it8 extends b221 implements ks61, ikz0 {
    public static final Parcelable.Creator<it8> CREATOR = new yi8(20);

    /* JADX INFO: renamed from: a */
    public final String f105460a;

    /* JADX INFO: renamed from: b */
    public final String f105461b;

    /* JADX INFO: renamed from: c */
    public final List f105462c;

    /* JADX INFO: renamed from: d */
    public final boolean f105463d;

    /* JADX INFO: renamed from: e */
    public final String f105464e;

    public it8(String str, String str2, boolean z, String str3, List list) {
        this.f105460a = str;
        this.f105461b = str2;
        this.f105462c = list;
        this.f105463d = z;
        this.f105464e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it8)) {
            return false;
        }
        it8 it8Var = (it8) obj;
        return wj50.m88271j(this.f105460a, it8Var.f105460a) && wj50.m88271j(this.f105461b, it8Var.f105461b) && wj50.m88271j(this.f105462c, it8Var.f105462c) && this.f105463d == it8Var.f105463d && wj50.m88271j(this.f105464e, it8Var.f105464e);
    }

    @Override // p204p.ikz0
    /* JADX INFO: renamed from: f */
    public final boolean mo28935f() {
        return this.f105463d;
    }

    @Override // p204p.b221
    public final String getUri() {
        return this.f105460a;
    }

    public final int hashCode() {
        return this.f105464e.hashCode() + s571.m77245d(s571.m77244c(s571.m77243b(this.f105460a.hashCode() * 31, 31, this.f105461b), 31, this.f105462c), 31, this.f105463d);
    }

    @Override // p204p.ks61
    /* JADX INFO: renamed from: p */
    public final List mo28937p() {
        return this.f105462c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105460a);
        parcel.writeString(this.f105461b);
        parcel.writeStringList(this.f105462c);
        parcel.writeInt(this.f105463d ? 1 : 0);
        parcel.writeString(this.f105464e);
    }
}
