package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fjk {

    /* JADX INFO: renamed from: a */
    public static final fjk f70301a;

    /* JADX INFO: renamed from: b */
    public static final fjk f70302b;

    /* JADX INFO: renamed from: c */
    public static final fjk f70303c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fjk[] f70304d;

    static {
        fjk fjkVar = new fjk("NOTE", 0);
        f70301a = fjkVar;
        fjk fjkVar2 = new fjk("COMMENT", 1);
        f70302b = fjkVar2;
        fjk fjkVar3 = new fjk("REACTION", 2);
        f70303c = fjkVar3;
        f70304d = new fjk[]{fjkVar, fjkVar2, fjkVar3, new fjk("UNKNOWN", 3)};
    }

    public static fjk valueOf(String str) {
        return (fjk) Enum.valueOf(fjk.class, str);
    }

    public static fjk[] values() {
        return (fjk[]) f70304d.clone();
    }
}
