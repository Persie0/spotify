package p204p;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class tp30 extends up30 {
    @Override // p204p.up30, p204p.tn30, p204p.nl30
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo36444f(ji10 ji10Var, fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        m81152k((box0) ji10Var, fk30Var, sk30Var);
    }

    @Override // p204p.up30, p204p.vp30, p204p.nl30
    /* JADX INFO: renamed from: g */
    public final ji10 mo36445g(Context context, ViewGroup viewGroup, sk30 sk30Var) {
        return mo81244n(context, viewGroup);
    }

    @Override // p204p.up30, p204p.vp30, p204p.tn30
    /* JADX INFO: renamed from: m */
    public final void mo70503i(qsx0 qsx0Var, fk30 fk30Var) {
        super.mo70503i(qsx0Var, fk30Var);
        CharSequence charSequenceM37392x = dyu.m37392x(fk30Var.text().accessory(), fk30Var.custom().boolValue("glue:accessoryAsHtml", false));
        if (TextUtils.isEmpty(charSequenceM37392x)) {
            return;
        }
        ((usx0) qsx0Var).f233695f.setText(charSequenceM37392x);
    }

    @Override // p204p.up30, p204p.vp30
    /* JADX INFO: renamed from: o */
    public final qsx0 mo81244n(Context context, ViewGroup viewGroup) {
        san0 san0VarM25941m = ahf1.m25941m(context, viewGroup, R.layout.glue_listtile_2_landscape_image);
        usx0 usx0Var = new usx0(san0VarM25941m);
        san0VarM25941m.setTag(R.id.glue_viewholder_tag, usx0Var);
        return usx0Var;
    }
}
