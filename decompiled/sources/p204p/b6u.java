package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b6u {

    /* JADX INFO: renamed from: a */
    public static final b6u f24042a;

    /* JADX INFO: renamed from: b */
    public static final b6u f24043b;

    /* JADX INFO: renamed from: c */
    public static final b6u f24044c;

    /* JADX INFO: renamed from: d */
    public static final b6u f24045d;

    /* JADX INFO: renamed from: e */
    public static final b6u f24046e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ b6u[] f24047f;

    static {
        b6u b6uVar = new b6u("CardClicked", 0);
        f24042a = b6uVar;
        b6u b6uVar2 = new b6u("CallToActionClicked", 1);
        f24043b = b6uVar2;
        b6u b6uVar3 = new b6u("CloseClicked", 2);
        f24044c = b6uVar3;
        b6u b6uVar4 = new b6u("VideoActionClicked", 3);
        f24045d = b6uVar4;
        b6u b6uVar5 = new b6u("VolumeClicked", 4);
        f24046e = b6uVar5;
        f24047f = new b6u[]{b6uVar, b6uVar2, b6uVar3, b6uVar4, b6uVar5};
    }

    public static b6u valueOf(String str) {
        return (b6u) Enum.valueOf(b6u.class, str);
    }

    public static b6u[] values() {
        return (b6u[]) f24047f.clone();
    }
}
