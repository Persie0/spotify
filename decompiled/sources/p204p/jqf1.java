package p204p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jqf1 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final jqf1 f114907a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ jqf1[] f114908b;

    static {
        jqf1 jqf1Var = new jqf1("INSTANCE", 0);
        f114907a = jqf1Var;
        f114908b = new jqf1[]{jqf1Var};
    }

    public static jqf1[] values() {
        return (jqf1[]) f114908b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
