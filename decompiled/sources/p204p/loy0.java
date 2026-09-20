package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class loy0 {

    /* JADX INFO: renamed from: g */
    public static final loy0 f135573g = new koy0().m57016g();

    /* JADX INFO: renamed from: a */
    public final hg40 f135574a;

    /* JADX INFO: renamed from: b */
    public final boolean f135575b;

    /* JADX INFO: renamed from: c */
    public final boolean f135576c;

    /* JADX INFO: renamed from: d */
    public final boolean f135577d;

    /* JADX INFO: renamed from: e */
    public final boolean f135578e;

    /* JADX INFO: renamed from: f */
    public final boolean f135579f;

    public loy0(koy0 koy0Var) {
        this.f135574a = koy0Var.f124923a;
        this.f135575b = koy0Var.f124924b;
        this.f135576c = koy0Var.f124925c;
        this.f135579f = koy0Var.f124926d;
        this.f135577d = koy0Var.f124927e;
        this.f135578e = koy0Var.f124928f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof loy0)) {
            return false;
        }
        loy0 loy0Var = (loy0) obj;
        return this.f135574a.equals(loy0Var.f135574a) && this.f135576c == loy0Var.f135576c && this.f135579f == loy0Var.f135579f && this.f135575b == loy0Var.f135575b && this.f135577d == loy0Var.f135577d && this.f135578e == loy0Var.f135578e;
    }

    public final int hashCode() {
        return Objects.hash(this.f135574a, null, null, Boolean.valueOf(this.f135575b), Boolean.valueOf(this.f135576c), Boolean.valueOf(this.f135579f), Boolean.valueOf(this.f135577d), Boolean.valueOf(this.f135578e));
    }
}
