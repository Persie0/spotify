package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class b8m {

    /* JADX INFO: renamed from: a */
    public final dlo0 f24609a;

    /* JADX INFO: renamed from: b */
    public final String f24610b;

    /* JADX INFO: renamed from: c */
    public final String f24611c;

    /* JADX INFO: renamed from: d */
    public final String f24612d;

    /* JADX INFO: renamed from: e */
    public final r86 f24613e;

    /* JADX INFO: renamed from: f */
    public final qsj f24614f;

    /* JADX INFO: renamed from: g */
    public final boolean f24615g;

    /* JADX INFO: renamed from: h */
    public final boolean f24616h;

    /* JADX INFO: renamed from: i */
    public final boolean f24617i;

    /* JADX INFO: renamed from: j */
    public final boolean f24618j;

    /* JADX INFO: renamed from: k */
    public final List f24619k;

    public b8m(dlo0 dlo0Var, String str, String str2, String str3, r86 r86Var, qsj qsjVar, boolean z, boolean z2, boolean z3, boolean z4, List list) {
        this.f24609a = dlo0Var;
        this.f24610b = str;
        this.f24611c = str2;
        this.f24612d = str3;
        this.f24613e = r86Var;
        this.f24614f = qsjVar;
        this.f24615g = z;
        this.f24616h = z2;
        this.f24617i = z3;
        this.f24618j = z4;
        this.f24619k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8m)) {
            return false;
        }
        b8m b8mVar = (b8m) obj;
        return this.f24609a == b8mVar.f24609a && wj50.m88271j(this.f24610b, b8mVar.f24610b) && this.f24611c.equals(b8mVar.f24611c) && wj50.m88271j(this.f24612d, b8mVar.f24612d) && this.f24613e.equals(b8mVar.f24613e) && this.f24614f == b8mVar.f24614f && this.f24615g == b8mVar.f24615g && this.f24616h == b8mVar.f24616h && this.f24617i == b8mVar.f24617i && this.f24618j == b8mVar.f24618j && wj50.m88271j(this.f24619k, b8mVar.f24619k);
    }

    public final int hashCode() {
        return this.f24619k.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(xl81.m91401j(this.f24614f, (this.f24613e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f24609a.hashCode() * 31, 31, this.f24610b), 31, this.f24611c), 31, this.f24612d)) * 31, 31), 31, this.f24615g), 31, this.f24616h), 31, this.f24617i), 31, this.f24618j), 31, false);
    }
}
