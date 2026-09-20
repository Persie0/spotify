package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class y86 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f270227a;

    /* JADX INFO: renamed from: b */
    public static final y86 f270218b = new y86(0);

    /* JADX INFO: renamed from: c */
    public static final y86 f270219c = new y86(1);

    /* JADX INFO: renamed from: d */
    public static final y86 f270220d = new y86(2);

    /* JADX INFO: renamed from: e */
    public static final y86 f270221e = new y86(3);

    /* JADX INFO: renamed from: f */
    public static final y86 f270222f = new y86(4);

    /* JADX INFO: renamed from: g */
    public static final y86 f270223g = new y86(5);

    /* JADX INFO: renamed from: h */
    public static final y86 f270224h = new y86(6);

    /* JADX INFO: renamed from: i */
    public static final y86 f270225i = new y86(7);

    /* JADX INFO: renamed from: t */
    public static final y86 f270226t = new y86(8);

    /* JADX INFO: renamed from: X */
    public static final y86 f270215X = new y86(9);

    /* JADX INFO: renamed from: Y */
    public static final y86 f270216Y = new y86(10);

    /* JADX INFO: renamed from: Z */
    public static final y86 f270217Z = new y86(11);

    /* JADX INFO: renamed from: L0 */
    public static final y86 f270214L0 = new y86(12);

    public /* synthetic */ y86(int i) {
        this.f270227a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        switch (this.f270227a) {
            case 11:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(xoc1.f264033Z1.f243453a));
                intent.setFlags(268435456);
                if (view != null && (context = view.getContext()) != null) {
                    context.startActivity(intent);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m93081a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m93082b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m93083c(View view) {
    }

    /* JADX INFO: renamed from: d */
    private final void m93084d(View view) {
    }

    /* JADX INFO: renamed from: e */
    private final void m93085e(View view) {
    }

    /* JADX INFO: renamed from: f */
    private final void m93086f(View view) {
    }

    /* JADX INFO: renamed from: g */
    private final void m93087g(View view) {
    }

    /* JADX INFO: renamed from: h */
    private final void m93088h(View view) {
    }

    /* JADX INFO: renamed from: i */
    private final void m93089i(View view) {
    }

    /* JADX INFO: renamed from: j */
    private final void m93090j(View view) {
    }

    /* JADX INFO: renamed from: k */
    private final void m93091k(View view) {
    }

    /* JADX INFO: renamed from: l */
    private final /* synthetic */ void m93092l(View view) {
    }

    /* JADX INFO: renamed from: m */
    private final void m93093m(View view) {
    }
}
