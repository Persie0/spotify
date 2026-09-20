package p204p;

import com.spotify.cosmos.cosmos.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eh30 {

    /* JADX INFO: renamed from: a */
    public static final eh30 f59473a;

    /* JADX INFO: renamed from: b */
    public static final eh30 f59474b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ eh30[] f59475c;

    static {
        eh30 eh30Var = new eh30(Request.GET, 0);
        f59473a = eh30Var;
        eh30 eh30Var2 = new eh30(Request.POST, 1);
        f59474b = eh30Var2;
        f59475c = new eh30[]{eh30Var, eh30Var2, new eh30(Request.DELETE, 2)};
    }

    public static eh30 valueOf(String str) {
        return (eh30) Enum.valueOf(eh30.class, str);
    }

    public static eh30[] values() {
        return (eh30[]) f59475c.clone();
    }
}
