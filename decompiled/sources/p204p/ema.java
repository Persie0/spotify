package p204p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class ema extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gma f60858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ema(gma gmaVar) {
        super(3);
        this.f60858a = gmaVar;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        swd1 swd1Var = (swd1) obj2;
        gma gmaVar = this.f60858a;
        RecyclerView recyclerView = gmaVar.getRecyclerView();
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ((uq40) obj3).f232928d + swd1Var.f214650a.mo51806g(519).f53851d);
        gmaVar.f81347f1 = swd1Var;
        return swd1Var;
    }
}
