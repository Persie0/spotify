package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class fp61 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zu0 f71760b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp61(zu0 zu0Var, int i) {
        super(0);
        this.f71759a = i;
        this.f71760b = zu0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f71759a) {
            case 0:
                return ((Context) this.f71760b.f286299b).getString(R.string.audiobook_about_tab_title);
            default:
                return ((Context) this.f71760b.f286299b).getString(R.string.audiobook_more_like_this_tab_title);
        }
    }
}
