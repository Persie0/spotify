package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class k8w {

    /* JADX INFO: renamed from: a */
    public static final k8w f120470a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ k8w[] f120471b;

    static {
        k8w k8wVar = new k8w("RowClicked", 0);
        f120470a = k8wVar;
        f120471b = new k8w[]{k8wVar};
    }

    public static k8w valueOf(String str) {
        return (k8w) Enum.valueOf(k8w.class, str);
    }

    public static k8w[] values() {
        return (k8w[]) f120471b.clone();
    }
}
