package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class oob implements spz {

    /* JADX INFO: renamed from: a */
    public static final oob f167523a = new oob();

    /* JADX INFO: renamed from: b */
    public static Boolean f167524b;

    @Override // p204p.spz
    /* JADX INFO: renamed from: b */
    public final void mo67471b(boolean z) {
        f167524b = Boolean.valueOf(z);
    }

    @Override // p204p.spz
    /* JADX INFO: renamed from: d */
    public final boolean mo67472d() {
        Boolean bool = f167524b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw edb.m38576y("canFocus is read before it is written");
    }
}
