package p204p;

import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ugy0 implements f0k {

    /* JADX INFO: renamed from: a */
    public final gh00 f230282a;

    /* JADX INFO: renamed from: b */
    public final qe70 f230283b;

    /* JADX INFO: renamed from: c */
    public final eh00 f230284c;

    /* JADX INFO: renamed from: d */
    public final eh00 f230285d;

    /* JADX INFO: renamed from: e */
    public final b9k f230286e;

    /* JADX INFO: renamed from: f */
    public final qhy0 f230287f;

    /* JADX INFO: renamed from: g */
    public final Object f230288g;

    /* JADX WARN: Multi-variable type inference failed */
    public ugy0(ygy0 ygy0Var, gh00 gh00Var, gh00 gh00Var2, th00 th00Var, eh00 eh00Var, eh00 eh00Var2, Map map) {
        this.f230282a = gh00Var2;
        this.f230283b = (qe70) th00Var;
        this.f230284c = eh00Var;
        this.f230285d = eh00Var2;
        b9k b9kVar = new b9k(ygy0Var.f272694a, map, ygy0Var.f272696c);
        this.f230286e = b9kVar;
        qhy0 qhy0Var = new qhy0(b9kVar);
        this.f230287f = qhy0Var;
        this.f230288g = gh00Var.invoke(qhy0Var);
    }

    @Override // p204p.f0k
    /* JADX INFO: renamed from: J */
    public final b9k mo40305J() {
        return this.f230286e;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [p.qe70, p.th00] */
    @Override // p204p.f0k
    /* JADX INFO: renamed from: S */
    public final LinkedHashSet mo40306S() {
        gh00 gh00Var = this.f230282a;
        Object obj = this.f230288g;
        Set set = (Set) gh00Var.invoke(obj);
        Iterable iterable = (Iterable) this.f230283b.invoke(this.f230287f, obj);
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((hgm) ((t050) it.next()).f215764b.getValue());
        }
        return s601.m77309l0(set, arrayList);
    }

    @Override // p204p.f0k
    /* JADX INFO: renamed from: h */
    public final List mo40308h() {
        return (List) this.f230285d.invoke();
    }

    @Override // p204p.f0k
    /* JADX INFO: renamed from: m */
    public final List mo40309m() {
        return (List) this.f230284c.invoke();
    }

    @Override // p204p.f0k
    public final CompletableCreate shutdown() {
        return g0b1.m43282x(dau.f47107a, new cj40(this, null, 24));
    }

    @Override // p204p.f0k
    /* JADX INFO: renamed from: z */
    public final b9k mo40310z() {
        return this.f230286e;
    }

    public /* synthetic */ ugy0(ygy0 ygy0Var, gh00 gh00Var, gh00 gh00Var2, th00 th00Var, eh00 eh00Var, eh00 eh00Var2, int i) {
        this(ygy0Var, gh00Var, (i & 4) != 0 ? j1l0.f107791b1 : gh00Var2, th00Var, (i & 16) != 0 ? l3b0.f129266T0 : eh00Var, (i & 32) != 0 ? pwv0.f182134a1 : eh00Var2, nau.f152117a);
    }
}
