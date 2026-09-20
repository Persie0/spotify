package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yxo {

    /* JADX INFO: renamed from: a */
    public final r300 f277285a;

    /* JADX INFO: renamed from: b */
    public final r300 f277286b;

    /* JADX INFO: renamed from: c */
    public final int f277287c;

    /* JADX INFO: renamed from: d */
    public final int f277288d;

    /* JADX INFO: renamed from: e */
    public final k07 f277289e;

    /* JADX INFO: renamed from: f */
    public final p27 f277290f;

    /* JADX INFO: renamed from: g */
    public final qp71 f277291g;

    /* JADX INFO: renamed from: h */
    public final Object f277292h;

    public yxo(r300 r300Var, r300 r300Var2, int i, int i2, k07 k07Var, p27 p27Var, qp71 qp71Var, Object obj) {
        this.f277285a = r300Var;
        this.f277286b = r300Var2;
        this.f277287c = i;
        this.f277288d = i2;
        this.f277289e = k07Var;
        this.f277290f = p27Var;
        this.f277291g = qp71Var;
        this.f277292h = obj;
    }

    /* JADX INFO: renamed from: a */
    public static yxo m94846a(yxo yxoVar, k07 k07Var) {
        return new yxo(yxoVar.f277285a, yxoVar.f277286b, yxoVar.f277287c, yxoVar.f277288d, k07Var, yxoVar.f277290f, yxoVar.f277291g, yxoVar.f277292h);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m94847b(yxo yxoVar) {
        return Objects.equals(yxoVar.f277285a.f195387p, "audio/raw");
    }
}
