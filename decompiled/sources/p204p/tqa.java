package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tqa extends juz0 {

    /* JADX INFO: renamed from: m */
    public static final tqa f222779m;

    static {
        bux buxVar = new bux();
        xqa.m91822a(buxVar);
        f222779m = new tqa(buxVar, xqa.f264930c, xqa.f264929b, xqa.f264931d, xqa.f264932e, xqa.f264933f, xqa.f264934g, xqa.f264936i, xqa.f264935h, xqa.f264937j, xqa.f264938k, xqa.f264939l);
    }

    /* JADX INFO: renamed from: a */
    public static String m81309a(y400 y400Var) {
        StringBuilder sb = new StringBuilder();
        z400 z400Var = y400Var.f269048a;
        sb.append(z400Var.f279080a.replace('.', '/'));
        sb.append('/');
        sb.append((z400Var.m95303c() ? "default-package" : z400Var.m95306g().m73844b()).concat(".kotlin_builtins"));
        return sb.toString();
    }
}
