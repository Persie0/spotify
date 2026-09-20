package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class nuf {

    /* JADX INFO: renamed from: a */
    public static final nuf f158632a;

    /* JADX INFO: renamed from: b */
    public static final nuf f158633b;

    /* JADX INFO: renamed from: c */
    public static final nuf f158634c;

    /* JADX INFO: renamed from: d */
    public static final nuf f158635d;

    /* JADX INFO: renamed from: e */
    public static final nuf f158636e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nuf[] f158637f;

    static {
        nuf nufVar = new nuf("Autocomplete", 0);
        f158632a = nufVar;
        nuf nufVar2 = new nuf("Submit", 1);
        f158633b = nufVar2;
        nuf nufVar3 = new nuf("Deeplink", 2);
        f158634c = nufVar3;
        nuf nufVar4 = new nuf("RecommendedQuery", 3);
        f158635d = nufVar4;
        nuf nufVar5 = new nuf("RelatedQuery", 4);
        f158636e = nufVar5;
        f158637f = new nuf[]{nufVar, nufVar2, nufVar3, nufVar4, nufVar5};
    }

    public static nuf valueOf(String str) {
        return (nuf) Enum.valueOf(nuf.class, str);
    }

    public static nuf[] values() {
        return (nuf[]) f158637f.clone();
    }
}
