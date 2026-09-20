package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j2s {

    /* JADX INFO: renamed from: a */
    public static final j2s f108132a;

    /* JADX INFO: renamed from: b */
    public static final j2s f108133b;

    /* JADX INFO: renamed from: c */
    public static final j2s f108134c;

    /* JADX INFO: renamed from: d */
    public static final j2s f108135d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ j2s[] f108136e;

    static {
        j2s j2sVar = new j2s("Up", 0);
        f108132a = j2sVar;
        j2s j2sVar2 = new j2s("Drag", 1);
        f108133b = j2sVar2;
        j2s j2sVar3 = new j2s("Timeout", 2);
        f108134c = j2sVar3;
        j2s j2sVar4 = new j2s("Cancel", 3);
        f108135d = j2sVar4;
        f108136e = new j2s[]{j2sVar, j2sVar2, j2sVar3, j2sVar4};
    }

    public static j2s valueOf(String str) {
        return (j2s) Enum.valueOf(j2s.class, str);
    }

    public static j2s[] values() {
        return (j2s[]) f108136e.clone();
    }
}
