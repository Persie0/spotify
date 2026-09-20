package p204p;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.recyclerviewutil.SmoothScrollingGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class qom0 extends il80 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f191008p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f191009q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qom0(Object obj, Context context, int i) {
        super(context);
        this.f191008p = i;
        this.f191009q = obj;
    }

    @Override // p204p.il80
    /* JADX INFO: renamed from: b */
    public final float mo34955b(DisplayMetrics displayMetrics) {
        int i;
        float f;
        float f2;
        switch (this.f191008p) {
            case 0:
                i = displayMetrics.densityDpi;
                f = i;
                f2 = 100.0f;
                break;
            case 1:
                ((SmoothScrollingGridLayoutManager) this.f191009q).getClass();
                f = displayMetrics.densityDpi;
                f2 = 0.0f;
                break;
            default:
                i = displayMetrics.densityDpi;
                f = i;
                f2 = 100.0f;
                break;
        }
        return f2 / f;
    }

    @Override // p204p.il80
    /* JADX INFO: renamed from: c */
    public int mo50990c(int i) {
        switch (this.f191008p) {
            case 0:
                return Math.min(100, super.mo50990c(i));
            default:
                return super.mo50990c(i);
        }
    }

    @Override // p204p.il80
    /* JADX INFO: renamed from: d */
    public PointF mo43804d(int i) {
        switch (this.f191008p) {
            case 1:
                return ((SmoothScrollingGridLayoutManager) this.f191009q).mo932a(i);
            default:
                return super.mo43804d(i);
        }
    }

    @Override // p204p.il80
    /* JADX INFO: renamed from: j */
    public void mo50996j(View view, owo owoVar) {
        switch (this.f191008p) {
            case 0:
                jl80 jl80Var = (jl80) this.f191009q;
                int[] iArrMo45855c = jl80Var.mo45855c(jl80Var.f113518a.getLayoutManager(), view);
                int i = iArrMo45855c[0];
                int i2 = iArrMo45855c[1];
                int iCeil = (int) Math.ceil(((double) mo50990c(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                if (iCeil > 0) {
                    owoVar.f170742a = i;
                    owoVar.f170743b = i2;
                    owoVar.f170744c = iCeil;
                    owoVar.f170747f = this.f103326i;
                    owoVar.f170746e = true;
                }
                break;
            case 1:
            default:
                super.mo50996j(view, owoVar);
                break;
            case 2:
                jl80 jl80Var2 = (jl80) this.f191009q;
                RecyclerView recyclerView = jl80Var2.f113518a;
                if (recyclerView != null) {
                    int[] iArrMo45855c2 = jl80Var2.mo45855c(recyclerView.getLayoutManager(), view);
                    int i3 = iArrMo45855c2[0];
                    int i4 = iArrMo45855c2[1];
                    int iCeil2 = (int) Math.ceil(((double) mo50990c(Math.max(Math.abs(i3), Math.abs(i4)))) / 0.3356d);
                    if (iCeil2 > 0) {
                        owoVar.f170742a = i3;
                        owoVar.f170743b = i4;
                        owoVar.f170744c = iCeil2;
                        owoVar.f170747f = this.f103326i;
                        owoVar.f170746e = true;
                    }
                    break;
                }
                break;
        }
    }
}
