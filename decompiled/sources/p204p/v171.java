package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class v171 {

    /* JADX INFO: renamed from: a */
    public final Object f236273a;

    public v171() {
        pqm0 pqm0Var = new pqm0(rc71.f197781a, Float.valueOf(0.2f));
        Float fValueOf = Float.valueOf(0.7f);
        this.f236273a = kkc0.m56695h0(pqm0Var, new pqm0(rc71.f197783c, fValueOf), new pqm0(rc71.f197785e, Float.valueOf(0.1f)), new pqm0(rc71.f197784d, fValueOf), new pqm0(rc71.f197782b, Float.valueOf(0.3f)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final float m84453a(Set set, rc71 rc71Var) {
        Object next;
        Iterator it = set.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((sc71) next).f207657a != rc71Var);
        sc71 sc71Var = (sc71) next;
        float f = sc71Var != null ? sc71Var.f207658b : 0.0f;
        Float f2 = (Float) this.f236273a.get(rc71Var);
        return f * (f2 != null ? f2.floatValue() : 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public final float m84454b(yc71 yc71Var) {
        Set set = yc71Var.f271422b;
        float fM84453a = m84453a(set, rc71.f197781a) + m84453a(set, rc71.f197783c) + m84453a(set, rc71.f197785e);
        return ((m84453a(set, rc71.f197782b) + m84453a(set, rc71.f197784d)) * 0.3f) + (fM84453a * 0.7f);
    }
}
