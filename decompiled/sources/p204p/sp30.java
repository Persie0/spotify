package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public class sp30 extends tn30 {
    public sp30(at30 at30Var) {
        super(at30Var, trx0.class, 1);
    }

    @Override // p204p.nl30
    /* JADX INFO: renamed from: g */
    public ji10 mo36445g(Context context, ViewGroup viewGroup, sk30 sk30Var) {
        return mo70505n(context, viewGroup);
    }

    @Override // p204p.tn30
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo70503i(trx0 trx0Var, fk30 fk30Var) {
        trx0Var.mo54202l(dyu.m37388t(fk30Var));
    }

    @Override // 
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public trx0 mo70505n(Context context, ViewGroup viewGroup) {
        san0 san0VarM25941m = ahf1.m25941m(context, viewGroup, R.layout.glue_listtile_1);
        vrx0 vrx0Var = new vrx0(san0VarM25941m);
        san0VarM25941m.setTag(R.id.glue_viewholder_tag, vrx0Var);
        return vrx0Var;
    }
}
