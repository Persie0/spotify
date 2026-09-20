package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class yme {

    /* JADX INFO: renamed from: a */
    public static final yme f274234a;

    /* JADX INFO: renamed from: b */
    public static final yme f274235b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yme[] f274236c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f274237d;

    static {
        yme ymeVar = new yme("Image", 0);
        f274234a = ymeVar;
        yme ymeVar2 = new yme("Video", 1);
        f274235b = ymeVar2;
        yme[] ymeVarArr = {ymeVar, ymeVar2};
        f274236c = ymeVarArr;
        f274237d = new nzv(ymeVarArr);
    }

    public static yme valueOf(String str) {
        return (yme) Enum.valueOf(yme.class, str);
    }

    public static yme[] values() {
        return (yme[]) f274236c.clone();
    }
}
