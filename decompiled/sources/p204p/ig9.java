package p204p;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ig9 extends it1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f101930e;

    /* JADX INFO: renamed from: f */
    public final e940 f101931f;

    /* JADX INFO: renamed from: g */
    public List f101932g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig9(e940 e940Var, int i) {
        super(1);
        this.f101930e = i;
        switch (i) {
            case 1:
                super(1);
                this.f101931f = e940Var;
                this.f101932g = lau.f131415a;
                break;
            default:
                this.f101931f = e940Var;
                this.f101932g = lau.f131415a;
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        switch (this.f101930e) {
            case 0:
                break;
        }
        return this.f101932g.size();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        switch (this.f101930e) {
            case 0:
                jg9 jg9Var = (jg9) dkv0Var;
                jg9Var.f112111T0.m3276a((i340) this.f101932g.get(i), jg9Var.f112110S0);
                break;
            default:
                w6c w6cVar = (w6c) dkv0Var;
                w6cVar.f248324T0.m3276a((i340) this.f101932g.get(i), w6cVar.f248323S0);
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        switch (this.f101930e) {
            case 0:
                return new jg9(viewGroup, viewGroup.getContext(), this.f101931f);
            default:
                return new w6c(viewGroup, viewGroup.getContext(), this.f101931f);
        }
    }
}
