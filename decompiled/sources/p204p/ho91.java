package p204p;

import io.ably.lib.rest.Auth;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ho91 implements fn91 {
    /* JADX INFO: renamed from: a */
    public abstract int mo48022a();

    /* JADX INFO: renamed from: b */
    public abstract gd70 mo48023b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo48024c();

    /* JADX INFO: renamed from: d */
    public abstract ho91 mo48025d(ld70 ld70Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho91)) {
            return false;
        }
        ho91 ho91Var = (ho91) obj;
        return mo48024c() == ho91Var.mo48024c() && mo48022a() == ho91Var.mo48022a() && mo48023b().equals(ho91Var.mo48023b());
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(mo48022a());
        if (so91.m78641l(mo48023b())) {
            return (iM38547C * 31) + 19;
        }
        return (iM38547C * 31) + (mo48024c() ? 17 : mo48023b().hashCode());
    }

    public final String toString() {
        if (mo48024c()) {
            return Auth.WILDCARD_CLIENTID;
        }
        if (mo48022a() == 1) {
            return mo48023b().toString();
        }
        return xl81.m91412u(mo48022a()) + " " + mo48023b();
    }
}
