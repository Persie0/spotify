package p204p;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b4w implements w8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23420b;

    public /* synthetic */ b4w(Object obj, int i) {
        this.f23419a = i;
        this.f23420b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [p.gh00, p.qe70] */
    @Override // p204p.w8j
    public final void accept(Object obj) {
        Object value;
        switch (this.f23419a) {
            case 0:
                x3w x3wVar = (x3w) obj;
                f6v f6vVar = (f6v) this.f23420b;
                wj50.m88279p(x3wVar);
                f6vVar.invoke(x3wVar);
                return;
            case 1:
                ((ObservableEmitter) this.f23420b).onNext((v3a0) obj);
                return;
            case 2:
                lvi0 lvi0Var = (lvi0) this.f23420b;
                View view = lvi0Var.f137321b1;
                int i = lvi0Var.f137324e1;
                int i2 = lvi0Var.f137327h1;
                ViewGroup viewGroup = lvi0Var.f137319Z0;
                View viewFindViewById = viewGroup.findViewById(R.id.carousel_item_safe_barrier_top);
                View viewFindViewById2 = viewGroup.findViewById(R.id.carousel_item_safe_barrier_bottom);
                if (viewFindViewById == null || viewFindViewById2 == null) {
                    throw new NullPointerException("The Mode Page layout is missing carousel_item_safe_barrier_top and/or carousel_item_safe_barrier_bottom views, needed to position the square cover art in between.");
                }
                int top = (viewFindViewById2.getTop() - viewFindViewById.getBottom()) - (lvi0Var.f137328i1 + i2);
                int iMin = Math.min(top, i - (lvi0Var.f137326g1 * 2));
                int bottom = ((top - iMin) / 2) + viewFindViewById.getBottom() + i2;
                boolean z = i > lvi0Var.f137325f1;
                boolean z2 = ((double) iMin) > ((double) i) * 0.4d;
                if (z || z2) {
                    h6j h6jVar = (h6j) view.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) h6jVar).height = iMin;
                    ((ViewGroup.MarginLayoutParams) h6jVar).width = iMin;
                    h6jVar.setMargins(0, bottom, 0, 0);
                    view.setLayoutParams(h6jVar);
                    return;
                }
                return;
            case 3:
                ((Activity) this.f23420b).startActivity((Intent) obj);
                return;
            case 4:
                String str = (String) obj;
                Logger.m3969e("Partner ID \"%s\" retrieved for Crashlytics", str);
                a5j0 a5j0Var = ((x301) this.f23420b).f257644e;
                wj50.m88279p(str);
                if (str.length() == 0) {
                    return;
                }
                zv41 zv41Var = (zv41) a5j0Var.f12529b;
                do {
                    value = zv41Var.getValue();
                } while (!zv41Var.m97089k(value, new u4n0(str)));
                return;
            case 5:
                x901 x901Var = (x901) obj;
                nnz0 nnz0Var = (nnz0) this.f23420b;
                wj50.m88279p(x901Var);
                nnz0Var.invoke(x901Var);
                return;
            case 6:
                ((qb01) this.f23420b).f186968c.accept((b450) obj);
                return;
            default:
                List list = (List) obj;
                ?? r0 = (qe70) this.f23420b;
                wj50.m88279p(list);
                r0.invoke(list);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b4w(gh00 gh00Var) {
        this.f23419a = 7;
        this.f23420b = (qe70) gh00Var;
    }
}
