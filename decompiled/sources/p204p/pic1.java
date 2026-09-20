package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class pic1 {

    /* JADX INFO: renamed from: a */
    public static final j7n0 f177919a = new j7n0();

    /* JADX INFO: renamed from: a */
    public static final cte m70100a(mic1 mic1Var) {
        cte cteVarM41238f;
        synchronized (f177919a) {
            cteVarM41238f = (cte) mic1Var.m61849c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (cteVarM41238f == null) {
                cteVarM41238f = fbg1.m41238f();
                mic1Var.m61847a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", cteVarM41238f);
            }
        }
        return cteVarM41238f;
    }
}
