package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qhj0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rhj0 f188795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qhj0(rhj0 rhj0Var, int i) {
        super(0);
        this.f188794a = i;
        this.f188795b = rhj0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f188794a) {
            case 0:
                return this.f188795b.f199240c.mo75865f("network.bytes_received_cellular", rcf0.f197861a);
            case 1:
                return this.f188795b.f199240c.mo75865f("network.bytes_received_wifi", rcf0.f197861a);
            case 2:
                return this.f188795b.f199240c.mo75865f("network.bytes_sent_cellular", rcf0.f197861a);
            case 3:
                return this.f188795b.f199240c.mo75865f("network.bytes_sent_wifi", rcf0.f197861a);
            case 4:
                return this.f188795b.f199240c.mo75865f("http.request_error_count", new scf0("error"));
            default:
                return this.f188795b.f199240c.mo75874q("http.total_request_latency", ucf0.f229029a);
        }
    }
}
