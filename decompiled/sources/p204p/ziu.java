package p204p;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class ziu implements qwf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tgq f283245b;

    public /* synthetic */ ziu(tgq tgqVar, int i) {
        this.f283244a = i;
        this.f283245b = tgqVar;
    }

    @Override // p204p.qwf
    /* JADX INFO: renamed from: a */
    public final ovf mo26174a(hwf hwfVar) {
        switch (this.f283244a) {
            case 0:
                jk7 jk7Var = (jk7) hwfVar;
                Context context = (Context) this.f283245b.f220237b;
                if (wj50.m88271j(jk7Var, hk7.f92378a)) {
                    return new tyo(new kca(context));
                }
                if (wj50.m88271j(jk7Var, ik7.f103049a)) {
                    return new dmx0(context);
                }
                if (jk7Var == null) {
                    return new tyo(new kca(context));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                if (hwfVar == null) {
                    return new awo((Context) this.f283245b.f220237b, 6);
                }
                throw new ClassCastException();
            case 2:
                if (hwfVar == null) {
                    return new slp((Context) this.f283245b.f220237b, 0);
                }
                throw new ClassCastException();
            case 3:
                if (hwfVar == null) {
                    return new lgp((Context) this.f283245b.f220237b, 1);
                }
                throw new ClassCastException();
            case 4:
                if (hwfVar == null) {
                    return new awo((Context) this.f283245b.f220237b, 12);
                }
                throw new ClassCastException();
            case 5:
                e7u0 e7u0Var = (e7u0) hwfVar;
                boolean z = e7u0Var instanceof d7u0;
                tgq tgqVar = this.f283245b;
                return z ? new tjc1((Context) tgqVar.f220237b, ((d7u0) e7u0Var).f46275a) : new x1q((Context) tgqVar.f220237b);
            case 6:
                if (hwfVar == null) {
                    return new awo((Context) this.f283245b.f220237b, 13);
                }
                throw new ClassCastException();
            default:
                if (hwfVar == null) {
                    return new awo((Context) this.f283245b.f220237b, 15);
                }
                throw new ClassCastException();
        }
    }
}
