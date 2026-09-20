package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class k0c {

    /* JADX INFO: renamed from: a */
    public static final k0c f117956a;

    /* JADX INFO: renamed from: b */
    public static final k0c f117957b;

    /* JADX INFO: renamed from: c */
    public static final k0c f117958c;

    /* JADX INFO: renamed from: d */
    public static final k0c f117959d;

    /* JADX INFO: renamed from: e */
    public static final k0c f117960e;

    /* JADX INFO: renamed from: f */
    public static final k0c f117961f;

    /* JADX INFO: renamed from: g */
    public static final k0c f117962g;

    /* JADX INFO: renamed from: h */
    public static final k0c f117963h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ k0c[] f117964i;

    static {
        k0c k0cVar = new k0c("NO_TEXT", 0);
        f117956a = k0cVar;
        k0c k0cVar2 = new k0c("TITLE_ONLY", 1);
        f117957b = k0cVar2;
        k0c k0cVar3 = new k0c("TITLE_AND_SUBTITLE", 2);
        f117958c = k0cVar3;
        k0c k0cVar4 = new k0c("TITLE_AND_METADATA", 3);
        f117959d = k0cVar4;
        k0c k0cVar5 = new k0c("LARGE_DESCRIPTION_ONLY", 4);
        f117960e = k0cVar5;
        k0c k0cVar6 = new k0c("LARGE_NO_TEXT", 5);
        f117961f = k0cVar6;
        k0c k0cVar7 = new k0c("DESCRIPTION_ONLY", 6);
        f117962g = k0cVar7;
        k0c k0cVar8 = new k0c("SUBTITLE_ONLY", 7);
        f117963h = k0cVar8;
        f117964i = new k0c[]{k0cVar, k0cVar2, k0cVar3, k0cVar4, k0cVar5, k0cVar6, k0cVar7, k0cVar8};
    }

    public static k0c valueOf(String str) {
        return (k0c) Enum.valueOf(k0c.class, str);
    }

    public static k0c[] values() {
        return (k0c[]) f117964i.clone();
    }
}
