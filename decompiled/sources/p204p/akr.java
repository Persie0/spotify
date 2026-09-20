package p204p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class akr implements Executor {

    /* JADX INFO: renamed from: a */
    public static final akr f16626a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ akr[] f16627b;

    static {
        akr akrVar = new akr("INSTANCE", 0);
        f16626a = akrVar;
        f16627b = new akr[]{akrVar};
    }

    public static akr valueOf(String str) {
        return (akr) Enum.valueOf(akr.class, str);
    }

    public static akr[] values() {
        return (akr[]) f16627b.clone();
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
