package p204p;

import android.view.ViewStub;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class cdq extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p36 f36930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cdq(p36 p36Var, int i) {
        super(0);
        this.f36929a = i;
        this.f36930b = p36Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f36929a) {
            case 0:
                return ((lq81) this.f36930b.f173561b).mo33803j();
            default:
                ViewStub viewStubMo33801f = ((lq81) this.f36930b.f173561b).mo33801f();
                viewStubMo33801f.setLayoutResource(R.layout.pretitle_slot);
                return viewStubMo33801f.inflate();
        }
    }
}
