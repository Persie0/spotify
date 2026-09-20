package p204p;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes7.dex */
public final class ih10 {

    /* JADX INFO: renamed from: a */
    public CharSequence f102113a;

    /* JADX INFO: renamed from: b */
    public CharSequence f102114b;

    /* JADX INFO: renamed from: c */
    public DialogInterface.OnClickListener f102115c;

    /* JADX INFO: renamed from: d */
    public DialogInterface.OnClickListener f102116d;

    /* JADX INFO: renamed from: e */
    public boolean f102117e = true;

    /* JADX INFO: renamed from: f */
    public DialogInterface.OnCancelListener f102118f;

    /* JADX INFO: renamed from: g */
    public DialogInterface.OnDismissListener f102119g;

    /* JADX INFO: renamed from: h */
    public mh10 f102120h;

    /* JADX INFO: renamed from: i */
    public final Context f102121i;

    /* JADX INFO: renamed from: j */
    public final hh10 f102122j;

    public ih10(Context context, hh10 hh10Var) {
        this.f102121i = context;
        this.f102122j = hh10Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m50573a(boolean z) {
        this.f102117e = z;
    }

    /* JADX INFO: renamed from: b */
    public final lh10 m50574b() {
        return new lh10(this.f102121i, this);
    }

    /* JADX INFO: renamed from: c */
    public final void m50575c(String str, DialogInterface.OnClickListener onClickListener) {
        this.f102113a = str;
        this.f102115c = onClickListener;
    }
}
