package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class mft extends smt {

    /* JADX INFO: renamed from: a */
    public final boolean f143173a;

    /* JADX INFO: renamed from: b */
    public final String f143174b;

    /* JADX INFO: renamed from: c */
    public final String f143175c;

    /* JADX INFO: renamed from: d */
    public final String f143176d;

    /* JADX INFO: renamed from: e */
    public final Set f143177e;

    /* JADX INFO: renamed from: f */
    public final boolean f143178f;

    /* JADX INFO: renamed from: g */
    public final Set f143179g;

    /* JADX INFO: renamed from: h */
    public final int f143180h;

    public mft(boolean z, String str, String str2, String str3, Set set, boolean z2, Set set2, int i) {
        this.f143173a = z;
        this.f143174b = str;
        this.f143175c = str2;
        this.f143176d = str3;
        this.f143177e = set;
        this.f143178f = z2;
        this.f143179g = set2;
        this.f143180h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mft)) {
            return false;
        }
        mft mftVar = (mft) obj;
        return this.f143173a == mftVar.f143173a && wj50.m88271j(this.f143174b, mftVar.f143174b) && wj50.m88271j(this.f143175c, mftVar.f143175c) && wj50.m88271j(this.f143176d, mftVar.f143176d) && wj50.m88271j(this.f143177e, mftVar.f143177e) && this.f143178f == mftVar.f143178f && wj50.m88271j(this.f143179g, mftVar.f143179g) && this.f143180h == mftVar.f143180h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f143180h) + klh.m56830b(s571.m77245d(klh.m56830b(s571.m77243b(s571.m77243b(s571.m77243b(Boolean.hashCode(this.f143173a) * 31, 31, this.f143174b), 31, this.f143175c), 31, this.f143176d), 31, this.f143177e), 31, this.f143178f), 31, this.f143179g);
    }
}
