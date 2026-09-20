package p204p;

import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.h2a1[], still in use, count: 1, list:
  (r0v1 p.h2a1[]) from 0x002a: CONSTRUCTOR (r0v1 p.h2a1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:43) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class h2a1 {
    JAM_CLOSE("jam_close"),
    JAM_FAR("jam_far"),
    /* JADX INFO: Fake field, exist only in values array */
    FRIENDS("friends");


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f86942e;

    /* JADX INFO: renamed from: a */
    public final String f86943a;

    static {
        f86942e = new nzv(h2a1VarArr);
    }

    public h2a1(String str) {
        super(str, i);
        this.f86943a = str;
    }

    public static h2a1 valueOf(String str) {
        return (h2a1) Enum.valueOf(h2a1.class, str);
    }

    public static h2a1[] values() {
        return (h2a1[]) f86941d.clone();
    }

    /* JADX INFO: renamed from: a */
    public final UUID m46485a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            UUID uuid = xc8.f260119a;
            return xc8.f260121c;
        }
        if (iOrdinal == 1) {
            UUID uuid2 = xc8.f260119a;
            return xc8.f260122d;
        }
        if (iOrdinal == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
