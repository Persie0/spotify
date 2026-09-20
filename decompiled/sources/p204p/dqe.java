package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dqe {

    /* JADX INFO: renamed from: a */
    public static final dqe f51975a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ dqe[] f51976b;

    static {
        dqe dqeVar = new dqe("CardClicked", 0);
        f51975a = dqeVar;
        f51976b = new dqe[]{dqeVar};
    }

    public static dqe valueOf(String str) {
        return (dqe) Enum.valueOf(dqe.class, str);
    }

    public static dqe[] values() {
        return (dqe[]) f51976b.clone();
    }
}
