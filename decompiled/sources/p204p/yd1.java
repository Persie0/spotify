package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class yd1 {

    /* JADX INFO: renamed from: a */
    public final jg20 f271614a;

    /* JADX INFO: renamed from: b */
    public final List f271615b;

    /* JADX INFO: renamed from: c */
    public final String f271616c;

    /* JADX INFO: renamed from: d */
    public final String f271617d;

    /* JADX INFO: renamed from: e */
    public final String f271618e;

    /* JADX INFO: renamed from: f */
    public final String f271619f;

    /* JADX INFO: renamed from: g */
    public final boolean f271620g;

    public yd1(jg20 jg20Var, List list, String str, String str2, String str3, String str4, boolean z) {
        this.f271614a = jg20Var;
        this.f271615b = list;
        this.f271616c = str;
        this.f271617d = str2;
        this.f271618e = str3;
        this.f271619f = str4;
        this.f271620g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd1)) {
            return false;
        }
        yd1 yd1Var = (yd1) obj;
        return wj50.m88271j(this.f271614a, yd1Var.f271614a) && wj50.m88271j(this.f271615b, yd1Var.f271615b) && wj50.m88271j(this.f271616c, yd1Var.f271616c) && wj50.m88271j(this.f271617d, yd1Var.f271617d) && wj50.m88271j(this.f271618e, yd1Var.f271618e) && wj50.m88271j(this.f271619f, yd1Var.f271619f) && this.f271620g == yd1Var.f271620g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271620g) + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77244c(this.f271614a.hashCode() * 31, 31, this.f271615b), 31, this.f271616c), 31, this.f271617d), 31, this.f271618e), 31, this.f271619f);
    }

    public /* synthetic */ yd1() {
        this(new jg20("", "#FFFFFF", "", "#FFFFFF", "", "", new l10("", "", "primary"), "", ""), lau.f131415a, "", "", "", "", false);
    }
}
