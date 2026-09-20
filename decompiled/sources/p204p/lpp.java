package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class lpp extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ umn f135833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpp(umn umnVar, int i) {
        super(0);
        this.f135832a = i;
        this.f135833b = umnVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f135832a) {
            case 0:
                return ((r55) this.f135833b.f231915b).getString(R.string.mark_as_played_cancel_dialog_action_cancel);
            case 1:
                return ((r55) this.f135833b.f231915b).getString(R.string.mark_as_played_cancel_dialog_action_positive);
            case 2:
                return ((r55) this.f135833b.f231915b).getString(R.string.mark_as_played_cancel_dialog_subtitle_new);
            default:
                return ((r55) this.f135833b.f231915b).getString(R.string.mark_as_played_cancel_dialog_title_new);
        }
    }
}
