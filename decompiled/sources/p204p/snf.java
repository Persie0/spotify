package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class snf implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f210922b;

    public /* synthetic */ snf(int i, eh00 eh00Var) {
        this.f210921a = i;
        this.f210922b = eh00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f210921a) {
            case 0:
                eh00 eh00Var = this.f210922b;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                break;
            case 1:
                this.f210922b.invoke();
                break;
            default:
                this.f210922b.invoke();
                break;
        }
    }
}
