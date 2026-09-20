package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class dgq0 implements wfq0 {

    /* JADX INFO: renamed from: a */
    public static final zfq0 f48882a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ dgq0[] f48883b;

    static {
        zfq0 zfq0Var = new zfq0();
        f48882a = zfq0Var;
        f48883b = new dgq0[]{zfq0Var, new dgq0() { // from class: p.agq0
            @Override // p204p.wfq0
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new dgq0() { // from class: p.bgq0
            @Override // p204p.wfq0
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new dgq0() { // from class: p.cgq0
            @Override // p204p.wfq0
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static dgq0 valueOf(String str) {
        return (dgq0) Enum.valueOf(dgq0.class, str);
    }

    public static dgq0[] values() {
        return (dgq0[]) f48883b.clone();
    }
}
