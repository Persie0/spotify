package p204p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nx91 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final nx91 f159417a;

    /* JADX INFO: renamed from: b */
    public static final Handler f159418b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nx91[] f159419c;

    static {
        nx91 nx91Var = new nx91("INSTANCE", 0);
        f159417a = nx91Var;
        f159419c = new nx91[]{nx91Var};
        f159418b = new Handler(Looper.getMainLooper());
    }

    public static nx91 valueOf(String str) {
        return (nx91) Enum.valueOf(nx91.class, str);
    }

    public static nx91[] values() {
        return (nx91[]) f159419c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f159418b.post(runnable);
    }
}
