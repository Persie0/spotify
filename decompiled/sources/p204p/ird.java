package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class ird extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f104956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ird(int i, ViewGroup viewGroup) {
        super(0);
        this.f104955a = i;
        this.f104956b = viewGroup;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f104955a) {
            case 0:
                return nxf1.m65842u(this.f104956b);
            case 1:
                Context context = this.f104956b.getContext();
                float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.checkbox_icon_size);
                int color = context.getColor(R.color.green_light);
                tc41 tc41Var = new tc41(context, vc41.CHECK_ALT_FILL, dimensionPixelSize);
                tc41Var.m80417b(color);
                return tc41Var;
            case 2:
                return this.f104956b.getContext().getDrawable(R.drawable.shape_circle_mark_as_played);
            default:
                return nxf1.m65842u(this.f104956b);
        }
    }
}
