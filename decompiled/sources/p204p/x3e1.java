package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x3e1 {
    /* JADX INFO: renamed from: a */
    public static y3e1 m89787a(String str) {
        Object next;
        C2042k7 c2042k7 = new C2042k7(y3e1.f268908e, 0);
        while (c2042k7.hasNext()) {
            next = c2042k7.next();
            if (((y3e1) next).f268909a.equals(str)) {
                return (y3e1) next;
            }
        }
        next = null;
        return (y3e1) next;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    public final rr60 serializer() {
        return (rr60) y3e1.f268905b.getValue();
    }
}
