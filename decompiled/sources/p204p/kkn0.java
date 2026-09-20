package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class kkn0 {

    /* JADX INFO: renamed from: a */
    public final String f123635a;

    /* JADX INFO: renamed from: b */
    public final String f123636b;

    /* JADX INFO: renamed from: c */
    public final akk f123637c;

    /* JADX INFO: renamed from: d */
    public final List f123638d;

    /* JADX INFO: renamed from: e */
    public final eh00 f123639e;

    public kkn0(String str, String str2, akk akkVar, List list, eh00 eh00Var) {
        this.f123635a = str;
        this.f123636b = str2;
        this.f123637c = akkVar;
        this.f123638d = list;
        this.f123639e = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkn0)) {
            return false;
        }
        kkn0 kkn0Var = (kkn0) obj;
        return wj50.m88271j(this.f123635a, kkn0Var.f123635a) && wj50.m88271j(this.f123636b, kkn0Var.f123636b) && wj50.m88271j(this.f123637c, kkn0Var.f123637c) && wj50.m88271j(this.f123638d, kkn0Var.f123638d) && wj50.m88271j(this.f123639e, kkn0Var.f123639e);
    }

    public final int hashCode() {
        return this.f123639e.hashCode() + s571.m77244c((this.f123637c.hashCode() + s571.m77243b(this.f123635a.hashCode() * 31, 31, this.f123636b)) * 31, 31, this.f123638d);
    }
}
