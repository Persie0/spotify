package p204p;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class ql30 extends oi30 {
    @Override // p204p.oi30, p204p.oj30
    /* JADX INFO: renamed from: a */
    public final void mo32903a(fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        int color;
        String strString = fk30Var.custom().string("backgroundColor");
        na6.m63962j(!kgg1.m56363z(strString), "background color missing ");
        super.mo32903a(fk30Var, sk30Var, mqrVar);
        try {
            color = Color.parseColor(strString);
        } catch (IllegalArgumentException unused) {
            color = 0;
        }
        View view = this.f165949a;
        GradientDrawable gradientDrawableM94619j = ytg1.m94619j(((RecyclerView) view).getContext(), color);
        WeakHashMap weakHashMap = mec1.f142677a;
        view.setBackground(gradientDrawableM94619j);
    }
}
