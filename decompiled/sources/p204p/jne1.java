package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 p.jne1, still in use, count: 1, list:
  (r0v0 p.jne1) from 0x00b7: SPUT (r0v0 p.jne1) (LINE:184) p.jne1.i p.jne1
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
/* JADX INFO: loaded from: classes11.dex */
public final class jne1 {
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(0, "never", new kb01(R.string.your_episodes_settings_option_never, null, "never")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_24_HOURS(1, "after24hours", new kb01(R.string.your_episodes_settings_option_24h, null, "after-24h")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_1_WEEK(2, "after1week", new kb01(R.string.your_episodes_settings_option_1w, null, "after-1w")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_2_WEEKS(3, "after2weeks", new kb01(R.string.your_episodes_settings_option_2w, null, "after-2w")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_30_DAYS(4, "after30days", new kb01(R.string.your_episodes_settings_option_30d, null, "after-30d")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_3_MONTHS(5, "after3months", new kb01(R.string.your_episodes_settings_option_3m, null, "after-3mo"));


    /* JADX INFO: renamed from: d */
    public static final wg61 f114091d = new wg61(rfd1.f198613b1);

    /* JADX INFO: renamed from: e */
    public static final wg61 f114092e = new wg61(rfd1.f198615c1);

    /* JADX INFO: renamed from: f */
    public static final wg61 f114093f = new wg61(ine1.f103962c);

    /* JADX INFO: renamed from: g */
    public static final wg61 f114094g = new wg61(ine1.f103963d);

    /* JADX INFO: renamed from: h */
    public static final wg61 f114095h = new wg61(ine1.f103961b);

    /* JADX INFO: renamed from: i */
    public static final jne1 f114096i = new jne1(0, "never", new kb01(R.string.your_episodes_settings_option_never, null, "never"));

    /* JADX INFO: renamed from: a */
    public final int f114098a;

    /* JADX INFO: renamed from: b */
    public final String f114099b;

    /* JADX INFO: renamed from: c */
    public final kb01 f114100c;

    static {
    }

    public jne1(int i, String str, kb01 kb01Var) {
        super(str, i);
        this.f114098a = i;
        this.f114099b = str;
        this.f114100c = kb01Var;
    }

    public static jne1 valueOf(String str) {
        return (jne1) Enum.valueOf(jne1.class, str);
    }

    public static jne1[] values() {
        return (jne1[]) f114097t.clone();
    }
}
