package p204p;

import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;

/* JADX INFO: loaded from: classes9.dex */
public final class y551 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f269356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f269357b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zjv0 f269358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y551(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, zjv0 zjv0Var, int i) {
        super(0);
        this.f269356a = i;
        this.f269357b = stickyHeaderLinearLayoutManager;
        this.f269358c = zjv0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f269356a) {
            case 0:
                return Integer.valueOf(this.f269357b.m928X0(this.f269358c));
            case 1:
                return Integer.valueOf(this.f269357b.m929Y0(this.f269358c));
            case 2:
                return Integer.valueOf(this.f269357b.m931Z0(this.f269358c));
            case 3:
                return Integer.valueOf(this.f269357b.m928X0(this.f269358c));
            case 4:
                return Integer.valueOf(this.f269357b.m929Y0(this.f269358c));
            default:
                return Integer.valueOf(this.f269357b.m931Z0(this.f269358c));
        }
    }
}
