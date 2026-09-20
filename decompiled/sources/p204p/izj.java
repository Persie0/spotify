package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class izj {

    /* JADX INFO: renamed from: a */
    public final v300 f107237a;

    public izj(v300 v300Var) {
        this.f107237a = v300Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52026a(String str, lnn0 lnn0Var) {
        u300 u300VarM87094a;
        return (str == null || str.length() == 0 || (u300VarM87094a = ((w300) this.f107237a).m87094a(str)) == u300.LIKED_SONGS || u300VarM87094a == u300.LISTEN_LATER || lnn0Var.m59499a()) ? false : true;
    }
}
