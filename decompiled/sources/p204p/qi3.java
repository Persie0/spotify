package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class qi3 {

    /* JADX INFO: renamed from: a */
    public final boolean f188915a;

    /* JADX INFO: renamed from: b */
    public final boolean f188916b;

    /* JADX INFO: renamed from: c */
    public final boolean f188917c;

    /* JADX INFO: renamed from: d */
    public final boolean f188918d;

    /* JADX INFO: renamed from: e */
    public final List f188919e;

    /* JADX INFO: renamed from: f */
    public final boolean f188920f;

    /* JADX INFO: renamed from: g */
    public final boolean f188921g;

    public qi3(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f188915a = z;
        this.f188916b = z2;
        this.f188917c = z3;
        this.f188918d = z4;
        this.f188919e = list;
        this.f188920f = z5;
        this.f188921g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi3)) {
            return false;
        }
        qi3 qi3Var = (qi3) obj;
        return this.f188915a == qi3Var.f188915a && this.f188916b == qi3Var.f188916b && this.f188917c == qi3Var.f188917c && this.f188918d == qi3Var.f188918d && wj50.m88271j(this.f188919e, qi3Var.f188919e) && this.f188920f == qi3Var.f188920f && this.f188921g == qi3Var.f188921g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188921g) + s571.m77245d(s571.m77244c(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f188915a) * 31, 31, this.f188916b), 31, this.f188917c), 31, this.f188918d), 31, this.f188919e), 31, this.f188920f);
    }
}
