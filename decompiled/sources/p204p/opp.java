package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class opp {

    /* JADX INFO: renamed from: a */
    public final fmj f167977a;

    /* JADX INFO: renamed from: b */
    public final q831 f167978b;

    /* JADX INFO: renamed from: c */
    public final String f167979c;

    public opp(fmj fmjVar, q831 q831Var, Context context) {
        this.f167977a = fmjVar;
        this.f167978b = q831Var;
        this.f167979c = context.getString(R.string.snackbar_undo);
    }

    /* JADX INFO: renamed from: a */
    public final void m67577a(String str, eh00 eh00Var) {
        j4u j4uVarM79824e = t0j.m79824e(R.string.snackbar_mark_as_finished);
        j4uVarM79824e.m52390o(this.f167979c);
        j4uVarM79824e.m52399x(new lt7(eh00Var, this, str));
        this.f167978b.m72305j(j4uVarM79824e.m52392q());
    }
}
