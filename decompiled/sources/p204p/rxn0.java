package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class rxn0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f203642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f203643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rxn0(View view, eh00 eh00Var, int i) {
        super(0);
        this.f203641a = i;
        this.f203642b = view;
        this.f203643c = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f203641a) {
            case 0:
                this.f203642b.performHapticFeedback(1);
                this.f203643c.invoke();
                break;
            default:
                this.f203642b.setVisibility(8);
                this.f203643c.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
