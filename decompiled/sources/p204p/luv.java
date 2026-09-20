package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class luv {

    /* JADX INFO: renamed from: a */
    public final qe70 f137157a;

    /* JADX INFO: renamed from: b */
    public final Set f137158b;

    /* JADX WARN: Multi-variable type inference failed */
    public luv(Set set, th00 th00Var) {
        this.f137157a = (qe70) th00Var;
        this.f137158b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luv)) {
            return false;
        }
        luv luvVar = (luv) obj;
        return this.f137157a.equals(luvVar.f137157a) && this.f137158b.equals(luvVar.f137158b);
    }

    public final int hashCode() {
        return this.f137158b.hashCode() + (this.f137157a.hashCode() * 31);
    }
}
