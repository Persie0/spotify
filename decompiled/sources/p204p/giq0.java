package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class giq0 implements rys0, gi00 {

    /* JADX INFO: renamed from: a */
    public static final giq0 f80238a = new giq0();

    @Override // p204p.rys0
    /* JADX INFO: renamed from: a */
    public final String mo44846a(String str) {
        return System.getProperty(str);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rys0) && (obj instanceof gi00)) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return new ri00(1, System.class, "getProperty", "getProperty(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
