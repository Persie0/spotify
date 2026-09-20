package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class pt9 {

    /* JADX INFO: renamed from: a */
    public final ot9 f181075a;

    /* JADX INFO: renamed from: b */
    public final wg61 f181076b;

    public pt9(ow00 ow00Var, kun0 kun0Var, ot9 ot9Var) {
        this.f181075a = ot9Var;
        this.f181076b = new wg61(new pr0(5, ow00Var, kun0Var));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70916a() {
        ot9 ot9Var = this.f181075a;
        if (!ot9Var.f169004a.m37730w() || !ot9Var.f169004a.m37709b()) {
            return false;
        }
        mey meyVar = (mey) ((fmu0) this.f181076b.getValue()).getValue();
        key keyVar = meyVar instanceof key ? (key) meyVar : null;
        return (keyVar != null ? keyVar.m56243a() : null) instanceof C2448uc;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m70917b() {
        if (!this.f181075a.f169004a.m37730w()) {
            return false;
        }
        mey meyVar = (mey) ((fmu0) this.f181076b.getValue()).getValue();
        if (meyVar instanceof ley) {
            return true;
        }
        if (meyVar instanceof key) {
            return ((key) meyVar).m56243a() instanceof C2448uc;
        }
        throw new NoWhenBranchMatchedException();
    }
}
