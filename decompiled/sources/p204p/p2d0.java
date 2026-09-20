package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class p2d0 extends AbstractC2154n7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r2d0 f173324a;

    public p2d0(r2d0 r2d0Var) {
        this.f173324a = r2d0Var;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f173324a.f195127a.groupCount() + 1;
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.f173324a.f195127a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
