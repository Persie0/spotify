package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class mqy {

    /* JADX INFO: renamed from: a */
    public static final mqy f146378a;

    /* JADX INFO: renamed from: b */
    public static final mqy f146379b;

    /* JADX INFO: renamed from: c */
    public static final mqy f146380c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ mqy[] f146381d;

    static {
        mqy mqyVar = new mqy("THUMBS_UP", 0);
        f146378a = mqyVar;
        mqy mqyVar2 = new mqy("THUMBS_DOWN", 1);
        f146379b = mqyVar2;
        mqy mqyVar3 = new mqy("NONE", 2);
        f146380c = mqyVar3;
        f146381d = new mqy[]{mqyVar, mqyVar2, mqyVar3};
    }

    public static mqy valueOf(String str) {
        return (mqy) Enum.valueOf(mqy.class, str);
    }

    public static mqy[] values() {
        return (mqy[]) f146381d.clone();
    }
}
