package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c0e1 extends xdf0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f32756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e1(int i) {
        super(22, 23);
        this.f32756c = i;
        switch (i) {
            case 1:
                super(20, 21);
                break;
            default:
                break;
        }
    }

    @Override // p204p.xdf0
    /* JADX INFO: renamed from: a */
    public final void mo25720a(u561 u561Var) {
        switch (this.f32756c) {
            case 0:
                u561Var.mo82386F("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
                break;
            default:
                u561Var.mo82386F("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
                break;
        }
    }
}
