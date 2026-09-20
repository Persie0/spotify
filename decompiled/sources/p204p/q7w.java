package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class q7w {

    /* JADX INFO: renamed from: a */
    public static final q7w f186175a;

    /* JADX INFO: renamed from: b */
    public static final q7w f186176b;

    /* JADX INFO: renamed from: c */
    public static final q7w f186177c;

    /* JADX INFO: renamed from: d */
    public static final q7w f186178d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ q7w[] f186179e;

    static {
        q7w q7wVar = new q7w("RowClicked", 0);
        f186175a = q7wVar;
        q7w q7wVar2 = new q7w("AddClicked", 1);
        f186176b = q7wVar2;
        q7w q7wVar3 = new q7w("PreviewPlayClicked", 2);
        f186177c = q7wVar3;
        q7w q7wVar4 = new q7w("PreviewPauseClicked", 3);
        f186178d = q7wVar4;
        f186179e = new q7w[]{q7wVar, q7wVar2, q7wVar3, q7wVar4};
    }

    public static q7w valueOf(String str) {
        return (q7w) Enum.valueOf(q7w.class, str);
    }

    public static q7w[] values() {
        return (q7w[]) f186179e.clone();
    }
}
