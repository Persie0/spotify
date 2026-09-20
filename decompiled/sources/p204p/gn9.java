package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gn9 {

    /* JADX INFO: renamed from: a */
    public static final String f82660a;

    static {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.BLEND_SOCIAL_PROMPTING_PROMPT);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        f82660a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final String m45295a() {
        return f82660a;
    }
}
