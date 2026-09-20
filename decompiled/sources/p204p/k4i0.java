package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k4i0 {

    /* JADX INFO: renamed from: a */
    public final ob81 f119227a;

    /* JADX INFO: renamed from: b */
    public final mq81 f119228b;

    /* JADX INFO: renamed from: c */
    public final ck81 f119229c;

    /* JADX INFO: renamed from: d */
    public final bl91 f119230d;

    /* JADX INFO: renamed from: e */
    public final boolean f119231e;

    /* JADX INFO: renamed from: f */
    public final boolean f119232f;

    /* JADX INFO: renamed from: g */
    public int f119233g;

    /* JADX INFO: renamed from: h */
    public r300 f119234h;

    public k4i0(ob81 ob81Var, mq81 mq81Var, ck81 ck81Var) {
        this.f119227a = ob81Var;
        this.f119228b = mq81Var;
        this.f119229c = ck81Var;
        int i = ob81Var.f163567b;
        r300 r300Var = ob81Var.f163572g;
        this.f119231e = i == 2;
        this.f119232f = Objects.equals(r300Var.f195387p, "application/x-itut-t35");
        this.f119230d = "audio/true-hd".equals(r300Var.f195387p) ? new bl91() : null;
    }
}
