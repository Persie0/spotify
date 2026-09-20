package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1796e extends AbstractC1961i {
    public static final Parcelable.Creator<C1796e> CREATOR = new ora(2);

    /* JADX INFO: renamed from: X */
    public final long f54805X;

    /* JADX INFO: renamed from: Y */
    public final long f54806Y;

    /* JADX INFO: renamed from: a */
    public final String f54807a;

    /* JADX INFO: renamed from: b */
    public final String f54808b;

    /* JADX INFO: renamed from: c */
    public final String f54809c;

    /* JADX INFO: renamed from: d */
    public final String f54810d;

    /* JADX INFO: renamed from: e */
    public final boolean f54811e;

    /* JADX INFO: renamed from: f */
    public final boolean f54812f;

    /* JADX INFO: renamed from: g */
    public final boolean f54813g;

    /* JADX INFO: renamed from: h */
    public final boolean f54814h;

    /* JADX INFO: renamed from: i */
    public final String f54815i;

    /* JADX INFO: renamed from: t */
    public final String f54816t;

    public C1796e(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, long j, long j2) {
        this.f54807a = str;
        this.f54808b = str2;
        this.f54809c = str3;
        this.f54810d = str4;
        this.f54811e = z;
        this.f54812f = z2;
        this.f54813g = z3;
        this.f54814h = z4;
        this.f54815i = str5;
        this.f54816t = str6;
        this.f54805X = j;
        this.f54806Y = j2;
    }

    @Override // p204p.AbstractC1961i
    /* JADX INFO: renamed from: c */
    public final String mo34482c() {
        return this.f54810d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1796e)) {
            return false;
        }
        C1796e c1796e = (C1796e) obj;
        return wj50.m88271j(this.f54807a, c1796e.f54807a) && wj50.m88271j(this.f54808b, c1796e.f54808b) && wj50.m88271j(this.f54809c, c1796e.f54809c) && wj50.m88271j(this.f54810d, c1796e.f54810d) && this.f54811e == c1796e.f54811e && this.f54812f == c1796e.f54812f && this.f54813g == c1796e.f54813g && this.f54814h == c1796e.f54814h && wj50.m88271j(this.f54815i, c1796e.f54815i) && wj50.m88271j(this.f54816t, c1796e.f54816t) && this.f54805X == c1796e.f54805X && this.f54806Y == c1796e.f54806Y;
    }

    @Override // p204p.AbstractC1961i
    /* JADX INFO: renamed from: g */
    public final boolean mo34483g() {
        return this.f54812f;
    }

    @Override // p204p.AbstractC1961i
    public final String getImageUri() {
        return this.f54809c;
    }

    @Override // p204p.AbstractC1961i
    public final String getName() {
        return this.f54808b;
    }

    @Override // p204p.AbstractC1961i
    public final String getUri() {
        return this.f54807a;
    }

    @Override // p204p.AbstractC1961i
    /* JADX INFO: renamed from: h */
    public final boolean mo34484h() {
        return this.f54814h;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54806Y) + dq60.m36605e(s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f54807a.hashCode() * 31, 31, this.f54808b), 31, this.f54809c), 31, this.f54810d), 31, this.f54811e), 31, this.f54812f), 31, this.f54813g), 31, this.f54814h), 31, this.f54815i), 31, this.f54816t), this.f54805X, 31);
    }

    @Override // p204p.AbstractC1961i
    /* JADX INFO: renamed from: j */
    public final boolean mo34485j() {
        return this.f54811e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f54807a);
        parcel.writeString(this.f54808b);
        parcel.writeString(this.f54809c);
        parcel.writeString(this.f54810d);
        parcel.writeInt(this.f54811e ? 1 : 0);
        parcel.writeInt(this.f54812f ? 1 : 0);
        parcel.writeInt(this.f54813g ? 1 : 0);
        parcel.writeInt(this.f54814h ? 1 : 0);
        parcel.writeString(this.f54815i);
        parcel.writeString(this.f54816t);
        parcel.writeLong(this.f54805X);
        parcel.writeLong(this.f54806Y);
    }
}
