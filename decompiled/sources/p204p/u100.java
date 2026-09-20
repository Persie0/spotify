package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.music.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class u100 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final e940 f225634d;

    /* JADX INFO: renamed from: e */
    public rqc f225635e = null;

    /* JADX INFO: renamed from: f */
    public List f225636f = lau.f131415a;

    public u100(e940 e940Var) {
        this.f225634d = e940Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m82137A(List list) {
        oir oirVarM45541n = grl0.m45541n(new ylt0(1, this.f225636f, list));
        this.f225636f = list;
        oirVarM45541n.m67057b(this);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f225636f.size();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        ie9 ie9Var = (ie9) this.f225636f.get(i);
        if (ie9Var instanceof ge9) {
            return 0;
        }
        if (ie9Var instanceof he9) {
            return 1;
        }
        if (ie9Var instanceof fe9) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        ie9 ie9Var = (ie9) this.f225636f.get(i);
        if (!(dkv0Var instanceof s100)) {
            if (!(dkv0Var instanceof t100)) {
                if (dkv0Var instanceof r100) {
                    ((r100) dkv0Var).f194643S0.f265269c.setText(((fe9) ie9Var).f68714a);
                    return;
                }
                return;
            }
            yr50 yr50Var = ((t100) dkv0Var).f216047S0;
            TextView textView = yr50Var.f275401c;
            int i2 = ((he9) ie9Var).f90376a;
            textView.setText("+ " + i2);
            yr50Var.f275401c.setContentDescription(yr50Var.f275400b.getContext().getResources().getQuantityString(R.plurals.fop_plus_n_button_content_description, i2, Integer.valueOf(i2)));
            return;
        }
        s100 s100Var = (s100) dkv0Var;
        ge9 ge9Var = (ge9) ie9Var;
        ndy ndyVar = s100Var.f204567S0;
        if (ge9Var.f79060c) {
            ((FrameLayout) ndyVar.f152865b).setPadding(0, 0, 0, 0);
            ((FrameLayout) ndyVar.f152865b).setBackground(null);
        } else {
            FrameLayout frameLayout = (FrameLayout) ndyVar.f152865b;
            int dimensionPixelSize = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.fop_logo_padding);
            frameLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            frameLayout.setBackgroundResource(R.drawable.fop_background);
        }
        ((ShapeableImageView) ndyVar.f152866c).setContentDescription(ge9Var.f79059b);
        lxe lxeVarMo24613j = s100Var.f204568T0.f225634d.mo24613j(ge9Var.f79058a);
        lxeVarMo24613j.m60182h();
        lxeVarMo24613j.m60185k((ShapeableImageView) ndyVar.f152866c, null);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int iM38547C = edb.m38547C(edb.m38551G(3)[i]);
        if (iM38547C == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_fop_logo, viewGroup, false);
            ShapeableImageView shapeableImageView = (ShapeableImageView) vie1.m85629k(viewInflate, R.id.fop_logo);
            if (shapeableImageView == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fop_logo)));
            }
            return new s100(this, new ndy(24, (FrameLayout) viewInflate, shapeableImageView));
        }
        if (iM38547C == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_fop_plus_n_btn, viewGroup, false);
            if (viewInflate2 == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) viewInflate2;
            return new t100(this, new yr50(textView, textView, 0));
        }
        if (iM38547C != 2) {
            throw new NoWhenBranchMatchedException();
        }
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.item_fop_and_more_text, viewGroup, false);
        if (viewInflate3 == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView2 = (TextView) viewInflate3;
        return new r100(new xr50(textView2, textView2, 0));
    }
}
