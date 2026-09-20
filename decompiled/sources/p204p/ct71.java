package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class ct71 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41805a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f41806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f41807c;

    public ct71(long j, uk91 uk91Var) {
        this.f41806b = j;
        this.f41807c = uk91Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f41805a) {
            case 0:
                uk91 uk91Var = (uk91) obj;
                long j = uk91Var.f231266c;
                long j2 = this.f41806b;
                long jAbs = Math.abs(j - j2);
                long j3 = uk91Var.f231264a;
                uk91 uk91Var2 = (uk91) this.f41807c;
                uk91 uk91Var3 = (uk91) obj2;
                return jlg1.m53703m(Long.valueOf(Math.abs(uk91Var.f231265b - uk91Var2.f231265b) + Math.abs(j3 - uk91Var2.f231264a) + jAbs), Long.valueOf(Math.abs(uk91Var3.f231265b - uk91Var2.f231265b) + Math.abs(uk91Var3.f231264a - uk91Var2.f231264a) + Math.abs(uk91Var3.f231266c - j2)));
            default:
                int iCompare = ((ct71) this.f41807c).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                long j4 = ((uk91) obj).f231266c;
                long j5 = this.f41806b;
                return jlg1.m53703m(Long.valueOf(Math.abs(j4 - j5)), Long.valueOf(Math.abs(((uk91) obj2).f231266c - j5)));
        }
    }

    public ct71(ct71 ct71Var, long j) {
        this.f41807c = ct71Var;
        this.f41806b = j;
    }
}
