package p000;

import p204p.eh00;
import p204p.gh00;
import p204p.qe70;
import p204p.w2a1;
import p204p.wf11;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: classes9.dex */
public final class C1402i extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wf11 f7154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f7155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1402i(wf11 wf11Var, eh00 eh00Var, int i) {
        super(1);
        this.f7153a = i;
        this.f7154b = wf11Var;
        this.f7155c = eh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f7153a) {
            case 0:
                if (!this.f7154b.m87927i()) {
                    this.f7155c.invoke();
                }
                break;
            case 1:
                if (!this.f7154b.m87927i()) {
                    this.f7155c.invoke();
                }
                break;
            default:
                if (!this.f7154b.m87927i()) {
                    this.f7155c.invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
