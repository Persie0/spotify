package p204p;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class icf0 {

    /* JADX INFO: renamed from: a */
    public final UUID f100810a;

    /* JADX INFO: renamed from: b */
    public final Set f100811b;

    /* JADX INFO: renamed from: c */
    public final qe70 f100812c;

    /* JADX WARN: Multi-variable type inference failed */
    public icf0(UUID uuid, Set set, gh00 gh00Var) {
        this.f100810a = uuid;
        this.f100811b = set;
        this.f100812c = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: a */
    public final gh00 m50251a() {
        return this.f100812c;
    }

    /* JADX INFO: renamed from: b */
    public final Set m50252b() {
        return this.f100811b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icf0)) {
            return false;
        }
        icf0 icf0Var = (icf0) obj;
        return this.f100810a.equals(icf0Var.f100810a) && this.f100811b.equals(icf0Var.f100811b) && this.f100812c.equals(icf0Var.f100812c);
    }

    public final int hashCode() {
        return this.f100812c.hashCode() + klh.m56830b(this.f100810a.hashCode() * 31, 31, this.f100811b);
    }
}
