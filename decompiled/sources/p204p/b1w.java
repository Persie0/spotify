package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b1w {

    /* JADX INFO: renamed from: a */
    public static final b1w f22422a;

    /* JADX INFO: renamed from: b */
    public static final b1w f22423b;

    /* JADX INFO: renamed from: c */
    public static final b1w f22424c;

    /* JADX INFO: renamed from: d */
    public static final b1w f22425d;

    /* JADX INFO: renamed from: e */
    public static final b1w f22426e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ b1w[] f22427f;

    static {
        b1w b1wVar = new b1w("CardClicked", 0);
        f22422a = b1wVar;
        b1w b1wVar2 = new b1w("CardLongClicked", 1);
        f22423b = b1wVar2;
        b1w b1wVar3 = new b1w("ContextMenuButtonClicked", 2);
        f22424c = b1wVar3;
        b1w b1wVar4 = new b1w("SaveButtonClicked", 3);
        f22425d = b1wVar4;
        b1w b1wVar5 = new b1w("PlayButtonClicked", 4);
        f22426e = b1wVar5;
        f22427f = new b1w[]{b1wVar, b1wVar2, b1wVar3, b1wVar4, b1wVar5};
    }

    public static b1w valueOf(String str) {
        return (b1w) Enum.valueOf(b1w.class, str);
    }

    public static b1w[] values() {
        return (b1w[]) f22427f.clone();
    }
}
