package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class mlo extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f144880b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f144881c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f144882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mlo(kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3, int i) {
        super(1);
        this.f144879a = i;
        this.f144880b = kqi0Var;
        this.f144881c = kqi0Var2;
        this.f144882d = kqi0Var3;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f144879a) {
            case 0:
                tmo tmoVar = (tmo) obj;
                if (tmoVar instanceof qmo) {
                    this.f144880b.setValue(((qmo) tmoVar).f190362a);
                } else if (tmoVar instanceof smo) {
                    this.f144881c.setValue(((smo) tmoVar).f210692a);
                } else {
                    if (!(tmoVar instanceof rmo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f144882d.setValue(((rmo) tmoVar).f200593a);
                }
                return w2a1.f247311a;
            default:
                hwb hwbVar = (hwb) obj;
                if (hwbVar instanceof gwb) {
                    ((gh00) this.f144882d.getValue()).invoke(new bxc0(((gwb) hwbVar).f84964a));
                } else if (hwbVar.equals(ewb.f63490a)) {
                    this.f144880b.setValue(Boolean.TRUE);
                } else if (hwbVar.equals(fwb.f74038a)) {
                    this.f144881c.setValue(Boolean.TRUE);
                } else if (!hwbVar.equals(dwb.f53662a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
        }
    }
}
