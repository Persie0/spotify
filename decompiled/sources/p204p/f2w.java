package p204p;

import android.content.Context;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;

/* JADX INFO: loaded from: classes5.dex */
public final class f2w extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p36 f65275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e940 f65276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2w(p36 p36Var, e940 e940Var, int i) {
        super(0);
        this.f65274a = i;
        this.f65275b = p36Var;
        this.f65276c = e940Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f65274a) {
            case 0:
                return new hlv((Context) this.f65275b.f173561b, this.f65276c, 4, false, false, false, 48);
            default:
                return new QuickActionView(new lut0((Context) this.f65275b.f173561b, this.f65276c));
        }
    }
}
