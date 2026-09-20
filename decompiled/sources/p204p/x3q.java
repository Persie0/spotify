package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x3q {

    /* JADX INFO: renamed from: a */
    public static final x3q f257859a;

    /* JADX INFO: renamed from: b */
    public static final x3q f257860b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ x3q[] f257861c;

    static {
        x3q x3qVar = new x3q("Add", 0);
        f257859a = x3qVar;
        x3q x3qVar2 = new x3q("Remove", 1);
        f257860b = x3qVar2;
        f257861c = new x3q[]{x3qVar, x3qVar2};
    }

    public static x3q valueOf(String str) {
        return (x3q) Enum.valueOf(x3q.class, str);
    }

    public static x3q[] values() {
        return (x3q[]) f257861c.clone();
    }
}
