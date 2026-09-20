package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pfm0 implements ofm0 {

    /* JADX INFO: renamed from: c */
    public static final pfm0 f177111c = new pfm0(new qfm0[0], false);

    /* JADX INFO: renamed from: a */
    public final boolean f177112a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f177113b = new LinkedHashMap();

    public pfm0(qfm0[] qfm0VarArr, boolean z) {
        this.f177112a = z;
        for (qfm0 qfm0Var : qfm0VarArr) {
            this.f177113b.put(qfm0Var.getClass(), new xoi0(qfm0Var));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m69810a(qfm0 qfm0Var) {
        Class<?> cls = qfm0Var.getClass();
        boolean z = this.f177112a;
        LinkedHashMap linkedHashMap = this.f177113b;
        if (!z && !linkedHashMap.containsKey(cls)) {
            throw new IllegalStateException("can't update properties that didn't get a default value in constructor");
        }
        Object xoi0Var = linkedHashMap.get(cls);
        if (xoi0Var == null) {
            xoi0Var = new xoi0();
            linkedHashMap.put(cls, xoi0Var);
        }
        ((xoi0) xoi0Var).mo33104m(qfm0Var);
    }

    @Override // p204p.ofm0
    /* JADX INFO: renamed from: j0 */
    public final jfm0 mo15684j0(Class cls) {
        LinkedHashMap linkedHashMap = this.f177113b;
        Object xoi0Var = linkedHashMap.get(cls);
        if (xoi0Var == null) {
            xoi0Var = new xoi0();
            linkedHashMap.put(cls, xoi0Var);
        }
        return new g480((xoi0) xoi0Var, 1);
    }
}
