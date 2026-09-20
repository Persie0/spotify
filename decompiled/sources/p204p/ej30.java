package p204p;

import android.content.res.Resources;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ej30 extends oj30 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f60117b;

    /* JADX INFO: renamed from: c */
    public final LinearLayoutManager f60118c;

    /* JADX INFO: renamed from: d */
    public final ti30 f60119d;

    /* JADX INFO: renamed from: e */
    public fk30 f60120e;

    /* JADX INFO: renamed from: f */
    public mqr f60121f;

    public ej30(ViewGroup viewGroup, sk30 sk30Var, boolean z, int i) {
        this.f60117b = i;
        switch (i) {
            case 1:
                hj30 hj30Var = new hj30(viewGroup.getContext());
                super(hj30Var);
                hj30Var.setNestedScrollingEnabled(viewGroup instanceof mgj0);
                viewGroup.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                this.f60118c = linearLayoutManager;
                linearLayoutManager.f1301i = false;
                linearLayoutManager.m964y1(0);
                Resources resources = viewGroup.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hub_carousel_item_spacing);
                if (z) {
                    int iMax = Math.max(resources.getDimensionPixelOffset(R.dimen.content_area_horizontal_margin) - dimensionPixelSize, 0);
                    hj30Var.setPadding(iMax, 0, iMax, 0);
                    hj30Var.setClipToPadding(false);
                }
                hj30Var.setLayoutManager(linearLayoutManager);
                hj30Var.setItemAnimator(null);
                hj30Var.m1011i(new dj30(this, uqg1.m83801y(viewGroup), dimensionPixelSize));
                sk30Var.getClass();
                rk30 rk30VarM78366a = sk30.m78366a();
                ak30 ak30Var = sk30Var.f209988a;
                ak30Var.getClass();
                rk30VarM78366a.f199956a = ak30Var;
                os30 os30Var = sk30Var.f209989b;
                os30Var.getClass();
                rk30VarM78366a.f199957b = os30Var;
                rk30VarM78366a.f199960e = p711.m69243v(sk30Var.f209991d);
                lk30 lk30Var = sk30Var.f209992e;
                lk30Var.getClass();
                rk30VarM78366a.f199959d = lk30Var;
                lk30 lk30Var2 = sk30Var.f209993f;
                lk30Var2.getClass();
                rk30VarM78366a.f199961f = lk30Var2;
                ys30 ys30Var = sk30Var.f209994g;
                ys30Var.getClass();
                rk30VarM78366a.f199958c = ys30Var;
                qj30 qj30Var = sk30Var.f209996i;
                qj30Var.getClass();
                rk30VarM78366a.f199962g = qj30Var;
                iaz iazVar = sk30Var.f209997j;
                iazVar.getClass();
                rk30VarM78366a.f199963h = iazVar;
                ti30 ti30Var = new ti30(rk30VarM78366a.m75711a(), null);
                this.f60119d = ti30Var;
                hj30Var.setLayoutFrozen(false);
                hj30Var.m1037w0(ti30Var, true, false);
                hj30Var.m1016k0(true);
                hj30Var.requestLayout();
                hj30Var.m1018m(new iq6(this, 8));
                hj30Var.setHasFixedSize(false);
                break;
            default:
                hj30 hj30Var2 = new hj30(viewGroup.getContext());
                super(hj30Var2);
                hj30Var2.setNestedScrollingEnabled(viewGroup instanceof mgj0);
                viewGroup.getContext();
                LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1);
                this.f60118c = linearLayoutManager2;
                linearLayoutManager2.f1301i = false;
                linearLayoutManager2.m964y1(0);
                Resources resources2 = viewGroup.getResources();
                int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.hub_carousel_item_spacing);
                if (z) {
                    int iMax2 = Math.max(resources2.getDimensionPixelOffset(R.dimen.content_area_horizontal_margin) - dimensionPixelSize2, 0);
                    hj30Var2.setPadding(iMax2, 0, iMax2, 0);
                    hj30Var2.setClipToPadding(false);
                }
                hj30Var2.setLayoutManager(linearLayoutManager2);
                hj30Var2.setItemAnimator(null);
                hj30Var2.m1011i(new dj30(this, dimensionPixelSize2, uqg1.m83801y(viewGroup)));
                sk30Var.getClass();
                ti30 ti30Var2 = new ti30(sk30Var, null);
                this.f60119d = ti30Var2;
                hj30Var2.setLayoutFrozen(false);
                hj30Var2.m1037w0(ti30Var2, true, false);
                hj30Var2.m1016k0(true);
                hj30Var2.requestLayout();
                hj30Var2.m1018m(new iq6(this, 7));
                hj30Var2.setHasFixedSize(false);
                break;
        }
    }

    @Override // p204p.oj30
    /* JADX INFO: renamed from: a */
    public final void mo32903a(fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        switch (this.f60117b) {
            case 0:
                ((RecyclerView) this.f165949a).m984C0();
                this.f60120e = fk30Var;
                this.f60121f = mqrVar;
                List listChildren = fk30Var.children();
                ti30 ti30Var = this.f60119d;
                ti30Var.m80898B(listChildren);
                Parcelable parcelableM62585d = mqrVar.m62585d(fk30Var);
                LinearLayoutManager linearLayoutManager = this.f60118c;
                if (parcelableM62585d != null) {
                    linearLayoutManager.mo961x0(parcelableM62585d);
                } else {
                    linearLayoutManager.mo962x1(0, 0);
                }
                ti30Var.m47712h();
                break;
            default:
                ((RecyclerView) this.f165949a).m984C0();
                this.f60120e = fk30Var;
                this.f60121f = mqrVar;
                List listChildren2 = fk30Var.children();
                ti30 ti30Var2 = this.f60119d;
                ti30Var2.m80898B(listChildren2);
                Parcelable parcelableM62585d2 = mqrVar.m62585d(fk30Var);
                LinearLayoutManager linearLayoutManager2 = this.f60118c;
                if (parcelableM62585d2 != null) {
                    linearLayoutManager2.mo961x0(parcelableM62585d2);
                } else {
                    linearLayoutManager2.mo962x1(0, 0);
                }
                ti30Var2.m47712h();
                break;
        }
    }

    @Override // p204p.oj30
    /* JADX INFO: renamed from: b */
    public final void mo32904b(int... iArr) {
        switch (this.f60117b) {
            case 0:
                frz0.m42534s((RecyclerView) this.f165949a, iArr);
                break;
            default:
                frz0.m42534s((RecyclerView) this.f165949a, iArr);
                break;
        }
    }
}
