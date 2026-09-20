package p204p;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1e1 {

    /* JADX INFO: renamed from: a */
    public boolean f33077a;

    /* JADX INFO: renamed from: b */
    public UUID f33078b = UUID.randomUUID();

    /* JADX INFO: renamed from: c */
    public i1e1 f33079c;

    /* JADX INFO: renamed from: d */
    public final Set f33080d;

    public c1e1(Class cls) {
        this.f33079c = new i1e1(this.f33078b.toString(), (h0e1) null, cls.getName(), (String) null, (sco) null, (sco) null, 0L, 0L, 0L, (a8j) null, 0, (to8) null, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        this.f33080d = s601.m77306i0(cls.getName());
    }

    /* JADX INFO: renamed from: a */
    public final c1e1 m31254a(String str) {
        this.f33080d.add(str);
        return mo31257d();
    }

    /* JADX INFO: renamed from: b */
    public final e1e1 m31255b() {
        e1e1 e1e1VarMo31256c = mo31256c();
        a8j a8jVar = this.f33079c.f97508j;
        boolean z = a8jVar.m25042b() || a8jVar.f13307e || a8jVar.f13305c || a8jVar.f13306d;
        i1e1 i1e1Var = this.f33079c;
        if (i1e1Var.f97515q) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (i1e1Var.f97505g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (i1e1Var.f97522x == null) {
            i1e1Var.f97522x = d1e1.m34630a(i1e1Var.f97501c);
        }
        m31260g(UUID.randomUUID());
        return e1e1VarMo31256c;
    }

    /* JADX INFO: renamed from: c */
    public abstract e1e1 mo31256c();

    /* JADX INFO: renamed from: d */
    public abstract c1e1 mo31257d();

    /* JADX INFO: renamed from: e */
    public final c1e1 m31258e(to8 to8Var, long j, TimeUnit timeUnit) {
        this.f33077a = true;
        i1e1 i1e1Var = this.f33079c;
        i1e1Var.f97510l = to8Var;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            gaz.m44190b().getClass();
        }
        if (millis < 10000) {
            gaz.m44190b().getClass();
        }
        i1e1Var.f97511m = n0e1.m63439p(millis, 10000L, 18000000L);
        return mo31257d();
    }

    /* JADX INFO: renamed from: f */
    public final c1e1 m31259f(a8j a8jVar) {
        this.f33079c.f97508j = a8jVar;
        return mo31257d();
    }

    /* JADX INFO: renamed from: g */
    public final c1e1 m31260g(UUID uuid) {
        this.f33078b = uuid;
        String string = uuid.toString();
        i1e1 i1e1Var = this.f33079c;
        this.f33079c = new i1e1(string, i1e1Var.f97500b, i1e1Var.f97501c, i1e1Var.f97502d, new sco(i1e1Var.f97503e), new sco(i1e1Var.f97504f), i1e1Var.f97505g, i1e1Var.f97506h, i1e1Var.f97507i, new a8j(i1e1Var.f97508j), i1e1Var.f97509k, i1e1Var.f97510l, i1e1Var.f97511m, i1e1Var.f97512n, i1e1Var.f97513o, i1e1Var.f97514p, i1e1Var.f97515q, i1e1Var.f97516r, i1e1Var.f97517s, i1e1Var.f97519u, i1e1Var.f97520v, i1e1Var.f97521w, i1e1Var.f97522x, 524288);
        return mo31257d();
    }

    /* JADX INFO: renamed from: h */
    public final c1e1 m31261h(long j, TimeUnit timeUnit) {
        this.f33079c.f97505g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.f33079c.f97505g) {
            return mo31257d();
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    /* JADX INFO: renamed from: i */
    public final c1e1 m31262i(sco scoVar) {
        this.f33079c.f97503e = scoVar;
        return mo31257d();
    }
}
