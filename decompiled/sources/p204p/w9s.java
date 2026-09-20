package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w9s {

    /* JADX INFO: renamed from: a */
    public static final w9s f249255a;

    /* JADX INFO: renamed from: b */
    public static final w9s f249256b;

    /* JADX INFO: renamed from: c */
    public static final w9s f249257c;

    /* JADX INFO: renamed from: d */
    public static final w9s f249258d;

    /* JADX INFO: renamed from: e */
    public static final w9s f249259e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ w9s[] f249260f;

    static {
        w9s w9sVar = new w9s("Empty", 0);
        f249255a = w9sVar;
        w9s w9sVar2 = new w9s("Waiting", 1);
        f249256b = w9sVar2;
        w9s w9sVar3 = new w9s("Downloading", 2);
        f249257c = w9sVar3;
        w9s w9sVar4 = new w9s("Downloaded", 3);
        f249258d = w9sVar4;
        w9s w9sVar5 = new w9s("Error", 4);
        f249259e = w9sVar5;
        f249260f = new w9s[]{w9sVar, w9sVar2, w9sVar3, w9sVar4, w9sVar5};
    }

    public static w9s valueOf(String str) {
        return (w9s) Enum.valueOf(w9s.class, str);
    }

    public static w9s[] values() {
        return (w9s[]) f249260f.clone();
    }
}
