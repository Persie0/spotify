package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ctd1[], still in use, count: 1, list:
  (r0v1 p.ctd1[]) from 0x007a: CONSTRUCTOR (r0v1 p.ctd1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:123) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ctd1 {
    ACTION_USER_LOGIN("com.spotify.widgets.widgets.ACTION_USER_LOGIN"),
    ACTION_USER_LOGOUT("com.spotify.widgets.widgets.ACTION_USER_LOGOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTION_PLAYBACK_COMMAND("com.spotify.widgets.widgets.ACTION_PLAYBACK_COMMAND"),
    ACTION_REFRESH("com.spotify.widgets.widgets.ACTION_REFRESH"),
    ACTION_UPDATE("com.spotify.widgets.widgets.ACTION_UPDATE"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTION_DISMISS_EDUCATION("com.spotify.widgets.widgets.ACTION_DISMISS_EDUCATION"),
    ACTION_END_SESSION("com.spotify.widgets.widgets.ACTION_END_SESSION"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTION_DELETED("com.spotify.widgets.widgets.ACTION_DELETED"),
    ACTION_TOOLTIP("com.spotify.widgets.widgets.ACTION_TOOLTIP"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTION_MIUI_UPDATE("miui.appwidget.action.APPWIDGET_UPDATE");


    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ nzv f41862i;

    /* JADX INFO: renamed from: a */
    public final String f41863a;

    static {
        f41862i = new nzv(ctd1VarArr);
    }

    public ctd1(String str) {
        super(str, i);
        this.f41863a = str;
    }

    public static ctd1 valueOf(String str) {
        return (ctd1) Enum.valueOf(ctd1.class, str);
    }

    public static ctd1[] values() {
        return (ctd1[]) f41861h.clone();
    }
}
