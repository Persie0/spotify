package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class q6w {

    /* JADX INFO: renamed from: a */
    public static final q6w f185931a;

    /* JADX INFO: renamed from: b */
    public static final q6w f185932b;

    /* JADX INFO: renamed from: c */
    public static final q6w f185933c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ q6w[] f185934d;

    static {
        q6w q6wVar = new q6w("NotReady", 0);
        f185931a = q6wVar;
        q6w q6wVar2 = new q6w("Ready", 1);
        f185932b = q6wVar2;
        q6w q6wVar3 = new q6w("Failed", 2);
        f185933c = q6wVar3;
        f185934d = new q6w[]{q6wVar, q6wVar2, q6wVar3};
    }

    public static q6w valueOf(String str) {
        return (q6w) Enum.valueOf(q6w.class, str);
    }

    public static q6w[] values() {
        return (q6w[]) f185934d.clone();
    }
}
