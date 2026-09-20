package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes11.dex */
public final class mc50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ etz f142067b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc50(etz etzVar, int i) {
        super(0);
        this.f142066a = i;
        this.f142067b = etzVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f142066a) {
            case 0:
                return new wba((Activity) this.f142067b.f62824c);
            default:
                this.f142067b.m39995o().dismiss();
                return w2a1.f247311a;
        }
    }
}
