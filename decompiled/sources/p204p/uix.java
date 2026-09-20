package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uix implements k890, ocd0, qpd0, v8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f230827b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f230828c;

    public /* synthetic */ uix(int i, int i2, int i3) {
        this.f230826a = i3;
        this.f230827b = i;
        this.f230828c = i2;
    }

    @Override // p204p.ocd0
    /* JADX INFO: renamed from: a */
    public void mo56040a(jcd0 jcd0Var) {
        jcd0Var.m52963y(this.f230827b, this.f230828c);
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        switch (this.f230826a) {
            case 4:
                ((pdp0) obj).mo43915x0(this.f230827b, this.f230828c);
                break;
            default:
                ((pdp0) obj).mo43849N0(this.f230827b, this.f230828c);
                break;
        }
    }

    @Override // p204p.qpd0
    /* JADX INFO: renamed from: e */
    public void mo25926e(snd0 snd0Var, int i) {
        snd0Var.mo51511h(i, this.f230827b, this.f230828c);
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        switch (this.f230826a) {
            case 0:
                ((d7p0) obj).mo35210T(this.f230827b, this.f230828c);
                break;
            default:
                ((d7p0) obj).mo35210T(this.f230827b, this.f230828c);
                break;
        }
    }
}
