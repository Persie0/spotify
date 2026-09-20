package p204p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public final class x0q {

    /* JADX INFO: renamed from: a */
    public final qe70 f256946a;

    /* JADX INFO: renamed from: b */
    public final qe70 f256947b;

    /* JADX INFO: renamed from: c */
    public final String f256948c;

    /* JADX INFO: renamed from: d */
    public final lju f256949d;

    /* JADX INFO: renamed from: e */
    public final yiu f256950e;

    /* JADX INFO: renamed from: f */
    public final lju f256951f;

    /* JADX INFO: renamed from: g */
    public final lju f256952g;

    /* JADX INFO: renamed from: h */
    public iz1 f256953h;

    /* JADX INFO: renamed from: i */
    public final wg61 f256954i;

    /* JADX INFO: renamed from: j */
    public hxt f256955j;

    /* JADX INFO: renamed from: k */
    public final xir f256956k = xir.m91157c(xir.m91158d(oet.f164538W0, xir.m91155a(new o6p(this, 7))));

    /* JADX INFO: renamed from: l */
    public int f256957l;

    /* JADX WARN: Multi-variable type inference failed */
    public x0q(Context context, eh00 eh00Var, eh00 eh00Var2, String str, lju ljuVar, yiu yiuVar, lju ljuVar2, lju ljuVar3) {
        this.f256946a = (qe70) eh00Var;
        this.f256947b = (qe70) eh00Var2;
        this.f256948c = str;
        this.f256949d = ljuVar;
        this.f256950e = yiuVar;
        this.f256951f = ljuVar2;
        this.f256952g = ljuVar3;
        this.f256954i = new wg61(new C2652zj(context, 14));
    }

    /* JADX INFO: renamed from: b */
    public static void m89598b(View view, FrameLayout frameLayout, eh00 eh00Var) {
        if (frameLayout.indexOfChild(view) != -1) {
            return;
        }
        if (frameLayout.getChildCount() > 1) {
            if (!(frameLayout.getChildCount() > 0)) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            View childAt = frameLayout.getChildAt(0);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            childAt.setVisibility(4);
        }
        eh00Var.invoke();
        frameLayout.addView(view);
        frameLayout.post(new eph(frameLayout, 12));
    }

    /* JADX INFO: renamed from: a */
    public final FrameLayout m89599a() {
        return (FrameLayout) this.f256954i.getValue();
    }
}
