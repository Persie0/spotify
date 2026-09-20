package p204p;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class vp30 extends tn30 {

    /* JADX INFO: renamed from: f */
    public final boolean f243583f;

    public vp30(at30 at30Var, boolean z) {
        super(at30Var, qsx0.class, 1);
        this.f243583f = z;
    }

    @Override // p204p.nl30
    /* JADX INFO: renamed from: g */
    public ji10 mo36445g(Context context, ViewGroup viewGroup, sk30 sk30Var) {
        return mo81244n(context, viewGroup);
    }

    @Override // p204p.tn30
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo70503i(qsx0 qsx0Var, fk30 fk30Var) {
        qsx0Var.setTitle(dyu.m37388t(fk30Var));
        CharSequence charSequenceM37387s = dyu.m37387s(fk30Var);
        if (TextUtils.isEmpty(charSequenceM37387s)) {
            qsx0Var.setSubtitle(null);
            return;
        }
        if (Objects.equals(fk30Var.custom().string("glue:subtitleStyle", ""), "metadata")) {
            qsx0Var.mo66024s(charSequenceM37387s);
        } else {
            qsx0Var.setSubtitle(charSequenceM37387s);
        }
        TextView subtitleView = qsx0Var.getSubtitleView();
        String strString = fk30Var.custom().string("label");
        gug1.m45774p(subtitleView.getContext(), subtitleView, strString != null ? strString : "");
    }

    @Override // 
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public qsx0 mo81244n(Context context, ViewGroup viewGroup) {
        san0 san0VarM25941m = ahf1.m25941m(context, viewGroup, this.f243583f ? R.layout.glue_listtile_2_muted : R.layout.glue_listtile_2);
        tsx0 tsx0Var = new tsx0(san0VarM25941m);
        san0VarM25941m.setTag(R.id.glue_viewholder_tag, tsx0Var);
        return tsx0Var;
    }
}
