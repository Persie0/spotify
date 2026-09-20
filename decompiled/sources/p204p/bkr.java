package p204p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bkr implements Executor {

    /* JADX INFO: renamed from: a */
    public static final bkr f28006a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ bkr[] f28007b;

    static {
        bkr bkrVar = new bkr("INSTANCE", 0);
        f28006a = bkrVar;
        f28007b = new bkr[]{bkrVar};
    }

    public static bkr valueOf(String str) {
        return (bkr) Enum.valueOf(bkr.class, str);
    }

    public static bkr[] values() {
        return (bkr[]) f28007b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
