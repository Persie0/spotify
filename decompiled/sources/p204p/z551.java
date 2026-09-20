package p204p;

import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;

/* JADX INFO: loaded from: classes9.dex */
public final class z551 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f279479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f279480c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vjv0 f279481d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zjv0 f279482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z551(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, vjv0 vjv0Var, zjv0 zjv0Var, int i2) {
        super(0);
        this.f279478a = i2;
        this.f279479b = stickyHeaderLinearLayoutManager;
        this.f279480c = i;
        this.f279481d = vjv0Var;
        this.f279482e = zjv0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f279478a) {
            case 0:
                return Integer.valueOf(super/*androidx.recyclerview.widget.LinearLayoutManager*/.mo892H0(this.f279480c, this.f279481d, this.f279482e));
            default:
                return Integer.valueOf(super/*androidx.recyclerview.widget.LinearLayoutManager*/.mo895J0(this.f279480c, this.f279481d, this.f279482e));
        }
    }
}
