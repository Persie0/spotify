package p204p;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes9.dex */
public final class xyo implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f267391b;

    public /* synthetic */ xyo(Object obj, int i) {
        this.f267390a = i;
        this.f267391b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [p.gh00, p.qe70] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f267390a) {
            case 0:
                ((yyo) this.f267391b).f277554c.m97237a(dt7.f52744d);
                break;
            case 1:
                ugr ugrVar = (ugr) this.f267391b;
                Dialog dialog = ugrVar.f230244L1;
                if (dialog != null) {
                    ugrVar.onDismiss(dialog);
                }
                break;
            case 2:
                ((g4s) this.f267391b).f76518e.m27127a(zz6.f287893d);
                break;
            case 3:
                ((y5m0) this.f267391b).f269488O0.mo47345e();
                break;
            case 4:
                ((ff31) this.f267391b).f68897b2.invoke(df31.f48230b);
                break;
            case 5:
                ((ay21) this.f267391b).f21069d = null;
                break;
            case 6:
                ((gh00) this.f267391b).invoke(lq31.f135940a);
                break;
            default:
                ((jgc1) this.f267391b).f112156b = null;
                break;
        }
    }
}
