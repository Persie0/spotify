package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gvr {

    /* JADX INFO: renamed from: a */
    public final String f84807a;

    /* JADX INFO: renamed from: b */
    public final String f84808b;

    /* JADX INFO: renamed from: c */
    public final List f84809c;

    public gvr(String str, String str2, ro80 ro80Var) {
        this.f84807a = str;
        this.f84808b = str2;
        this.f84809c = ro80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvr)) {
            return false;
        }
        gvr gvrVar = (gvr) obj;
        return wj50.m88271j(this.f84807a, gvrVar.f84807a) && wj50.m88271j(this.f84808b, gvrVar.f84808b) && wj50.m88271j(this.f84809c, gvrVar.f84809c);
    }

    public final int hashCode() {
        return this.f84809c.hashCode() + s571.m77243b(this.f84807a.hashCode() * 31, 31, this.f84808b);
    }
}
