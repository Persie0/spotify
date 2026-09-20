package p204p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class apb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView f17904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rrp f17905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ apb1(RecyclerView recyclerView, rrp rrpVar, int i) {
        super(0);
        this.f17903a = i;
        this.f17904b = recyclerView;
        this.f17905c = rrpVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f17903a) {
            case 0:
                this.f17904b.addOnAttachStateChangeListener(this.f17905c);
                break;
            default:
                this.f17904b.removeOnAttachStateChangeListener(this.f17905c);
                break;
        }
        return w2a1.f247311a;
    }
}
