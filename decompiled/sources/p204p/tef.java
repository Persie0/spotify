package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class tef {

    /* JADX INFO: renamed from: a */
    public static final tef f219690a;

    /* JADX INFO: renamed from: b */
    public static final tef f219691b;

    /* JADX INFO: renamed from: c */
    public static final tef f219692c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ tef[] f219693d;

    static {
        tef tefVar = new tef("BLOCK_AUTHOR", 0);
        f219690a = tefVar;
        tef tefVar2 = new tef("REPORT_COMMENT", 1);
        f219691b = tefVar2;
        tef tefVar3 = new tef("DELETE_COMMENT", 2);
        f219692c = tefVar3;
        f219693d = new tef[]{tefVar, tefVar2, tefVar3};
    }

    public static tef valueOf(String str) {
        return (tef) Enum.valueOf(tef.class, str);
    }

    public static tef[] values() {
        return (tef[]) f219693d.clone();
    }
}
