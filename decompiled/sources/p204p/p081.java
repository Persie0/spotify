package p204p;

import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class p081 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f172505a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItem f172506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q081 f172507c;

    public /* synthetic */ p081(q081 q081Var, MenuItem menuItem, int i) {
        this.f172505a = i;
        this.f172507c = q081Var;
        this.f172506b = menuItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f172505a) {
            case 0:
                this.f172507c.f183928b.performIdentifierAction(this.f172506b.getItemId(), 0);
                break;
            default:
                this.f172507c.f183928b.performIdentifierAction(this.f172506b.getItemId(), 0);
                break;
        }
    }
}
