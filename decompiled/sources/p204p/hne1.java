package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 p.hne1, still in use, count: 1, list:
  (r0v0 p.hne1) from 0x009f: SPUT (r0v0 p.hne1) (LINE:160) p.hne1.i p.hne1
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
/* JADX INFO: loaded from: classes2.dex */
public final class hne1 {
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(0, "never", new kb01(R.string.your_episodes_settings_option_never, null, "never")),
    AFTER_PLAYING(1, "afterplaying", new kb01(R.string.your_episodes_settings_option_after_playing, null, "after-playing")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_24_HOURS(2, "after24hours", new kb01(R.string.your_episodes_settings_option_24h, null, "after-24h")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_2_DAYS(3, "after2days", new kb01(R.string.your_episodes_settings_option_2d, null, "after-2d")),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_1_WEEK(4, "after1week", new kb01(R.string.your_episodes_settings_option_1w, null, "after-1w"));


    /* JADX INFO: renamed from: d */
    public static final wg61 f93317d = new wg61(foc1.f71503d);

    /* JADX INFO: renamed from: e */
    public static final wg61 f93318e = new wg61(rfd1.f198606X0);

    /* JADX INFO: renamed from: f */
    public static final wg61 f93319f = new wg61(rfd1.f198610Z0);

    /* JADX INFO: renamed from: g */
    public static final wg61 f93320g = new wg61(rfd1.f198611a1);

    /* JADX INFO: renamed from: h */
    public static final wg61 f93321h = new wg61(rfd1.f198608Y0);

    /* JADX INFO: renamed from: i */
    public static final hne1 f93322i = new hne1(0, "never", new kb01(R.string.your_episodes_settings_option_never, null, "never"));

    /* JADX INFO: renamed from: a */
    public final int f93324a;

    /* JADX INFO: renamed from: b */
    public final String f93325b;

    /* JADX INFO: renamed from: c */
    public final kb01 f93326c;

    static {
    }

    public hne1(int i, String str, kb01 kb01Var) {
        super(str, i);
        this.f93324a = i;
        this.f93325b = str;
        this.f93326c = kb01Var;
    }

    public static hne1 valueOf(String str) {
        return (hne1) Enum.valueOf(hne1.class, str);
    }

    public static hne1[] values() {
        return (hne1[]) f93316X.clone();
    }
}
