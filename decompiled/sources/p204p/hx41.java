package p204p;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hx41 {

    /* JADX INFO: renamed from: a */
    public static final ex41 f96135a;

    /* JADX INFO: renamed from: b */
    public static final hx41[] f96136b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hx41[] f96137c;

    static {
        ex41 ex41Var = new ex41();
        f96135a = ex41Var;
        f96137c = new hx41[]{ex41Var, new hx41() { // from class: p.fx41
            @Override // p204p.hx41
            /* JADX INFO: renamed from: a */
            public final boolean mo40163a(String str) {
                return (str.equals("orbit.settings") || str.equals("offline2") || str.equals("offline_lists.bnk")) ? false : true;
            }
        }, new hx41() { // from class: p.gx41
            @Override // p204p.hx41
            /* JADX INFO: renamed from: a */
            public final boolean mo40163a(String str) {
                return true;
            }
        }};
        f96136b = values();
    }

    public static hx41 valueOf(String str) {
        return (hx41) Enum.valueOf(hx41.class, str);
    }

    public static hx41[] values() {
        return (hx41[]) f96137c.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo40163a(String str);

    @Override // java.lang.Enum
    public final String toString() {
        return super.toString().toLowerCase(Locale.US);
    }
}
