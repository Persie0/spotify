package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: renamed from: p.ir */
/* JADX INFO: loaded from: classes18.dex */
public final class C1989ir implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104871a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2585xr f104872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f104873c;

    public C1989ir(C2585xr c2585xr, String str) {
        this.f104872b = c2585xr;
        this.f104873c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f104871a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    this.f104872b.f265170g.m53152a(new ns41((String) this.f104873c));
                }
                break;
            default:
                C1993iw c1993iw = (C1993iw) ((xul0) obj).mo49283h();
                if (c1993iw != null && !c1993iw.equals((C1993iw) this.f104873c)) {
                    this.f104872b.m91909q(c1993iw);
                    break;
                }
                break;
        }
    }

    public C1989ir(C2585xr c2585xr, C1993iw c1993iw) {
        this.f104873c = c1993iw;
        this.f104872b = c2585xr;
    }
}
