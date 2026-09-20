package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class wv51 {

    /* JADX INFO: Fake field, exist only in values array */
    wv51 EF5;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ wv51[] f255416b = {new wv51("HUMAN", 0), new wv51("MACHINE", 1)};
    public static final vv51 Companion = new vv51();

    /* JADX INFO: renamed from: a */
    public static final Object f255415a = q3d0.m72078I(2, uv51.f234363b);

    public static wv51 valueOf(String str) {
        return (wv51) Enum.valueOf(wv51.class, str);
    }

    public static wv51[] values() {
        return (wv51[]) f255416b.clone();
    }
}
