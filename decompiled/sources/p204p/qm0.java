package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v27 p.qm0[], still in use, count: 1, list:
  (r1v27 p.qm0[]) from 0x0257: CONSTRUCTOR (r2v27 p.nzv) = (r1v27 p.qm0[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:600) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class qm0 {
    BACKGROUNDED("backgrounded"),
    CLICKED("clicked"),
    COLLAPSED("collapsed"),
    CONTINUOUS_VIEWABILITY("viewability"),
    DISMISSED("dismissed"),
    ENDED("ended"),
    ERROR("errored"),
    EXPANDED("expanded"),
    FIRST_QUARTILE("first_quartile"),
    FOREGROUNDED("foregrounded"),
    IMPRESSION("viewed"),
    ITEM_CLICKED("item_clicked"),
    ITEM_IMPRESSION("item_impression"),
    MIDPOINT("midpoint"),
    MINIMIZED("minimized"),
    MUTED("muted"),
    NONCONTINUOUS_VIEWABILITY("video_viewed"),
    OBSCURED("obscured"),
    PAUSED("paused"),
    PROGRESS("progress"),
    REPLAYED("replayed"),
    RESUMED("resumed"),
    SKIPPED("skipped"),
    STARTED("started"),
    SURVEY_SUBMITTED("survey_submitted"),
    TERMINATED("terminated"),
    THIRD_QUARTILE("third_quartile"),
    UNMUTED("unmuted"),
    LOADED("loaded"),
    UNLOADED("unloaded"),
    UNOBSCURED("unobscured"),
    VIEWABILITY_0("visible_0"),
    VIEWABILITY_GREATER_THAN_0("visible_gt_0"),
    VIEWABILITY_50("visible_50"),
    VIEWABILITY_50_LESS("visible_50_less"),
    VIEWABILITY_100("visible_100"),
    VOLUME_CHANGE("volume_change"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f189980b;

    /* JADX INFO: renamed from: a */
    public final String f190001a;

    static {
        nzv nzvVar = new nzv(qm0VarArr);
        int iM31820L = c95.m31820L(i6f.m49804T(nzvVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        Iterator it = nzvVar.iterator();
        while (true) {
            C2042k7 c2042k7 = (C2042k7) it;
            if (!c2042k7.hasNext()) {
                f189980b = linkedHashMap;
                return;
            } else {
                Object next = c2042k7.next();
                linkedHashMap.put(((qm0) next).f190001a, next);
            }
        }
    }

    public qm0(String str) {
        super(str, i);
        this.f190001a = str;
    }

    public static qm0 valueOf(String str) {
        return (qm0) Enum.valueOf(qm0.class, str);
    }

    public static qm0[] values() {
        return (qm0[]) f189999m1.clone();
    }
}
