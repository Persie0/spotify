package p204p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class xkd1 {

    /* JADX INFO: renamed from: a */
    public final hv31 f262345a;

    /* JADX INFO: renamed from: b */
    public final xre f262346b;

    /* JADX INFO: renamed from: c */
    public final vu4 f262347c;

    /* JADX INFO: renamed from: d */
    public final BehaviorSubject f262348d;

    public xkd1(hv31 hv31Var, xre xreVar, vu4 vu4Var) {
        this.f262345a = hv31Var;
        this.f262346b = xreVar;
        this.f262347c = vu4Var;
        BehaviorSubject behaviorSubjectM23795f = BehaviorSubject.m23795f();
        this.f262348d = behaviorSubjectM23795f;
        if (vu4Var.m86409a()) {
            fv31 fv31Var = ykd1.f273681b;
            if (!((mv31) hv31Var).m62894o(fv31Var)) {
                lv31 lv31VarEdit = hv31Var.edit();
                lv31VarEdit.m60050c(fv31Var, System.currentTimeMillis());
                lv31VarEdit.m60054g();
            }
        }
        if (System.currentTimeMillis() - hv31Var.mo48712g(ykd1.f273680a, Long.MAX_VALUE) > 3628800000L) {
            behaviorSubjectM23795f.onNext(vkd1.f242210c);
        }
    }
}
