package p204p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ckr implements Executor {

    /* JADX INFO: renamed from: a */
    public static final ckr f39074a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ckr[] f39075b;

    static {
        ckr ckrVar = new ckr("INSTANCE", 0);
        f39074a = ckrVar;
        f39075b = new ckr[]{ckrVar};
    }

    public static ckr valueOf(String str) {
        return (ckr) Enum.valueOf(ckr.class, str);
    }

    public static ckr[] values() {
        return (ckr[]) f39075b.clone();
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
