package p204p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u8w extends FrameLayout implements oqs {

    /* JADX INFO: renamed from: a */
    public t8w f228024a;

    /* JADX INFO: renamed from: b */
    public final wg61 f228025b;

    public u8w(Context context) {
        super(context, null, 0);
        this.f228025b = new wg61(new zyv(this, 3));
    }

    private final View getQuickActionView() {
        return (View) this.f228025b.getValue();
    }

    /* JADX INFO: renamed from: a */
    public abstract View mo30581a();

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        view.setDuplicateParentStateEnabled(true);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(t8w t8wVar) {
        removeAllViews();
        addView(getQuickActionView());
        this.f228024a = t8wVar;
        setEnabled(t8wVar.mo63860a());
        Object objInvoke = getActionModelExtractor().invoke(t8wVar);
        ((gr50) getQuickActionView()).mo2820d(objInvoke);
        mo38261e(getQuickActionView(), objInvoke);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        getQuickActionView().setOnClickListener(new ndp(gh00Var, this));
    }

    public abstract gh00 getActionModelExtractor();

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        getQuickActionView().setPadding(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: e */
    public void mo38261e(View view, Object obj) {
    }
}
