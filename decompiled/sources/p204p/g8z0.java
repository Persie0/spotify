package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class g8z0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z43 f77633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8z0(z43 z43Var, int i) {
        super(1);
        this.f77632a = i;
        this.f77633b = z43Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f77632a) {
            case 0:
                tjm0 tjm0Var = (tjm0) obj;
                return new ro20(2, 994, tjm0Var.f220964a, null, ((Context) this.f77633b.f279103b).getString(R.string.creator_section_button_show_all), tjm0Var.f220965b, false);
            default:
                return (ro20) ((g8z0) this.f77633b.f279105d).invoke((tjm0) obj);
        }
    }
}
