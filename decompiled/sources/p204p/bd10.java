package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bd10 implements cka1 {

    /* JADX INFO: renamed from: b */
    public static final bd10 f25976b = new bd10();

    @Override // p204p.cka1
    /* JADX INFO: renamed from: a */
    public final boolean mo25885a(String str) {
        return str.length() > 0;
    }

    @Override // p204p.cka1
    /* JADX INFO: renamed from: b */
    public final boolean mo25886b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '?' || cCharAt == '#') {
                return false;
            }
        }
        return true;
    }
}
