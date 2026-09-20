package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x0q0 {

    /* JADX INFO: renamed from: a */
    public final v0q0 f256958a;

    /* JADX INFO: renamed from: b */
    public final h2q f256959b;

    /* JADX INFO: renamed from: c */
    public final fe00 f256960c;

    public x0q0(v0q0 v0q0Var, h2q h2qVar, fe00 fe00Var) {
        this.f256958a = v0q0Var;
        this.f256959b = h2qVar;
        this.f256960c = fe00Var;
    }

    /* JADX INFO: renamed from: d */
    public static eso m89600d(u0q0 u0q0Var) {
        Map map = u0q0Var.f225579d;
        List list = u0q0Var.f225581f;
        if (map.isEmpty()) {
            map = null;
        }
        if (list.isEmpty()) {
            list = null;
        }
        cso csoVar = (map == null && list == null) ? null : new cso(list, map);
        Map map2 = u0q0Var.f225577b;
        Map map3 = u0q0Var.f225578c;
        List list2 = u0q0Var.f225580e;
        if (map2.isEmpty()) {
            map2 = null;
        }
        if (map3.isEmpty()) {
            map3 = null;
        }
        if (list2.isEmpty()) {
            list2 = null;
        }
        return new eso(csoVar, (map2 == null && map3 == null && list2 == null) ? null : new aso(list2, map2, map3));
    }

    /* JADX INFO: renamed from: a */
    public final Single m89601a(List list, u0q0 u0q0Var) {
        hmm0 hmm0Var = new hmm0(this.f256960c, 12);
        return this.f256959b.m46501a(this.f256958a.m84397b(wtg1.m88949x(u0q0Var), new t0q0(list, m89600d(u0q0Var))).toObservable(), w0q0.f246793h, hmm0Var).firstOrError();
    }

    /* JADX INFO: renamed from: b */
    public final Observable m89602b(List list, u0q0 u0q0Var) {
        hmm0 hmm0Var = new hmm0(this.f256960c, 13);
        return this.f256959b.m46501a(this.f256958a.m84396a(wtg1.m88949x(u0q0Var), new t0q0(list, m89600d(u0q0Var))), w0q0.f246793h, hmm0Var);
    }

    /* JADX INFO: renamed from: c */
    public final Single m89603c(List list, u0q0 u0q0Var) {
        hmm0 hmm0Var = new hmm0(this.f256960c, 14);
        return this.f256959b.m46501a(this.f256958a.m84397b(wtg1.m88949x(u0q0Var), new t0q0(list, m89600d(u0q0Var))).toObservable(), w0q0.f246793h, hmm0Var).firstOrError();
    }
}
