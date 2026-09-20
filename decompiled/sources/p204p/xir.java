package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class xir {

    /* JADX INFO: renamed from: a */
    public final ant f261931a;

    public xir(lir lirVar, ant antVar) {
        this.f261931a = new n4l(new AtomicReference(), lirVar, antVar);
    }

    /* JADX INFO: renamed from: a */
    public static xir m91155a(ant antVar) {
        return new xir(new C2162nf(28), antVar);
    }

    /* JADX INFO: renamed from: b */
    public static xir m91156b(List list) {
        return new xir(new eqp(11), new uir(new ArrayList(list)));
    }

    /* JADX INFO: renamed from: c */
    public static xir m91157c(xir... xirVarArr) {
        return m91156b(Arrays.asList(xirVarArr));
    }

    /* JADX INFO: renamed from: d */
    public static xir m91158d(yh00 yh00Var, xir xirVar) {
        return new xir(new m94(22, xirVar, yh00Var));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m91159e(Object obj) {
        this.f261931a.mo25099t(obj);
    }

    public xir(m94 m94Var) {
        this.f261931a = m94Var;
    }
}
