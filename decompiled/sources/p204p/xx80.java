package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class xx80 extends ri00 implements vh00 {

    /* JADX INFO: renamed from: h */
    public static final xx80 f266901h = new xx80(3, by80.class, "defaultLoadedItems", "defaultLoadedItems(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/ListModel;ILcom/spotify/yourlibrary/yourlibraryx/shared/domain/Loaded;)Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/Items;", 1);

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        String str;
        jz80 jz80Var = (jz80) obj;
        int iIntValue = ((Number) obj2).intValue();
        i6a0 i6a0Var = (i6a0) obj3;
        ibj ibjVar = jz80Var.f117618a.f84784e;
        if (!(ibjVar instanceof gbj) || (str = ((gbj) ibjVar).f78311a) == null || str.length() == 0) {
            return jz80Var.f117623f instanceof i1v0 ? new aw50(iIntValue, i6a0Var.getCount(), i6a0Var.mo27290g(), i6a0Var.getItems(), i6a0Var.mo27289c()) : new vv50(iIntValue, i6a0Var.getCount(), i6a0Var.mo27290g(), i6a0Var.getItems(), i6a0Var.mo27291h(), i6a0Var.getFilters(), i6a0Var.mo27289c(), i6a0Var.mo27292j());
        }
        return new bw50(iIntValue, i6a0Var.getCount(), i6a0Var.mo27290g(), i6a0Var.getItems(), i6a0Var.mo27289c());
    }
}
