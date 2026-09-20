package p204p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class hlv implements gr50, clc1 {

    /* JADX INFO: renamed from: a */
    public final Context f92751a;

    /* JADX INFO: renamed from: b */
    public final e940 f92752b;

    /* JADX INFO: renamed from: c */
    public final EncoreListRow f92753c;

    /* JADX INFO: renamed from: d */
    public gh00 f92754d;

    /* JADX INFO: renamed from: e */
    public bjv f92755e;

    /* JADX INFO: renamed from: f */
    public final wir f92756f;

    public hlv(Context context, e940 e940Var, int i, boolean z, boolean z2, boolean z3, int i2) {
        int i3 = (i2 & 4) != 0 ? 4 : i;
        boolean z4 = (i2 & 8) != 0 ? true : z;
        boolean z5 = (i2 & 16) != 0 ? false : z2;
        boolean z6 = (i2 & 32) == 0 ? z3 : true;
        this.f92751a = context;
        this.f92752b = e940Var;
        EncoreListRow encoreListRow = new EncoreListRow(context, null, phf1.m70000s(i3));
        encoreListRow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        EnumC1976ie enumC1976ieM53044a = new C2012je(encoreListRow.getContext()).m53044a();
        int iCompareTo = enumC1976ieM53044a.compareTo(EnumC1976ie.f101285i);
        ysx0 ysx0Var = ysx0.Regular;
        ysx0 ysx0Var2 = ysx0.Narrow;
        encoreListRow.setRowType((iCompareTo > 0 || enumC1976ieM53044a.compareTo(EnumC1976ie.f101281e) < 0 || !z4) ? ysx0Var : ysx0Var2);
        if (z6) {
            ConstraintLayout constraintLayoutM30904a = encoreListRow.getBinding().m30904a();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.entity_list_row_additional_padding);
            constraintLayoutM30904a.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        View viewFindViewById = encoreListRow.getBinding().f32321a.findViewById(R.id.footer_slot);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar = (h6j) layoutParams;
        h6jVar.f88164t = 0;
        h6jVar.f88166v = 0;
        if (z5) {
            h6jVar.f88151l = 0;
            h6jVar.setMargins(0, 0, 0, 0);
        } else {
            h6jVar.setMarginStart(encoreListRow.getResources().getDimensionPixelSize(R.dimen.encore_list_row_action_container_margin_start));
            h6jVar.setMarginEnd(encoreListRow.getResources().getDimensionPixelSize(R.dimen.encore_list_row_action_container_margin_end));
        }
        viewFindViewById.setLayoutParams(h6jVar);
        if (encoreListRow.getRowType() == ysx0Var) {
            View viewM30907d = encoreListRow.getBinding().m30907d();
            ViewGroup.LayoutParams layoutParams2 = viewM30907d.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            h6j h6jVar2 = (h6j) layoutParams2;
            h6jVar2.f88166v = 0;
            h6jVar2.setMarginEnd(encoreListRow.getResources().getDimensionPixelSize(R.dimen.encore_list_row_action_container_margin_end));
            viewM30907d.setLayoutParams(h6jVar2);
        } else if (encoreListRow.getRowType() == ysx0Var2) {
            View viewM30907d2 = encoreListRow.getBinding().m30907d();
            ViewGroup.LayoutParams layoutParams3 = viewM30907d2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            h6j h6jVar3 = (h6j) layoutParams3;
            h6jVar3.f88164t = 0;
            h6jVar3.setMarginStart(encoreListRow.getResources().getDimensionPixelSize(R.dimen.encore_list_row_trailing_margin_start));
            viewM30907d2.setLayoutParams(h6jVar3);
        }
        this.f92753c = encoreListRow;
        this.f92755e = ziv.f283247a;
        this.f92756f = vqg1.m86248z(vqg1.m86216A(alv.f16993h, vqg1.m86247y(new j20(this, 26))), vqg1.m86216A(clv.f39403h, vqg1.m86247y(new dlv(encoreListRow, 0))), vqg1.m86216A(elv.f60761h, vqg1.m86247y(new dlv(encoreListRow, 1))), vqg1.m86216A(flv.f70876h, vqg1.m86247y(new ukv(this, 3))), vqg1.m86216A(glv.f81186h, vqg1.m86247y(new ukv(this, 0))), vqg1.m86216A(vkv.f242295h, vqg1.m86247y(new ukv(this, 1))), vqg1.m86216A(wkv.f252309h, vqg1.m86247y(new vas(this, 27))), vqg1.m86216A(xkv.f262945h, vqg1.m86247y(new qc7(this, z5, 4))), vqg1.m86216A(ykv.f273844h, vqg1.m86247y(new vas(this, 28))), vqg1.m86216A(zkv.f283847h, vqg1.m86247y(new vas(this, 29))), vqg1.m86216A(blv.f28292h, vqg1.m86247y(new ukv(this, 2))));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(akv akvVar) {
        this.f92756f.m88218a((zg50) akvVar.f16667o.getValue());
        int i = EncoreListRow.f3800W0;
        this.f92753c.setAdditionalAccessibilityActions(null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.f92754d = gh00Var;
        qvb qvbVar = new qvb(1, gh00Var, this);
        EncoreListRow encoreListRow = this.f92753c;
        encoreListRow.setOnClickListener(qvbVar);
        encoreListRow.setOnLongClickListener(new udq(gh00Var, this));
        encoreListRow.getBinding().m30905b().setOnClickListener(new ndp(25, gh00Var, this));
        encoreListRow.getBinding().m30905b().setOnLongClickListener(new hpo(2, gh00Var, this));
        View viewM30907d = encoreListRow.getBinding().m30907d();
        EntityActionView entityActionView = viewM30907d instanceof EntityActionView ? (EntityActionView) viewM30907d : null;
        if (entityActionView != null) {
            dyu.m37361F(entityActionView, gh00Var, new ias(this, 4));
        }
        KeyEvent.Callback callbackFindViewById = encoreListRow.getBinding().f32321a.findViewById(R.id.footer_slot);
        qcv qcvVar = callbackFindViewById instanceof qcv ? (qcv) callbackFindViewById : null;
        if (qcvVar != null) {
            dyu.m37359D(qcvVar, gh00Var, new tkv(this, 3));
        }
        View viewM30905b = encoreListRow.getBinding().m30905b();
        jmv jmvVar = viewM30905b instanceof jmv ? (jmv) viewM30905b : null;
        if (jmvVar != null) {
            dyu.m37360E(jmvVar, gh00Var, new tkv(this, 4));
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f92753c;
    }
}
