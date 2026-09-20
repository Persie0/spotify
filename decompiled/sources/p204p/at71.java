package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class at71 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uk91 f19611b;

    public /* synthetic */ at71(int i, uk91 uk91Var) {
        this.f19610a = i;
        this.f19611b = uk91Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19610a) {
            case 0:
                long j = ((uk91) obj).f231264a;
                uk91 uk91Var = this.f19611b;
                return jlg1.m53703m(Long.valueOf(Math.abs(j - uk91Var.f231264a)), Long.valueOf(Math.abs(((uk91) obj2).f231264a - uk91Var.f231264a)));
            default:
                long j2 = ((uk91) obj).f231265b;
                uk91 uk91Var2 = this.f19611b;
                return jlg1.m53703m(Long.valueOf(Math.abs(j2 - uk91Var2.f231265b)), Long.valueOf(Math.abs(((uk91) obj2).f231265b - uk91Var2.f231265b)));
        }
    }
}
