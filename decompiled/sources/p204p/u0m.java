package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class u0m {

    /* JADX INFO: renamed from: a */
    public static final u0m f225531a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ u0m[] f225532b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f225533c;

    /* JADX INFO: Fake field, exist only in values array */
    u0m EF0;

    static {
        u0m u0mVar = new u0m("INTRO", 0);
        u0m u0mVar2 = new u0m("COACHING", 1);
        u0m u0mVar3 = new u0m("ENCOURAGEMENT", 2);
        u0m u0mVar4 = new u0m("TRANSITION", 3);
        u0m u0mVar5 = new u0m("OUTRO", 4);
        u0m u0mVar6 = new u0m("UNKNOWN", 5);
        f225531a = u0mVar6;
        u0m[] u0mVarArr = {u0mVar, u0mVar2, u0mVar3, u0mVar4, u0mVar5, u0mVar6};
        f225532b = u0mVarArr;
        f225533c = new nzv(u0mVarArr);
    }

    public static u0m valueOf(String str) {
        return (u0m) Enum.valueOf(u0m.class, str);
    }

    public static u0m[] values() {
        return (u0m[]) f225532b.clone();
    }
}
