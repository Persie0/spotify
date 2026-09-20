package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a8z {

    /* JADX INFO: renamed from: a */
    public static final a8z f13433a;

    /* JADX INFO: renamed from: b */
    public static final a8z f13434b;

    /* JADX INFO: renamed from: c */
    public static final a8z f13435c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ a8z[] f13436d;

    static {
        a8z a8zVar = new a8z("CameraButtonClicked", 0);
        f13433a = a8zVar;
        a8z a8zVar2 = new a8z("AudioRecognitionButtonClicked", 1);
        f13434b = a8zVar2;
        a8z a8zVar3 = new a8z("ProfileClicked", 2);
        f13435c = a8zVar3;
        f13436d = new a8z[]{a8zVar, a8zVar2, a8zVar3};
    }

    public static a8z valueOf(String str) {
        return (a8z) Enum.valueOf(a8z.class, str);
    }

    public static a8z[] values() {
        return (a8z[]) f13436d.clone();
    }
}
