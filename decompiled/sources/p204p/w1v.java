package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w1v {

    /* JADX INFO: renamed from: a */
    public static final w1v f247185a;

    /* JADX INFO: renamed from: b */
    public static final w1v f247186b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ w1v[] f247187c;

    static {
        w1v w1vVar = new w1v("CBCS", 0);
        f247185a = w1vVar;
        w1v w1vVar2 = new w1v("CTR", 1);
        f247186b = w1vVar2;
        f247187c = new w1v[]{w1vVar, w1vVar2};
    }

    public static w1v valueOf(String str) {
        return (w1v) Enum.valueOf(w1v.class, str);
    }

    public static w1v[] values() {
        return (w1v[]) f247187c.clone();
    }
}
