package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class pyp implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f183447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qyp f183448b;

    public /* synthetic */ pyp(qyp qypVar, int i) {
        this.f183447a = i;
        this.f183448b = qypVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int iM38547C;
        Object l4q0Var;
        switch (this.f183447a) {
            case 0:
                BehaviorSubject behaviorSubject = this.f183448b.f193976u;
                yfy0 yfy0Var = ((q810) obj).f186208a;
                ney0 ney0Var = yfy0Var.f272381b;
                boolean z = yfy0Var.f272384e;
                Object l4q0Var2 = k4q0.f119296a;
                if (z && (iM38547C = edb.m38547C(ney0Var.f153157a)) != 0) {
                    if (iM38547C == 1) {
                        l4q0Var2 = j4q0.f108762a;
                    } else if (iM38547C == 2) {
                        joo jooVar = ney0Var.f153158b;
                        if (jooVar == null) {
                            jooVar = joo.f114466b;
                        }
                        l4q0Var2 = new l4q0(jooVar.m53892a());
                    } else {
                        if (iM38547C != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l4q0Var2 = i4q0.f98574a;
                    }
                }
                behaviorSubject.onNext(l4q0Var2);
                return;
            case 1:
                vda1 vda1Var = (vda1) obj;
                qyp qypVar = this.f183448b;
                BehaviorSubject behaviorSubject2 = qypVar.f193976u;
                qypVar.f193970o.getClass();
                if (vda1Var instanceof rda1) {
                    l4q0Var = j4q0.f108762a;
                } else if (vda1Var instanceof uda1) {
                    l4q0Var = new l4q0(((uda1) vda1Var).f229216a);
                } else if (vda1Var instanceof tda1) {
                    l4q0Var = k4q0.f119296a;
                } else {
                    if (!(vda1Var instanceof sda1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l4q0Var = i4q0.f98574a;
                }
                behaviorSubject2.onNext(l4q0Var);
                return;
            default:
                this.f183448b.f193976u.onNext(i4q0.f98574a);
                return;
        }
    }
}
