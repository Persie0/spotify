package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yuk {

    /* JADX INFO: renamed from: a */
    public static final yuk f276404a;

    /* JADX INFO: renamed from: b */
    public static final yuk f276405b;

    /* JADX INFO: renamed from: c */
    public static final yuk f276406c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yuk[] f276407d;

    static {
        yuk yukVar = new yuk("COROUTINE_SUSPENDED", 0);
        f276404a = yukVar;
        yuk yukVar2 = new yuk("UNDECIDED", 1);
        f276405b = yukVar2;
        yuk yukVar3 = new yuk("RESUMED", 2);
        f276406c = yukVar3;
        f276407d = new yuk[]{yukVar, yukVar2, yukVar3};
    }

    public static yuk valueOf(String str) {
        return (yuk) Enum.valueOf(yuk.class, str);
    }

    public static yuk[] values() {
        return (yuk[]) f276407d.clone();
    }
}
