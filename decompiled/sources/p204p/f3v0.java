package p204p;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f3v0 {

    /* JADX INFO: renamed from: a */
    public static final Set f65599a;

    /* JADX INFO: renamed from: b */
    public static final f3v0 f65600b;

    /* JADX INFO: renamed from: c */
    public static final f3v0 f65601c;

    /* JADX INFO: renamed from: d */
    public static final f3v0 f65602d;

    /* JADX INFO: renamed from: e */
    public static final f3v0 f65603e;

    /* JADX INFO: renamed from: f */
    public static final f3v0 f65604f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ f3v0[] f65605g;

    /* JADX INFO: Fake field, exist only in values array */
    f3v0 EF0;

    static {
        f3v0 f3v0Var = new f3v0("SHOWS", 0);
        f3v0 f3v0Var2 = new f3v0("RADIO", 1);
        f3v0 f3v0Var3 = new f3v0("DAILY_MIX", 2);
        f3v0 f3v0Var4 = new f3v0("HIDDEN_ENTITIES", 3);
        f65600b = f3v0Var4;
        f3v0 f3v0Var5 = new f3v0("COLLECTION_TRACKS", 4);
        f65601c = f3v0Var5;
        f3v0 f3v0Var6 = new f3v0("COLLECTION_EPISODES", 5);
        f65602d = f3v0Var6;
        f3v0 f3v0Var7 = new f3v0("OWN_DELETED_PLAYLISTS", 6);
        f65603e = f3v0Var7;
        f3v0 f3v0Var8 = new f3v0("PODCAST_SHORTS", 7);
        f65604f = f3v0Var8;
        f65605g = new f3v0[]{f3v0Var, f3v0Var2, f3v0Var3, f3v0Var4, f3v0Var5, f3v0Var6, f3v0Var7, f3v0Var8};
        f65599a = bk5.m29624m1(new f3v0[]{f3v0Var, f3v0Var2, f3v0Var3, f3v0Var5, f3v0Var6, f3v0Var8});
    }

    public static f3v0 valueOf(String str) {
        return (f3v0) Enum.valueOf(f3v0.class, str);
    }

    public static f3v0[] values() {
        return (f3v0[]) f65605g.clone();
    }
}
