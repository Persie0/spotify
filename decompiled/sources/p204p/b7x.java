package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b7x {

    /* JADX INFO: renamed from: a */
    public static final b7x f24434a;

    /* JADX INFO: renamed from: b */
    public static final b7x f24435b;

    /* JADX INFO: renamed from: c */
    public static final b7x f24436c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ b7x[] f24437d;

    static {
        b7x b7xVar = new b7x("READ_FAILED", 0);
        f24434a = b7xVar;
        b7x b7xVar2 = new b7x("WRITE_FAILED", 1);
        f24435b = b7xVar2;
        b7x b7xVar3 = new b7x("QUEUE_PERMANENTLY_STOPPED", 2);
        f24436c = b7xVar3;
        f24437d = new b7x[]{b7xVar, b7xVar2, b7xVar3};
    }

    public static b7x valueOf(String str) {
        return (b7x) Enum.valueOf(b7x.class, str);
    }

    public static b7x[] values() {
        return (b7x[]) f24437d.clone();
    }
}
