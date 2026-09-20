package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yfe1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ yfe1[] f272218a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ nzv f272219b;

    /* JADX INFO: Fake field, exist only in values array */
    yfe1 EF5;

    static {
        yfe1[] yfe1VarArr = {new yfe1("REDMI_HEADPHONES_NEO", 0)};
        f272218a = yfe1VarArr;
        f272219b = new nzv(yfe1VarArr);
    }

    public static yfe1 valueOf(String str) {
        return (yfe1) Enum.valueOf(yfe1.class, str);
    }

    public static yfe1[] values() {
        return (yfe1[]) f272218a.clone();
    }
}
