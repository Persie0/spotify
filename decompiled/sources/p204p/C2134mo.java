package p204p;

import android.content.Intent;

/* JADX INFO: renamed from: p.mo */
/* JADX INFO: loaded from: classes7.dex */
public final class C2134mo {

    /* JADX INFO: renamed from: a */
    public final qta0 f145506a;

    /* JADX INFO: renamed from: b */
    public final Intent f145507b;

    public C2134mo(qta0 qta0Var, Intent intent) {
        this.f145506a = qta0Var;
        this.f145507b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2134mo)) {
            return false;
        }
        C2134mo c2134mo = (C2134mo) obj;
        return wj50.m88271j(this.f145506a, c2134mo.f145506a) && wj50.m88271j(this.f145507b, c2134mo.f145507b);
    }

    public final int hashCode() {
        return this.f145507b.hashCode() + (this.f145506a.hashCode() * 31);
    }
}
