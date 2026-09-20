package p204p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f8g1 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final f8g1 f66988a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ f8g1[] f66989b;

    static {
        f8g1 f8g1Var = new f8g1("INSTANCE", 0);
        f66988a = f8g1Var;
        f66989b = new f8g1[]{f8g1Var};
    }

    public static f8g1[] values() {
        return (f8g1[]) f66989b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((ywh0) qgj0.m72745j().f188484b).post(runnable);
    }
}
