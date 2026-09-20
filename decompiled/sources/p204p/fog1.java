package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class fog1 {

    /* JADX INFO: renamed from: a */
    public final cmg1 f71530a;

    /* JADX INFO: renamed from: b */
    public final d1e1 f71531b;

    /* JADX INFO: renamed from: c */
    public final String f71532c;

    /* JADX INFO: renamed from: d */
    public final String f71533d = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: e */
    public final int f71534e;

    public fog1(cmg1 cmg1Var, d1e1 d1e1Var, String str, int i) {
        this.f71530a = cmg1Var;
        this.f71531b = d1e1Var;
        this.f71532c = str;
        this.f71534e = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m42288a() {
        return this.f71532c;
    }

    /* JADX INFO: renamed from: b */
    public final String m42289b() {
        return this.f71533d;
    }

    /* JADX INFO: renamed from: c */
    public final Object m42290c(th00 th00Var, mb61 mb61Var) {
        return th00Var.invoke(new log1(this.f71530a, this.f71531b, this), mb61Var);
    }
}
