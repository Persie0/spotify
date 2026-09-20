package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.pw5[], still in use, count: 1, list:
  (r0v1 p.pw5[]) from 0x007e: CONSTRUCTOR (r1v2 p.nzv) = (r0v1 p.pw5[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:127) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class pw5 {
    AI_PERSONA("ai_persona"),
    RELEASES("releases"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLISTED("playlisted"),
    EDITORIAL_PLAYLIST("editorial_playlist"),
    REGISTERED_IN_SPOTIFY("registered_in_spotify"),
    VERIFIED_BY_SPOTIFY("verified_by_spotify"),
    /* JADX INFO: Fake field, exist only in values array */
    CONCERTS("concerts"),
    TOURS("tours"),
    FRESH_FINDS_FORWARD("fresh_finds_forward"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f181906b;

    /* JADX INFO: renamed from: a */
    public final String f181915a;

    static {
        nzv nzvVar = new nzv(pw5VarArr);
        int iM31820L = c95.m31820L(i6f.m49804T(nzvVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        Iterator it = nzvVar.iterator();
        while (true) {
            C2042k7 c2042k7 = (C2042k7) it;
            if (!c2042k7.hasNext()) {
                f181906b = linkedHashMap;
                return;
            } else {
                Object next = c2042k7.next();
                linkedHashMap.put(((pw5) next).f181915a, next);
            }
        }
    }

    public pw5(String str) {
        super(str, i);
        this.f181915a = str;
    }

    public static pw5 valueOf(String str) {
        return (pw5) Enum.valueOf(pw5.class, str);
    }

    public static pw5[] values() {
        return (pw5[]) f181905X.clone();
    }
}
