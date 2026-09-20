package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class x5b {

    /* JADX INFO: renamed from: a */
    public final String f258363a;

    /* JADX INFO: renamed from: b */
    public final String f258364b;

    /* JADX INFO: renamed from: c */
    public final String f258365c;

    /* JADX INFO: renamed from: d */
    public final t4b f258366d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f258367e;

    /* JADX INFO: renamed from: f */
    public final boolean f258368f;

    /* JADX INFO: renamed from: g */
    public final boolean f258369g;

    /* JADX INFO: renamed from: h */
    public final boolean f258370h;

    public x5b(String str, String str2, String str3, t4b t4bVar, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        this.f258363a = str;
        this.f258364b = str2;
        this.f258365c = str3;
        this.f258366d = t4bVar;
        this.f258367e = arrayList;
        this.f258368f = z;
        this.f258369g = z2;
        this.f258370h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5b)) {
            return false;
        }
        x5b x5bVar = (x5b) obj;
        return wj50.m88271j(this.f258363a, x5bVar.f258363a) && wj50.m88271j(this.f258364b, x5bVar.f258364b) && wj50.m88271j(this.f258365c, x5bVar.f258365c) && this.f258366d.equals(x5bVar.f258366d) && this.f258367e.equals(x5bVar.f258367e) && this.f258368f == x5bVar.f258368f && this.f258369g == x5bVar.f258369g && this.f258370h == x5bVar.f258370h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258370h) + s571.m77245d(s571.m77245d(lq51.m59700f(this.f258367e, (this.f258366d.hashCode() + s571.m77243b(s571.m77243b(this.f258363a.hashCode() * 31, 31, this.f258364b), 31, this.f258365c)) * 31, 31), 31, this.f258368f), 31, this.f258369g);
    }
}
