package p204p;

import android.graphics.drawable.ColorDrawable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ysb extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ctb f275733b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ysb(ctb ctbVar, int i) {
        super(0);
        this.f275732a = i;
        this.f275733b = ctbVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f275732a) {
            case 0:
                ctb ctbVar = this.f275733b;
                ctbVar.f41844n1 = true;
                ctbVar.m33832L();
                return w2a1.f247311a;
            default:
                return new ColorDrawable(this.f275733b.f50039a.getContext().getColor(R.color.bg_cover_art_placeholder));
        }
    }
}
