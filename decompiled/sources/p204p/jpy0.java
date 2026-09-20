package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class jpy0 {

    /* JADX INFO: renamed from: a */
    public final String f114750a;

    /* JADX INFO: renamed from: b */
    public final boolean f114751b;

    /* JADX INFO: renamed from: c */
    public final boolean f114752c;

    /* JADX INFO: renamed from: d */
    public final boolean f114753d;

    /* JADX INFO: renamed from: e */
    public final l590 f114754e;

    /* JADX INFO: renamed from: f */
    public final Object f114755f;

    public jpy0(String str, boolean z, boolean z2, boolean z3, l590 l590Var, List list) {
        this.f114750a = str;
        this.f114751b = z;
        this.f114752c = z2;
        this.f114753d = z3;
        this.f114754e = l590Var;
        this.f114755f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpy0)) {
            return false;
        }
        jpy0 jpy0Var = (jpy0) obj;
        return this.f114750a.equals(jpy0Var.f114750a) && this.f114751b == jpy0Var.f114751b && this.f114752c == jpy0Var.f114752c && this.f114753d == jpy0Var.f114753d && this.f114754e.equals(jpy0Var.f114754e) && this.f114755f.equals(jpy0Var.f114755f);
    }

    public final int hashCode() {
        return this.f114755f.hashCode() + ((this.f114754e.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(this.f114750a.hashCode() * 31, 31, this.f114751b), 31, this.f114752c), 31, this.f114753d)) * 31);
    }
}
