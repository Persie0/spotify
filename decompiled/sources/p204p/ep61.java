package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ep61 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bq61 f61562b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep61(bq61 bq61Var, int i) {
        super(0);
        this.f61561a = i;
        this.f61562b = bq61Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f61561a) {
            case 0:
                return this.f61562b.f29693a.getString(R.string.audiobook_about_tab_title);
            case 1:
                return this.f61562b.f29693a.getString(R.string.audiobook_chapters_tab_title);
            case 2:
                bq61 bq61Var = this.f61562b;
                return new xoi0((bq61Var.f29685D || !bq61Var.f29696d) ? h2b.f86944a : h2b.f86945b);
            default:
                return this.f61562b.f29693a.getString(R.string.audiobook_more_like_this_tab_title);
        }
    }
}
